package defpackage;

import androidx.compose.material3.DrawerValue;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.core.view.ViewCompat;
import app.chalo.home.ui.history.MyTicketsDataState;
import app.chalo.home.ui.history.TabUiMetaData;
import app.chalo.home.ui.history.TicketsPageAlertDialogType;
import app.chalo.home.ui.history.TicketsPageLayoutType;
import app.chalo.home.ui.history.TicketsScreenBottomSheetType;
import app.chalo.ncmc.data.cardtransactions.CardPassPurchaseTransactionApiResponse;
import app.chalo.ncmc.data.cardtransactions.CardRechargeTransactionApiResponse;
import app.chalo.ncmc.data.cardtransactions.CardTicketTransactionApiResponse;
import app.chalo.ncmc.data.cardtransactions.CardTransactionApiResponse;
import app.chalo.ncmc.data.cardtransactions.CardUnknownTransactionApiResponse;
import app.chalo.ncmc.data.cardtransactions.MerchantTransactionApiResponse;
import app.chalo.ncmc.data.error.NcmcOfflineRechargeOrderCreationException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.utils.HtmlStyledData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.modules.PolymorphicModuleBuilder;
import kotlinx.serialization.modules.SerializersModuleBuilder;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sk0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19310a;

    public /* synthetic */ sk0(int i) {
        this.f19310a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19310a) {
            case 0:
                MyTicketsDataState it = (MyTicketsDataState) obj;
                Intrinsics.i(it, "it");
                return MyTicketsDataState.a(it, null, null, null, false, false, null, null, null, null, false, null, false, null, false, false, null, false, null, TicketsPageLayoutType.NOTIFICATION_TURN_ON_EXPLAINER, null, false, 32505855);
            case 1:
                MyTicketsDataState it2 = (MyTicketsDataState) obj;
                Intrinsics.i(it2, "it");
                return MyTicketsDataState.a(it2, null, null, null, false, false, null, null, null, null, false, null, false, null, false, false, null, false, null, TicketsPageLayoutType.TICKETS_PASSES_SECTION, null, false, 32505855);
            case 2:
                HtmlStyledData it3 = (HtmlStyledData) obj;
                Intrinsics.i(it3, "it");
                return it3.f10426a;
            case 3:
                MyTicketsDataState it4 = (MyTicketsDataState) obj;
                Intrinsics.i(it4, "it");
                return MyTicketsDataState.a(it4, null, null, null, false, false, null, null, null, null, false, null, false, null, false, false, null, false, null, null, null, false, 33553919);
            case 4:
                MyTicketsDataState it5 = (MyTicketsDataState) obj;
                Intrinsics.i(it5, "it");
                return MyTicketsDataState.a(it5, null, null, null, false, false, null, null, null, null, false, null, false, null, false, false, null, false, null, null, null, true, ViewCompat.MEASURED_SIZE_MASK);
            case 5:
                MyTicketsDataState it6 = (MyTicketsDataState) obj;
                Intrinsics.i(it6, "it");
                return MyTicketsDataState.a(it6, null, null, null, false, false, null, null, null, null, false, null, false, null, false, false, null, false, null, null, null, false, 33553919);
            case 6:
                MyTicketsDataState it7 = (MyTicketsDataState) obj;
                Intrinsics.i(it7, "it");
                return MyTicketsDataState.a(it7, null, null, null, false, false, null, null, null, null, false, null, false, TicketsPageAlertDialogType.NONE, false, false, null, false, null, null, null, false, 33538047);
            case 7:
                MyTicketsDataState it8 = (MyTicketsDataState) obj;
                Intrinsics.i(it8, "it");
                return MyTicketsDataState.a(it8, null, null, null, false, false, null, null, null, null, false, null, false, null, false, false, null, false, null, null, null, false, ViewCompat.MEASURED_SIZE_MASK);
            case 8:
                MyTicketsDataState it9 = (MyTicketsDataState) obj;
                Intrinsics.i(it9, "it");
                return MyTicketsDataState.a(it9, null, null, null, false, false, null, null, null, null, false, null, false, TicketsPageAlertDialogType.NONE, false, false, null, false, null, null, null, false, 33538047);
            case 9:
                MyTicketsDataState it10 = (MyTicketsDataState) obj;
                Intrinsics.i(it10, "it");
                return MyTicketsDataState.a(it10, null, null, null, !it10.e, false, null, null, null, null, false, null, false, null, false, false, null, false, null, null, null, false, 33554415);
            case 10:
                MyTicketsDataState it11 = (MyTicketsDataState) obj;
                Intrinsics.i(it11, "it");
                return MyTicketsDataState.a(it11, null, null, null, false, false, null, null, TicketsScreenBottomSheetType.PurchaseProductBottomSheet.f3447a, null, false, null, false, null, false, false, null, false, null, null, null, false, 33553919);
            case 11:
                MyTicketsDataState it12 = (MyTicketsDataState) obj;
                Intrinsics.i(it12, "it");
                return MyTicketsDataState.a(it12, null, null, null, false, false, null, null, null, null, false, null, false, null, false, false, null, false, null, TicketsPageLayoutType.TICKETS_PASSES_SECTION, null, false, 32505855);
            case 12:
                MyTicketsDataState it13 = (MyTicketsDataState) obj;
                Intrinsics.i(it13, "it");
                return MyTicketsDataState.a(it13, null, null, null, false, false, null, null, null, null, false, null, false, TicketsPageAlertDialogType.NONE, true, false, null, false, null, null, null, false, 33505279);
            case 13:
                MyTicketsDataState it14 = (MyTicketsDataState) obj;
                Intrinsics.i(it14, "it");
                return MyTicketsDataState.a(it14, null, null, null, false, false, null, null, null, null, false, null, false, null, false, false, null, false, null, TicketsPageLayoutType.TICKETS_PASSES_SECTION, null, false, 32505855);
            case 14:
                MyTicketsDataState it15 = (MyTicketsDataState) obj;
                Intrinsics.i(it15, "it");
                return MyTicketsDataState.a(it15, null, null, null, false, !it15.f, null, null, null, null, false, null, false, null, false, false, null, false, null, null, null, false, 33554399);
            case 15:
                MyTicketsDataState it16 = (MyTicketsDataState) obj;
                Intrinsics.i(it16, "it");
                return MyTicketsDataState.a(it16, null, null, null, false, false, null, null, null, null, false, null, false, null, false, false, null, false, null, null, null, false, 33553919);
            case 16:
                MyTicketsDataState it17 = (MyTicketsDataState) obj;
                Intrinsics.i(it17, "it");
                return MyTicketsDataState.a(it17, null, null, null, false, false, null, null, null, null, false, null, false, TicketsPageAlertDialogType.RECLAIM_PRODUCT, false, false, null, false, null, null, null, false, 33538047);
            case 17:
                HtmlStyledData it18 = (HtmlStyledData) obj;
                Intrinsics.i(it18, "it");
                return it18.f10426a;
            case 18:
                MyTicketsDataState it19 = (MyTicketsDataState) obj;
                Intrinsics.i(it19, "it");
                return MyTicketsDataState.a(it19, null, null, null, false, false, null, null, null, null, false, null, false, null, false, false, null, false, null, null, null, false, 33521663);
            case 19:
                MyTicketsDataState it20 = (MyTicketsDataState) obj;
                Intrinsics.i(it20, "it");
                return MyTicketsDataState.a(it20, null, null, null, false, false, null, null, null, null, false, null, false, null, false, false, null, false, null, null, null, false, 33521663);
            case 20:
                return MyTicketsDataState.a((MyTicketsDataState) obj, null, null, null, false, false, null, null, null, null, false, null, false, TicketsPageAlertDialogType.NONE, false, false, null, false, null, null, null, false, 33505279);
            case 21:
                return MyTicketsDataState.a((MyTicketsDataState) obj, null, null, null, false, false, null, null, null, null, false, null, false, TicketsPageAlertDialogType.PRODUCT_DISABLED, false, false, null, false, null, null, null, false, 33505279);
            case 22:
                return MyTicketsDataState.a((MyTicketsDataState) obj, null, null, null, false, false, null, null, null, null, false, null, false, TicketsPageAlertDialogType.PRODUCT_DISABLED, false, false, null, false, null, null, null, false, 33505279);
            case 23:
                return MyTicketsDataState.a((MyTicketsDataState) obj, null, null, null, false, false, null, null, null, null, false, null, false, TicketsPageAlertDialogType.NONE, false, false, null, false, null, null, null, false, 33505279);
            case 24:
                return MyTicketsDataState.a((MyTicketsDataState) obj, null, null, null, false, false, null, null, null, null, false, null, false, null, false, false, null, false, null, null, null, false, 33521663);
            case 25:
                MyTicketsDataState myTicketsDataState = (MyTicketsDataState) obj;
                TabUiMetaData tabUiMetaData = myTicketsDataState.u;
                return MyTicketsDataState.a(myTicketsDataState, null, null, null, false, false, null, null, null, null, false, null, false, null, false, false, null, true, null, null, null, false, 33251327);
            case 26:
                return NavigationDrawerKt.NavigationDrawerItem$lambda$64$lambda$63((SemanticsPropertyReceiver) obj);
            case 27:
                return Boolean.valueOf(NavigationDrawerKt.rememberDrawerState$lambda$1$lambda$0((DrawerValue) obj));
            case 28:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                return new NcmcOfflineRechargeOrderCreationException(genericChaloErrorResponse, genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            default:
                JsonBuilder customJson = (JsonBuilder) obj;
                Intrinsics.i(customJson, "$this$customJson");
                SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
                PolymorphicModuleBuilder polymorphicModuleBuilder = new PolymorphicModuleBuilder(Reflection.a(CardTransactionApiResponse.class));
                polymorphicModuleBuilder.c(Reflection.a(CardPassPurchaseTransactionApiResponse.class), CardPassPurchaseTransactionApiResponse.INSTANCE.serializer());
                polymorphicModuleBuilder.c(Reflection.a(CardRechargeTransactionApiResponse.class), CardRechargeTransactionApiResponse.INSTANCE.serializer());
                polymorphicModuleBuilder.c(Reflection.a(CardTicketTransactionApiResponse.class), CardTicketTransactionApiResponse.INSTANCE.serializer());
                polymorphicModuleBuilder.c(Reflection.a(CardUnknownTransactionApiResponse.class), CardUnknownTransactionApiResponse.INSTANCE.serializer());
                polymorphicModuleBuilder.c(Reflection.a(MerchantTransactionApiResponse.class), MerchantTransactionApiResponse.INSTANCE.serializer());
                polymorphicModuleBuilder.a(serializersModuleBuilder);
                customJson.n = serializersModuleBuilder.f();
                return Unit.f17538a;
        }
    }
}
