function Top() {
  return (
    <div className="bg-slate-300 flex justify-between">
      <div>
        <img src="" alt="logo-prov" />
      </div>
      <div className="flex m-5">
        <h3 className="border-b-2 h-7">Início</h3>
        <h3 className="border-b-2 h-7 ml-2">Sobre</h3>
      </div>
      <div className="flex m-5">
        <button className="bg-slate-500 text-white block p-2">Registrar</button>
        <button className="bg-slate-500 text-white block p-2 ml-2">
          Entrar
        </button>
      </div>
    </div>
  );
}

export default Top;
