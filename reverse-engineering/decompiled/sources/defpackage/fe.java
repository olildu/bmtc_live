package defpackage;

import in.juspay.hyperupi.commonLibrary.v18.CL18;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class fe implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15633a;
    public final /* synthetic */ CL18 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;

    public /* synthetic */ fe(CL18 cl18, String str, String str2, String str3, String str4, String str5, int i) {
        this.f15633a = i;
        this.b = cl18;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15633a) {
            case 0:
                CL18.registerApp$lambda$5(this.b, this.c, this.d, this.e, this.f, this.g);
                break;
            case 1:
                CL18.registerUPILiteOnboarding$lambda$9(this.b, this.c, this.d, this.e, this.f, this.g);
                break;
            default:
                CL18.registerUPILiteState$lambda$10(this.b, this.c, this.d, this.e, this.f, this.g);
                break;
        }
    }
}
