package defpackage;

import in.juspay.hyperupi.commonLibrary.v18.CL18;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class he implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15817a;
    public final /* synthetic */ CL18 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    public /* synthetic */ he(CL18 cl18, String str, String str2, String str3, String str4, int i) {
        this.f15817a = i;
        this.b = cl18;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15817a) {
            case 0:
                CL18.getUPILiteBalance$lambda$11(this.b, this.c, this.d, this.e, this.f);
                break;
            case 1:
                CL18.isUpiLiteBound$lambda$7(this.b, this.c, this.d, this.e, this.f);
                break;
            default:
                CL18.unBindDevice$lambda$8(this.b, this.c, this.d, this.e, this.f);
                break;
        }
    }
}
