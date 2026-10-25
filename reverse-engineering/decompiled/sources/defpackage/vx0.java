package defpackage;

import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassBasicDetailsDialogType;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsDataState;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel;
import app.chalo.usecase.MillisAfterTimeFormatType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vx0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19875a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vx0(long j, long j2, SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel) {
        this.b = j;
        this.c = j2;
        this.d = superPassEnterUserDetailsViewModel;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long jLongValue;
        switch (this.f19875a) {
            case 0:
                String str = (String) this.d;
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, str);
                execute.d(1, Long.valueOf(this.b));
                execute.d(2, Long.valueOf(this.c));
                return Unit.f17538a;
            default:
                SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel = (SuperPassEnterUserDetailsViewModel) this.d;
                SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState = (SuperPassEnterUserDetailsDataState) obj;
                Long l = superPassEnterUserDetailsDataState.d;
                long j = this.b;
                if (l == null) {
                    jLongValue = j;
                } else {
                    if (l.longValue() == -1) {
                        l = null;
                    }
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = j;
                    }
                }
                return SuperPassEnterUserDetailsDataState.a(superPassEnterUserDetailsDataState, null, null, null, null, false, null, new SuperPassBasicDetailsDialogType.PassStartTimeDatePicker(Long.valueOf(jLongValue), this.c, superPassEnterUserDetailsViewModel.r.a(j, 2592000000L, MillisAfterTimeFormatType.EXACT)), 63);
        }
    }

    public /* synthetic */ vx0(String str, long j, long j2) {
        this.d = str;
        this.b = j;
        this.c = j2;
    }
}
