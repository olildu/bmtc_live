package defpackage;

import androidx.compose.foundation.gestures.Scrollable2DNode;
import androidx.compose.material3.internal.PredictiveBackState;
import androidx.compose.runtime.saveable.SaveableStateRegistryWrapper;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import app.chalo.checkout.paymentprovider.razorpay.RazorpaySdk;
import app.chalo.home.ui.history.uistate.ChaloWidgetCardUiState;
import app.chalo.home.ui.history.uistate.regularbusticket.RegularBusTicketCtaUiState;
import app.chalo.home.ui.history.uistate.regularbusticket.RegularBusTicketFooterContainerUiState;
import app.chalo.home.ui.savedplacesandrides.RidesUIState;
import app.chalo.home.ui.savedplacesandrides.SavedPlaceUIState;
import app.chalo.instantticket.ui.routeselection.RouteBasedStopSearchForProductPurchaseComponent;
import app.chalo.instantticket.ui.routeselection.RouteSelectionIntent;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetValue;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.LiveVehiclesMarkerUIState;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler.PremiumBusStopMarkerUIState;
import app.chalo.premiumbus.ui.slotselection.OutlinedButtonUIState;
import app.chalo.premiumbus.ui.slotselection.PassPurchaseNudgeCardUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusDefaultOptionUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusPassOptionUIState;
import app.chalo.productactivation.ui.ProductActivationComponent;
import app.chalo.productactivation.ui.ProductActivationIntent;
import app.chalo.productbooking.pickroutelocation.RouteItemUiState;
import app.chalo.productpurchase.productselection.ui.ProductSelectionSectionItemUIState;
import app.chalo.productsummary.ui.data.ProductSummaryStatusUiData;
import app.chalo.uistate.base.UiEventHandler;
import com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration;
import com.google.firebase.sessions.ProcessDataManagerImpl;
import com.google.firebase.sessions.UuidGenerator;
import com.razorpay.Razorpay;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketWriter;
import okio.FileSystem;
import okio.Path;
import okio.internal.ResourceFileSystem;
import okio.internal.ZipFilesKt;
import okio.internal.a;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qv0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19157a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qv0(Object obj, int i) {
        this.f19157a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IOException {
        int iH;
        Pair pair;
        int i = this.f19157a;
        Unit unit = Unit.f17538a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((PremiumBusDefaultOptionUIState) obj).c.a();
                return unit;
            case 1:
                UiEventHandler uiEventHandler = ((OutlinedButtonUIState) obj).d;
                if (uiEventHandler != null) {
                    uiEventHandler.a();
                }
                return unit;
            case 2:
                ((PassPurchaseNudgeCardUIState) obj).e.a();
                return unit;
            case 3:
                ((PremiumBusPassOptionUIState) obj).e.a();
                return unit;
            case 4:
                return ((PremiumBusStopMarkerUIState) obj).i;
            case 5:
                PremiumReserveTicketStatus premiumReserveTicketStatus = ((PremiumReserveTicketAppModel) obj).f7113a.h;
                return Boolean.valueOf(premiumReserveTicketStatus == PremiumReserveTicketStatus.USED || premiumReserveTicketStatus == PremiumReserveTicketStatus.PUNCHED);
            case 6:
                return ProcessDataManagerImpl.myUuid_delegate$lambda$1((UuidGenerator) obj);
            case 7:
                ((ProductActivationComponent) obj).R0(ProductActivationIntent.BackToHomeScreenIntent.f8032a);
                return unit;
            case 8:
                UiEventHandler uiEventHandler2 = ((ProductSelectionSectionItemUIState.ProductItemUIState) obj).h;
                if (uiEventHandler2 != null) {
                    uiEventHandler2.a();
                }
                return unit;
            case 9:
                ((ProductSummaryStatusUiData) obj).h.a();
                return unit;
            case 10:
                ((ChaloWidgetCardUiState) obj).g.a();
                return unit;
            case 11:
                return new Razorpay(((RazorpaySdk) obj).f1427a);
            case 12:
                return Long.valueOf(((Number) ((m) obj).invoke()).longValue());
            case 13:
                return RealWebSocket.writeOneFrame$lambda$10$lambda$9((RealWebSocket) obj);
            case 14:
                return RealWebSocket.finishReader$lambda$5$lambda$4((WebSocketWriter) obj);
            case 15:
                ((RegularBusTicketCtaUiState) obj).d.invoke();
                return unit;
            case 16:
                ((RegularBusTicketFooterContainerUiState) obj).b.d.invoke();
                return unit;
            case 17:
                ((ConfigUpdateListenerRegistration) obj).remove();
                return unit;
            case 18:
                ResourceFileSystem resourceFileSystem = (ResourceFileSystem) obj;
                ClassLoader classLoader = resourceFileSystem.f18644a;
                FileSystem fileSystem = resourceFileSystem.b;
                Enumeration<URL> resources = classLoader.getResources("");
                Intrinsics.h(resources, "getResources(...)");
                ArrayList list = Collections.list(resources);
                Intrinsics.h(list, "list(...)");
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                int i2 = 0;
                while (true) {
                    Pair pair2 = null;
                    if (i2 >= size) {
                        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                        Intrinsics.h(resources2, "getResources(...)");
                        ArrayList list2 = Collections.list(resources2);
                        Intrinsics.h(list2, "list(...)");
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list2.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj2 = list2.get(i3);
                            i3++;
                            URL url = (URL) obj2;
                            Intrinsics.f(url);
                            String string = url.toString();
                            Intrinsics.h(string, "toString(...)");
                            if (StringsKt.a0(string, "jar:file:", false) && (iH = StringsKt.H(6, string, "!")) != -1) {
                                String str = Path.b;
                                String strSubstring = string.substring(4, iH);
                                Intrinsics.h(strSubstring, "substring(...)");
                                pair = new Pair(ZipFilesKt.c(Path.Companion.b(new File(URI.create(strSubstring))), fileSystem, new a()), ResourceFileSystem.d);
                            } else {
                                pair = null;
                            }
                            if (pair != null) {
                                arrayList2.add(pair);
                            }
                        }
                        return CollectionsKt.c0(arrayList2, arrayList);
                    }
                    Object obj3 = list.get(i2);
                    i2++;
                    URL url2 = (URL) obj3;
                    Intrinsics.f(url2);
                    if (Intrinsics.d(url2.getProtocol(), "file")) {
                        String str2 = Path.b;
                        pair2 = new Pair(fileSystem, Path.Companion.b(new File(url2.toURI())));
                    }
                    if (pair2 != null) {
                        arrayList.add(pair2);
                    }
                }
                break;
            case 19:
                BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) obj;
                BottomSheetValue bottomSheetValue = (BottomSheetValue) bottomSheetScaffoldState.f4447a.c.getValue();
                BottomSheetValue bottomSheetValue2 = (BottomSheetValue) bottomSheetScaffoldState.f4447a.d();
                BottomSheetValue bottomSheetValue3 = BottomSheetValue.ExpandedFull;
                return (bottomSheetValue == bottomSheetValue3 || bottomSheetValue2 == bottomSheetValue3) ? bottomSheetValue3 : bottomSheetValue;
            case 20:
                return Boolean.valueOf(((LiveVehiclesMarkerUIState.VehicleNumberViewUIState) obj).b.b != null);
            case 21:
                ((RouteItemUiState) obj).f.a();
                return unit;
            case 22:
                ((RouteBasedStopSearchForProductPurchaseComponent) obj).F0(RouteSelectionIntent.NextButtonClicked.f3964a);
                return unit;
            case 23:
                return SaveableStateRegistryWrapper._init_$lambda$0((SaveableStateRegistryWrapper) obj);
            case 24:
                ((RidesUIState) obj).d.c.a();
                return unit;
            case 25:
                ((SavedPlaceUIState) obj).g.a();
                return unit;
            case 26:
                return SavedStateHandleSupport.getSavedStateHandlesVM((ViewModelStoreOwner) obj);
            case 27:
                return SavedStateRegistryController.Companion.create$lambda$0((SavedStateRegistryOwner) obj);
            case 28:
                return Boolean.valueOf(((Scrollable2DNode) obj).getIsAttached());
            default:
                return ((PredictiveBackState) obj).getValue();
        }
    }
}
