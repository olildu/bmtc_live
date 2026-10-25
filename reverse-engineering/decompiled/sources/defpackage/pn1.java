package defpackage;

import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.userprofile.ui.UserProfileFormComponent;
import app.chalo.userprofile.ui.UserProfileFormIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pn1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19052a;
    public final /* synthetic */ UserProfileFormComponent b;

    public /* synthetic */ pn1(UserProfileFormComponent userProfileFormComponent, int i) {
        this.f19052a = i;
        this.b = userProfileFormComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ChaloNavigationManager chaloNavigationManager;
        switch (this.f19052a) {
            case 0:
                chaloNavigationManager = this.b.m;
                gf.u(null, chaloNavigationManager);
                break;
            case 1:
                chaloNavigationManager = this.b.m;
                gf.u(null, chaloNavigationManager);
                break;
            case 2:
                this.b.I0(UserProfileFormIntent.BackBtnClicked.f10354a);
                break;
            case 3:
                this.b.I0(UserProfileFormIntent.DobPickerDismissed.f10358a);
                break;
            default:
                this.b.I0(UserProfileFormIntent.DobPickerDismissed.f10358a);
                break;
        }
        return Unit.f17538a;
    }
}
