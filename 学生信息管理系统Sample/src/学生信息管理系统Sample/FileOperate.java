package 学生信息管理系统Sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
 
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
 
import java.util.ArrayList;
import java.util.List;

public class FileOperate  {
	private String fileName="Studnets.dat";
	private List<Student> list=new ArrayList<Student>();
	private File file;
	private List<Student> getAll;
	public FileOperate() {
		file=new File(this.fileName);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public   void insert()   {
		try {
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		System.out.println("请输入学号");
		String stuId = br.readLine();
		 System.out.println("请输入姓名");
		String stuName=br.readLine();
		System.out.println("请输入年龄");
		String age=br.readLine();
		Student stu=new Student(stuId,stuName,Integer.parseInt(age));
			list=getAll();
            list.add(stu);
		 FileOutputStream fos=new FileOutputStream(this.fileName);
		 ObjectOutputStream oos=new ObjectOutputStream(fos);
		  oos.writeObject(list);
		 oos.close();
		 fos.close();
		 System.out.println("新增成功：");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}
	 
	 
		 
	@SuppressWarnings("unchecked")
	private List<Student> getAll() throws IOException, ClassNotFoundException {
		 
		 
			 InputStream fis=new FileInputStream(this.fileName);
			 ObjectInputStream ois=new ObjectInputStream(fis);
			 this.list=(List<Student>)ois.readObject();
			 ois.close();
			 fis.close();
			return null;
		
		 
	
		 
	}
	public  void deletet() throws IOException  {
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		System.out.println("请输入要删除的学号");
		String id=br.readLine();
		list=getAll;
		boolean flag=false;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getStuId().endsWith(id)) {
				list.remove(list.get(i));
				 FileOutputStream fos=new FileOutputStream(this.fileName);
				 ObjectOutputStream oos=new ObjectOutputStream(fos);
				  oos.writeObject(list);
				 oos.close();
				 fos.close();
				 flag=true;
			}
		}
		if(flag) {
			System.out.println("删除成功");
		}else {
			System.out.println("没有数据");
			
		}
	 }
	 public   void update() throws IOException {
		 InputStreamReader is=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(is);
			System.out.println("请输入要修改的学号");
			String id=br.readLine();
			list=getAll;
			boolean flag=false;
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getStuId().endsWith(id)) {
					list.remove(list.get(i));
					 FileOutputStream fos=new FileOutputStream(this.fileName);
					 ObjectOutputStream oos=new ObjectOutputStream(fos);
					  oos.writeObject(list);
					 oos.close();
					 fos.close();
					 flag=true;
					 flag=true;
				}
			}
			if(flag) {
				System.out.println("修改成功");
			}else {
				System.out.println("没有数据");
				
			}
		 }
	  
	  public  void search(String sid) throws IOException {
		  InputStreamReader is=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(is);
			System.out.println("请输入要查询的学生信息");
			String id=br.readLine();
			searchByIdNameAge(sid,typeContent);
			String name=br.readLine();
			searchByIdNameAge(sid,typeContent);
			String age=br.readLine();
			searchByIdNameAge(sid, typeContent);
	}
	  
	@SuppressWarnings("unchecked")
	public void searchByIdNameAge(String sid,String typeContent) throws IOException, ClassNotFoundException{
		  FileInputStream fis=new FileInputStream(fileName);
		  ObjectInputStream ois=new ObjectInputStream(fis);
		  list=(List<Student>) ois.readObject();
		  for(Student stu:list) {
			  if(sid.equals( "1")) {
				  if(stu.getStuId().equals(type)) {
					  temList.add(stu);
				  }
			  }else if(sid.equals( "2")) {
				  if(stu.getStuName().equals(type)) {
					  
				  }
			  }else if(sid.equals( "3")) {
				  if(stu.getAge()==Integer.parseInt(type){
					  tmpList.add(stu);
				  }
			  }
		  }
		  
	  ois.close();
	  fis.close();
	  if(tempList.size()!=0) {
		  System.out.println("结果：\t学号\t姓名\t年龄");
		  for(Student studnet:tmpList) {
			  System.out.println("\t"+student.getstuId()"\t"+student.getStuName()+"\t"student.getAge());
			  
		  }
	  }else {
		  System.out.println("查询无记录！！");
	  }
	  System.out.println( );
}

	public static void showAll() {
		try {
		list=gitAll();
			if(list.size()!=0) {
				System.out.println("结果：\t学号\t姓名\t年龄");
				for(Studnet studnet:list) {
					  System.out.println("\t"+student.getstuId()"\t"+student.getStuName()+"\t"student.getAge());
				}
				
			}else {
				System.out.println("查询无记录！！");
			}
				
			System.out.println();
    }catch (ClassNotFoundException e) {
    	e.printStackTrace();
    }
	 

	 
 

      


