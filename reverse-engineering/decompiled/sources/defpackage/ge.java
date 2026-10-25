package defpackage;

import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hyperupi.commonLibrary.v18.CL18;
import org.npci.upi.security.services.CLRemoteResultReceiver;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ge implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15724a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ ge(SdkTracker sdkTracker, String str, String str2, String str3, Integer num, String str4, Long l, Long l2, Object obj, Object obj2, String str5) {
        this.g = sdkTracker;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.h = num;
        this.e = str4;
        this.i = l;
        this.j = l2;
        this.k = obj;
        this.l = obj2;
        this.f = str5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15724a) {
            case 0:
                CL18.getCredentials$lambda$12((CL18) this.g, this.b, this.c, this.d, this.e, this.f, (String) this.h, (String) this.i, (String) this.j, (String) this.k, (CLRemoteResultReceiver) this.l);
                break;
            default:
                ((SdkTracker) this.g).lambda$trackApiCalls$9(this.b, this.c, this.d, (Integer) this.h, this.e, (Long) this.i, (Long) this.j, this.k, this.l, this.f);
                break;
        }
    }

    public /* synthetic */ ge(CL18 cl18, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, CLRemoteResultReceiver cLRemoteResultReceiver) {
        this.g = cl18;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = cLRemoteResultReceiver;
    }
}
