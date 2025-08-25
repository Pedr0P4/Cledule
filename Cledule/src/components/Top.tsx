import logoProv from "../assets/logo-prov.png";

function Top() {
  return (
    <div className="bg-neutral-200 h-25 flex justify-between items-center">
      <div>
        <img src={logoProv} alt="logo-prov" className="h-20 m-4" />
      </div>
      <div className="flex m-5">
        <h3 className="cursor-pointer border-b-2 h-8 w-25 m-4 text-xl text-center">
          Início
        </h3>
        <h3 className="cursor-pointer border-b-2 h-8 w-25 m-4 text-xl text-center">
          Sobre
        </h3>
      </div>
      <div className="flex m-5">
        <button className="cursor-pointer bg-neutral-500 text-white block m-1 p-3">
          Registrar
        </button>
        <button className="cursor-pointer bg-neutral-500 text-white block m-1 p-3">
          Entrar
        </button>
      </div>
    </div>
  );
}

export default Top;
