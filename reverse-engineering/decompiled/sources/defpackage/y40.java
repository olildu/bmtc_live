package defpackage;

import app.chalo.appUpdate.ForceAppUpdateComponent;
import app.chalo.appUpdate.ForceAppUpdateIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y40 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20074a;
    public final /* synthetic */ ForceAppUpdateComponent b;

    public /* synthetic */ y40(ForceAppUpdateComponent forceAppUpdateComponent, int i) {
        this.f20074a = i;
        this.b = forceAppUpdateComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20074a) {
            case 0:
                this.b.H0(ForceAppUpdateIntent.OnUpdateBtnClicked.f951a);
                break;
            case 1:
                this.b.H0(ForceAppUpdateIntent.OnRemindLaterClicked.f950a);
                break;
            default:
                this.b.H0(ForceAppUpdateIntent.OnBackPressed.f949a);
                break;
        }
        return Unit.f17538a;
    }
}
