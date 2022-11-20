using System;
using System.IO;

class Program
{
    public static void Main(string[] args)
    {
        string path = "hello.ods";

        FileInfo fi = new FileInfo(path);
        FileGeneric file = new FileGeneric(path, fi.Name, fi.Extension);
        if (fi.Extension.ToUpper() == ".PDF")
        {
             file = new PDF(path,fi.Name,fi.Extension);
        }
		if (fi.Extension.ToUpper() == ".DOC")
        {
             file = new PDF(path,fi.Name,fi.Extension);
        }
		if (fi.Extension.ToUpper() == ".ODS")
        {
             file = new PDF(path,fi.Name,fi.Extension);
        }
        file.PrintFileType();

    }
}

public class FileGeneric
{

  public string Path { get; set; }
  public string Name { get; set; }
  public string Extension {get; set; }

  public FileGeneric(string path,string name, string extension)
  {
   Path = path;
   Extension = extension;
   Name = name;
   }

	public virtual void PrintFileType()
{
       Console.WriteLine("Não foi possivel identificar o arquivo");
        
 }
}

public class PDF : FileGeneric{
	
	public PDF(string path, string name, string extension) : base(path,name,extension){}
	public override void PrintFileType()
		{
			Console.WriteLine("A extensão usada é: " + Extension);
		}
}

public class DOC : FileGeneric{
	
	public DOC(string path, string name, string extension) : base(path,name,extension){}
	public override void PrintFileType()
		{
			Console.WriteLine("A extensão usada é: " + Extension);
		}
}

public class ODS : FileGeneric{
	
	public ODS(string path, string name, string extension) : base(path,name,extension){}
	public override void PrintFileType()
		{
			Console.WriteLine("A extensão usada é:" + Extension);
		}
}
