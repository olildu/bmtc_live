package defpackage;

import in.juspay.hypersmshandler.SmsConsentHandler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ha1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15807a;
    public final /* synthetic */ SmsConsentHandler b;

    public /* synthetic */ ha1(SmsConsentHandler smsConsentHandler, int i) {
        this.f15807a = i;
        this.b = smsConsentHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15807a) {
            case 0:
                SmsConsentHandler.a(this.b);
                break;
            default:
                SmsConsentHandler.b(this.b);
                break;
        }
    }
}
