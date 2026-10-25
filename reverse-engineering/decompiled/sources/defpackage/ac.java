package defpackage;

import androidx.compose.foundation.BorderModifierNode;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.DatePickerDefaults;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt$betweenRange$1;
import app.chalo.core.Ride_based_super_pass_tableQueries;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsDialogType;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsViewState;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ac implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ac(long j, Serializable serializable, Serializable serializable2, Serializable serializable3, int i) {
        this.f273a = i;
        this.b = j;
        this.c = serializable;
        this.d = serializable2;
        this.e = serializable3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f273a;
        Unit unit = Unit.f17538a;
        long j = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                return BorderModifierNode.drawGenericBorder$lambda$3((Rect) obj4, (Ref.ObjectRef) obj3, this.b, (ColorFilter) obj2, (ContentDrawScope) obj);
            case 1:
                return MultiParagraph.fillBoundingBoxes_8ffj60Q$lambda$0(this.b, (float[]) obj4, (Ref.IntRef) obj3, (Ref.FloatRef) obj2, (ParagraphInfo) obj);
            case 2:
                long jLongValue = ((Long) obj4).longValue();
                DatePickerDefaults datePickerDefaults = DatePickerDefaults.INSTANCE;
                long jLongValue2 = ((Long) obj3).longValue();
                String strB = ((PbBulkBookingRideDetailsComponent) obj2).m.b();
                PaddingValues paddingValues = ChaloDatePickerKt.f1888a;
                Intrinsics.i(datePickerDefaults, "<this>");
                return PbBulkBookingRideDetailsViewState.a((PbBulkBookingRideDetailsViewState) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, new PbBulkBookingRideDetailsDialogType.DatePickerDialog(jLongValue, new ChaloDatePickerKt$betweenRange$1(this.b, jLongValue2, strB)), null, null, false, null, false, 66060287);
            case 3:
                return PullToRefreshKt.CircularArrowProgressIndicator_RPmYEkk$lambda$13$lambda$12((FloatProducer) obj4, (State) obj3, this.b, (Path) obj2, (DrawScope) obj);
            case 4:
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, (String) ((Ride_based_super_pass_tableQueries) obj4).b.b.encode((List) obj3));
                execute.d(1, Long.valueOf(j));
                execute.bindString(2, (String) obj2);
                return unit;
            default:
                SqlPreparedStatement sqlPreparedStatement = (SqlPreparedStatement) obj;
                uf0.x(sqlPreparedStatement, "$this$execute", j, 0);
                sqlPreparedStatement.bindString(1, (String) obj4);
                sqlPreparedStatement.bindString(2, (String) obj3);
                sqlPreparedStatement.bindString(3, (String) obj2);
                return unit;
        }
    }

    public /* synthetic */ ac(Long l, long j, Long l2, PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent) {
        this.f273a = 2;
        this.c = l;
        this.b = j;
        this.d = l2;
        this.e = pbBulkBookingRideDetailsComponent;
    }

    public /* synthetic */ ac(Object obj, Object obj2, long j, Object obj3, int i) {
        this.f273a = i;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }
}
