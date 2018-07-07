package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;

/**
 * 会員情報を保持するエンティティクラス.
 * @author matsumotoyuka
 *
 */
@Entity
public class User extends Model{

	@Id
	private Long id;
	
	@NotNull
	private String userNm;
	
	@NotNull
	private String email;
	
	@CreatedTimestamp
	private Date createDate;
	
	@Version
	private Date updateDate;
	
	@NotNull
	private Integer delFlg;
	
}
