package defpackage;

import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsDataState;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsIntent;
import app.chalo.userprofile.Gender;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yf1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20105a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ SuperPassEnterUserDetailsDataState c;

    public /* synthetic */ yf1(Function1 function1, SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState, int i) {
        this.f20105a = i;
        this.b = function1;
        this.c = superPassEnterUserDetailsDataState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20105a) {
            case 0:
                Gender it = (Gender) obj;
                Intrinsics.i(it, "it");
                SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState = this.c;
                this.b.invoke(new SuperPassEnterUserDetailsIntent.FieldUpdatedIntent(superPassEnterUserDetailsDataState.f8412a, it, superPassEnterUserDetailsDataState.c, superPassEnterUserDetailsDataState.d));
                break;
            case 1:
                Long l = (Long) obj;
                l.longValue();
                SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState2 = this.c;
                this.b.invoke(new SuperPassEnterUserDetailsIntent.FieldUpdatedIntent(superPassEnterUserDetailsDataState2.f8412a, superPassEnterUserDetailsDataState2.b, l, superPassEnterUserDetailsDataState2.d));
                break;
            default:
                Long l2 = (Long) obj;
                l2.longValue();
                SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState3 = this.c;
                this.b.invoke(new SuperPassEnterUserDetailsIntent.FieldUpdatedIntent(superPassEnterUserDetailsDataState3.f8412a, superPassEnterUserDetailsDataState3.b, superPassEnterUserDetailsDataState3.c, l2));
                break;
        }
        return Unit.f17538a;
    }
}
