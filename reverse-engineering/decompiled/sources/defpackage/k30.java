package defpackage;

import com.google.firebase.installations.FirebaseInstallations;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k30 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17460a;
    public final /* synthetic */ FirebaseInstallations b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ k30(FirebaseInstallations firebaseInstallations, boolean z, int i) {
        this.f17460a = i;
        this.b = firebaseInstallations;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17460a) {
            case 0:
                this.b.lambda$doRegistrationOrRefresh$3(this.c);
                break;
            default:
                this.b.lambda$getToken$2(this.c);
                break;
        }
    }
}
