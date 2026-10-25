package defpackage;

import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsDataState;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsIntent;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wf1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19924a;
    public final /* synthetic */ SuperPassEnterUserDetailsViewModel b;
    public final /* synthetic */ SuperPassEnterUserDetailsDataState c;

    public /* synthetic */ wf1(SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel, SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState, int i) {
        this.f19924a = i;
        this.b = superPassEnterUserDetailsViewModel;
        this.c = superPassEnterUserDetailsDataState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        switch (this.f19924a) {
            case 0:
                Intrinsics.i(it, "it");
                SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState = this.c;
                this.b.D(new SuperPassEnterUserDetailsIntent.FieldUpdatedIntent(it, superPassEnterUserDetailsDataState.b, superPassEnterUserDetailsDataState.c, superPassEnterUserDetailsDataState.d));
                break;
            default:
                Intrinsics.i(it, "it");
                SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState2 = this.c;
                this.b.D(new SuperPassEnterUserDetailsIntent.FieldUpdatedIntent(it, superPassEnterUserDetailsDataState2.b, superPassEnterUserDetailsDataState2.c, superPassEnterUserDetailsDataState2.d));
                break;
        }
        return Unit.f17538a;
    }
}
