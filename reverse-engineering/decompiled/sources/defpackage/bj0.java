package defpackage;

import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bj0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11202a;
    public final /* synthetic */ MinProfileUpdateComponent b;

    public /* synthetic */ bj0(MinProfileUpdateComponent minProfileUpdateComponent, int i) {
        this.f11202a = i;
        this.b = minProfileUpdateComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11202a) {
            case 0:
                this.b.W0(MinProfileUpdateIntent.BackClicked.f10394a);
                break;
            case 1:
                this.b.W0(MinProfileUpdateIntent.DobFieldClicked.f10395a);
                break;
            case 2:
                this.b.W0(MinProfileUpdateIntent.DobFieldClicked.f10395a);
                break;
            case 3:
                this.b.W0(MinProfileUpdateIntent.UploadProfilePhotoClicked.f10405a);
                break;
            case 4:
                this.b.W0(MinProfileUpdateIntent.UploadProfilePhotoClicked.f10405a);
                break;
            case 5:
                this.b.W0(new MinProfileUpdateIntent.NextClicked(false));
                break;
            case 6:
                this.b.W0(new MinProfileUpdateIntent.PermissionRationaleDialogInteraction(true));
                break;
            case 7:
                this.b.W0(new MinProfileUpdateIntent.PermissionRationaleDialogInteraction(false));
                break;
            case 8:
                this.b.W0(MinProfileUpdateIntent.SkipClicked.f10404a);
                break;
            case 9:
                ChaloNavigationManagerKt.c(this.b.m);
                break;
            case 10:
                this.b.W0(MinProfileUpdateIntent.DobPickerDismissed.f10396a);
                break;
            case 11:
                this.b.W0(MinProfileUpdateIntent.DobPickerDismissed.f10396a);
                break;
            default:
                this.b.W0(MinProfileUpdateIntent.BackClicked.f10394a);
                break;
        }
        return Unit.f17538a;
    }
}
