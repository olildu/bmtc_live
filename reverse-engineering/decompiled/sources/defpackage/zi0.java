package defpackage;

import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zi0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20202a;
    public final /* synthetic */ MinProfileUpdateComponent b;

    public /* synthetic */ zi0(MinProfileUpdateComponent minProfileUpdateComponent, int i) {
        this.f20202a = i;
        this.b = minProfileUpdateComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20202a) {
            case 0:
                String it = (String) obj;
                Intrinsics.i(it, "it");
                this.b.W0(new MinProfileUpdateIntent.AgeTextChanged(it));
                break;
            case 1:
                String it2 = (String) obj;
                Intrinsics.i(it2, "it");
                this.b.W0(new MinProfileUpdateIntent.NameEntered(it2));
                break;
            default:
                this.b.W0(new MinProfileUpdateIntent.DobSelected((Long) obj));
                break;
        }
        return Unit.f17538a;
    }
}
