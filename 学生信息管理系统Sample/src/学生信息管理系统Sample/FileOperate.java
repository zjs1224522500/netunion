package ѧ����Ϣ����ϵͳSample;

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
		System.out.println("������ѧ��");
		String stuId = br.readLine();
		 System.out.println("����������");
		String stuName=br.readLine();
		System.out.println("����������");
		String age=br.readLine();
		Student stu=new Student(stuId,stuName,Integer.parseInt(age));
			list=getAll();
            list.add(stu);
		 FileOutputStream fos=new FileOutputStream(this.fileName);
		 ObjectOutputStream oos=new ObjectOutputStream(fos);
		  oos.writeObject(list);
		 oos.close();
		 fos.close();
		 System.out.println("�����ɹ���");
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
		System.out.println("������Ҫɾ����ѧ��");
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
			System.out.println("ɾ���ɹ�");
		}else {
			System.out.println("û������");
			
		}
	 }
	 public   void update() throws IOException {
		 InputStreamReader is=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(is);
			System.out.println("������Ҫ�޸ĵ�ѧ��");
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
				System.out.println("�޸ĳɹ�");
			}else {
				System.out.println("û������");
				
			}
		 }
	  
	  public  void search(String sid) throws IOException {
		  InputStreamReader is=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(is);
			System.out.println("������Ҫ��ѯ��ѧ����Ϣ");
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
		  System.out.println("�����\tѧ��\t����\t����");
		  for(Student studnet:tmpList) {
			  System.out.println("\t"+student.getstuId()"\t"+student.getStuName()+"\t"student.getAge());
			  
		  }
	  }else {
		  System.out.println("��ѯ�޼�¼����");
	  }
	  System.out.println( );
}

	public static void showAll() {
		try {
		list=gitAll();
			if(list.size()!=0) {
				System.out.println("�����\tѧ��\t����\t����");
				for(Studnet studnet:list) {
					  System.out.println("\t"+student.getstuId()"\t"+student.getStuName()+"\t"student.getAge());
				}
				
			}else {
				System.out.println("��ѯ�޼�¼����");
			}
				
			System.out.println();
    }catch (ClassNotFoundException e) {
    	e.printStackTrace();
    }
	 

	 
 

      


