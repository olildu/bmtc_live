package defpackage;

import androidx.compose.material3.DateRangePickerDefaults;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.login.ui.options.LoginOptionsDataState;
import app.chalo.productactivation.ui.ProductActivationDataState;
import app.chalo.productactivation.ui.ProductActivationDialogType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gw implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15771a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ gw(String str, String str2, int i) {
        this.f15771a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15771a) {
            case 0:
                return DateRangePickerDefaults.DateRangePickerHeadline_nZrIstQ$lambda$3$lambda$2(this.b, this.c, (SemanticsPropertyReceiver) obj);
            case 1:
                return LoginOptionsDataState.a((LoginOptionsDataState) obj, this.b, null, this.c, false, null, false, null, null, null, null, false, false, 32730);
            case 2:
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, this.b);
                execute.bindString(1, this.c);
                return Unit.f17538a;
            case 3:
                ProductActivationDataState it = (ProductActivationDataState) obj;
                Intrinsics.i(it, "it");
                return ProductActivationDataState.a(it, null, null, new ProductActivationDialogType.ProductActivationFailedDialog(this.b, this.c), null, false, null, null, null, null, false, null, null, false, 16379);
            case 4:
                ProductActivationDataState it2 = (ProductActivationDataState) obj;
                Intrinsics.i(it2, "it");
                return ProductActivationDataState.a(it2, null, null, new ProductActivationDialogType.ProductActivationFailedDialog(this.b, this.c), null, false, null, null, null, null, false, null, null, false, 16379);
            case 5:
                ProductActivationDataState it3 = (ProductActivationDataState) obj;
                Intrinsics.i(it3, "it");
                return ProductActivationDataState.a(it3, null, null, new ProductActivationDialogType.ProductActivationFailedDialog(this.b, this.c), null, false, null, null, null, null, false, null, null, false, 16379);
            case 6:
                ProductActivationDataState it4 = (ProductActivationDataState) obj;
                Intrinsics.i(it4, "it");
                return ProductActivationDataState.a(it4, null, null, new ProductActivationDialogType.ProductActivationFailedDialog(this.b, this.c), null, false, null, null, null, null, false, null, null, false, 16379);
            case 7:
                SqlPreparedStatement execute2 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute2, "$this$execute");
                execute2.bindString(0, this.b);
                execute2.bindString(1, this.c);
                return Unit.f17538a;
            case 8:
                SqlPreparedStatement execute3 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute3, "$this$execute");
                execute3.bindString(0, this.b);
                execute3.bindString(1, this.c);
                return Unit.f17538a;
            case 9:
                SqlPreparedStatement execute4 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute4, "$this$execute");
                execute4.bindString(0, this.b);
                execute4.bindString(1, this.c);
                return Unit.f17538a;
            case 10:
                SqlPreparedStatement execute5 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute5, "$this$execute");
                execute5.bindString(0, this.b);
                execute5.bindString(1, this.c);
                return Unit.f17538a;
            case 11:
                SqlPreparedStatement execute6 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute6, "$this$execute");
                execute6.bindString(0, this.b);
                execute6.bindString(1, this.c);
                return Unit.f17538a;
            case 12:
                SqlPreparedStatement execute7 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute7, "$this$execute");
                execute7.bindString(0, this.b);
                execute7.bindString(1, this.c);
                return Unit.f17538a;
            case 13:
                SqlPreparedStatement execute8 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute8, "$this$execute");
                execute8.bindString(0, this.b);
                execute8.bindString(1, this.c);
                return Unit.f17538a;
            case 14:
                SqlPreparedStatement execute9 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute9, "$this$execute");
                execute9.bindString(0, this.b);
                execute9.bindString(1, this.c);
                return Unit.f17538a;
            case 15:
                SqlPreparedStatement execute10 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute10, "$this$execute");
                execute10.bindString(0, this.b);
                execute10.bindString(1, this.c);
                return Unit.f17538a;
            case 16:
                SqlPreparedStatement execute11 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute11, "$this$execute");
                execute11.bindString(0, this.b);
                execute11.bindString(1, this.c);
                return Unit.f17538a;
            case 17:
                SqlPreparedStatement execute12 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute12, "$this$execute");
                execute12.bindString(0, this.b);
                execute12.bindString(1, this.c);
                return Unit.f17538a;
            default:
                SqlPreparedStatement execute13 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute13, "$this$execute");
                execute13.bindString(0, this.b);
                execute13.bindString(1, this.c);
                return Unit.f17538a;
        }
    }
}
