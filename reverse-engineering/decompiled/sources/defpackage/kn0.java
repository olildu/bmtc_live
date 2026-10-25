package defpackage;

import app.chalo.core.navigation.premiumbus.PremiumBusParentComponent;
import app.chalo.home.ui.base.a;
import app.chalo.home.ui.history.uistate.ImageWithTextUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.SearchStopItemUiState;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent;
import app.chalo.premiumbus.managers.PremiumBusPurchaseInfoState;
import app.chalo.premiumbus.managers.PremiumBusSharedManagerViewModel;
import app.chalo.premiumbus.managers.PremiumBusSharedRestoredState;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsIntent;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler.PremiumBusLiveBusMarkerUIState;
import app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationViewState;
import app.chalo.premiumbus.ui.changestop.PbStopInfoCardUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.SearchItemUIState;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PremiumBusProductSelectionToolBarUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderPreferenceNudgeCardUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderSelectionOptionUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SingleSeatUIState;
import app.chalo.premiumbus.ui.slotselection.PbSlotCardUIState;
import app.chalo.productbooking.pickstop.StopItemUiState;
import app.chalo.productpurchase.passselection.ui.PassSelectionCategorySelectionData;
import app.chalo.productpurchase.passselection.ui.PassSelectionScreenType;
import app.chalo.productpurchase.passselection.ui.PassSelectionScreenTypeUIState;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigCategoryResponseAppModel;
import app.chalo.productsummary.ui.data.DocumentationUIState;
import app.chalo.productsummary.ui.data.TripHistoryCardUIState;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.IconButtonUIState;
import app.chalo.uistate.toolbar.ToolbarActionsUIState;
import io.github.alexzhirkevich.compottie.internal.layers.BaseLayer;
import io.github.alexzhirkevich.compottie.internal.layers.PrecompositionLayer;
import io.ktor.http.content.OutgoingContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.datetime.internal.format.parser.NumberSpanParserOperation;
import kotlinx.datetime.internal.format.parser.PlainStringParserOperation;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class kn0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17514a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kn0(Object obj, int i) {
        this.f17514a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List listD0;
        Collection collectionValues;
        int i = this.f17514a;
        Unit unit = Unit.f17538a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "Unexpected end of input: yet to parse " + ((NumberSpanParserOperation) obj).b();
            case 1:
                return ((OutgoingContent.ReadChannelContent) ((OutgoingContent) obj)).d();
            case 2:
                ((SearchStopItemUiState) obj).d.a();
                return unit;
            case 3:
                ((ButtonUIState) obj).f.a();
                return unit;
            case 4:
                ((SearchItemUIState) obj).d.invoke();
                return unit;
            case 5:
                return Integer.valueOf(((PassSelectionScreenTypeUIState.CategorySelection) obj).b.size());
            case 6:
                PassSelectionScreenType.PassSelection passSelection = (PassSelectionScreenType.PassSelection) obj;
                Collection<SuperPassProductConfigCategoryResponseAppModel> collectionValues2 = passSelection.c.values();
                ArrayList arrayList = new ArrayList(CollectionsKt.v(collectionValues2, 10));
                for (SuperPassProductConfigCategoryResponseAppModel superPassProductConfigCategoryResponseAppModel : collectionValues2) {
                    Map map = (Map) passSelection.b.get(superPassProductConfigCategoryResponseAppModel.f8639a);
                    if (map == null || (collectionValues = map.values()) == null || (listD0 = CollectionsKt.D0(collectionValues)) == null) {
                        listD0 = EmptyList.f17557a;
                    }
                    arrayList.add(new PassSelectionCategorySelectionData(superPassProductConfigCategoryResponseAppModel, listD0));
                }
                return arrayList;
            case 7:
                ((TripHistoryCardUIState) obj).e.a();
                return unit;
            case 8:
                UiEventHandler uiEventHandler = ((DocumentationUIState) obj).f8750a.f;
                if (uiEventHandler != null) {
                    uiEventHandler.a();
                }
                return unit;
            case 9:
                ((ImageWithTextUiState) obj).d.a();
                return unit;
            case 10:
                ((PbBulkBookingRideDetailsComponent) obj).E0(new mq0(20));
                return unit;
            case 11:
                ((a) obj).invoke();
                return unit;
            case 12:
                ((StopItemUiState) obj).e.a();
                return unit;
            case 13:
                ((IconButtonUIState) obj).b.a();
                return unit;
            case 14:
                return vo1.i('\'', ((PlainStringParserOperation) obj).f18040a, new StringBuilder("Unexpected end of input: yet to parse '"));
            case 15:
                PolymorphicSerializer polymorphicSerializer = (PolymorphicSerializer) obj;
                return ContextAwareKt.b(SerialDescriptorsKt.e("kotlinx.serialization.Polymorphic", PolymorphicKind.OPEN.f18099a, new SerialDescriptor[0], new ym0(polymorphicSerializer, 29)), polymorphicSerializer.f18092a);
            case 16:
                Iterable iterable = ((PrecompositionLayer) obj).x;
                if (iterable == null) {
                    iterable = EmptyList.f17557a;
                }
                Iterable iterable2 = iterable;
                int iG = MapsKt.g(CollectionsKt.v(iterable2, 10));
                if (iG < 16) {
                    iG = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
                for (Object obj2 : iterable2) {
                    String name = ((BaseLayer) obj2).getG();
                    if (name == null) {
                        name = "";
                    }
                    linkedHashMap.put(name, obj2);
                }
                return linkedHashMap;
            case 17:
                return Boolean.valueOf(((HashSet) obj).size() == 1);
            case 18:
                ((PremiumBusBulkBookingConfirmationViewState) obj).h.e.invoke();
                return unit;
            case 19:
                UiEventHandler uiEventHandler2 = ((PbStopInfoCardUIState) obj).c.b;
                if (uiEventHandler2 != null) {
                    uiEventHandler2.a();
                }
                return unit;
            case 20:
                return ((PremiumBusLiveBusMarkerUIState) obj).g;
            case 21:
                PremiumBusParentComponent premiumBusParentComponent = (PremiumBusParentComponent) obj;
                return ParametersHolderKt.a(premiumBusParentComponent.d, premiumBusParentComponent.e);
            case 22:
                ((PremiumBusProductModificationReasonsComponent) obj).N0(PremiumBusProductModificationReasonsIntent.OnBackPressedIntent.f7346a);
                return unit;
            case 23:
                ((PremiumBusProductSelectionToolBarUIState) obj).d.a();
                return unit;
            case 24:
                ((ToolbarActionsUIState) obj).f10116a.a();
                return unit;
            case 25:
                ((GenderSelectionOptionUIState) obj).c.a();
                return unit;
            case 26:
                UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = ((SingleSeatUIState) obj).e;
                if (uiEventHandler$Companion$fromLambda$1 != null) {
                    uiEventHandler$Companion$fromLambda$1.a();
                }
                return unit;
            case 27:
                ((GenderPreferenceNudgeCardUIState) obj).e.a();
                return unit;
            case 28:
                PremiumBusSharedManagerViewModel premiumBusSharedManagerViewModel = (PremiumBusSharedManagerViewModel) obj;
                return new PremiumBusSharedRestoredState(new PremiumBusPurchaseInfoState(premiumBusSharedManagerViewModel.n, premiumBusSharedManagerViewModel.p, premiumBusSharedManagerViewModel.q), premiumBusSharedManagerViewModel.l, premiumBusSharedManagerViewModel.o);
            default:
                ((PbSlotCardUIState) obj).i.a();
                return unit;
        }
    }
}
