#Author: angeldavvid41@gmail.com
@tag
Feature: Validar información de empleados  usando Serenity Rest
  Yo como automatizador
  deseo hacer operaciones con los principales verbos del Api (POST, GET, DELETE)


  @actualizar
  Scenario: Actualizar usuario de forma exitosa
    When se manda el username del usuario a actualizar "Angel"
    Then se valida que el usuario es actualizado con codigo 200

    ##------------------------------
  @crear
  Scenario: Crear usuario de manera exitosa
    When se crea un nuevo registro de una mascota
    Then se observa que el servicio responde con status code 200

  @buscarPorId
  Scenario: Consultar un usuario creado por username
    When consultar usuario con username "Angel"
    Then Se observa el codigo de respuesta con codigo 200




  @eliminar
  Scenario: Eliminar un usuario por Username de manera exitosa
    When se busca el usuario a eliminar por username "Angel"

    Then se observa el servicio de eliminacion responde con 200

##-----------------------