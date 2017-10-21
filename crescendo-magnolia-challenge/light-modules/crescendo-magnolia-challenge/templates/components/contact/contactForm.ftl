<form method="post">
    
    <div>
        <label>First Name:</label>
        <input type="text" name="firstName" />
        <#if model.firstName??>${model.firstName}<#else> </#if>
    </div>
    <div>
        <label>Last Name:</label>
        <input type="text" name="lastName" />
        <#if model.lastName??>${model.lastName}<#else> </#if>
    </div>
    <div>
        <label>E-mail:</label>
        <input type="text" name="email" />
        <#if model.email??>${model.email}<#else> </#if>
    </div>
    <div>
        <input type="checkbox" name="join" />
        <label>Join the mailing list</label>
        ${model.join?string('yes', 'no')}
    </div>
    <div>
        <input type="submit" value="Submit Form" onclick="${model.confirmSubmit()}"/>
    </div>
    <div>
         <#if model.statusMessage??>${model.statusMessage}<#else> </#if>
    </div>
</form>