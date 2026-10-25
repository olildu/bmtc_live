package defpackage;

import app.chalo.login.ui.userconsent.UserConsentComponent;
import app.chalo.login.ui.userconsent.UserConsentIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ln1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18330a;
    public final /* synthetic */ UserConsentComponent b;

    public /* synthetic */ ln1(UserConsentComponent userConsentComponent, int i) {
        this.f18330a = i;
        this.b = userConsentComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18330a) {
            case 0:
                this.b.L0(UserConsentIntent.DismissConsentRequiredDialog.f5353a);
                break;
            case 1:
                this.b.L0(UserConsentIntent.DismissConsentRequiredDialog.f5353a);
                break;
            case 2:
                this.b.L0(UserConsentIntent.RetryFetchIntent.f5355a);
                break;
            case 3:
                this.b.L0(UserConsentIntent.AcceptConsentIntent.f5350a);
                break;
            case 4:
                this.b.L0(UserConsentIntent.DenyConsentIntent.f5352a);
                break;
            default:
                this.b.L0(UserConsentIntent.SkipConsentIntent.f5356a);
                break;
        }
        return Unit.f17538a;
    }
}
