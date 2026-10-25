package defpackage;

import androidx.compose.material3.ModalWideNavigationRailState;
import androidx.compose.ui.text.MultiParagraphKt;
import androidx.compose.ui.text.ParagraphInfo;
import app.cash.sqldelight.db.SqlCursor;
import app.chalo.home.ui.history.MyTicketsDataState;
import app.chalo.home.ui.history.TicketsPageAlertDialogType;
import app.chalo.instantticket.data.exception.ProductBookingRemoteDataException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.multiproductvalidation.ui.ActiveQrState;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationDataState;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.serializers.MonthBasedDateTimeUnitSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.internal.IntSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lj0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18319a;

    public /* synthetic */ lj0(int i) {
        this.f18319a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f18319a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                return Float.valueOf(ModalWideNavigationRailState.anchoredDraggableState$lambda$0(((Float) obj).floatValue()));
            case 1:
                ClassSerialDescriptorBuilder buildClassSerialDescriptor = (ClassSerialDescriptorBuilder) obj;
                MonthBasedDateTimeUnitSerializer monthBasedDateTimeUnitSerializer = MonthBasedDateTimeUnitSerializer.f18072a;
                Intrinsics.i(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                EmptyList emptyList = EmptyList.f17557a;
                IntSerializer intSerializer = IntSerializer.f18146a;
                buildClassSerialDescriptor.a("months", IntSerializer.b, emptyList, false);
                return unit;
            case 2:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("mticket_activation_store_table");
                return unit;
            case 3:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                return new ProductBookingRemoteDataException(genericChaloErrorResponse, genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            case 4:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                return new ProductBookingRemoteDataException(genericChaloErrorResponse2, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
            case 5:
                GenericChaloErrorResponse genericChaloErrorResponse3 = (GenericChaloErrorResponse) obj;
                return new ProductBookingRemoteDataException(genericChaloErrorResponse3, genericChaloErrorResponse3 != null ? genericChaloErrorResponse3.b : null);
            case 6:
                ProductValidationData it = (ProductValidationData) obj;
                Intrinsics.i(it, "it");
                return it.b();
            case 7:
                return MultiParagraphKt.findParagraphByIndex$lambda$2$0((ParagraphInfo) obj);
            case 8:
                ProductValidationData it2 = (ProductValidationData) obj;
                Intrinsics.i(it2, "it");
                return it2.b();
            case 9:
                MultiProductValidationDataState it3 = (MultiProductValidationDataState) obj;
                Intrinsics.i(it3, "it");
                return MultiProductValidationDataState.a(it3, null, null, ActiveQrState.a(it3.d, false), false, 23);
            case 10:
                return Boolean.valueOf(((Long) obj).longValue() >= 0);
            case 11:
                return MultiProductValidationDataState.a((MultiProductValidationDataState) obj, null, null, null, false, 15);
            case 12:
                MultiProductValidationDataState multiProductValidationDataState = (MultiProductValidationDataState) obj;
                return MultiProductValidationDataState.a(multiProductValidationDataState, null, null, ActiveQrState.a(multiProductValidationDataState.d, true), false, 23);
            case 13:
                Map.Entry it4 = (Map.Entry) obj;
                Intrinsics.i(it4, "it");
                return it4.getValue() + " " + it4.getKey();
            case 14:
                Function1 emit2 = (Function1) obj;
                Intrinsics.i(emit2, "emit");
                emit2.invoke("multi_modal_group_ticket_child_table");
                return unit;
            case 15:
                Function1 emit3 = (Function1) obj;
                Intrinsics.i(emit3, "emit");
                emit3.invoke("multi_modal_group_ticket_child_table");
                return unit;
            case 16:
                Function1 emit4 = (Function1) obj;
                Intrinsics.i(emit4, "emit");
                emit4.invoke("multi_modal_group_ticket_child_table");
                return unit;
            case 17:
                Function1 emit5 = (Function1) obj;
                Intrinsics.i(emit5, "emit");
                emit5.invoke("multi_modal_group_ticket_table");
                return unit;
            case 18:
                return cb0.i((SqlCursor) obj, "cursor", 0);
            case 19:
                return cb0.i((SqlCursor) obj, "cursor", 0);
            case 20:
                Function1 emit6 = (Function1) obj;
                Intrinsics.i(emit6, "emit");
                emit6.invoke("multi_modal_group_ticket_table");
                return unit;
            case 21:
                Function1 emit7 = (Function1) obj;
                Intrinsics.i(emit7, "emit");
                emit7.invoke("multi_modal_group_ticket_table");
                return unit;
            case 22:
                Function1 emit8 = (Function1) obj;
                Intrinsics.i(emit8, "emit");
                emit8.invoke("multi_modal_group_ticket_table");
                return unit;
            case 23:
                MyTicketsDataState it5 = (MyTicketsDataState) obj;
                Intrinsics.i(it5, "it");
                return MyTicketsDataState.a(it5, null, null, null, false, false, null, null, null, null, false, null, false, null, true, false, null, false, null, null, null, false, 33521663);
            case 24:
                MyTicketsDataState it6 = (MyTicketsDataState) obj;
                Intrinsics.i(it6, "it");
                return MyTicketsDataState.a(it6, null, null, null, false, false, null, null, null, null, false, null, false, TicketsPageAlertDialogType.PRODUCT_DISABLED, false, false, null, false, null, null, null, false, 33538047);
            case 25:
                MyTicketsDataState it7 = (MyTicketsDataState) obj;
                Intrinsics.i(it7, "it");
                return MyTicketsDataState.a(it7, null, null, null, false, false, null, null, null, null, false, null, false, null, true, false, null, false, null, null, null, false, 33505279);
            case 26:
                MyTicketsDataState it8 = (MyTicketsDataState) obj;
                Intrinsics.i(it8, "it");
                return MyTicketsDataState.a(it8, null, null, null, false, false, null, null, null, null, false, null, false, null, false, false, null, false, null, null, null, false, 33521663);
            case 27:
                MyTicketsDataState it9 = (MyTicketsDataState) obj;
                Intrinsics.i(it9, "it");
                return MyTicketsDataState.a(it9, null, null, null, false, false, null, null, null, null, false, null, false, TicketsPageAlertDialogType.PRODUCT_DISABLED, false, false, null, false, null, null, null, false, 33538047);
            case 28:
                MyTicketsDataState it10 = (MyTicketsDataState) obj;
                Intrinsics.i(it10, "it");
                return MyTicketsDataState.a(it10, null, null, null, false, false, null, null, null, null, false, null, false, TicketsPageAlertDialogType.PRODUCT_DISABLED, false, false, null, false, null, null, null, false, 33538047);
            default:
                MyTicketsDataState it11 = (MyTicketsDataState) obj;
                Intrinsics.i(it11, "it");
                return MyTicketsDataState.a(it11, null, null, null, false, false, null, null, null, null, false, null, false, TicketsPageAlertDialogType.PRODUCT_VALIDITY_EXPIRED, false, false, null, false, null, null, null, false, 33538047);
        }
    }
}
