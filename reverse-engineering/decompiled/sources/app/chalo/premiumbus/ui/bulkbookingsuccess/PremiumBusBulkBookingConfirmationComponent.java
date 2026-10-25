package app.chalo.premiumbus.ui.bulkbookingsuccess;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.bookingsuccessproducttype.BookingSuccessProductType;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.constants.Source;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.premiumbus.data.SuperPassDataWrapper;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusSelectedLocationType;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionFlowType;
import app.chalo.premiumbus.ui.slotselection.DateAndSlotSelectedForBulkBooking;
import app.chalo.premiumbus.ui.slotselection.SlotsAvailableForSelection;
import app.chalo.productbooking.common.domain.BulkPreBookUseCase;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdWithLocalCacheUseCase;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.BookingSuccessArgs;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.dialog.DialogUIStateFactory;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.StyledTextClickHandler$Companion$create$1;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.usecase.FormatTimeInMillisToGivenFormatUseCase;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.gt0;
import defpackage.mt0;
import defpackage.pk0;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationIntent;", "Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationDataState;", "Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationViewState;", "Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationSideEffect;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusBulkBookingConfirmationComponent extends ChaloBaseStateMviComponent<PremiumBusBulkBookingConfirmationIntent, PremiumBusBulkBookingConfirmationDataState, PremiumBusBulkBookingConfirmationViewState, PremiumBusBulkBookingConfirmationSideEffect> {
    public final ChaloNavigationManager k;
    public final SuperPassDataWrapper l;
    public final KotlinToastManager m;
    public final StringProvider n;
    public final BulkPreBookUseCase o;
    public final AnalyticsContract p;
    public final FormatTimeInMillisToGivenFormatUseCase q;
    public final FetchCompleteProductConfigByIdWithLocalCacheUseCase r;

    public PremiumBusBulkBookingConfirmationComponent(PremiumBusArgs.PremiumBusBulkBookingConfirmationScreenArgs premiumBusBulkBookingConfirmationScreenArgs, ComponentContext componentContext, ChaloNavigationManager chaloNavigationManager, SuperPassDataWrapper superPassDataWrapper, KotlinToastManager kotlinToastManager, StringProvider stringProvider, BulkPreBookUseCase bulkPreBookUseCase, AnalyticsContract analyticsContract, FormatTimeInMillisToGivenFormatUseCase formatTimeInMillisToGivenFormatUseCase, FetchCompleteProductConfigByIdWithLocalCacheUseCase fetchCompleteProductConfigByIdWithLocalCacheUseCase) {
        Object objB;
        super(componentContext);
        this.k = chaloNavigationManager;
        this.l = superPassDataWrapper;
        this.m = kotlinToastManager;
        this.n = stringProvider;
        this.o = bulkPreBookUseCase;
        this.p = analyticsContract;
        this.q = formatTimeInMillisToGivenFormatUseCase;
        this.r = fetchCompleteProductConfigByIdWithLocalCacheUseCase;
        ChaloJson chaloJson = ChaloJson.f6455a;
        String str = premiumBusBulkBookingConfirmationScreenArgs.d;
        try {
            Json json = ChaloJson.b;
            json.getClass();
            objB = json.b(str, PremiumBusSeatSelectionFlowType.INSTANCE.serializer());
        } catch (Exception unused) {
            objB = null;
        }
        PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType = (PremiumBusSeatSelectionFlowType) objB;
        if (premiumBusSeatSelectionFlowType == null) {
            ChaloNavigationManagerKt.c(this.k);
            return;
        }
        if (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.BulkBooking) {
            O0(new PremiumBusBulkBookingConfirmationIntent.InitializationIntent((PremiumBusSeatSelectionFlowType.BulkBooking) premiumBusSeatSelectionFlowType, premiumBusBulkBookingConfirmationScreenArgs.c));
        } else {
            if (!(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.ChangeSeat) && !(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchase) && !(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass) && !(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.Reschedule)) {
                throw new NoWhenBranchMatchedException();
            }
            ChaloNavigationManagerKt.c(this.k);
        }
    }

    public static final Object F0(PremiumBusBulkBookingConfirmationComponent premiumBusBulkBookingConfirmationComponent, List list, SuspendLambda suspendLambda) {
        StringProvider stringProvider = premiumBusBulkBookingConfirmationComponent.n;
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((DateAndSlotSelectedForBulkBooking) it.next()).d.size();
        }
        return size <= 1 ? stringProvider.b(StringEnum.BOOK_RIDE, new Object[0], suspendLambda) : stringProvider.b(StringEnum.BOOK_X_RIDES, new Object[]{new Integer(size)}, suspendLambda);
    }

    public static final LinkedHashMap G0(PremiumBusBulkBookingConfirmationComponent premiumBusBulkBookingConfirmationComponent, List list) {
        premiumBusBulkBookingConfirmationComponent.getClass();
        String strB = TimeUtilsContract.f10451a.a().b();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DateAndSlotSelectedForBulkBooking dateAndSlotSelectedForBulkBooking = (DateAndSlotSelectedForBulkBooking) it.next();
            List<SlotsAvailableForSelection> list2 = dateAndSlotSelectedForBulkBooking.d;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list2, 10));
            for (SlotsAvailableForSelection slotsAvailableForSelection : list2) {
                arrayList2.add(new Pair(Long.valueOf(TimeUtilsContract.f10451a.a().K(slotsAvailableForSelection.f7902a.c, strB)), new Pair(dateAndSlotSelectedForBulkBooking, slotsAvailableForSelection)));
            }
            CollectionsKt.i(arrayList2, arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            Long lValueOf = Long.valueOf(((Number) pair.d()).longValue());
            Object arrayList3 = linkedHashMap.get(lValueOf);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(lValueOf, arrayList3);
            }
            ((List) arrayList3).add((Pair) pair.e());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.g(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List<Pair> list3 = (List) entry.getValue();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Pair pair2 : list3) {
                DateAndSlotSelectedForBulkBooking dateAndSlotSelectedForBulkBooking2 = (DateAndSlotSelectedForBulkBooking) pair2.d();
                Object arrayList4 = linkedHashMap3.get(dateAndSlotSelectedForBulkBooking2);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap3.put(dateAndSlotSelectedForBulkBooking2, arrayList4);
                }
                ((List) arrayList4).add((SlotsAvailableForSelection) pair2.e());
            }
            ArrayList arrayList5 = new ArrayList(linkedHashMap3.size());
            for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                arrayList5.add(DateAndSlotSelectedForBulkBooking.a((DateAndSlotSelectedForBulkBooking) entry2.getKey(), (List) entry2.getValue()));
            }
            linkedHashMap2.put(key, arrayList5);
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0103  */
    /* JADX WARN: Code duplicated, block: B:31:0x0121  */
    /* JADX WARN: Code duplicated, block: B:35:0x0140  */
    /* JADX WARN: Code duplicated, block: B:39:0x0171  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object H0(PassInfo passInfo, ContinuationImpl continuationImpl) {
        PremiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1 premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1;
        PassInfo passInfo2;
        String strN;
        PassInfo passInfo3;
        String str;
        int i;
        ArrayList arrayListB0;
        int i2;
        PassInfo passInfo4;
        ChaloTextStyleHelper chaloTextStyleHelper;
        StringProvider stringProvider;
        Object objB;
        String str2;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        PassInfo passInfo5;
        List list;
        ChaloTextStyleHelper chaloTextStyleHelper3;
        TextUIState.ChaloTextUIState chaloTextUIStateA;
        PassInfo passInfo6;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ChaloTextStyleHelper chaloTextStyleHelper4;
        if (continuationImpl instanceof PremiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1) {
            premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1 = (PremiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1) continuationImpl;
            int i3 = premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.label = i3 - Integer.MIN_VALUE;
            } else {
                premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1 = new PremiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1 = new PremiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1(this, continuationImpl);
        }
        Object objB2 = premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.label;
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
        ChaloTextStyleHelper chaloTextStyleHelper5 = ChaloTextStyleHelper.f10078a;
        StringProvider stringProvider2 = this.n;
        if (i4 == 0) {
            ResultKt.b(objB2);
            passInfo2 = passInfo;
            premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$0 = passInfo2;
            premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.label = 1;
            objB2 = stringProvider2.b(StringEnum.VALID_TILL, new Object[0], premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1);
            if (objB2 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            PassInfo passInfo7 = (PassInfo) premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$0;
            ResultKt.b(objB2);
            passInfo2 = passInfo7;
        } else {
            if (i4 == 2) {
                strN = (String) premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$1;
                PassInfo passInfo8 = (PassInfo) premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$0;
                ResultKt.b(objB2);
                passInfo3 = passInfo8;
                str = (String) objB2;
                i = 0;
                arrayListB0 = CollectionsKt.b0(new StyledTextDataUIState(String.valueOf(passInfo3.e), almostBlackColor, UIFontWeight.Bold, UITextStyle.DisplayLarge, null, null, null, 1008));
                i2 = passInfo3.f;
                if (i2 > 0) {
                    passInfo4 = passInfo3;
                    shadyGray = shadyGray;
                    arrayListB0.add(new StyledTextDataUIState(pk0.g(i2, " / ", " ", str), shadyGray, null, UITextStyle.BodySmall, null, null, null, 1012));
                } else {
                    passInfo4 = passInfo3;
                    shadyGray = shadyGray;
                }
                premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$0 = passInfo4;
                premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$1 = strN;
                premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$2 = arrayListB0;
                chaloTextStyleHelper = chaloTextStyleHelper5;
                premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$3 = chaloTextStyleHelper;
                premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.label = 3;
                stringProvider = stringProvider2;
                objB = stringProvider.b(StringEnum.BOOKING_USING, new Object[0], premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1);
                if (objB != coroutineSingletons) {
                    str2 = strN;
                    chaloTextStyleHelper2 = chaloTextStyleHelper;
                    passInfo5 = passInfo4;
                    objB2 = objB;
                    list = arrayListB0;
                    chaloTextStyleHelper3 = chaloTextStyleHelper;
                    chaloTextUIStateA = ChaloTextStyleHelper.a(chaloTextStyleHelper2, (String) objB2, almostBlackColor, UIFontWeight.Bold, null, 108);
                    premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$0 = passInfo5;
                    premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$1 = str2;
                    premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$2 = list;
                    premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$3 = chaloTextUIStateA;
                    premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$4 = chaloTextStyleHelper3;
                    premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.CHALO_BUS_PASS, new Object[i], premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1);
                    if (objB2 != coroutineSingletons) {
                        passInfo6 = passInfo5;
                        chaloTextUIState = chaloTextUIStateA;
                        chaloTextStyleHelper4 = chaloTextStyleHelper3;
                    }
                }
                return coroutineSingletons;
            }
            if (i4 == 3) {
                ChaloTextStyleHelper chaloTextStyleHelper6 = (ChaloTextStyleHelper) premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$3;
                list = (List) premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$2;
                String str3 = (String) premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$1;
                PassInfo passInfo9 = (PassInfo) premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$0;
                ResultKt.b(objB2);
                str2 = str3;
                chaloTextStyleHelper = chaloTextStyleHelper5;
                i = 0;
                chaloTextStyleHelper2 = chaloTextStyleHelper6;
                passInfo5 = passInfo9;
                stringProvider = stringProvider2;
                chaloTextStyleHelper3 = chaloTextStyleHelper;
                chaloTextUIStateA = ChaloTextStyleHelper.a(chaloTextStyleHelper2, (String) objB2, almostBlackColor, UIFontWeight.Bold, null, 108);
                premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$0 = passInfo5;
                premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$1 = str2;
                premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$2 = list;
                premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$3 = chaloTextUIStateA;
                premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$4 = chaloTextStyleHelper3;
                premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.label = 4;
                objB2 = stringProvider.b(StringEnum.CHALO_BUS_PASS, new Object[i], premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1);
                if (objB2 != coroutineSingletons) {
                    passInfo6 = passInfo5;
                    chaloTextUIState = chaloTextUIStateA;
                    chaloTextStyleHelper4 = chaloTextStyleHelper3;
                }
                return coroutineSingletons;
            }
            if (i4 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChaloTextStyleHelper chaloTextStyleHelper7 = (ChaloTextStyleHelper) premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$4;
            chaloTextUIState = (TextUIState.ChaloTextUIState) premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$3;
            list = (List) premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$2;
            str2 = (String) premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$1;
            passInfo6 = (PassInfo) premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$0;
            ResultKt.b(objB2);
            chaloTextStyleHelper4 = chaloTextStyleHelper7;
            chaloTextStyleHelper3 = chaloTextStyleHelper5;
        }
        List list2 = list;
        ChaloTextStyleHelper chaloTextStyleHelper8 = chaloTextStyleHelper3;
        return new PassInfoUIState(chaloTextUIState, ChaloTextStyleHelper.f(chaloTextStyleHelper4, (String) objB2, ChaloColorToken.Black_87.f9768a, UIFontWeight.Bold, null, 108), ChaloTextStyleHelper.c(chaloTextStyleHelper8, passInfo6.f7491a, shadyGray, null, null, null, null, 124), ChaloTextStyleHelper.c(chaloTextStyleHelper8, str2, shadyGray, null, null, null, null, 124), new TextUIState.StyledTextUIState(list2, null, null, 30));
        strN = vo1.n((String) objB2, " ", TimeUtilsContract.f10451a.a().g(passInfo2.c));
        premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$0 = passInfo2;
        premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$1 = strN;
        premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.label = 2;
        objB2 = stringProvider2.b(StringEnum.TRIPS_LEFT, new Object[0], premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1);
        if (objB2 != coroutineSingletons) {
            passInfo3 = passInfo2;
            str = (String) objB2;
            i = 0;
            arrayListB0 = CollectionsKt.b0(new StyledTextDataUIState(String.valueOf(passInfo3.e), almostBlackColor, UIFontWeight.Bold, UITextStyle.DisplayLarge, null, null, null, 1008));
            i2 = passInfo3.f;
            if (i2 > 0) {
                passInfo4 = passInfo3;
                shadyGray = shadyGray;
                arrayListB0.add(new StyledTextDataUIState(pk0.g(i2, " / ", " ", str), shadyGray, null, UITextStyle.BodySmall, null, null, null, 1012));
            } else {
                passInfo4 = passInfo3;
                shadyGray = shadyGray;
            }
            premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$0 = passInfo4;
            premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$1 = strN;
            premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$2 = arrayListB0;
            chaloTextStyleHelper = chaloTextStyleHelper5;
            premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$3 = chaloTextStyleHelper;
            premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.label = 3;
            stringProvider = stringProvider2;
            objB = stringProvider.b(StringEnum.BOOKING_USING, new Object[0], premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1);
            if (objB != coroutineSingletons) {
                str2 = strN;
                chaloTextStyleHelper2 = chaloTextStyleHelper;
                passInfo5 = passInfo4;
                objB2 = objB;
                list = arrayListB0;
                chaloTextStyleHelper3 = chaloTextStyleHelper;
                chaloTextUIStateA = ChaloTextStyleHelper.a(chaloTextStyleHelper2, (String) objB2, almostBlackColor, UIFontWeight.Bold, null, 108);
                premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$0 = passInfo5;
                premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$1 = str2;
                premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$2 = list;
                premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$3 = chaloTextUIStateA;
                premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.L$4 = chaloTextStyleHelper3;
                premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1.label = 4;
                objB2 = stringProvider.b(StringEnum.CHALO_BUS_PASS, new Object[i], premiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1);
                if (objB2 != coroutineSingletons) {
                    passInfo6 = passInfo5;
                    chaloTextUIState = chaloTextUIStateA;
                    chaloTextStyleHelper4 = chaloTextStyleHelper3;
                    List list3 = list;
                    ChaloTextStyleHelper chaloTextStyleHelper9 = chaloTextStyleHelper3;
                    return new PassInfoUIState(chaloTextUIState, ChaloTextStyleHelper.f(chaloTextStyleHelper4, (String) objB2, ChaloColorToken.Black_87.f9768a, UIFontWeight.Bold, null, 108), ChaloTextStyleHelper.c(chaloTextStyleHelper9, passInfo6.f7491a, shadyGray, null, null, null, null, 124), ChaloTextStyleHelper.c(chaloTextStyleHelper9, str2, shadyGray, null, null, null, null, 124), new TextUIState.StyledTextUIState(list3, null, null, 30));
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object I0(long j, List list, TextUIState.ChaloTextUIState chaloTextUIState, ContinuationImpl continuationImpl) {
        PremiumBusBulkBookingConfirmationComponent$buildSlotAndSeatInfoUIState$1 premiumBusBulkBookingConfirmationComponent$buildSlotAndSeatInfoUIState$1;
        ChaloTextStyleHelper chaloTextStyleHelper;
        TextUIState.ChaloTextUIState chaloTextUIStateB;
        TextUIState.ChaloTextUIState chaloTextUIStateC;
        List list2;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        List list3;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        if (continuationImpl instanceof PremiumBusBulkBookingConfirmationComponent$buildSlotAndSeatInfoUIState$1) {
            premiumBusBulkBookingConfirmationComponent$buildSlotAndSeatInfoUIState$1 = (PremiumBusBulkBookingConfirmationComponent$buildSlotAndSeatInfoUIState$1) continuationImpl;
            int i = premiumBusBulkBookingConfirmationComponent$buildSlotAndSeatInfoUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusBulkBookingConfirmationComponent$buildSlotAndSeatInfoUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusBulkBookingConfirmationComponent$buildSlotAndSeatInfoUIState$1 = new PremiumBusBulkBookingConfirmationComponent$buildSlotAndSeatInfoUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusBulkBookingConfirmationComponent$buildSlotAndSeatInfoUIState$1 = new PremiumBusBulkBookingConfirmationComponent$buildSlotAndSeatInfoUIState$1(this, continuationImpl);
        }
        Object objB = premiumBusBulkBookingConfirmationComponent$buildSlotAndSeatInfoUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusBulkBookingConfirmationComponent$buildSlotAndSeatInfoUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            String strL = TimeUtilsContract.f10451a.a().l(j);
            UIFontWeight uIFontWeight = UIFontWeight.Bold;
            chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
            chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper, strL, ChaloColorToken.AlmostBlackColor.f9756a, 0, null, uIFontWeight, null, null, 108);
            if (list.isEmpty()) {
                premiumBusBulkBookingConfirmationComponent$buildSlotAndSeatInfoUIState$1.L$0 = list;
                premiumBusBulkBookingConfirmationComponent$buildSlotAndSeatInfoUIState$1.L$1 = chaloTextUIState;
                premiumBusBulkBookingConfirmationComponent$buildSlotAndSeatInfoUIState$1.L$2 = chaloTextUIStateB;
                premiumBusBulkBookingConfirmationComponent$buildSlotAndSeatInfoUIState$1.L$3 = chaloTextStyleHelper;
                premiumBusBulkBookingConfirmationComponent$buildSlotAndSeatInfoUIState$1.label = 1;
                objB = this.n.b(StringEnum.NO_DATES_SELECTED, new Object[0], premiumBusBulkBookingConfirmationComponent$buildSlotAndSeatInfoUIState$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                list3 = list;
                chaloTextUIState3 = chaloTextUIState;
            } else {
                chaloTextUIStateC = null;
                list2 = list;
                chaloTextUIState2 = chaloTextUIState;
            }
            return new SlotAndSeatInfoUIState(new ImageUIState(IconType.IC_TIME, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), chaloTextUIStateB, chaloTextUIState2, new ImageUIState(IconType.IC_SEAT_BLACK, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), list2, chaloTextUIStateC);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ChaloTextStyleHelper chaloTextStyleHelper2 = (ChaloTextStyleHelper) premiumBusBulkBookingConfirmationComponent$buildSlotAndSeatInfoUIState$1.L$3;
        chaloTextUIStateB = (TextUIState.ChaloTextUIState) premiumBusBulkBookingConfirmationComponent$buildSlotAndSeatInfoUIState$1.L$2;
        chaloTextUIState3 = (TextUIState.ChaloTextUIState) premiumBusBulkBookingConfirmationComponent$buildSlotAndSeatInfoUIState$1.L$1;
        list3 = (List) premiumBusBulkBookingConfirmationComponent$buildSlotAndSeatInfoUIState$1.L$0;
        ResultKt.b(objB);
        chaloTextStyleHelper = chaloTextStyleHelper2;
        chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper, (String) objB, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
        list2 = list3;
        chaloTextUIState2 = chaloTextUIState3;
        return new SlotAndSeatInfoUIState(new ImageUIState(IconType.IC_TIME, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), chaloTextUIStateB, chaloTextUIState2, new ImageUIState(IconType.IC_SEAT_BLACK, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), list2, chaloTextUIStateC);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x015e  */
    /* JADX WARN: Code duplicated, block: B:59:0x018b A[LOOP:0: B:57:0x0185->B:59:0x018b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x022b  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x022b -> B:64:0x022e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object J0(app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationDataState r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationComponent.J0(app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationDataState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0596  */
    /* JADX WARN: Code duplicated, block: B:106:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:108:0x05e5 A[LOOP:0: B:104:0x05d7->B:108:0x05e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x0617 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0407 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0296  */
    /* JADX WARN: Code duplicated, block: B:42:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:45:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:48:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:50:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:54:0x0310  */
    /* JADX WARN: Code duplicated, block: B:57:0x031e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0340  */
    /* JADX WARN: Code duplicated, block: B:63:0x034e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0359  */
    /* JADX WARN: Code duplicated, block: B:69:0x037d  */
    /* JADX WARN: Code duplicated, block: B:73:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:75:0x03bb A[LOOP:1: B:71:0x03ad->B:75:0x03bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0451  */
    /* JADX WARN: Code duplicated, block: B:85:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:87:0x0505  */
    /* JADX WARN: Code duplicated, block: B:90:0x051a  */
    /* JADX WARN: Instruction removed from duplicated block: B:108:0x05e5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x03bb, please report this as an issue */
    /* JADX WARN: Type inference failed for: r7v21, types: [app.chalo.uistate.text.UITextAlign, app.chalo.uistate.text.UITextOverflow] */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public final Object p0(PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState, ContinuationImpl continuationImpl) {
        PremiumBusBulkBookingConfirmationComponent$convertToUiState$1 premiumBusBulkBookingConfirmationComponent$convertToUiState$1;
        PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState2;
        Object objB;
        ChaloTextStyleHelper chaloTextStyleHelper;
        ToolbarUIState toolbarUIState;
        String str;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        RouteDetailInfoUIState routeDetailInfoUIState;
        Object objJ0;
        ToolbarUIState toolbarUIState2;
        Object obj;
        PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState3;
        RouteDetailInfoUIState routeDetailInfoUIState2;
        List list;
        PassInfo passInfo;
        PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState4;
        ToolbarUIState toolbarUIState3;
        RouteDetailInfoUIState routeDetailInfoUIState3;
        List list2;
        PassInfoUIState passInfoUIState;
        Object objH0;
        Object obj2;
        Object objL0;
        PassInfoUIState passInfoUIState2;
        Object obj3;
        PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState5;
        ToolbarUIState toolbarUIState4;
        RouteDetailInfoUIState routeDetailInfoUIState4;
        ButtonUIState buttonUIState;
        List list3;
        LoadingDialogUIState loadingDialogUIStateA;
        ButtonUIState buttonUIState2;
        DialogUIStateFactory dialogUIStateFactory;
        Object objB2;
        PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState6;
        List list4;
        PremiumBusBulkBookingConfirmationComponent premiumBusBulkBookingConfirmationComponent;
        RouteDetailInfoUIState routeDetailInfoUIState5;
        CoroutineSingletons coroutineSingletons;
        StringProvider stringProvider;
        ChaloColorToken.ShadyGray shadyGray;
        ChaloTextStyleHelper chaloTextStyleHelper3;
        String str2;
        TermsAndConditionsUIState termsAndConditionsUIState;
        Object objB3;
        Object obj4;
        LoadingDialogUIState loadingDialogUIState;
        PassInfoUIState passInfoUIState3;
        PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState7;
        ChaloTextStyleHelper chaloTextStyleHelper4;
        List list5;
        TextUIState.ChaloTextUIState chaloTextUIStateG;
        ArrayList arrayList;
        int i;
        RouteDetailInfoUIState routeDetailInfoUIState6;
        Object obj5;
        List list6;
        StyledTextDataUIState[] styledTextDataUIStateArr;
        PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState8;
        LoadingDialogUIState loadingDialogUIState2;
        Object objB4;
        ToolbarUIState toolbarUIState5;
        RouteDetailInfoUIState routeDetailInfoUIState7;
        Object obj6;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ButtonUIState buttonUIState3;
        StyledTextDataUIState[] styledTextDataUIStateArr2;
        StyledTextDataUIState[] styledTextDataUIStateArr3;
        LoadingDialogUIState loadingDialogUIState3;
        int i2;
        int i3;
        Object objB5;
        StyledTextDataUIState[] styledTextDataUIStateArr4;
        List list7;
        StyledTextDataUIState[] styledTextDataUIStateArr5;
        Object obj7;
        int i4;
        RouteDetailInfoUIState routeDetailInfoUIState8;
        LoadingDialogUIState loadingDialogUIState4;
        ButtonUIState buttonUIState4;
        PassInfoUIState passInfoUIState4;
        TermsAndConditionsUIState termsAndConditionsUIState2;
        List list8;
        ToolbarUIState toolbarUIState6;
        TermsAndConditionsBottomSheetUIState termsAndConditionsBottomSheetUIState;
        List list9;
        ChaloTextStyleHelper chaloTextStyleHelper5;
        PassInfoUIState passInfoUIState5;
        TermsAndConditionsUIState termsAndConditionsUIState3;
        ToolbarUIState toolbarUIState7;
        ChaloTextStyleHelper chaloTextStyleHelper6;
        ButtonUIState buttonUIState5;
        List list10;
        LoadingDialogUIState loadingDialogUIState5;
        Object obj8;
        TextUIState.ChaloTextUIState chaloTextUIStateG2;
        ButtonUIStateFactory buttonUIStateFactory;
        RouteDetailInfoUIState routeDetailInfoUIState9;
        Object objB6;
        List list11;
        LoadingDialogUIState loadingDialogUIState6;
        PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState9;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        TermsAndConditionsUIState termsAndConditionsUIState4;
        ChaloTextStyleHelper chaloTextStyleHelper7;
        PremiumBusBulkBookingConfirmationComponent premiumBusBulkBookingConfirmationComponent2;
        ArrayList arrayList2;
        int i5;
        int i6;
        if (continuationImpl instanceof PremiumBusBulkBookingConfirmationComponent$convertToUiState$1) {
            premiumBusBulkBookingConfirmationComponent$convertToUiState$1 = (PremiumBusBulkBookingConfirmationComponent$convertToUiState$1) continuationImpl;
            int i7 = premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = i7 - Integer.MIN_VALUE;
            } else {
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1 = new PremiumBusBulkBookingConfirmationComponent$convertToUiState$1(this, continuationImpl);
            }
        } else {
            premiumBusBulkBookingConfirmationComponent$convertToUiState$1 = new PremiumBusBulkBookingConfirmationComponent$convertToUiState$1(this, continuationImpl);
        }
        Object obj9 = premiumBusBulkBookingConfirmationComponent$convertToUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label;
        ChaloColorToken.ShadyGray shadyGray2 = ChaloColorToken.ShadyGray.f9851a;
        String str3 = ". ";
        ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
        StringProvider stringProvider2 = this.n;
        ChaloTextStyleHelper chaloTextStyleHelper8 = ChaloTextStyleHelper.f10078a;
        switch (i8) {
            case 0:
                ResultKt.b(obj9);
                premiumBusBulkBookingConfirmationDataState2 = premiumBusBulkBookingConfirmationDataState;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState2;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextStyleHelper8;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 1;
                objB = stringProvider2.b(StringEnum.CONFIRM_BOOKING, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                if (objB != coroutineSingletons2) {
                    chaloTextStyleHelper = chaloTextStyleHelper8;
                    toolbarUIState = new ToolbarUIState(null, ChaloTextStyleHelper.e(chaloTextStyleHelper, (String) objB, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, null, null, ChaloThemeHelper.b().f1917a, null, null, 221);
                    str = premiumBusBulkBookingConfirmationDataState2.k;
                    String str4 = premiumBusBulkBookingConfirmationDataState2.l;
                    if (str != null || str.length() == 0 || str4 == null || str4.length() == 0) {
                        chaloTextStyleHelper2 = chaloTextStyleHelper8;
                        routeDetailInfoUIState = null;
                    } else {
                        TextUIState.ChaloTextUIState chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper8, str, almostBlackColor, 0, null, null, null, null, 124);
                        TextUIState.ChaloTextUIState chaloTextUIStateB2 = ChaloTextStyleHelper.b(chaloTextStyleHelper8, str4, almostBlackColor, 0, null, null, null, null, 124);
                        chaloTextStyleHelper2 = chaloTextStyleHelper8;
                        routeDetailInfoUIState = new RouteDetailInfoUIState(chaloTextUIStateB, chaloTextUIStateB2);
                    }
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState2;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = routeDetailInfoUIState;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 2;
                    objJ0 = J0(premiumBusBulkBookingConfirmationDataState2, premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                    if (objJ0 != coroutineSingletons2) {
                        toolbarUIState2 = toolbarUIState;
                        obj = objJ0;
                        premiumBusBulkBookingConfirmationDataState3 = premiumBusBulkBookingConfirmationDataState2;
                        routeDetailInfoUIState2 = routeDetailInfoUIState;
                        list = (List) obj;
                        passInfo = premiumBusBulkBookingConfirmationDataState3.g;
                        if (passInfo != null) {
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState3;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState2;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = routeDetailInfoUIState2;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = list;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 3;
                            objH0 = H0(passInfo, premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                            if (objH0 != coroutineSingletons2) {
                                RouteDetailInfoUIState routeDetailInfoUIState10 = routeDetailInfoUIState2;
                                list2 = list;
                                obj2 = objH0;
                                premiumBusBulkBookingConfirmationDataState4 = premiumBusBulkBookingConfirmationDataState3;
                                toolbarUIState3 = toolbarUIState2;
                                routeDetailInfoUIState3 = routeDetailInfoUIState10;
                                passInfoUIState = (PassInfoUIState) obj2;
                                String str5 = premiumBusBulkBookingConfirmationDataState4.h;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState4;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState3;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = routeDetailInfoUIState3;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = list2;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = passInfoUIState;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 4;
                                objL0 = L0(str5, premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                if (objL0 != coroutineSingletons2) {
                                    RouteDetailInfoUIState routeDetailInfoUIState11 = routeDetailInfoUIState3;
                                    passInfoUIState2 = passInfoUIState;
                                    obj3 = objL0;
                                    premiumBusBulkBookingConfirmationDataState5 = premiumBusBulkBookingConfirmationDataState4;
                                    toolbarUIState4 = toolbarUIState3;
                                    routeDetailInfoUIState4 = routeDetailInfoUIState11;
                                    buttonUIState = (ButtonUIState) obj3;
                                    if (premiumBusBulkBookingConfirmationDataState5.f7495a) {
                                        list3 = list2;
                                        loadingDialogUIStateA = null;
                                        buttonUIState2 = buttonUIState;
                                        premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState5;
                                        list4 = premiumBusBulkBookingConfirmationDataState6.m;
                                        if (list4 != null) {
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState6;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = list4;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = chaloTextStyleHelper2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = toolbarUIState4;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = routeDetailInfoUIState4;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = list3;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = passInfoUIState2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = buttonUIState2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = loadingDialogUIStateA;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 6;
                                            objB3 = stringProvider2.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                            if (objB3 != coroutineSingletons2) {
                                                LoadingDialogUIState loadingDialogUIState7 = loadingDialogUIStateA;
                                                obj4 = objB3;
                                                loadingDialogUIState = loadingDialogUIState7;
                                                passInfoUIState3 = passInfoUIState2;
                                                premiumBusBulkBookingConfirmationDataState7 = premiumBusBulkBookingConfirmationDataState6;
                                                chaloTextStyleHelper4 = chaloTextStyleHelper2;
                                                List list12 = list4;
                                                list5 = list3;
                                                chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) obj4, almostBlackColor, null, UIFontWeight.Bold, null, null, 108);
                                                List list13 = list12;
                                                PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState10 = premiumBusBulkBookingConfirmationDataState7;
                                                arrayList = new ArrayList(CollectionsKt.v(list13, 10));
                                                i = 0;
                                                for (Object obj10 : list13) {
                                                    i3 = i + 1;
                                                    if (i >= 0) {
                                                        CollectionsKt.z0();
                                                        throw null;
                                                    }
                                                    ArrayList arrayList3 = arrayList;
                                                    ChaloTextStyleHelper chaloTextStyleHelper9 = chaloTextStyleHelper2;
                                                    chaloTextStyleHelper2 = chaloTextStyleHelper9;
                                                    arrayList3.add(ChaloTextStyleHelper.c(chaloTextStyleHelper9, i3 + str3 + ((String) obj10), shadyGray2, null, null, null, null, 124));
                                                    stringProvider2 = stringProvider2;
                                                    arrayList = arrayList3;
                                                    i = i3;
                                                    str3 = str3;
                                                    coroutineSingletons2 = coroutineSingletons2;
                                                    toolbarUIState4 = toolbarUIState4;
                                                    routeDetailInfoUIState4 = routeDetailInfoUIState4;
                                                }
                                                CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                                                stringProvider = stringProvider2;
                                                routeDetailInfoUIState6 = routeDetailInfoUIState4;
                                                str2 = str3;
                                                shadyGray2 = shadyGray2;
                                                obj5 = null;
                                                list6 = arrayList;
                                                styledTextDataUIStateArr = new StyledTextDataUIState[2];
                                                premiumBusBulkBookingConfirmationDataState8 = premiumBusBulkBookingConfirmationDataState10;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIStateG;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState4;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState6;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState2;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState;
                                                loadingDialogUIState2 = loadingDialogUIState;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 0;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 7;
                                                objB4 = stringProvider.b(StringEnum.TNC_PREFIX, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                                coroutineSingletons = coroutineSingletons3;
                                                if (objB4 == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                toolbarUIState5 = toolbarUIState4;
                                                routeDetailInfoUIState7 = routeDetailInfoUIState6;
                                                obj6 = objB4;
                                                chaloTextUIState = chaloTextUIStateG;
                                                buttonUIState3 = buttonUIState2;
                                                styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                                                styledTextDataUIStateArr3 = styledTextDataUIStateArr2;
                                                loadingDialogUIState3 = loadingDialogUIState2;
                                                i2 = 0;
                                                styledTextDataUIStateArr3[i2] = new StyledTextDataUIState((String) obj6, almostBlackColor, null, UITextStyle.BodySmall, null, null, null, 1012);
                                                shadyGray = shadyGray2;
                                                chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr2;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr2;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState7;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState3;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState3;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 1;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 8;
                                                objB5 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                                if (objB5 == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                styledTextDataUIStateArr4 = styledTextDataUIStateArr2;
                                                list7 = list5;
                                                styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                                                obj7 = objB5;
                                                i4 = 1;
                                                LoadingDialogUIState loadingDialogUIState8 = loadingDialogUIState3;
                                                String lowerCase = ((String) obj7).toLowerCase(Locale.ROOT);
                                                Intrinsics.h(lowerCase, "toLowerCase(...)");
                                                PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState11 = premiumBusBulkBookingConfirmationDataState8;
                                                premiumBusBulkBookingConfirmationComponent = this;
                                                styledTextDataUIStateArr4[i4] = new StyledTextDataUIState(" ".concat(lowerCase), ChaloColorToken.OrangePrimary.f9835a, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler$Companion$create$1("TNC", "TNC", new mt0(premiumBusBulkBookingConfirmationComponent, 0)), 496);
                                                ?? r7 = obj5;
                                                termsAndConditionsUIState = new TermsAndConditionsUIState(chaloTextUIState, list6, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), r7, r7, 30));
                                                buttonUIState2 = buttonUIState3;
                                                list3 = list7;
                                                routeDetailInfoUIState5 = routeDetailInfoUIState7;
                                                toolbarUIState4 = toolbarUIState5;
                                                passInfoUIState2 = passInfoUIState3;
                                                premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState11;
                                                loadingDialogUIStateA = loadingDialogUIState8;
                                            }
                                        } else {
                                            RouteDetailInfoUIState routeDetailInfoUIState12 = routeDetailInfoUIState4;
                                            premiumBusBulkBookingConfirmationComponent = this;
                                            routeDetailInfoUIState5 = routeDetailInfoUIState12;
                                            coroutineSingletons = coroutineSingletons2;
                                            stringProvider = stringProvider2;
                                            shadyGray = shadyGray2;
                                            chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                            str2 = ". ";
                                            termsAndConditionsUIState = null;
                                        }
                                        if (premiumBusBulkBookingConfirmationDataState6.n) {
                                        }
                                        routeDetailInfoUIState8 = routeDetailInfoUIState5;
                                        loadingDialogUIState4 = loadingDialogUIStateA;
                                        buttonUIState4 = buttonUIState2;
                                        passInfoUIState4 = passInfoUIState2;
                                        termsAndConditionsUIState2 = termsAndConditionsUIState;
                                        list8 = list3;
                                        toolbarUIState6 = toolbarUIState4;
                                        termsAndConditionsBottomSheetUIState = null;
                                        return new PremiumBusBulkBookingConfirmationViewState(toolbarUIState6, routeDetailInfoUIState8, list8, passInfoUIState4, buttonUIState4, loadingDialogUIState4, termsAndConditionsUIState2, termsAndConditionsBottomSheetUIState);
                                    }
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState5;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = routeDetailInfoUIState4;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = list2;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = passInfoUIState2;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = buttonUIState;
                                    dialogUIStateFactory = DialogUIStateFactory.f9989a;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = dialogUIStateFactory;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 5;
                                    objB2 = stringProvider2.b(StringEnum.LOADING, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                    if (objB2 != coroutineSingletons2) {
                                        list3 = list2;
                                        buttonUIState2 = buttonUIState;
                                        dialogUIStateFactory.getClass();
                                        loadingDialogUIStateA = DialogUIStateFactory.a((String) objB2);
                                        premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState5;
                                        list4 = premiumBusBulkBookingConfirmationDataState6.m;
                                        if (list4 != null) {
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState6;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = list4;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = chaloTextStyleHelper2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = toolbarUIState4;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = routeDetailInfoUIState4;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = list3;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = passInfoUIState2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = buttonUIState2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = loadingDialogUIStateA;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 6;
                                            objB3 = stringProvider2.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                            if (objB3 != coroutineSingletons2) {
                                                LoadingDialogUIState loadingDialogUIState9 = loadingDialogUIStateA;
                                                obj4 = objB3;
                                                loadingDialogUIState = loadingDialogUIState9;
                                                passInfoUIState3 = passInfoUIState2;
                                                premiumBusBulkBookingConfirmationDataState7 = premiumBusBulkBookingConfirmationDataState6;
                                                chaloTextStyleHelper4 = chaloTextStyleHelper2;
                                                List list14 = list4;
                                                list5 = list3;
                                                chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) obj4, almostBlackColor, null, UIFontWeight.Bold, null, null, 108);
                                                List list15 = list14;
                                                PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState12 = premiumBusBulkBookingConfirmationDataState7;
                                                arrayList = new ArrayList(CollectionsKt.v(list15, 10));
                                                i = 0;
                                                while (r16.hasNext()) {
                                                    i3 = i + 1;
                                                    if (i >= 0) {
                                                        CollectionsKt.z0();
                                                        throw null;
                                                    }
                                                    ArrayList arrayList4 = arrayList;
                                                    ChaloTextStyleHelper chaloTextStyleHelper10 = chaloTextStyleHelper2;
                                                    chaloTextStyleHelper2 = chaloTextStyleHelper10;
                                                    arrayList4.add(ChaloTextStyleHelper.c(chaloTextStyleHelper10, i3 + str3 + ((String) obj10), shadyGray2, null, null, null, null, 124));
                                                    stringProvider2 = stringProvider2;
                                                    arrayList = arrayList4;
                                                    i = i3;
                                                    str3 = str3;
                                                    coroutineSingletons2 = coroutineSingletons2;
                                                    toolbarUIState4 = toolbarUIState4;
                                                    routeDetailInfoUIState4 = routeDetailInfoUIState4;
                                                }
                                                CoroutineSingletons coroutineSingletons4 = coroutineSingletons2;
                                                stringProvider = stringProvider2;
                                                routeDetailInfoUIState6 = routeDetailInfoUIState4;
                                                str2 = str3;
                                                shadyGray2 = shadyGray2;
                                                obj5 = null;
                                                list6 = arrayList;
                                                styledTextDataUIStateArr = new StyledTextDataUIState[2];
                                                premiumBusBulkBookingConfirmationDataState8 = premiumBusBulkBookingConfirmationDataState12;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIStateG;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState4;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState6;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState2;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState;
                                                loadingDialogUIState2 = loadingDialogUIState;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 0;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 7;
                                                objB4 = stringProvider.b(StringEnum.TNC_PREFIX, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                                coroutineSingletons = coroutineSingletons4;
                                                if (objB4 == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                toolbarUIState5 = toolbarUIState4;
                                                routeDetailInfoUIState7 = routeDetailInfoUIState6;
                                                obj6 = objB4;
                                                chaloTextUIState = chaloTextUIStateG;
                                                buttonUIState3 = buttonUIState2;
                                                styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                                                styledTextDataUIStateArr3 = styledTextDataUIStateArr2;
                                                loadingDialogUIState3 = loadingDialogUIState2;
                                                i2 = 0;
                                                styledTextDataUIStateArr3[i2] = new StyledTextDataUIState((String) obj6, almostBlackColor, null, UITextStyle.BodySmall, null, null, null, 1012);
                                                shadyGray = shadyGray2;
                                                chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr2;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr2;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState7;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState3;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState3;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 1;
                                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 8;
                                                objB5 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                                if (objB5 == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                styledTextDataUIStateArr4 = styledTextDataUIStateArr2;
                                                list7 = list5;
                                                styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                                                obj7 = objB5;
                                                i4 = 1;
                                                LoadingDialogUIState loadingDialogUIState10 = loadingDialogUIState3;
                                                String lowerCase2 = ((String) obj7).toLowerCase(Locale.ROOT);
                                                Intrinsics.h(lowerCase2, "toLowerCase(...)");
                                                PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState13 = premiumBusBulkBookingConfirmationDataState8;
                                                premiumBusBulkBookingConfirmationComponent = this;
                                                styledTextDataUIStateArr4[i4] = new StyledTextDataUIState(" ".concat(lowerCase2), ChaloColorToken.OrangePrimary.f9835a, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler$Companion$create$1("TNC", "TNC", new mt0(premiumBusBulkBookingConfirmationComponent, 0)), 496);
                                                ?? r8 = obj5;
                                                termsAndConditionsUIState = new TermsAndConditionsUIState(chaloTextUIState, list6, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), r8, r8, 30));
                                                buttonUIState2 = buttonUIState3;
                                                list3 = list7;
                                                routeDetailInfoUIState5 = routeDetailInfoUIState7;
                                                toolbarUIState4 = toolbarUIState5;
                                                passInfoUIState2 = passInfoUIState3;
                                                premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState13;
                                                loadingDialogUIStateA = loadingDialogUIState10;
                                            }
                                        } else {
                                            RouteDetailInfoUIState routeDetailInfoUIState13 = routeDetailInfoUIState4;
                                            premiumBusBulkBookingConfirmationComponent = this;
                                            routeDetailInfoUIState5 = routeDetailInfoUIState13;
                                            coroutineSingletons = coroutineSingletons2;
                                            stringProvider = stringProvider2;
                                            shadyGray = shadyGray2;
                                            chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                            str2 = ". ";
                                            termsAndConditionsUIState = null;
                                        }
                                        if (premiumBusBulkBookingConfirmationDataState6.n || (list9 = premiumBusBulkBookingConfirmationDataState6.m) == null || list9.isEmpty()) {
                                            routeDetailInfoUIState8 = routeDetailInfoUIState5;
                                            loadingDialogUIState4 = loadingDialogUIStateA;
                                            buttonUIState4 = buttonUIState2;
                                            passInfoUIState4 = passInfoUIState2;
                                            termsAndConditionsUIState2 = termsAndConditionsUIState;
                                            list8 = list3;
                                            toolbarUIState6 = toolbarUIState4;
                                            termsAndConditionsBottomSheetUIState = null;
                                        } else {
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState6;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = routeDetailInfoUIState5;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = list3;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = passInfoUIState2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = buttonUIState2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIStateA;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = termsAndConditionsUIState;
                                            chaloTextStyleHelper5 = chaloTextStyleHelper3;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = chaloTextStyleHelper5;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = null;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = null;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 9;
                                            Object objB7 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                            if (objB7 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            passInfoUIState5 = passInfoUIState2;
                                            termsAndConditionsUIState3 = termsAndConditionsUIState;
                                            toolbarUIState7 = toolbarUIState4;
                                            chaloTextStyleHelper6 = chaloTextStyleHelper5;
                                            buttonUIState5 = buttonUIState2;
                                            list10 = list3;
                                            loadingDialogUIState5 = loadingDialogUIStateA;
                                            obj8 = objB7;
                                            chaloTextUIStateG2 = ChaloTextStyleHelper.g(chaloTextStyleHelper6, (String) obj8, almostBlackColor, null, UIFontWeight.Bold, null, null, 108);
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState6;
                                            buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = buttonUIStateFactory;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = toolbarUIState7;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = routeDetailInfoUIState5;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = list10;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = passInfoUIState5;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = buttonUIState5;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = loadingDialogUIState5;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = termsAndConditionsUIState3;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = chaloTextUIStateG2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = chaloTextStyleHelper5;
                                            routeDetailInfoUIState9 = routeDetailInfoUIState5;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 10;
                                            objB6 = stringProvider.b(StringEnum.OK, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                            if (objB6 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            list11 = list10;
                                            loadingDialogUIState6 = loadingDialogUIState5;
                                            premiumBusBulkBookingConfirmationDataState9 = premiumBusBulkBookingConfirmationDataState6;
                                            chaloTextUIState2 = chaloTextUIStateG2;
                                            obj9 = objB6;
                                            termsAndConditionsUIState4 = termsAndConditionsUIState3;
                                            chaloTextStyleHelper7 = chaloTextStyleHelper5;
                                            PassInfoUIState passInfoUIState6 = passInfoUIState5;
                                            ToolbarUIState toolbarUIState8 = toolbarUIState7;
                                            ButtonUIState buttonUIState6 = buttonUIState5;
                                            premiumBusBulkBookingConfirmationComponent2 = this;
                                            ButtonUIState buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.g(chaloTextStyleHelper7, (String) obj9, ChaloColorToken.White.f9870a, null, UIFontWeight.Bold, null, null, 108), new mt0(premiumBusBulkBookingConfirmationComponent2, 1), UIShape.e, false, 0.0f, 52);
                                            List list16 = premiumBusBulkBookingConfirmationDataState9.m;
                                            arrayList2 = new ArrayList(CollectionsKt.v(list16, 10));
                                            i5 = 0;
                                            for (Object obj11 : list16) {
                                                i6 = i5 + 1;
                                                if (i5 < 0) {
                                                    CollectionsKt.z0();
                                                    throw null;
                                                }
                                                ChaloTextStyleHelper chaloTextStyleHelper11 = chaloTextStyleHelper5;
                                                arrayList2.add(ChaloTextStyleHelper.c(chaloTextStyleHelper11, i6 + str2 + ((String) obj11), shadyGray, null, null, null, null, 124));
                                                chaloTextStyleHelper5 = chaloTextStyleHelper11;
                                                premiumBusBulkBookingConfirmationComponent2 = premiumBusBulkBookingConfirmationComponent2;
                                                i5 = i6;
                                            }
                                            termsAndConditionsUIState2 = termsAndConditionsUIState4;
                                            loadingDialogUIState4 = loadingDialogUIState6;
                                            termsAndConditionsBottomSheetUIState = new TermsAndConditionsBottomSheetUIState(chaloTextUIState2, buttonUIStateF, arrayList2, new mt0(premiumBusBulkBookingConfirmationComponent2, 2));
                                            buttonUIState4 = buttonUIState6;
                                            routeDetailInfoUIState8 = routeDetailInfoUIState9;
                                            passInfoUIState4 = passInfoUIState6;
                                            list8 = list11;
                                            toolbarUIState6 = toolbarUIState8;
                                        }
                                        return new PremiumBusBulkBookingConfirmationViewState(toolbarUIState6, routeDetailInfoUIState8, list8, passInfoUIState4, buttonUIState4, loadingDialogUIState4, termsAndConditionsUIState2, termsAndConditionsBottomSheetUIState);
                                    }
                                }
                            }
                        } else {
                            premiumBusBulkBookingConfirmationDataState4 = premiumBusBulkBookingConfirmationDataState3;
                            toolbarUIState3 = toolbarUIState2;
                            routeDetailInfoUIState3 = routeDetailInfoUIState2;
                            list2 = list;
                            passInfoUIState = null;
                            String str6 = premiumBusBulkBookingConfirmationDataState4.h;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState4;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState3;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = routeDetailInfoUIState3;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = list2;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = passInfoUIState;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 4;
                            objL0 = L0(str6, premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                            if (objL0 != coroutineSingletons2) {
                                RouteDetailInfoUIState routeDetailInfoUIState14 = routeDetailInfoUIState3;
                                passInfoUIState2 = passInfoUIState;
                                obj3 = objL0;
                                premiumBusBulkBookingConfirmationDataState5 = premiumBusBulkBookingConfirmationDataState4;
                                toolbarUIState4 = toolbarUIState3;
                                routeDetailInfoUIState4 = routeDetailInfoUIState14;
                                buttonUIState = (ButtonUIState) obj3;
                                if (premiumBusBulkBookingConfirmationDataState5.f7495a) {
                                    list3 = list2;
                                    loadingDialogUIStateA = null;
                                    buttonUIState2 = buttonUIState;
                                    premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState5;
                                    list4 = premiumBusBulkBookingConfirmationDataState6.m;
                                    if (list4 != null) {
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState6;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = list4;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = chaloTextStyleHelper2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = toolbarUIState4;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = routeDetailInfoUIState4;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = list3;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = passInfoUIState2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = buttonUIState2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = loadingDialogUIStateA;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 6;
                                        objB3 = stringProvider2.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                        if (objB3 != coroutineSingletons2) {
                                            LoadingDialogUIState loadingDialogUIState11 = loadingDialogUIStateA;
                                            obj4 = objB3;
                                            loadingDialogUIState = loadingDialogUIState11;
                                            passInfoUIState3 = passInfoUIState2;
                                            premiumBusBulkBookingConfirmationDataState7 = premiumBusBulkBookingConfirmationDataState6;
                                            chaloTextStyleHelper4 = chaloTextStyleHelper2;
                                            List list17 = list4;
                                            list5 = list3;
                                            chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) obj4, almostBlackColor, null, UIFontWeight.Bold, null, null, 108);
                                            List list18 = list17;
                                            PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState14 = premiumBusBulkBookingConfirmationDataState7;
                                            arrayList = new ArrayList(CollectionsKt.v(list18, 10));
                                            i = 0;
                                            while (r16.hasNext()) {
                                                i3 = i + 1;
                                                if (i >= 0) {
                                                    CollectionsKt.z0();
                                                    throw null;
                                                }
                                                ArrayList arrayList5 = arrayList;
                                                ChaloTextStyleHelper chaloTextStyleHelper12 = chaloTextStyleHelper2;
                                                chaloTextStyleHelper2 = chaloTextStyleHelper12;
                                                arrayList5.add(ChaloTextStyleHelper.c(chaloTextStyleHelper12, i3 + str3 + ((String) obj10), shadyGray2, null, null, null, null, 124));
                                                stringProvider2 = stringProvider2;
                                                arrayList = arrayList5;
                                                i = i3;
                                                str3 = str3;
                                                coroutineSingletons2 = coroutineSingletons2;
                                                toolbarUIState4 = toolbarUIState4;
                                                routeDetailInfoUIState4 = routeDetailInfoUIState4;
                                            }
                                            CoroutineSingletons coroutineSingletons5 = coroutineSingletons2;
                                            stringProvider = stringProvider2;
                                            routeDetailInfoUIState6 = routeDetailInfoUIState4;
                                            str2 = str3;
                                            shadyGray2 = shadyGray2;
                                            obj5 = null;
                                            list6 = arrayList;
                                            styledTextDataUIStateArr = new StyledTextDataUIState[2];
                                            premiumBusBulkBookingConfirmationDataState8 = premiumBusBulkBookingConfirmationDataState14;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIStateG;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState4;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState6;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState;
                                            loadingDialogUIState2 = loadingDialogUIState;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 0;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 7;
                                            objB4 = stringProvider.b(StringEnum.TNC_PREFIX, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                            coroutineSingletons = coroutineSingletons5;
                                            if (objB4 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            toolbarUIState5 = toolbarUIState4;
                                            routeDetailInfoUIState7 = routeDetailInfoUIState6;
                                            obj6 = objB4;
                                            chaloTextUIState = chaloTextUIStateG;
                                            buttonUIState3 = buttonUIState2;
                                            styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                                            styledTextDataUIStateArr3 = styledTextDataUIStateArr2;
                                            loadingDialogUIState3 = loadingDialogUIState2;
                                            i2 = 0;
                                            styledTextDataUIStateArr3[i2] = new StyledTextDataUIState((String) obj6, almostBlackColor, null, UITextStyle.BodySmall, null, null, null, 1012);
                                            shadyGray = shadyGray2;
                                            chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState7;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState3;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState3;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 1;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 8;
                                            objB5 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                            if (objB5 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            styledTextDataUIStateArr4 = styledTextDataUIStateArr2;
                                            list7 = list5;
                                            styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                                            obj7 = objB5;
                                            i4 = 1;
                                            LoadingDialogUIState loadingDialogUIState12 = loadingDialogUIState3;
                                            String lowerCase3 = ((String) obj7).toLowerCase(Locale.ROOT);
                                            Intrinsics.h(lowerCase3, "toLowerCase(...)");
                                            PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState15 = premiumBusBulkBookingConfirmationDataState8;
                                            premiumBusBulkBookingConfirmationComponent = this;
                                            styledTextDataUIStateArr4[i4] = new StyledTextDataUIState(" ".concat(lowerCase3), ChaloColorToken.OrangePrimary.f9835a, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler$Companion$create$1("TNC", "TNC", new mt0(premiumBusBulkBookingConfirmationComponent, 0)), 496);
                                            ?? r9 = obj5;
                                            termsAndConditionsUIState = new TermsAndConditionsUIState(chaloTextUIState, list6, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), r9, r9, 30));
                                            buttonUIState2 = buttonUIState3;
                                            list3 = list7;
                                            routeDetailInfoUIState5 = routeDetailInfoUIState7;
                                            toolbarUIState4 = toolbarUIState5;
                                            passInfoUIState2 = passInfoUIState3;
                                            premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState15;
                                            loadingDialogUIStateA = loadingDialogUIState12;
                                        }
                                    } else {
                                        RouteDetailInfoUIState routeDetailInfoUIState15 = routeDetailInfoUIState4;
                                        premiumBusBulkBookingConfirmationComponent = this;
                                        routeDetailInfoUIState5 = routeDetailInfoUIState15;
                                        coroutineSingletons = coroutineSingletons2;
                                        stringProvider = stringProvider2;
                                        shadyGray = shadyGray2;
                                        chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                        str2 = ". ";
                                        termsAndConditionsUIState = null;
                                    }
                                    if (premiumBusBulkBookingConfirmationDataState6.n) {
                                    }
                                    routeDetailInfoUIState8 = routeDetailInfoUIState5;
                                    loadingDialogUIState4 = loadingDialogUIStateA;
                                    buttonUIState4 = buttonUIState2;
                                    passInfoUIState4 = passInfoUIState2;
                                    termsAndConditionsUIState2 = termsAndConditionsUIState;
                                    list8 = list3;
                                    toolbarUIState6 = toolbarUIState4;
                                    termsAndConditionsBottomSheetUIState = null;
                                    return new PremiumBusBulkBookingConfirmationViewState(toolbarUIState6, routeDetailInfoUIState8, list8, passInfoUIState4, buttonUIState4, loadingDialogUIState4, termsAndConditionsUIState2, termsAndConditionsBottomSheetUIState);
                                }
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState5;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = routeDetailInfoUIState4;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = list2;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = passInfoUIState2;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = buttonUIState;
                                dialogUIStateFactory = DialogUIStateFactory.f9989a;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = dialogUIStateFactory;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 5;
                                objB2 = stringProvider2.b(StringEnum.LOADING, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                if (objB2 != coroutineSingletons2) {
                                    list3 = list2;
                                    buttonUIState2 = buttonUIState;
                                    dialogUIStateFactory.getClass();
                                    loadingDialogUIStateA = DialogUIStateFactory.a((String) objB2);
                                    premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState5;
                                    list4 = premiumBusBulkBookingConfirmationDataState6.m;
                                    if (list4 != null) {
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState6;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = list4;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = chaloTextStyleHelper2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = toolbarUIState4;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = routeDetailInfoUIState4;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = list3;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = passInfoUIState2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = buttonUIState2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = loadingDialogUIStateA;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 6;
                                        objB3 = stringProvider2.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                        if (objB3 != coroutineSingletons2) {
                                            LoadingDialogUIState loadingDialogUIState13 = loadingDialogUIStateA;
                                            obj4 = objB3;
                                            loadingDialogUIState = loadingDialogUIState13;
                                            passInfoUIState3 = passInfoUIState2;
                                            premiumBusBulkBookingConfirmationDataState7 = premiumBusBulkBookingConfirmationDataState6;
                                            chaloTextStyleHelper4 = chaloTextStyleHelper2;
                                            List list19 = list4;
                                            list5 = list3;
                                            chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) obj4, almostBlackColor, null, UIFontWeight.Bold, null, null, 108);
                                            List list110 = list19;
                                            PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState16 = premiumBusBulkBookingConfirmationDataState7;
                                            arrayList = new ArrayList(CollectionsKt.v(list110, 10));
                                            i = 0;
                                            while (r16.hasNext()) {
                                                i3 = i + 1;
                                                if (i >= 0) {
                                                    CollectionsKt.z0();
                                                    throw null;
                                                }
                                                ArrayList arrayList6 = arrayList;
                                                ChaloTextStyleHelper chaloTextStyleHelper13 = chaloTextStyleHelper2;
                                                chaloTextStyleHelper2 = chaloTextStyleHelper13;
                                                arrayList6.add(ChaloTextStyleHelper.c(chaloTextStyleHelper13, i3 + str3 + ((String) obj10), shadyGray2, null, null, null, null, 124));
                                                stringProvider2 = stringProvider2;
                                                arrayList = arrayList6;
                                                i = i3;
                                                str3 = str3;
                                                coroutineSingletons2 = coroutineSingletons2;
                                                toolbarUIState4 = toolbarUIState4;
                                                routeDetailInfoUIState4 = routeDetailInfoUIState4;
                                            }
                                            CoroutineSingletons coroutineSingletons6 = coroutineSingletons2;
                                            stringProvider = stringProvider2;
                                            routeDetailInfoUIState6 = routeDetailInfoUIState4;
                                            str2 = str3;
                                            shadyGray2 = shadyGray2;
                                            obj5 = null;
                                            list6 = arrayList;
                                            styledTextDataUIStateArr = new StyledTextDataUIState[2];
                                            premiumBusBulkBookingConfirmationDataState8 = premiumBusBulkBookingConfirmationDataState16;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIStateG;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState4;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState6;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState;
                                            loadingDialogUIState2 = loadingDialogUIState;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 0;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 7;
                                            objB4 = stringProvider.b(StringEnum.TNC_PREFIX, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                            coroutineSingletons = coroutineSingletons6;
                                            if (objB4 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            toolbarUIState5 = toolbarUIState4;
                                            routeDetailInfoUIState7 = routeDetailInfoUIState6;
                                            obj6 = objB4;
                                            chaloTextUIState = chaloTextUIStateG;
                                            buttonUIState3 = buttonUIState2;
                                            styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                                            styledTextDataUIStateArr3 = styledTextDataUIStateArr2;
                                            loadingDialogUIState3 = loadingDialogUIState2;
                                            i2 = 0;
                                            styledTextDataUIStateArr3[i2] = new StyledTextDataUIState((String) obj6, almostBlackColor, null, UITextStyle.BodySmall, null, null, null, 1012);
                                            shadyGray = shadyGray2;
                                            chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState7;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState3;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState3;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 1;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 8;
                                            objB5 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                            if (objB5 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            styledTextDataUIStateArr4 = styledTextDataUIStateArr2;
                                            list7 = list5;
                                            styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                                            obj7 = objB5;
                                            i4 = 1;
                                            LoadingDialogUIState loadingDialogUIState14 = loadingDialogUIState3;
                                            String lowerCase4 = ((String) obj7).toLowerCase(Locale.ROOT);
                                            Intrinsics.h(lowerCase4, "toLowerCase(...)");
                                            PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState17 = premiumBusBulkBookingConfirmationDataState8;
                                            premiumBusBulkBookingConfirmationComponent = this;
                                            styledTextDataUIStateArr4[i4] = new StyledTextDataUIState(" ".concat(lowerCase4), ChaloColorToken.OrangePrimary.f9835a, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler$Companion$create$1("TNC", "TNC", new mt0(premiumBusBulkBookingConfirmationComponent, 0)), 496);
                                            ?? r10 = obj5;
                                            termsAndConditionsUIState = new TermsAndConditionsUIState(chaloTextUIState, list6, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), r10, r10, 30));
                                            buttonUIState2 = buttonUIState3;
                                            list3 = list7;
                                            routeDetailInfoUIState5 = routeDetailInfoUIState7;
                                            toolbarUIState4 = toolbarUIState5;
                                            passInfoUIState2 = passInfoUIState3;
                                            premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState17;
                                            loadingDialogUIStateA = loadingDialogUIState14;
                                        }
                                    } else {
                                        RouteDetailInfoUIState routeDetailInfoUIState16 = routeDetailInfoUIState4;
                                        premiumBusBulkBookingConfirmationComponent = this;
                                        routeDetailInfoUIState5 = routeDetailInfoUIState16;
                                        coroutineSingletons = coroutineSingletons2;
                                        stringProvider = stringProvider2;
                                        shadyGray = shadyGray2;
                                        chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                        str2 = ". ";
                                        termsAndConditionsUIState = null;
                                    }
                                    if (premiumBusBulkBookingConfirmationDataState6.n) {
                                    }
                                    routeDetailInfoUIState8 = routeDetailInfoUIState5;
                                    loadingDialogUIState4 = loadingDialogUIStateA;
                                    buttonUIState4 = buttonUIState2;
                                    passInfoUIState4 = passInfoUIState2;
                                    termsAndConditionsUIState2 = termsAndConditionsUIState;
                                    list8 = list3;
                                    toolbarUIState6 = toolbarUIState4;
                                    termsAndConditionsBottomSheetUIState = null;
                                    return new PremiumBusBulkBookingConfirmationViewState(toolbarUIState6, routeDetailInfoUIState8, list8, passInfoUIState4, buttonUIState4, loadingDialogUIState4, termsAndConditionsUIState2, termsAndConditionsBottomSheetUIState);
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons2;
            case 1:
                ChaloTextStyleHelper chaloTextStyleHelper14 = (ChaloTextStyleHelper) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1;
                premiumBusBulkBookingConfirmationDataState2 = (PremiumBusBulkBookingConfirmationDataState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0;
                ResultKt.b(obj9);
                chaloTextStyleHelper = chaloTextStyleHelper14;
                objB = obj9;
                toolbarUIState = new ToolbarUIState(null, ChaloTextStyleHelper.e(chaloTextStyleHelper, (String) objB, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, null, null, ChaloThemeHelper.b().f1917a, null, null, 221);
                str = premiumBusBulkBookingConfirmationDataState2.k;
                String str7 = premiumBusBulkBookingConfirmationDataState2.l;
                if (str != null) {
                    chaloTextStyleHelper2 = chaloTextStyleHelper8;
                    routeDetailInfoUIState = null;
                } else {
                    chaloTextStyleHelper2 = chaloTextStyleHelper8;
                    routeDetailInfoUIState = null;
                }
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState2;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = routeDetailInfoUIState;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 2;
                objJ0 = J0(premiumBusBulkBookingConfirmationDataState2, premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                if (objJ0 != coroutineSingletons2) {
                    toolbarUIState2 = toolbarUIState;
                    obj = objJ0;
                    premiumBusBulkBookingConfirmationDataState3 = premiumBusBulkBookingConfirmationDataState2;
                    routeDetailInfoUIState2 = routeDetailInfoUIState;
                    list = (List) obj;
                    passInfo = premiumBusBulkBookingConfirmationDataState3.g;
                    if (passInfo != null) {
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState3;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState2;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = routeDetailInfoUIState2;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = list;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 3;
                        objH0 = H0(passInfo, premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                        if (objH0 != coroutineSingletons2) {
                            RouteDetailInfoUIState routeDetailInfoUIState17 = routeDetailInfoUIState2;
                            list2 = list;
                            obj2 = objH0;
                            premiumBusBulkBookingConfirmationDataState4 = premiumBusBulkBookingConfirmationDataState3;
                            toolbarUIState3 = toolbarUIState2;
                            routeDetailInfoUIState3 = routeDetailInfoUIState17;
                            passInfoUIState = (PassInfoUIState) obj2;
                            String str8 = premiumBusBulkBookingConfirmationDataState4.h;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState4;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState3;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = routeDetailInfoUIState3;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = list2;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = passInfoUIState;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 4;
                            objL0 = L0(str8, premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                            if (objL0 != coroutineSingletons2) {
                                RouteDetailInfoUIState routeDetailInfoUIState18 = routeDetailInfoUIState3;
                                passInfoUIState2 = passInfoUIState;
                                obj3 = objL0;
                                premiumBusBulkBookingConfirmationDataState5 = premiumBusBulkBookingConfirmationDataState4;
                                toolbarUIState4 = toolbarUIState3;
                                routeDetailInfoUIState4 = routeDetailInfoUIState18;
                                buttonUIState = (ButtonUIState) obj3;
                                if (premiumBusBulkBookingConfirmationDataState5.f7495a) {
                                    list3 = list2;
                                    loadingDialogUIStateA = null;
                                    buttonUIState2 = buttonUIState;
                                    premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState5;
                                    list4 = premiumBusBulkBookingConfirmationDataState6.m;
                                    if (list4 != null) {
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState6;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = list4;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = chaloTextStyleHelper2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = toolbarUIState4;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = routeDetailInfoUIState4;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = list3;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = passInfoUIState2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = buttonUIState2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = loadingDialogUIStateA;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 6;
                                        objB3 = stringProvider2.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                        if (objB3 != coroutineSingletons2) {
                                            LoadingDialogUIState loadingDialogUIState15 = loadingDialogUIStateA;
                                            obj4 = objB3;
                                            loadingDialogUIState = loadingDialogUIState15;
                                            passInfoUIState3 = passInfoUIState2;
                                            premiumBusBulkBookingConfirmationDataState7 = premiumBusBulkBookingConfirmationDataState6;
                                            chaloTextStyleHelper4 = chaloTextStyleHelper2;
                                            List list111 = list4;
                                            list5 = list3;
                                            chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) obj4, almostBlackColor, null, UIFontWeight.Bold, null, null, 108);
                                            List list112 = list111;
                                            PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState18 = premiumBusBulkBookingConfirmationDataState7;
                                            arrayList = new ArrayList(CollectionsKt.v(list112, 10));
                                            i = 0;
                                            while (r16.hasNext()) {
                                                i3 = i + 1;
                                                if (i >= 0) {
                                                    CollectionsKt.z0();
                                                    throw null;
                                                }
                                                ArrayList arrayList7 = arrayList;
                                                ChaloTextStyleHelper chaloTextStyleHelper15 = chaloTextStyleHelper2;
                                                chaloTextStyleHelper2 = chaloTextStyleHelper15;
                                                arrayList7.add(ChaloTextStyleHelper.c(chaloTextStyleHelper15, i3 + str3 + ((String) obj10), shadyGray2, null, null, null, null, 124));
                                                stringProvider2 = stringProvider2;
                                                arrayList = arrayList7;
                                                i = i3;
                                                str3 = str3;
                                                coroutineSingletons2 = coroutineSingletons2;
                                                toolbarUIState4 = toolbarUIState4;
                                                routeDetailInfoUIState4 = routeDetailInfoUIState4;
                                            }
                                            CoroutineSingletons coroutineSingletons7 = coroutineSingletons2;
                                            stringProvider = stringProvider2;
                                            routeDetailInfoUIState6 = routeDetailInfoUIState4;
                                            str2 = str3;
                                            shadyGray2 = shadyGray2;
                                            obj5 = null;
                                            list6 = arrayList;
                                            styledTextDataUIStateArr = new StyledTextDataUIState[2];
                                            premiumBusBulkBookingConfirmationDataState8 = premiumBusBulkBookingConfirmationDataState18;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIStateG;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState4;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState6;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState;
                                            loadingDialogUIState2 = loadingDialogUIState;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 0;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 7;
                                            objB4 = stringProvider.b(StringEnum.TNC_PREFIX, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                            coroutineSingletons = coroutineSingletons7;
                                            if (objB4 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            toolbarUIState5 = toolbarUIState4;
                                            routeDetailInfoUIState7 = routeDetailInfoUIState6;
                                            obj6 = objB4;
                                            chaloTextUIState = chaloTextUIStateG;
                                            buttonUIState3 = buttonUIState2;
                                            styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                                            styledTextDataUIStateArr3 = styledTextDataUIStateArr2;
                                            loadingDialogUIState3 = loadingDialogUIState2;
                                            i2 = 0;
                                            styledTextDataUIStateArr3[i2] = new StyledTextDataUIState((String) obj6, almostBlackColor, null, UITextStyle.BodySmall, null, null, null, 1012);
                                            shadyGray = shadyGray2;
                                            chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState7;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState3;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState3;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 1;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 8;
                                            objB5 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                            if (objB5 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            styledTextDataUIStateArr4 = styledTextDataUIStateArr2;
                                            list7 = list5;
                                            styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                                            obj7 = objB5;
                                            i4 = 1;
                                            LoadingDialogUIState loadingDialogUIState16 = loadingDialogUIState3;
                                            String lowerCase5 = ((String) obj7).toLowerCase(Locale.ROOT);
                                            Intrinsics.h(lowerCase5, "toLowerCase(...)");
                                            PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState19 = premiumBusBulkBookingConfirmationDataState8;
                                            premiumBusBulkBookingConfirmationComponent = this;
                                            styledTextDataUIStateArr4[i4] = new StyledTextDataUIState(" ".concat(lowerCase5), ChaloColorToken.OrangePrimary.f9835a, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler$Companion$create$1("TNC", "TNC", new mt0(premiumBusBulkBookingConfirmationComponent, 0)), 496);
                                            ?? r11 = obj5;
                                            termsAndConditionsUIState = new TermsAndConditionsUIState(chaloTextUIState, list6, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), r11, r11, 30));
                                            buttonUIState2 = buttonUIState3;
                                            list3 = list7;
                                            routeDetailInfoUIState5 = routeDetailInfoUIState7;
                                            toolbarUIState4 = toolbarUIState5;
                                            passInfoUIState2 = passInfoUIState3;
                                            premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState19;
                                            loadingDialogUIStateA = loadingDialogUIState16;
                                        }
                                    } else {
                                        RouteDetailInfoUIState routeDetailInfoUIState19 = routeDetailInfoUIState4;
                                        premiumBusBulkBookingConfirmationComponent = this;
                                        routeDetailInfoUIState5 = routeDetailInfoUIState19;
                                        coroutineSingletons = coroutineSingletons2;
                                        stringProvider = stringProvider2;
                                        shadyGray = shadyGray2;
                                        chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                        str2 = ". ";
                                        termsAndConditionsUIState = null;
                                    }
                                    if (premiumBusBulkBookingConfirmationDataState6.n) {
                                        break;
                                    }
                                    routeDetailInfoUIState8 = routeDetailInfoUIState5;
                                    loadingDialogUIState4 = loadingDialogUIStateA;
                                    buttonUIState4 = buttonUIState2;
                                    passInfoUIState4 = passInfoUIState2;
                                    termsAndConditionsUIState2 = termsAndConditionsUIState;
                                    list8 = list3;
                                    toolbarUIState6 = toolbarUIState4;
                                    termsAndConditionsBottomSheetUIState = null;
                                    return new PremiumBusBulkBookingConfirmationViewState(toolbarUIState6, routeDetailInfoUIState8, list8, passInfoUIState4, buttonUIState4, loadingDialogUIState4, termsAndConditionsUIState2, termsAndConditionsBottomSheetUIState);
                                }
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState5;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = routeDetailInfoUIState4;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = list2;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = passInfoUIState2;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = buttonUIState;
                                dialogUIStateFactory = DialogUIStateFactory.f9989a;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = dialogUIStateFactory;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 5;
                                objB2 = stringProvider2.b(StringEnum.LOADING, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                if (objB2 != coroutineSingletons2) {
                                    list3 = list2;
                                    buttonUIState2 = buttonUIState;
                                    dialogUIStateFactory.getClass();
                                    loadingDialogUIStateA = DialogUIStateFactory.a((String) objB2);
                                    premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState5;
                                    list4 = premiumBusBulkBookingConfirmationDataState6.m;
                                    if (list4 != null) {
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState6;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = list4;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = chaloTextStyleHelper2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = toolbarUIState4;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = routeDetailInfoUIState4;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = list3;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = passInfoUIState2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = buttonUIState2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = loadingDialogUIStateA;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 6;
                                        objB3 = stringProvider2.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                        if (objB3 != coroutineSingletons2) {
                                            LoadingDialogUIState loadingDialogUIState17 = loadingDialogUIStateA;
                                            obj4 = objB3;
                                            loadingDialogUIState = loadingDialogUIState17;
                                            passInfoUIState3 = passInfoUIState2;
                                            premiumBusBulkBookingConfirmationDataState7 = premiumBusBulkBookingConfirmationDataState6;
                                            chaloTextStyleHelper4 = chaloTextStyleHelper2;
                                            List list113 = list4;
                                            list5 = list3;
                                            chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) obj4, almostBlackColor, null, UIFontWeight.Bold, null, null, 108);
                                            List list114 = list113;
                                            PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState110 = premiumBusBulkBookingConfirmationDataState7;
                                            arrayList = new ArrayList(CollectionsKt.v(list114, 10));
                                            i = 0;
                                            while (r16.hasNext()) {
                                                i3 = i + 1;
                                                if (i >= 0) {
                                                    CollectionsKt.z0();
                                                    throw null;
                                                }
                                                ArrayList arrayList8 = arrayList;
                                                ChaloTextStyleHelper chaloTextStyleHelper16 = chaloTextStyleHelper2;
                                                chaloTextStyleHelper2 = chaloTextStyleHelper16;
                                                arrayList8.add(ChaloTextStyleHelper.c(chaloTextStyleHelper16, i3 + str3 + ((String) obj10), shadyGray2, null, null, null, null, 124));
                                                stringProvider2 = stringProvider2;
                                                arrayList = arrayList8;
                                                i = i3;
                                                str3 = str3;
                                                coroutineSingletons2 = coroutineSingletons2;
                                                toolbarUIState4 = toolbarUIState4;
                                                routeDetailInfoUIState4 = routeDetailInfoUIState4;
                                            }
                                            CoroutineSingletons coroutineSingletons8 = coroutineSingletons2;
                                            stringProvider = stringProvider2;
                                            routeDetailInfoUIState6 = routeDetailInfoUIState4;
                                            str2 = str3;
                                            shadyGray2 = shadyGray2;
                                            obj5 = null;
                                            list6 = arrayList;
                                            styledTextDataUIStateArr = new StyledTextDataUIState[2];
                                            premiumBusBulkBookingConfirmationDataState8 = premiumBusBulkBookingConfirmationDataState110;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIStateG;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState4;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState6;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState;
                                            loadingDialogUIState2 = loadingDialogUIState;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 0;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 7;
                                            objB4 = stringProvider.b(StringEnum.TNC_PREFIX, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                            coroutineSingletons = coroutineSingletons8;
                                            if (objB4 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            toolbarUIState5 = toolbarUIState4;
                                            routeDetailInfoUIState7 = routeDetailInfoUIState6;
                                            obj6 = objB4;
                                            chaloTextUIState = chaloTextUIStateG;
                                            buttonUIState3 = buttonUIState2;
                                            styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                                            styledTextDataUIStateArr3 = styledTextDataUIStateArr2;
                                            loadingDialogUIState3 = loadingDialogUIState2;
                                            i2 = 0;
                                            styledTextDataUIStateArr3[i2] = new StyledTextDataUIState((String) obj6, almostBlackColor, null, UITextStyle.BodySmall, null, null, null, 1012);
                                            shadyGray = shadyGray2;
                                            chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr2;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState7;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState3;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState3;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 1;
                                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 8;
                                            objB5 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                            if (objB5 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            styledTextDataUIStateArr4 = styledTextDataUIStateArr2;
                                            list7 = list5;
                                            styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                                            obj7 = objB5;
                                            i4 = 1;
                                            LoadingDialogUIState loadingDialogUIState18 = loadingDialogUIState3;
                                            String lowerCase6 = ((String) obj7).toLowerCase(Locale.ROOT);
                                            Intrinsics.h(lowerCase6, "toLowerCase(...)");
                                            PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState111 = premiumBusBulkBookingConfirmationDataState8;
                                            premiumBusBulkBookingConfirmationComponent = this;
                                            styledTextDataUIStateArr4[i4] = new StyledTextDataUIState(" ".concat(lowerCase6), ChaloColorToken.OrangePrimary.f9835a, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler$Companion$create$1("TNC", "TNC", new mt0(premiumBusBulkBookingConfirmationComponent, 0)), 496);
                                            ?? r12 = obj5;
                                            termsAndConditionsUIState = new TermsAndConditionsUIState(chaloTextUIState, list6, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), r12, r12, 30));
                                            buttonUIState2 = buttonUIState3;
                                            list3 = list7;
                                            routeDetailInfoUIState5 = routeDetailInfoUIState7;
                                            toolbarUIState4 = toolbarUIState5;
                                            passInfoUIState2 = passInfoUIState3;
                                            premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState111;
                                            loadingDialogUIStateA = loadingDialogUIState18;
                                        }
                                    } else {
                                        RouteDetailInfoUIState routeDetailInfoUIState110 = routeDetailInfoUIState4;
                                        premiumBusBulkBookingConfirmationComponent = this;
                                        routeDetailInfoUIState5 = routeDetailInfoUIState110;
                                        coroutineSingletons = coroutineSingletons2;
                                        stringProvider = stringProvider2;
                                        shadyGray = shadyGray2;
                                        chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                        str2 = ". ";
                                        termsAndConditionsUIState = null;
                                    }
                                    if (premiumBusBulkBookingConfirmationDataState6.n) {
                                        break;
                                    }
                                    routeDetailInfoUIState8 = routeDetailInfoUIState5;
                                    loadingDialogUIState4 = loadingDialogUIStateA;
                                    buttonUIState4 = buttonUIState2;
                                    passInfoUIState4 = passInfoUIState2;
                                    termsAndConditionsUIState2 = termsAndConditionsUIState;
                                    list8 = list3;
                                    toolbarUIState6 = toolbarUIState4;
                                    termsAndConditionsBottomSheetUIState = null;
                                    return new PremiumBusBulkBookingConfirmationViewState(toolbarUIState6, routeDetailInfoUIState8, list8, passInfoUIState4, buttonUIState4, loadingDialogUIState4, termsAndConditionsUIState2, termsAndConditionsBottomSheetUIState);
                                }
                            }
                        }
                    } else {
                        premiumBusBulkBookingConfirmationDataState4 = premiumBusBulkBookingConfirmationDataState3;
                        toolbarUIState3 = toolbarUIState2;
                        routeDetailInfoUIState3 = routeDetailInfoUIState2;
                        list2 = list;
                        passInfoUIState = null;
                        String str9 = premiumBusBulkBookingConfirmationDataState4.h;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState4;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState3;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = routeDetailInfoUIState3;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = list2;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = passInfoUIState;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 4;
                        objL0 = L0(str9, premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                        if (objL0 != coroutineSingletons2) {
                            RouteDetailInfoUIState routeDetailInfoUIState111 = routeDetailInfoUIState3;
                            passInfoUIState2 = passInfoUIState;
                            obj3 = objL0;
                            premiumBusBulkBookingConfirmationDataState5 = premiumBusBulkBookingConfirmationDataState4;
                            toolbarUIState4 = toolbarUIState3;
                            routeDetailInfoUIState4 = routeDetailInfoUIState111;
                            buttonUIState = (ButtonUIState) obj3;
                            if (premiumBusBulkBookingConfirmationDataState5.f7495a) {
                                list3 = list2;
                                loadingDialogUIStateA = null;
                                buttonUIState2 = buttonUIState;
                                premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState5;
                                list4 = premiumBusBulkBookingConfirmationDataState6.m;
                                if (list4 != null) {
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState6;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = list4;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = chaloTextStyleHelper2;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = toolbarUIState4;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = routeDetailInfoUIState4;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = list3;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = passInfoUIState2;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = buttonUIState2;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = loadingDialogUIStateA;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 6;
                                    objB3 = stringProvider2.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                    if (objB3 != coroutineSingletons2) {
                                        LoadingDialogUIState loadingDialogUIState19 = loadingDialogUIStateA;
                                        obj4 = objB3;
                                        loadingDialogUIState = loadingDialogUIState19;
                                        passInfoUIState3 = passInfoUIState2;
                                        premiumBusBulkBookingConfirmationDataState7 = premiumBusBulkBookingConfirmationDataState6;
                                        chaloTextStyleHelper4 = chaloTextStyleHelper2;
                                        List list115 = list4;
                                        list5 = list3;
                                        chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) obj4, almostBlackColor, null, UIFontWeight.Bold, null, null, 108);
                                        List list116 = list115;
                                        PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState112 = premiumBusBulkBookingConfirmationDataState7;
                                        arrayList = new ArrayList(CollectionsKt.v(list116, 10));
                                        i = 0;
                                        while (r16.hasNext()) {
                                            i3 = i + 1;
                                            if (i >= 0) {
                                                CollectionsKt.z0();
                                                throw null;
                                            }
                                            ArrayList arrayList9 = arrayList;
                                            ChaloTextStyleHelper chaloTextStyleHelper17 = chaloTextStyleHelper2;
                                            chaloTextStyleHelper2 = chaloTextStyleHelper17;
                                            arrayList9.add(ChaloTextStyleHelper.c(chaloTextStyleHelper17, i3 + str3 + ((String) obj10), shadyGray2, null, null, null, null, 124));
                                            stringProvider2 = stringProvider2;
                                            arrayList = arrayList9;
                                            i = i3;
                                            str3 = str3;
                                            coroutineSingletons2 = coroutineSingletons2;
                                            toolbarUIState4 = toolbarUIState4;
                                            routeDetailInfoUIState4 = routeDetailInfoUIState4;
                                        }
                                        CoroutineSingletons coroutineSingletons9 = coroutineSingletons2;
                                        stringProvider = stringProvider2;
                                        routeDetailInfoUIState6 = routeDetailInfoUIState4;
                                        str2 = str3;
                                        shadyGray2 = shadyGray2;
                                        obj5 = null;
                                        list6 = arrayList;
                                        styledTextDataUIStateArr = new StyledTextDataUIState[2];
                                        premiumBusBulkBookingConfirmationDataState8 = premiumBusBulkBookingConfirmationDataState112;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIStateG;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState4;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState6;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 0;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 7;
                                        objB4 = stringProvider.b(StringEnum.TNC_PREFIX, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                        coroutineSingletons = coroutineSingletons9;
                                        if (objB4 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        toolbarUIState5 = toolbarUIState4;
                                        routeDetailInfoUIState7 = routeDetailInfoUIState6;
                                        obj6 = objB4;
                                        chaloTextUIState = chaloTextUIStateG;
                                        buttonUIState3 = buttonUIState2;
                                        styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                                        styledTextDataUIStateArr3 = styledTextDataUIStateArr2;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        i2 = 0;
                                        styledTextDataUIStateArr3[i2] = new StyledTextDataUIState((String) obj6, almostBlackColor, null, UITextStyle.BodySmall, null, null, null, 1012);
                                        shadyGray = shadyGray2;
                                        chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState7;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState3;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState3;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 1;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 8;
                                        objB5 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                        if (objB5 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        styledTextDataUIStateArr4 = styledTextDataUIStateArr2;
                                        list7 = list5;
                                        styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                                        obj7 = objB5;
                                        i4 = 1;
                                        LoadingDialogUIState loadingDialogUIState110 = loadingDialogUIState3;
                                        String lowerCase7 = ((String) obj7).toLowerCase(Locale.ROOT);
                                        Intrinsics.h(lowerCase7, "toLowerCase(...)");
                                        PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState113 = premiumBusBulkBookingConfirmationDataState8;
                                        premiumBusBulkBookingConfirmationComponent = this;
                                        styledTextDataUIStateArr4[i4] = new StyledTextDataUIState(" ".concat(lowerCase7), ChaloColorToken.OrangePrimary.f9835a, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler$Companion$create$1("TNC", "TNC", new mt0(premiumBusBulkBookingConfirmationComponent, 0)), 496);
                                        ?? r13 = obj5;
                                        termsAndConditionsUIState = new TermsAndConditionsUIState(chaloTextUIState, list6, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), r13, r13, 30));
                                        buttonUIState2 = buttonUIState3;
                                        list3 = list7;
                                        routeDetailInfoUIState5 = routeDetailInfoUIState7;
                                        toolbarUIState4 = toolbarUIState5;
                                        passInfoUIState2 = passInfoUIState3;
                                        premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState113;
                                        loadingDialogUIStateA = loadingDialogUIState110;
                                    }
                                } else {
                                    RouteDetailInfoUIState routeDetailInfoUIState112 = routeDetailInfoUIState4;
                                    premiumBusBulkBookingConfirmationComponent = this;
                                    routeDetailInfoUIState5 = routeDetailInfoUIState112;
                                    coroutineSingletons = coroutineSingletons2;
                                    stringProvider = stringProvider2;
                                    shadyGray = shadyGray2;
                                    chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                    str2 = ". ";
                                    termsAndConditionsUIState = null;
                                }
                                if (premiumBusBulkBookingConfirmationDataState6.n) {
                                    break;
                                }
                                routeDetailInfoUIState8 = routeDetailInfoUIState5;
                                loadingDialogUIState4 = loadingDialogUIStateA;
                                buttonUIState4 = buttonUIState2;
                                passInfoUIState4 = passInfoUIState2;
                                termsAndConditionsUIState2 = termsAndConditionsUIState;
                                list8 = list3;
                                toolbarUIState6 = toolbarUIState4;
                                termsAndConditionsBottomSheetUIState = null;
                                return new PremiumBusBulkBookingConfirmationViewState(toolbarUIState6, routeDetailInfoUIState8, list8, passInfoUIState4, buttonUIState4, loadingDialogUIState4, termsAndConditionsUIState2, termsAndConditionsBottomSheetUIState);
                            }
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState5;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = routeDetailInfoUIState4;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = list2;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = passInfoUIState2;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = buttonUIState;
                            dialogUIStateFactory = DialogUIStateFactory.f9989a;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = dialogUIStateFactory;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 5;
                            objB2 = stringProvider2.b(StringEnum.LOADING, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                            if (objB2 != coroutineSingletons2) {
                                list3 = list2;
                                buttonUIState2 = buttonUIState;
                                dialogUIStateFactory.getClass();
                                loadingDialogUIStateA = DialogUIStateFactory.a((String) objB2);
                                premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState5;
                                list4 = premiumBusBulkBookingConfirmationDataState6.m;
                                if (list4 != null) {
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState6;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = list4;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = chaloTextStyleHelper2;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = toolbarUIState4;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = routeDetailInfoUIState4;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = list3;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = passInfoUIState2;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = buttonUIState2;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = loadingDialogUIStateA;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 6;
                                    objB3 = stringProvider2.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                    if (objB3 != coroutineSingletons2) {
                                        LoadingDialogUIState loadingDialogUIState111 = loadingDialogUIStateA;
                                        obj4 = objB3;
                                        loadingDialogUIState = loadingDialogUIState111;
                                        passInfoUIState3 = passInfoUIState2;
                                        premiumBusBulkBookingConfirmationDataState7 = premiumBusBulkBookingConfirmationDataState6;
                                        chaloTextStyleHelper4 = chaloTextStyleHelper2;
                                        List list117 = list4;
                                        list5 = list3;
                                        chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) obj4, almostBlackColor, null, UIFontWeight.Bold, null, null, 108);
                                        List list118 = list117;
                                        PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState114 = premiumBusBulkBookingConfirmationDataState7;
                                        arrayList = new ArrayList(CollectionsKt.v(list118, 10));
                                        i = 0;
                                        while (r16.hasNext()) {
                                            i3 = i + 1;
                                            if (i >= 0) {
                                                CollectionsKt.z0();
                                                throw null;
                                            }
                                            ArrayList arrayList10 = arrayList;
                                            ChaloTextStyleHelper chaloTextStyleHelper18 = chaloTextStyleHelper2;
                                            chaloTextStyleHelper2 = chaloTextStyleHelper18;
                                            arrayList10.add(ChaloTextStyleHelper.c(chaloTextStyleHelper18, i3 + str3 + ((String) obj10), shadyGray2, null, null, null, null, 124));
                                            stringProvider2 = stringProvider2;
                                            arrayList = arrayList10;
                                            i = i3;
                                            str3 = str3;
                                            coroutineSingletons2 = coroutineSingletons2;
                                            toolbarUIState4 = toolbarUIState4;
                                            routeDetailInfoUIState4 = routeDetailInfoUIState4;
                                        }
                                        CoroutineSingletons coroutineSingletons10 = coroutineSingletons2;
                                        stringProvider = stringProvider2;
                                        routeDetailInfoUIState6 = routeDetailInfoUIState4;
                                        str2 = str3;
                                        shadyGray2 = shadyGray2;
                                        obj5 = null;
                                        list6 = arrayList;
                                        styledTextDataUIStateArr = new StyledTextDataUIState[2];
                                        premiumBusBulkBookingConfirmationDataState8 = premiumBusBulkBookingConfirmationDataState114;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIStateG;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState4;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState6;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 0;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 7;
                                        objB4 = stringProvider.b(StringEnum.TNC_PREFIX, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                        coroutineSingletons = coroutineSingletons10;
                                        if (objB4 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        toolbarUIState5 = toolbarUIState4;
                                        routeDetailInfoUIState7 = routeDetailInfoUIState6;
                                        obj6 = objB4;
                                        chaloTextUIState = chaloTextUIStateG;
                                        buttonUIState3 = buttonUIState2;
                                        styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                                        styledTextDataUIStateArr3 = styledTextDataUIStateArr2;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        i2 = 0;
                                        styledTextDataUIStateArr3[i2] = new StyledTextDataUIState((String) obj6, almostBlackColor, null, UITextStyle.BodySmall, null, null, null, 1012);
                                        shadyGray = shadyGray2;
                                        chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState7;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState3;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState3;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 1;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 8;
                                        objB5 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                        if (objB5 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        styledTextDataUIStateArr4 = styledTextDataUIStateArr2;
                                        list7 = list5;
                                        styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                                        obj7 = objB5;
                                        i4 = 1;
                                        LoadingDialogUIState loadingDialogUIState112 = loadingDialogUIState3;
                                        String lowerCase8 = ((String) obj7).toLowerCase(Locale.ROOT);
                                        Intrinsics.h(lowerCase8, "toLowerCase(...)");
                                        PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState115 = premiumBusBulkBookingConfirmationDataState8;
                                        premiumBusBulkBookingConfirmationComponent = this;
                                        styledTextDataUIStateArr4[i4] = new StyledTextDataUIState(" ".concat(lowerCase8), ChaloColorToken.OrangePrimary.f9835a, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler$Companion$create$1("TNC", "TNC", new mt0(premiumBusBulkBookingConfirmationComponent, 0)), 496);
                                        ?? r14 = obj5;
                                        termsAndConditionsUIState = new TermsAndConditionsUIState(chaloTextUIState, list6, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), r14, r14, 30));
                                        buttonUIState2 = buttonUIState3;
                                        list3 = list7;
                                        routeDetailInfoUIState5 = routeDetailInfoUIState7;
                                        toolbarUIState4 = toolbarUIState5;
                                        passInfoUIState2 = passInfoUIState3;
                                        premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState115;
                                        loadingDialogUIStateA = loadingDialogUIState112;
                                    }
                                } else {
                                    RouteDetailInfoUIState routeDetailInfoUIState113 = routeDetailInfoUIState4;
                                    premiumBusBulkBookingConfirmationComponent = this;
                                    routeDetailInfoUIState5 = routeDetailInfoUIState113;
                                    coroutineSingletons = coroutineSingletons2;
                                    stringProvider = stringProvider2;
                                    shadyGray = shadyGray2;
                                    chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                    str2 = ". ";
                                    termsAndConditionsUIState = null;
                                }
                                if (premiumBusBulkBookingConfirmationDataState6.n) {
                                    break;
                                }
                                routeDetailInfoUIState8 = routeDetailInfoUIState5;
                                loadingDialogUIState4 = loadingDialogUIStateA;
                                buttonUIState4 = buttonUIState2;
                                passInfoUIState4 = passInfoUIState2;
                                termsAndConditionsUIState2 = termsAndConditionsUIState;
                                list8 = list3;
                                toolbarUIState6 = toolbarUIState4;
                                termsAndConditionsBottomSheetUIState = null;
                                return new PremiumBusBulkBookingConfirmationViewState(toolbarUIState6, routeDetailInfoUIState8, list8, passInfoUIState4, buttonUIState4, loadingDialogUIState4, termsAndConditionsUIState2, termsAndConditionsBottomSheetUIState);
                            }
                        }
                    }
                }
                return coroutineSingletons2;
            case 2:
                RouteDetailInfoUIState routeDetailInfoUIState20 = (RouteDetailInfoUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2;
                ToolbarUIState toolbarUIState9 = (ToolbarUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1;
                PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState20 = (PremiumBusBulkBookingConfirmationDataState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0;
                ResultKt.b(obj9);
                chaloTextStyleHelper2 = chaloTextStyleHelper8;
                premiumBusBulkBookingConfirmationDataState3 = premiumBusBulkBookingConfirmationDataState20;
                toolbarUIState2 = toolbarUIState9;
                routeDetailInfoUIState2 = routeDetailInfoUIState20;
                obj = obj9;
                list = (List) obj;
                passInfo = premiumBusBulkBookingConfirmationDataState3.g;
                if (passInfo != null) {
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState3;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState2;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = routeDetailInfoUIState2;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = list;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 3;
                    objH0 = H0(passInfo, premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                    if (objH0 != coroutineSingletons2) {
                        RouteDetailInfoUIState routeDetailInfoUIState114 = routeDetailInfoUIState2;
                        list2 = list;
                        obj2 = objH0;
                        premiumBusBulkBookingConfirmationDataState4 = premiumBusBulkBookingConfirmationDataState3;
                        toolbarUIState3 = toolbarUIState2;
                        routeDetailInfoUIState3 = routeDetailInfoUIState114;
                        passInfoUIState = (PassInfoUIState) obj2;
                        String str10 = premiumBusBulkBookingConfirmationDataState4.h;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState4;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState3;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = routeDetailInfoUIState3;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = list2;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = passInfoUIState;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 4;
                        objL0 = L0(str10, premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                        if (objL0 != coroutineSingletons2) {
                            RouteDetailInfoUIState routeDetailInfoUIState115 = routeDetailInfoUIState3;
                            passInfoUIState2 = passInfoUIState;
                            obj3 = objL0;
                            premiumBusBulkBookingConfirmationDataState5 = premiumBusBulkBookingConfirmationDataState4;
                            toolbarUIState4 = toolbarUIState3;
                            routeDetailInfoUIState4 = routeDetailInfoUIState115;
                            buttonUIState = (ButtonUIState) obj3;
                            if (premiumBusBulkBookingConfirmationDataState5.f7495a) {
                                list3 = list2;
                                loadingDialogUIStateA = null;
                                buttonUIState2 = buttonUIState;
                                premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState5;
                                list4 = premiumBusBulkBookingConfirmationDataState6.m;
                                if (list4 != null) {
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState6;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = list4;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = chaloTextStyleHelper2;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = toolbarUIState4;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = routeDetailInfoUIState4;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = list3;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = passInfoUIState2;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = buttonUIState2;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = loadingDialogUIStateA;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 6;
                                    objB3 = stringProvider2.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                    if (objB3 != coroutineSingletons2) {
                                        LoadingDialogUIState loadingDialogUIState113 = loadingDialogUIStateA;
                                        obj4 = objB3;
                                        loadingDialogUIState = loadingDialogUIState113;
                                        passInfoUIState3 = passInfoUIState2;
                                        premiumBusBulkBookingConfirmationDataState7 = premiumBusBulkBookingConfirmationDataState6;
                                        chaloTextStyleHelper4 = chaloTextStyleHelper2;
                                        List list119 = list4;
                                        list5 = list3;
                                        chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) obj4, almostBlackColor, null, UIFontWeight.Bold, null, null, 108);
                                        List list1110 = list119;
                                        PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState116 = premiumBusBulkBookingConfirmationDataState7;
                                        arrayList = new ArrayList(CollectionsKt.v(list1110, 10));
                                        i = 0;
                                        while (r16.hasNext()) {
                                            i3 = i + 1;
                                            if (i >= 0) {
                                                CollectionsKt.z0();
                                                throw null;
                                            }
                                            ArrayList arrayList11 = arrayList;
                                            ChaloTextStyleHelper chaloTextStyleHelper19 = chaloTextStyleHelper2;
                                            chaloTextStyleHelper2 = chaloTextStyleHelper19;
                                            arrayList11.add(ChaloTextStyleHelper.c(chaloTextStyleHelper19, i3 + str3 + ((String) obj10), shadyGray2, null, null, null, null, 124));
                                            stringProvider2 = stringProvider2;
                                            arrayList = arrayList11;
                                            i = i3;
                                            str3 = str3;
                                            coroutineSingletons2 = coroutineSingletons2;
                                            toolbarUIState4 = toolbarUIState4;
                                            routeDetailInfoUIState4 = routeDetailInfoUIState4;
                                        }
                                        CoroutineSingletons coroutineSingletons11 = coroutineSingletons2;
                                        stringProvider = stringProvider2;
                                        routeDetailInfoUIState6 = routeDetailInfoUIState4;
                                        str2 = str3;
                                        shadyGray2 = shadyGray2;
                                        obj5 = null;
                                        list6 = arrayList;
                                        styledTextDataUIStateArr = new StyledTextDataUIState[2];
                                        premiumBusBulkBookingConfirmationDataState8 = premiumBusBulkBookingConfirmationDataState116;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIStateG;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState4;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState6;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 0;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 7;
                                        objB4 = stringProvider.b(StringEnum.TNC_PREFIX, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                        coroutineSingletons = coroutineSingletons11;
                                        if (objB4 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        toolbarUIState5 = toolbarUIState4;
                                        routeDetailInfoUIState7 = routeDetailInfoUIState6;
                                        obj6 = objB4;
                                        chaloTextUIState = chaloTextUIStateG;
                                        buttonUIState3 = buttonUIState2;
                                        styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                                        styledTextDataUIStateArr3 = styledTextDataUIStateArr2;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        i2 = 0;
                                        styledTextDataUIStateArr3[i2] = new StyledTextDataUIState((String) obj6, almostBlackColor, null, UITextStyle.BodySmall, null, null, null, 1012);
                                        shadyGray = shadyGray2;
                                        chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState7;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState3;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState3;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 1;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 8;
                                        objB5 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                        if (objB5 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        styledTextDataUIStateArr4 = styledTextDataUIStateArr2;
                                        list7 = list5;
                                        styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                                        obj7 = objB5;
                                        i4 = 1;
                                        LoadingDialogUIState loadingDialogUIState114 = loadingDialogUIState3;
                                        String lowerCase9 = ((String) obj7).toLowerCase(Locale.ROOT);
                                        Intrinsics.h(lowerCase9, "toLowerCase(...)");
                                        PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState117 = premiumBusBulkBookingConfirmationDataState8;
                                        premiumBusBulkBookingConfirmationComponent = this;
                                        styledTextDataUIStateArr4[i4] = new StyledTextDataUIState(" ".concat(lowerCase9), ChaloColorToken.OrangePrimary.f9835a, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler$Companion$create$1("TNC", "TNC", new mt0(premiumBusBulkBookingConfirmationComponent, 0)), 496);
                                        ?? r15 = obj5;
                                        termsAndConditionsUIState = new TermsAndConditionsUIState(chaloTextUIState, list6, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), r15, r15, 30));
                                        buttonUIState2 = buttonUIState3;
                                        list3 = list7;
                                        routeDetailInfoUIState5 = routeDetailInfoUIState7;
                                        toolbarUIState4 = toolbarUIState5;
                                        passInfoUIState2 = passInfoUIState3;
                                        premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState117;
                                        loadingDialogUIStateA = loadingDialogUIState114;
                                    }
                                } else {
                                    RouteDetailInfoUIState routeDetailInfoUIState116 = routeDetailInfoUIState4;
                                    premiumBusBulkBookingConfirmationComponent = this;
                                    routeDetailInfoUIState5 = routeDetailInfoUIState116;
                                    coroutineSingletons = coroutineSingletons2;
                                    stringProvider = stringProvider2;
                                    shadyGray = shadyGray2;
                                    chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                    str2 = ". ";
                                    termsAndConditionsUIState = null;
                                }
                                if (premiumBusBulkBookingConfirmationDataState6.n) {
                                    break;
                                }
                                routeDetailInfoUIState8 = routeDetailInfoUIState5;
                                loadingDialogUIState4 = loadingDialogUIStateA;
                                buttonUIState4 = buttonUIState2;
                                passInfoUIState4 = passInfoUIState2;
                                termsAndConditionsUIState2 = termsAndConditionsUIState;
                                list8 = list3;
                                toolbarUIState6 = toolbarUIState4;
                                termsAndConditionsBottomSheetUIState = null;
                                return new PremiumBusBulkBookingConfirmationViewState(toolbarUIState6, routeDetailInfoUIState8, list8, passInfoUIState4, buttonUIState4, loadingDialogUIState4, termsAndConditionsUIState2, termsAndConditionsBottomSheetUIState);
                            }
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState5;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = routeDetailInfoUIState4;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = list2;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = passInfoUIState2;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = buttonUIState;
                            dialogUIStateFactory = DialogUIStateFactory.f9989a;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = dialogUIStateFactory;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 5;
                            objB2 = stringProvider2.b(StringEnum.LOADING, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                            if (objB2 != coroutineSingletons2) {
                                list3 = list2;
                                buttonUIState2 = buttonUIState;
                                dialogUIStateFactory.getClass();
                                loadingDialogUIStateA = DialogUIStateFactory.a((String) objB2);
                                premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState5;
                                list4 = premiumBusBulkBookingConfirmationDataState6.m;
                                if (list4 != null) {
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState6;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = list4;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = chaloTextStyleHelper2;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = toolbarUIState4;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = routeDetailInfoUIState4;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = list3;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = passInfoUIState2;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = buttonUIState2;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = loadingDialogUIStateA;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 6;
                                    objB3 = stringProvider2.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                    if (objB3 != coroutineSingletons2) {
                                        LoadingDialogUIState loadingDialogUIState115 = loadingDialogUIStateA;
                                        obj4 = objB3;
                                        loadingDialogUIState = loadingDialogUIState115;
                                        passInfoUIState3 = passInfoUIState2;
                                        premiumBusBulkBookingConfirmationDataState7 = premiumBusBulkBookingConfirmationDataState6;
                                        chaloTextStyleHelper4 = chaloTextStyleHelper2;
                                        List list1111 = list4;
                                        list5 = list3;
                                        chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) obj4, almostBlackColor, null, UIFontWeight.Bold, null, null, 108);
                                        List list1112 = list1111;
                                        PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState118 = premiumBusBulkBookingConfirmationDataState7;
                                        arrayList = new ArrayList(CollectionsKt.v(list1112, 10));
                                        i = 0;
                                        while (r16.hasNext()) {
                                            i3 = i + 1;
                                            if (i >= 0) {
                                                CollectionsKt.z0();
                                                throw null;
                                            }
                                            ArrayList arrayList12 = arrayList;
                                            ChaloTextStyleHelper chaloTextStyleHelper110 = chaloTextStyleHelper2;
                                            chaloTextStyleHelper2 = chaloTextStyleHelper110;
                                            arrayList12.add(ChaloTextStyleHelper.c(chaloTextStyleHelper110, i3 + str3 + ((String) obj10), shadyGray2, null, null, null, null, 124));
                                            stringProvider2 = stringProvider2;
                                            arrayList = arrayList12;
                                            i = i3;
                                            str3 = str3;
                                            coroutineSingletons2 = coroutineSingletons2;
                                            toolbarUIState4 = toolbarUIState4;
                                            routeDetailInfoUIState4 = routeDetailInfoUIState4;
                                        }
                                        CoroutineSingletons coroutineSingletons12 = coroutineSingletons2;
                                        stringProvider = stringProvider2;
                                        routeDetailInfoUIState6 = routeDetailInfoUIState4;
                                        str2 = str3;
                                        shadyGray2 = shadyGray2;
                                        obj5 = null;
                                        list6 = arrayList;
                                        styledTextDataUIStateArr = new StyledTextDataUIState[2];
                                        premiumBusBulkBookingConfirmationDataState8 = premiumBusBulkBookingConfirmationDataState118;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIStateG;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState4;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState6;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 0;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 7;
                                        objB4 = stringProvider.b(StringEnum.TNC_PREFIX, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                        coroutineSingletons = coroutineSingletons12;
                                        if (objB4 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        toolbarUIState5 = toolbarUIState4;
                                        routeDetailInfoUIState7 = routeDetailInfoUIState6;
                                        obj6 = objB4;
                                        chaloTextUIState = chaloTextUIStateG;
                                        buttonUIState3 = buttonUIState2;
                                        styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                                        styledTextDataUIStateArr3 = styledTextDataUIStateArr2;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        i2 = 0;
                                        styledTextDataUIStateArr3[i2] = new StyledTextDataUIState((String) obj6, almostBlackColor, null, UITextStyle.BodySmall, null, null, null, 1012);
                                        shadyGray = shadyGray2;
                                        chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr2;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState7;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState3;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState3;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 1;
                                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 8;
                                        objB5 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                        if (objB5 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        styledTextDataUIStateArr4 = styledTextDataUIStateArr2;
                                        list7 = list5;
                                        styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                                        obj7 = objB5;
                                        i4 = 1;
                                        LoadingDialogUIState loadingDialogUIState116 = loadingDialogUIState3;
                                        String lowerCase10 = ((String) obj7).toLowerCase(Locale.ROOT);
                                        Intrinsics.h(lowerCase10, "toLowerCase(...)");
                                        PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState119 = premiumBusBulkBookingConfirmationDataState8;
                                        premiumBusBulkBookingConfirmationComponent = this;
                                        styledTextDataUIStateArr4[i4] = new StyledTextDataUIState(" ".concat(lowerCase10), ChaloColorToken.OrangePrimary.f9835a, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler$Companion$create$1("TNC", "TNC", new mt0(premiumBusBulkBookingConfirmationComponent, 0)), 496);
                                        ?? r16 = obj5;
                                        termsAndConditionsUIState = new TermsAndConditionsUIState(chaloTextUIState, list6, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), r16, r16, 30));
                                        buttonUIState2 = buttonUIState3;
                                        list3 = list7;
                                        routeDetailInfoUIState5 = routeDetailInfoUIState7;
                                        toolbarUIState4 = toolbarUIState5;
                                        passInfoUIState2 = passInfoUIState3;
                                        premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState119;
                                        loadingDialogUIStateA = loadingDialogUIState116;
                                    }
                                } else {
                                    RouteDetailInfoUIState routeDetailInfoUIState117 = routeDetailInfoUIState4;
                                    premiumBusBulkBookingConfirmationComponent = this;
                                    routeDetailInfoUIState5 = routeDetailInfoUIState117;
                                    coroutineSingletons = coroutineSingletons2;
                                    stringProvider = stringProvider2;
                                    shadyGray = shadyGray2;
                                    chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                    str2 = ". ";
                                    termsAndConditionsUIState = null;
                                }
                                if (premiumBusBulkBookingConfirmationDataState6.n) {
                                    break;
                                }
                                routeDetailInfoUIState8 = routeDetailInfoUIState5;
                                loadingDialogUIState4 = loadingDialogUIStateA;
                                buttonUIState4 = buttonUIState2;
                                passInfoUIState4 = passInfoUIState2;
                                termsAndConditionsUIState2 = termsAndConditionsUIState;
                                list8 = list3;
                                toolbarUIState6 = toolbarUIState4;
                                termsAndConditionsBottomSheetUIState = null;
                                return new PremiumBusBulkBookingConfirmationViewState(toolbarUIState6, routeDetailInfoUIState8, list8, passInfoUIState4, buttonUIState4, loadingDialogUIState4, termsAndConditionsUIState2, termsAndConditionsBottomSheetUIState);
                            }
                        }
                    }
                } else {
                    premiumBusBulkBookingConfirmationDataState4 = premiumBusBulkBookingConfirmationDataState3;
                    toolbarUIState3 = toolbarUIState2;
                    routeDetailInfoUIState3 = routeDetailInfoUIState2;
                    list2 = list;
                    passInfoUIState = null;
                    String str11 = premiumBusBulkBookingConfirmationDataState4.h;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState4;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState3;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = routeDetailInfoUIState3;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = list2;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = passInfoUIState;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 4;
                    objL0 = L0(str11, premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                    if (objL0 != coroutineSingletons2) {
                        RouteDetailInfoUIState routeDetailInfoUIState118 = routeDetailInfoUIState3;
                        passInfoUIState2 = passInfoUIState;
                        obj3 = objL0;
                        premiumBusBulkBookingConfirmationDataState5 = premiumBusBulkBookingConfirmationDataState4;
                        toolbarUIState4 = toolbarUIState3;
                        routeDetailInfoUIState4 = routeDetailInfoUIState118;
                        buttonUIState = (ButtonUIState) obj3;
                        if (premiumBusBulkBookingConfirmationDataState5.f7495a) {
                            list3 = list2;
                            loadingDialogUIStateA = null;
                            buttonUIState2 = buttonUIState;
                            premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState5;
                            list4 = premiumBusBulkBookingConfirmationDataState6.m;
                            if (list4 != null) {
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState6;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = list4;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = chaloTextStyleHelper2;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = toolbarUIState4;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = routeDetailInfoUIState4;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = list3;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = passInfoUIState2;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = buttonUIState2;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = loadingDialogUIStateA;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 6;
                                objB3 = stringProvider2.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                if (objB3 != coroutineSingletons2) {
                                    LoadingDialogUIState loadingDialogUIState117 = loadingDialogUIStateA;
                                    obj4 = objB3;
                                    loadingDialogUIState = loadingDialogUIState117;
                                    passInfoUIState3 = passInfoUIState2;
                                    premiumBusBulkBookingConfirmationDataState7 = premiumBusBulkBookingConfirmationDataState6;
                                    chaloTextStyleHelper4 = chaloTextStyleHelper2;
                                    List list1113 = list4;
                                    list5 = list3;
                                    chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) obj4, almostBlackColor, null, UIFontWeight.Bold, null, null, 108);
                                    List list1114 = list1113;
                                    PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState1110 = premiumBusBulkBookingConfirmationDataState7;
                                    arrayList = new ArrayList(CollectionsKt.v(list1114, 10));
                                    i = 0;
                                    while (r16.hasNext()) {
                                        i3 = i + 1;
                                        if (i >= 0) {
                                            CollectionsKt.z0();
                                            throw null;
                                        }
                                        ArrayList arrayList13 = arrayList;
                                        ChaloTextStyleHelper chaloTextStyleHelper111 = chaloTextStyleHelper2;
                                        chaloTextStyleHelper2 = chaloTextStyleHelper111;
                                        arrayList13.add(ChaloTextStyleHelper.c(chaloTextStyleHelper111, i3 + str3 + ((String) obj10), shadyGray2, null, null, null, null, 124));
                                        stringProvider2 = stringProvider2;
                                        arrayList = arrayList13;
                                        i = i3;
                                        str3 = str3;
                                        coroutineSingletons2 = coroutineSingletons2;
                                        toolbarUIState4 = toolbarUIState4;
                                        routeDetailInfoUIState4 = routeDetailInfoUIState4;
                                    }
                                    CoroutineSingletons coroutineSingletons13 = coroutineSingletons2;
                                    stringProvider = stringProvider2;
                                    routeDetailInfoUIState6 = routeDetailInfoUIState4;
                                    str2 = str3;
                                    shadyGray2 = shadyGray2;
                                    obj5 = null;
                                    list6 = arrayList;
                                    styledTextDataUIStateArr = new StyledTextDataUIState[2];
                                    premiumBusBulkBookingConfirmationDataState8 = premiumBusBulkBookingConfirmationDataState1110;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIStateG;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState4;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState6;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState2;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState;
                                    loadingDialogUIState2 = loadingDialogUIState;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 0;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 7;
                                    objB4 = stringProvider.b(StringEnum.TNC_PREFIX, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                    coroutineSingletons = coroutineSingletons13;
                                    if (objB4 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    toolbarUIState5 = toolbarUIState4;
                                    routeDetailInfoUIState7 = routeDetailInfoUIState6;
                                    obj6 = objB4;
                                    chaloTextUIState = chaloTextUIStateG;
                                    buttonUIState3 = buttonUIState2;
                                    styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                                    styledTextDataUIStateArr3 = styledTextDataUIStateArr2;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                    i2 = 0;
                                    styledTextDataUIStateArr3[i2] = new StyledTextDataUIState((String) obj6, almostBlackColor, null, UITextStyle.BodySmall, null, null, null, 1012);
                                    shadyGray = shadyGray2;
                                    chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr2;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr2;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState7;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState3;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState3;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 1;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 8;
                                    objB5 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                    if (objB5 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    styledTextDataUIStateArr4 = styledTextDataUIStateArr2;
                                    list7 = list5;
                                    styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                                    obj7 = objB5;
                                    i4 = 1;
                                    LoadingDialogUIState loadingDialogUIState118 = loadingDialogUIState3;
                                    String lowerCase11 = ((String) obj7).toLowerCase(Locale.ROOT);
                                    Intrinsics.h(lowerCase11, "toLowerCase(...)");
                                    PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState1111 = premiumBusBulkBookingConfirmationDataState8;
                                    premiumBusBulkBookingConfirmationComponent = this;
                                    styledTextDataUIStateArr4[i4] = new StyledTextDataUIState(" ".concat(lowerCase11), ChaloColorToken.OrangePrimary.f9835a, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler$Companion$create$1("TNC", "TNC", new mt0(premiumBusBulkBookingConfirmationComponent, 0)), 496);
                                    ?? r17 = obj5;
                                    termsAndConditionsUIState = new TermsAndConditionsUIState(chaloTextUIState, list6, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), r17, r17, 30));
                                    buttonUIState2 = buttonUIState3;
                                    list3 = list7;
                                    routeDetailInfoUIState5 = routeDetailInfoUIState7;
                                    toolbarUIState4 = toolbarUIState5;
                                    passInfoUIState2 = passInfoUIState3;
                                    premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState1111;
                                    loadingDialogUIStateA = loadingDialogUIState118;
                                }
                            } else {
                                RouteDetailInfoUIState routeDetailInfoUIState119 = routeDetailInfoUIState4;
                                premiumBusBulkBookingConfirmationComponent = this;
                                routeDetailInfoUIState5 = routeDetailInfoUIState119;
                                coroutineSingletons = coroutineSingletons2;
                                stringProvider = stringProvider2;
                                shadyGray = shadyGray2;
                                chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                str2 = ". ";
                                termsAndConditionsUIState = null;
                            }
                            if (premiumBusBulkBookingConfirmationDataState6.n) {
                                break;
                            }
                            routeDetailInfoUIState8 = routeDetailInfoUIState5;
                            loadingDialogUIState4 = loadingDialogUIStateA;
                            buttonUIState4 = buttonUIState2;
                            passInfoUIState4 = passInfoUIState2;
                            termsAndConditionsUIState2 = termsAndConditionsUIState;
                            list8 = list3;
                            toolbarUIState6 = toolbarUIState4;
                            termsAndConditionsBottomSheetUIState = null;
                            return new PremiumBusBulkBookingConfirmationViewState(toolbarUIState6, routeDetailInfoUIState8, list8, passInfoUIState4, buttonUIState4, loadingDialogUIState4, termsAndConditionsUIState2, termsAndConditionsBottomSheetUIState);
                        }
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState5;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = routeDetailInfoUIState4;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = list2;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = passInfoUIState2;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = buttonUIState;
                        dialogUIStateFactory = DialogUIStateFactory.f9989a;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = dialogUIStateFactory;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 5;
                        objB2 = stringProvider2.b(StringEnum.LOADING, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                        if (objB2 != coroutineSingletons2) {
                            list3 = list2;
                            buttonUIState2 = buttonUIState;
                            dialogUIStateFactory.getClass();
                            loadingDialogUIStateA = DialogUIStateFactory.a((String) objB2);
                            premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState5;
                            list4 = premiumBusBulkBookingConfirmationDataState6.m;
                            if (list4 != null) {
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState6;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = list4;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = chaloTextStyleHelper2;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = toolbarUIState4;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = routeDetailInfoUIState4;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = list3;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = passInfoUIState2;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = buttonUIState2;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = loadingDialogUIStateA;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 6;
                                objB3 = stringProvider2.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                if (objB3 != coroutineSingletons2) {
                                    LoadingDialogUIState loadingDialogUIState119 = loadingDialogUIStateA;
                                    obj4 = objB3;
                                    loadingDialogUIState = loadingDialogUIState119;
                                    passInfoUIState3 = passInfoUIState2;
                                    premiumBusBulkBookingConfirmationDataState7 = premiumBusBulkBookingConfirmationDataState6;
                                    chaloTextStyleHelper4 = chaloTextStyleHelper2;
                                    List list1115 = list4;
                                    list5 = list3;
                                    chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) obj4, almostBlackColor, null, UIFontWeight.Bold, null, null, 108);
                                    List list1116 = list1115;
                                    PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState1112 = premiumBusBulkBookingConfirmationDataState7;
                                    arrayList = new ArrayList(CollectionsKt.v(list1116, 10));
                                    i = 0;
                                    while (r16.hasNext()) {
                                        i3 = i + 1;
                                        if (i >= 0) {
                                            CollectionsKt.z0();
                                            throw null;
                                        }
                                        ArrayList arrayList14 = arrayList;
                                        ChaloTextStyleHelper chaloTextStyleHelper112 = chaloTextStyleHelper2;
                                        chaloTextStyleHelper2 = chaloTextStyleHelper112;
                                        arrayList14.add(ChaloTextStyleHelper.c(chaloTextStyleHelper112, i3 + str3 + ((String) obj10), shadyGray2, null, null, null, null, 124));
                                        stringProvider2 = stringProvider2;
                                        arrayList = arrayList14;
                                        i = i3;
                                        str3 = str3;
                                        coroutineSingletons2 = coroutineSingletons2;
                                        toolbarUIState4 = toolbarUIState4;
                                        routeDetailInfoUIState4 = routeDetailInfoUIState4;
                                    }
                                    CoroutineSingletons coroutineSingletons14 = coroutineSingletons2;
                                    stringProvider = stringProvider2;
                                    routeDetailInfoUIState6 = routeDetailInfoUIState4;
                                    str2 = str3;
                                    shadyGray2 = shadyGray2;
                                    obj5 = null;
                                    list6 = arrayList;
                                    styledTextDataUIStateArr = new StyledTextDataUIState[2];
                                    premiumBusBulkBookingConfirmationDataState8 = premiumBusBulkBookingConfirmationDataState1112;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIStateG;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState4;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState6;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState2;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState;
                                    loadingDialogUIState2 = loadingDialogUIState;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 0;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 7;
                                    objB4 = stringProvider.b(StringEnum.TNC_PREFIX, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                    coroutineSingletons = coroutineSingletons14;
                                    if (objB4 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    toolbarUIState5 = toolbarUIState4;
                                    routeDetailInfoUIState7 = routeDetailInfoUIState6;
                                    obj6 = objB4;
                                    chaloTextUIState = chaloTextUIStateG;
                                    buttonUIState3 = buttonUIState2;
                                    styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                                    styledTextDataUIStateArr3 = styledTextDataUIStateArr2;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                    i2 = 0;
                                    styledTextDataUIStateArr3[i2] = new StyledTextDataUIState((String) obj6, almostBlackColor, null, UITextStyle.BodySmall, null, null, null, 1012);
                                    shadyGray = shadyGray2;
                                    chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr2;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr2;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState7;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState3;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState3;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 1;
                                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 8;
                                    objB5 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                    if (objB5 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    styledTextDataUIStateArr4 = styledTextDataUIStateArr2;
                                    list7 = list5;
                                    styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                                    obj7 = objB5;
                                    i4 = 1;
                                    LoadingDialogUIState loadingDialogUIState1110 = loadingDialogUIState3;
                                    String lowerCase12 = ((String) obj7).toLowerCase(Locale.ROOT);
                                    Intrinsics.h(lowerCase12, "toLowerCase(...)");
                                    PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState1113 = premiumBusBulkBookingConfirmationDataState8;
                                    premiumBusBulkBookingConfirmationComponent = this;
                                    styledTextDataUIStateArr4[i4] = new StyledTextDataUIState(" ".concat(lowerCase12), ChaloColorToken.OrangePrimary.f9835a, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler$Companion$create$1("TNC", "TNC", new mt0(premiumBusBulkBookingConfirmationComponent, 0)), 496);
                                    ?? r18 = obj5;
                                    termsAndConditionsUIState = new TermsAndConditionsUIState(chaloTextUIState, list6, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), r18, r18, 30));
                                    buttonUIState2 = buttonUIState3;
                                    list3 = list7;
                                    routeDetailInfoUIState5 = routeDetailInfoUIState7;
                                    toolbarUIState4 = toolbarUIState5;
                                    passInfoUIState2 = passInfoUIState3;
                                    premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState1113;
                                    loadingDialogUIStateA = loadingDialogUIState1110;
                                }
                            } else {
                                RouteDetailInfoUIState routeDetailInfoUIState1110 = routeDetailInfoUIState4;
                                premiumBusBulkBookingConfirmationComponent = this;
                                routeDetailInfoUIState5 = routeDetailInfoUIState1110;
                                coroutineSingletons = coroutineSingletons2;
                                stringProvider = stringProvider2;
                                shadyGray = shadyGray2;
                                chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                str2 = ". ";
                                termsAndConditionsUIState = null;
                            }
                            if (premiumBusBulkBookingConfirmationDataState6.n) {
                                break;
                            }
                            routeDetailInfoUIState8 = routeDetailInfoUIState5;
                            loadingDialogUIState4 = loadingDialogUIStateA;
                            buttonUIState4 = buttonUIState2;
                            passInfoUIState4 = passInfoUIState2;
                            termsAndConditionsUIState2 = termsAndConditionsUIState;
                            list8 = list3;
                            toolbarUIState6 = toolbarUIState4;
                            termsAndConditionsBottomSheetUIState = null;
                            return new PremiumBusBulkBookingConfirmationViewState(toolbarUIState6, routeDetailInfoUIState8, list8, passInfoUIState4, buttonUIState4, loadingDialogUIState4, termsAndConditionsUIState2, termsAndConditionsBottomSheetUIState);
                        }
                    }
                }
                return coroutineSingletons2;
            case 3:
                List list20 = (List) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3;
                RouteDetailInfoUIState routeDetailInfoUIState21 = (RouteDetailInfoUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2;
                ToolbarUIState toolbarUIState10 = (ToolbarUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1;
                PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState21 = (PremiumBusBulkBookingConfirmationDataState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0;
                ResultKt.b(obj9);
                chaloTextStyleHelper2 = chaloTextStyleHelper8;
                premiumBusBulkBookingConfirmationDataState4 = premiumBusBulkBookingConfirmationDataState21;
                toolbarUIState3 = toolbarUIState10;
                routeDetailInfoUIState3 = routeDetailInfoUIState21;
                list2 = list20;
                obj2 = obj9;
                passInfoUIState = (PassInfoUIState) obj2;
                String str12 = premiumBusBulkBookingConfirmationDataState4.h;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState4;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState3;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = routeDetailInfoUIState3;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = list2;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = passInfoUIState;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 4;
                objL0 = L0(str12, premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                if (objL0 != coroutineSingletons2) {
                    RouteDetailInfoUIState routeDetailInfoUIState1111 = routeDetailInfoUIState3;
                    passInfoUIState2 = passInfoUIState;
                    obj3 = objL0;
                    premiumBusBulkBookingConfirmationDataState5 = premiumBusBulkBookingConfirmationDataState4;
                    toolbarUIState4 = toolbarUIState3;
                    routeDetailInfoUIState4 = routeDetailInfoUIState1111;
                    buttonUIState = (ButtonUIState) obj3;
                    if (premiumBusBulkBookingConfirmationDataState5.f7495a) {
                        list3 = list2;
                        loadingDialogUIStateA = null;
                        buttonUIState2 = buttonUIState;
                        premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState5;
                        list4 = premiumBusBulkBookingConfirmationDataState6.m;
                        if (list4 != null) {
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState6;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = list4;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = chaloTextStyleHelper2;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = toolbarUIState4;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = routeDetailInfoUIState4;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = list3;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = passInfoUIState2;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = buttonUIState2;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = loadingDialogUIStateA;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 6;
                            objB3 = stringProvider2.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                            if (objB3 != coroutineSingletons2) {
                                LoadingDialogUIState loadingDialogUIState1111 = loadingDialogUIStateA;
                                obj4 = objB3;
                                loadingDialogUIState = loadingDialogUIState1111;
                                passInfoUIState3 = passInfoUIState2;
                                premiumBusBulkBookingConfirmationDataState7 = premiumBusBulkBookingConfirmationDataState6;
                                chaloTextStyleHelper4 = chaloTextStyleHelper2;
                                List list1117 = list4;
                                list5 = list3;
                                chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) obj4, almostBlackColor, null, UIFontWeight.Bold, null, null, 108);
                                List list1118 = list1117;
                                PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState1114 = premiumBusBulkBookingConfirmationDataState7;
                                arrayList = new ArrayList(CollectionsKt.v(list1118, 10));
                                i = 0;
                                while (r16.hasNext()) {
                                    i3 = i + 1;
                                    if (i >= 0) {
                                        CollectionsKt.z0();
                                        throw null;
                                    }
                                    ArrayList arrayList15 = arrayList;
                                    ChaloTextStyleHelper chaloTextStyleHelper113 = chaloTextStyleHelper2;
                                    chaloTextStyleHelper2 = chaloTextStyleHelper113;
                                    arrayList15.add(ChaloTextStyleHelper.c(chaloTextStyleHelper113, i3 + str3 + ((String) obj10), shadyGray2, null, null, null, null, 124));
                                    stringProvider2 = stringProvider2;
                                    arrayList = arrayList15;
                                    i = i3;
                                    str3 = str3;
                                    coroutineSingletons2 = coroutineSingletons2;
                                    toolbarUIState4 = toolbarUIState4;
                                    routeDetailInfoUIState4 = routeDetailInfoUIState4;
                                }
                                CoroutineSingletons coroutineSingletons15 = coroutineSingletons2;
                                stringProvider = stringProvider2;
                                routeDetailInfoUIState6 = routeDetailInfoUIState4;
                                str2 = str3;
                                shadyGray2 = shadyGray2;
                                obj5 = null;
                                list6 = arrayList;
                                styledTextDataUIStateArr = new StyledTextDataUIState[2];
                                premiumBusBulkBookingConfirmationDataState8 = premiumBusBulkBookingConfirmationDataState1114;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIStateG;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState4;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState6;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState2;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState;
                                loadingDialogUIState2 = loadingDialogUIState;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 0;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 7;
                                objB4 = stringProvider.b(StringEnum.TNC_PREFIX, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                coroutineSingletons = coroutineSingletons15;
                                if (objB4 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                toolbarUIState5 = toolbarUIState4;
                                routeDetailInfoUIState7 = routeDetailInfoUIState6;
                                obj6 = objB4;
                                chaloTextUIState = chaloTextUIStateG;
                                buttonUIState3 = buttonUIState2;
                                styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                                styledTextDataUIStateArr3 = styledTextDataUIStateArr2;
                                loadingDialogUIState3 = loadingDialogUIState2;
                                i2 = 0;
                                styledTextDataUIStateArr3[i2] = new StyledTextDataUIState((String) obj6, almostBlackColor, null, UITextStyle.BodySmall, null, null, null, 1012);
                                shadyGray = shadyGray2;
                                chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr2;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr2;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState7;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState3;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState3;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 1;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 8;
                                objB5 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                if (objB5 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                styledTextDataUIStateArr4 = styledTextDataUIStateArr2;
                                list7 = list5;
                                styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                                obj7 = objB5;
                                i4 = 1;
                                LoadingDialogUIState loadingDialogUIState1112 = loadingDialogUIState3;
                                String lowerCase13 = ((String) obj7).toLowerCase(Locale.ROOT);
                                Intrinsics.h(lowerCase13, "toLowerCase(...)");
                                PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState1115 = premiumBusBulkBookingConfirmationDataState8;
                                premiumBusBulkBookingConfirmationComponent = this;
                                styledTextDataUIStateArr4[i4] = new StyledTextDataUIState(" ".concat(lowerCase13), ChaloColorToken.OrangePrimary.f9835a, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler$Companion$create$1("TNC", "TNC", new mt0(premiumBusBulkBookingConfirmationComponent, 0)), 496);
                                ?? r19 = obj5;
                                termsAndConditionsUIState = new TermsAndConditionsUIState(chaloTextUIState, list6, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), r19, r19, 30));
                                buttonUIState2 = buttonUIState3;
                                list3 = list7;
                                routeDetailInfoUIState5 = routeDetailInfoUIState7;
                                toolbarUIState4 = toolbarUIState5;
                                passInfoUIState2 = passInfoUIState3;
                                premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState1115;
                                loadingDialogUIStateA = loadingDialogUIState1112;
                            }
                        } else {
                            RouteDetailInfoUIState routeDetailInfoUIState1112 = routeDetailInfoUIState4;
                            premiumBusBulkBookingConfirmationComponent = this;
                            routeDetailInfoUIState5 = routeDetailInfoUIState1112;
                            coroutineSingletons = coroutineSingletons2;
                            stringProvider = stringProvider2;
                            shadyGray = shadyGray2;
                            chaloTextStyleHelper3 = chaloTextStyleHelper2;
                            str2 = ". ";
                            termsAndConditionsUIState = null;
                        }
                        if (premiumBusBulkBookingConfirmationDataState6.n) {
                            break;
                        }
                        routeDetailInfoUIState8 = routeDetailInfoUIState5;
                        loadingDialogUIState4 = loadingDialogUIStateA;
                        buttonUIState4 = buttonUIState2;
                        passInfoUIState4 = passInfoUIState2;
                        termsAndConditionsUIState2 = termsAndConditionsUIState;
                        list8 = list3;
                        toolbarUIState6 = toolbarUIState4;
                        termsAndConditionsBottomSheetUIState = null;
                        return new PremiumBusBulkBookingConfirmationViewState(toolbarUIState6, routeDetailInfoUIState8, list8, passInfoUIState4, buttonUIState4, loadingDialogUIState4, termsAndConditionsUIState2, termsAndConditionsBottomSheetUIState);
                    }
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState5;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = routeDetailInfoUIState4;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = list2;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = passInfoUIState2;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = buttonUIState;
                    dialogUIStateFactory = DialogUIStateFactory.f9989a;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = dialogUIStateFactory;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 5;
                    objB2 = stringProvider2.b(StringEnum.LOADING, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                    if (objB2 != coroutineSingletons2) {
                        list3 = list2;
                        buttonUIState2 = buttonUIState;
                        dialogUIStateFactory.getClass();
                        loadingDialogUIStateA = DialogUIStateFactory.a((String) objB2);
                        premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState5;
                        list4 = premiumBusBulkBookingConfirmationDataState6.m;
                        if (list4 != null) {
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState6;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = list4;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = chaloTextStyleHelper2;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = toolbarUIState4;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = routeDetailInfoUIState4;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = list3;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = passInfoUIState2;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = buttonUIState2;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = loadingDialogUIStateA;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 6;
                            objB3 = stringProvider2.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                            if (objB3 != coroutineSingletons2) {
                                LoadingDialogUIState loadingDialogUIState1113 = loadingDialogUIStateA;
                                obj4 = objB3;
                                loadingDialogUIState = loadingDialogUIState1113;
                                passInfoUIState3 = passInfoUIState2;
                                premiumBusBulkBookingConfirmationDataState7 = premiumBusBulkBookingConfirmationDataState6;
                                chaloTextStyleHelper4 = chaloTextStyleHelper2;
                                List list1119 = list4;
                                list5 = list3;
                                chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) obj4, almostBlackColor, null, UIFontWeight.Bold, null, null, 108);
                                List list11110 = list1119;
                                PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState1116 = premiumBusBulkBookingConfirmationDataState7;
                                arrayList = new ArrayList(CollectionsKt.v(list11110, 10));
                                i = 0;
                                while (r16.hasNext()) {
                                    i3 = i + 1;
                                    if (i >= 0) {
                                        CollectionsKt.z0();
                                        throw null;
                                    }
                                    ArrayList arrayList16 = arrayList;
                                    ChaloTextStyleHelper chaloTextStyleHelper114 = chaloTextStyleHelper2;
                                    chaloTextStyleHelper2 = chaloTextStyleHelper114;
                                    arrayList16.add(ChaloTextStyleHelper.c(chaloTextStyleHelper114, i3 + str3 + ((String) obj10), shadyGray2, null, null, null, null, 124));
                                    stringProvider2 = stringProvider2;
                                    arrayList = arrayList16;
                                    i = i3;
                                    str3 = str3;
                                    coroutineSingletons2 = coroutineSingletons2;
                                    toolbarUIState4 = toolbarUIState4;
                                    routeDetailInfoUIState4 = routeDetailInfoUIState4;
                                }
                                CoroutineSingletons coroutineSingletons16 = coroutineSingletons2;
                                stringProvider = stringProvider2;
                                routeDetailInfoUIState6 = routeDetailInfoUIState4;
                                str2 = str3;
                                shadyGray2 = shadyGray2;
                                obj5 = null;
                                list6 = arrayList;
                                styledTextDataUIStateArr = new StyledTextDataUIState[2];
                                premiumBusBulkBookingConfirmationDataState8 = premiumBusBulkBookingConfirmationDataState1116;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIStateG;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState4;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState6;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState2;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState;
                                loadingDialogUIState2 = loadingDialogUIState;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 0;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 7;
                                objB4 = stringProvider.b(StringEnum.TNC_PREFIX, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                coroutineSingletons = coroutineSingletons16;
                                if (objB4 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                toolbarUIState5 = toolbarUIState4;
                                routeDetailInfoUIState7 = routeDetailInfoUIState6;
                                obj6 = objB4;
                                chaloTextUIState = chaloTextUIStateG;
                                buttonUIState3 = buttonUIState2;
                                styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                                styledTextDataUIStateArr3 = styledTextDataUIStateArr2;
                                loadingDialogUIState3 = loadingDialogUIState2;
                                i2 = 0;
                                styledTextDataUIStateArr3[i2] = new StyledTextDataUIState((String) obj6, almostBlackColor, null, UITextStyle.BodySmall, null, null, null, 1012);
                                shadyGray = shadyGray2;
                                chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr2;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr2;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState7;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState3;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState3;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 1;
                                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 8;
                                objB5 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                                if (objB5 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                styledTextDataUIStateArr4 = styledTextDataUIStateArr2;
                                list7 = list5;
                                styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                                obj7 = objB5;
                                i4 = 1;
                                LoadingDialogUIState loadingDialogUIState1114 = loadingDialogUIState3;
                                String lowerCase14 = ((String) obj7).toLowerCase(Locale.ROOT);
                                Intrinsics.h(lowerCase14, "toLowerCase(...)");
                                PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState1117 = premiumBusBulkBookingConfirmationDataState8;
                                premiumBusBulkBookingConfirmationComponent = this;
                                styledTextDataUIStateArr4[i4] = new StyledTextDataUIState(" ".concat(lowerCase14), ChaloColorToken.OrangePrimary.f9835a, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler$Companion$create$1("TNC", "TNC", new mt0(premiumBusBulkBookingConfirmationComponent, 0)), 496);
                                ?? r110 = obj5;
                                termsAndConditionsUIState = new TermsAndConditionsUIState(chaloTextUIState, list6, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), r110, r110, 30));
                                buttonUIState2 = buttonUIState3;
                                list3 = list7;
                                routeDetailInfoUIState5 = routeDetailInfoUIState7;
                                toolbarUIState4 = toolbarUIState5;
                                passInfoUIState2 = passInfoUIState3;
                                premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState1117;
                                loadingDialogUIStateA = loadingDialogUIState1114;
                            }
                        } else {
                            RouteDetailInfoUIState routeDetailInfoUIState1113 = routeDetailInfoUIState4;
                            premiumBusBulkBookingConfirmationComponent = this;
                            routeDetailInfoUIState5 = routeDetailInfoUIState1113;
                            coroutineSingletons = coroutineSingletons2;
                            stringProvider = stringProvider2;
                            shadyGray = shadyGray2;
                            chaloTextStyleHelper3 = chaloTextStyleHelper2;
                            str2 = ". ";
                            termsAndConditionsUIState = null;
                        }
                        if (premiumBusBulkBookingConfirmationDataState6.n) {
                            break;
                        }
                        routeDetailInfoUIState8 = routeDetailInfoUIState5;
                        loadingDialogUIState4 = loadingDialogUIStateA;
                        buttonUIState4 = buttonUIState2;
                        passInfoUIState4 = passInfoUIState2;
                        termsAndConditionsUIState2 = termsAndConditionsUIState;
                        list8 = list3;
                        toolbarUIState6 = toolbarUIState4;
                        termsAndConditionsBottomSheetUIState = null;
                        return new PremiumBusBulkBookingConfirmationViewState(toolbarUIState6, routeDetailInfoUIState8, list8, passInfoUIState4, buttonUIState4, loadingDialogUIState4, termsAndConditionsUIState2, termsAndConditionsBottomSheetUIState);
                    }
                }
                return coroutineSingletons2;
            case 4:
                PassInfoUIState passInfoUIState7 = (PassInfoUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4;
                list2 = (List) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3;
                RouteDetailInfoUIState routeDetailInfoUIState22 = (RouteDetailInfoUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2;
                ToolbarUIState toolbarUIState11 = (ToolbarUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1;
                PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState22 = (PremiumBusBulkBookingConfirmationDataState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0;
                ResultKt.b(obj9);
                toolbarUIState4 = toolbarUIState11;
                premiumBusBulkBookingConfirmationDataState5 = premiumBusBulkBookingConfirmationDataState22;
                chaloTextStyleHelper2 = chaloTextStyleHelper8;
                routeDetailInfoUIState4 = routeDetailInfoUIState22;
                passInfoUIState2 = passInfoUIState7;
                obj3 = obj9;
                buttonUIState = (ButtonUIState) obj3;
                if (premiumBusBulkBookingConfirmationDataState5.f7495a) {
                    list3 = list2;
                    loadingDialogUIStateA = null;
                    buttonUIState2 = buttonUIState;
                    premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState5;
                    list4 = premiumBusBulkBookingConfirmationDataState6.m;
                    if (list4 != null) {
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState6;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = list4;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = chaloTextStyleHelper2;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = toolbarUIState4;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = routeDetailInfoUIState4;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = list3;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = passInfoUIState2;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = buttonUIState2;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = loadingDialogUIStateA;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 6;
                        objB3 = stringProvider2.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                        if (objB3 != coroutineSingletons2) {
                            LoadingDialogUIState loadingDialogUIState1115 = loadingDialogUIStateA;
                            obj4 = objB3;
                            loadingDialogUIState = loadingDialogUIState1115;
                            passInfoUIState3 = passInfoUIState2;
                            premiumBusBulkBookingConfirmationDataState7 = premiumBusBulkBookingConfirmationDataState6;
                            chaloTextStyleHelper4 = chaloTextStyleHelper2;
                            List list11111 = list4;
                            list5 = list3;
                            chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) obj4, almostBlackColor, null, UIFontWeight.Bold, null, null, 108);
                            List list11112 = list11111;
                            PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState1118 = premiumBusBulkBookingConfirmationDataState7;
                            arrayList = new ArrayList(CollectionsKt.v(list11112, 10));
                            i = 0;
                            while (r16.hasNext()) {
                                i3 = i + 1;
                                if (i >= 0) {
                                    CollectionsKt.z0();
                                    throw null;
                                }
                                ArrayList arrayList17 = arrayList;
                                ChaloTextStyleHelper chaloTextStyleHelper115 = chaloTextStyleHelper2;
                                chaloTextStyleHelper2 = chaloTextStyleHelper115;
                                arrayList17.add(ChaloTextStyleHelper.c(chaloTextStyleHelper115, i3 + str3 + ((String) obj10), shadyGray2, null, null, null, null, 124));
                                stringProvider2 = stringProvider2;
                                arrayList = arrayList17;
                                i = i3;
                                str3 = str3;
                                coroutineSingletons2 = coroutineSingletons2;
                                toolbarUIState4 = toolbarUIState4;
                                routeDetailInfoUIState4 = routeDetailInfoUIState4;
                            }
                            CoroutineSingletons coroutineSingletons17 = coroutineSingletons2;
                            stringProvider = stringProvider2;
                            routeDetailInfoUIState6 = routeDetailInfoUIState4;
                            str2 = str3;
                            shadyGray2 = shadyGray2;
                            obj5 = null;
                            list6 = arrayList;
                            styledTextDataUIStateArr = new StyledTextDataUIState[2];
                            premiumBusBulkBookingConfirmationDataState8 = premiumBusBulkBookingConfirmationDataState1118;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIStateG;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState4;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState6;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState2;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState;
                            loadingDialogUIState2 = loadingDialogUIState;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 0;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 7;
                            objB4 = stringProvider.b(StringEnum.TNC_PREFIX, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                            coroutineSingletons = coroutineSingletons17;
                            if (objB4 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            toolbarUIState5 = toolbarUIState4;
                            routeDetailInfoUIState7 = routeDetailInfoUIState6;
                            obj6 = objB4;
                            chaloTextUIState = chaloTextUIStateG;
                            buttonUIState3 = buttonUIState2;
                            styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                            styledTextDataUIStateArr3 = styledTextDataUIStateArr2;
                            loadingDialogUIState3 = loadingDialogUIState2;
                            i2 = 0;
                            styledTextDataUIStateArr3[i2] = new StyledTextDataUIState((String) obj6, almostBlackColor, null, UITextStyle.BodySmall, null, null, null, 1012);
                            shadyGray = shadyGray2;
                            chaloTextStyleHelper3 = chaloTextStyleHelper2;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr2;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr2;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState5;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState7;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState3;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState3;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 1;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 8;
                            objB5 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                            if (objB5 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            styledTextDataUIStateArr4 = styledTextDataUIStateArr2;
                            list7 = list5;
                            styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                            obj7 = objB5;
                            i4 = 1;
                            LoadingDialogUIState loadingDialogUIState1116 = loadingDialogUIState3;
                            String lowerCase15 = ((String) obj7).toLowerCase(Locale.ROOT);
                            Intrinsics.h(lowerCase15, "toLowerCase(...)");
                            PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState1119 = premiumBusBulkBookingConfirmationDataState8;
                            premiumBusBulkBookingConfirmationComponent = this;
                            styledTextDataUIStateArr4[i4] = new StyledTextDataUIState(" ".concat(lowerCase15), ChaloColorToken.OrangePrimary.f9835a, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler$Companion$create$1("TNC", "TNC", new mt0(premiumBusBulkBookingConfirmationComponent, 0)), 496);
                            ?? r111 = obj5;
                            termsAndConditionsUIState = new TermsAndConditionsUIState(chaloTextUIState, list6, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), r111, r111, 30));
                            buttonUIState2 = buttonUIState3;
                            list3 = list7;
                            routeDetailInfoUIState5 = routeDetailInfoUIState7;
                            toolbarUIState4 = toolbarUIState5;
                            passInfoUIState2 = passInfoUIState3;
                            premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState1119;
                            loadingDialogUIStateA = loadingDialogUIState1116;
                        }
                    } else {
                        RouteDetailInfoUIState routeDetailInfoUIState1114 = routeDetailInfoUIState4;
                        premiumBusBulkBookingConfirmationComponent = this;
                        routeDetailInfoUIState5 = routeDetailInfoUIState1114;
                        coroutineSingletons = coroutineSingletons2;
                        stringProvider = stringProvider2;
                        shadyGray = shadyGray2;
                        chaloTextStyleHelper3 = chaloTextStyleHelper2;
                        str2 = ". ";
                        termsAndConditionsUIState = null;
                    }
                    if (premiumBusBulkBookingConfirmationDataState6.n) {
                        break;
                    }
                    routeDetailInfoUIState8 = routeDetailInfoUIState5;
                    loadingDialogUIState4 = loadingDialogUIStateA;
                    buttonUIState4 = buttonUIState2;
                    passInfoUIState4 = passInfoUIState2;
                    termsAndConditionsUIState2 = termsAndConditionsUIState;
                    list8 = list3;
                    toolbarUIState6 = toolbarUIState4;
                    termsAndConditionsBottomSheetUIState = null;
                    return new PremiumBusBulkBookingConfirmationViewState(toolbarUIState6, routeDetailInfoUIState8, list8, passInfoUIState4, buttonUIState4, loadingDialogUIState4, termsAndConditionsUIState2, termsAndConditionsBottomSheetUIState);
                }
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState5;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = routeDetailInfoUIState4;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = list2;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = passInfoUIState2;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = buttonUIState;
                dialogUIStateFactory = DialogUIStateFactory.f9989a;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = dialogUIStateFactory;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 5;
                objB2 = stringProvider2.b(StringEnum.LOADING, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                if (objB2 != coroutineSingletons2) {
                    list3 = list2;
                    buttonUIState2 = buttonUIState;
                    dialogUIStateFactory.getClass();
                    loadingDialogUIStateA = DialogUIStateFactory.a((String) objB2);
                    premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState5;
                    list4 = premiumBusBulkBookingConfirmationDataState6.m;
                    if (list4 != null) {
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState6;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = list4;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = chaloTextStyleHelper2;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = toolbarUIState4;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = routeDetailInfoUIState4;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = list3;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = passInfoUIState2;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = buttonUIState2;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = loadingDialogUIStateA;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 6;
                        objB3 = stringProvider2.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                        if (objB3 != coroutineSingletons2) {
                            LoadingDialogUIState loadingDialogUIState1117 = loadingDialogUIStateA;
                            obj4 = objB3;
                            loadingDialogUIState = loadingDialogUIState1117;
                            passInfoUIState3 = passInfoUIState2;
                            premiumBusBulkBookingConfirmationDataState7 = premiumBusBulkBookingConfirmationDataState6;
                            chaloTextStyleHelper4 = chaloTextStyleHelper2;
                            List list11113 = list4;
                            list5 = list3;
                            chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) obj4, almostBlackColor, null, UIFontWeight.Bold, null, null, 108);
                            List list11114 = list11113;
                            PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState11110 = premiumBusBulkBookingConfirmationDataState7;
                            arrayList = new ArrayList(CollectionsKt.v(list11114, 10));
                            i = 0;
                            while (r16.hasNext()) {
                                i3 = i + 1;
                                if (i >= 0) {
                                    CollectionsKt.z0();
                                    throw null;
                                }
                                ArrayList arrayList18 = arrayList;
                                ChaloTextStyleHelper chaloTextStyleHelper116 = chaloTextStyleHelper2;
                                chaloTextStyleHelper2 = chaloTextStyleHelper116;
                                arrayList18.add(ChaloTextStyleHelper.c(chaloTextStyleHelper116, i3 + str3 + ((String) obj10), shadyGray2, null, null, null, null, 124));
                                stringProvider2 = stringProvider2;
                                arrayList = arrayList18;
                                i = i3;
                                str3 = str3;
                                coroutineSingletons2 = coroutineSingletons2;
                                toolbarUIState4 = toolbarUIState4;
                                routeDetailInfoUIState4 = routeDetailInfoUIState4;
                            }
                            CoroutineSingletons coroutineSingletons18 = coroutineSingletons2;
                            stringProvider = stringProvider2;
                            routeDetailInfoUIState6 = routeDetailInfoUIState4;
                            str2 = str3;
                            shadyGray2 = shadyGray2;
                            obj5 = null;
                            list6 = arrayList;
                            styledTextDataUIStateArr = new StyledTextDataUIState[2];
                            premiumBusBulkBookingConfirmationDataState8 = premiumBusBulkBookingConfirmationDataState11110;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIStateG;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState4;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState6;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState2;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState;
                            loadingDialogUIState2 = loadingDialogUIState;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 0;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 7;
                            objB4 = stringProvider.b(StringEnum.TNC_PREFIX, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                            coroutineSingletons = coroutineSingletons18;
                            if (objB4 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            toolbarUIState5 = toolbarUIState4;
                            routeDetailInfoUIState7 = routeDetailInfoUIState6;
                            obj6 = objB4;
                            chaloTextUIState = chaloTextUIStateG;
                            buttonUIState3 = buttonUIState2;
                            styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                            styledTextDataUIStateArr3 = styledTextDataUIStateArr2;
                            loadingDialogUIState3 = loadingDialogUIState2;
                            i2 = 0;
                            styledTextDataUIStateArr3[i2] = new StyledTextDataUIState((String) obj6, almostBlackColor, null, UITextStyle.BodySmall, null, null, null, 1012);
                            shadyGray = shadyGray2;
                            chaloTextStyleHelper3 = chaloTextStyleHelper2;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr2;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr2;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState5;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState7;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState3;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState3;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 1;
                            premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 8;
                            objB5 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                            if (objB5 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            styledTextDataUIStateArr4 = styledTextDataUIStateArr2;
                            list7 = list5;
                            styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                            obj7 = objB5;
                            i4 = 1;
                            LoadingDialogUIState loadingDialogUIState1118 = loadingDialogUIState3;
                            String lowerCase16 = ((String) obj7).toLowerCase(Locale.ROOT);
                            Intrinsics.h(lowerCase16, "toLowerCase(...)");
                            PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState11111 = premiumBusBulkBookingConfirmationDataState8;
                            premiumBusBulkBookingConfirmationComponent = this;
                            styledTextDataUIStateArr4[i4] = new StyledTextDataUIState(" ".concat(lowerCase16), ChaloColorToken.OrangePrimary.f9835a, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler$Companion$create$1("TNC", "TNC", new mt0(premiumBusBulkBookingConfirmationComponent, 0)), 496);
                            ?? r112 = obj5;
                            termsAndConditionsUIState = new TermsAndConditionsUIState(chaloTextUIState, list6, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), r112, r112, 30));
                            buttonUIState2 = buttonUIState3;
                            list3 = list7;
                            routeDetailInfoUIState5 = routeDetailInfoUIState7;
                            toolbarUIState4 = toolbarUIState5;
                            passInfoUIState2 = passInfoUIState3;
                            premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState11111;
                            loadingDialogUIStateA = loadingDialogUIState1118;
                        }
                    } else {
                        RouteDetailInfoUIState routeDetailInfoUIState1115 = routeDetailInfoUIState4;
                        premiumBusBulkBookingConfirmationComponent = this;
                        routeDetailInfoUIState5 = routeDetailInfoUIState1115;
                        coroutineSingletons = coroutineSingletons2;
                        stringProvider = stringProvider2;
                        shadyGray = shadyGray2;
                        chaloTextStyleHelper3 = chaloTextStyleHelper2;
                        str2 = ". ";
                        termsAndConditionsUIState = null;
                    }
                    if (premiumBusBulkBookingConfirmationDataState6.n) {
                        break;
                    }
                    routeDetailInfoUIState8 = routeDetailInfoUIState5;
                    loadingDialogUIState4 = loadingDialogUIStateA;
                    buttonUIState4 = buttonUIState2;
                    passInfoUIState4 = passInfoUIState2;
                    termsAndConditionsUIState2 = termsAndConditionsUIState;
                    list8 = list3;
                    toolbarUIState6 = toolbarUIState4;
                    termsAndConditionsBottomSheetUIState = null;
                    return new PremiumBusBulkBookingConfirmationViewState(toolbarUIState6, routeDetailInfoUIState8, list8, passInfoUIState4, buttonUIState4, loadingDialogUIState4, termsAndConditionsUIState2, termsAndConditionsBottomSheetUIState);
                }
                return coroutineSingletons2;
            case 5:
                DialogUIStateFactory dialogUIStateFactory2 = (DialogUIStateFactory) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6;
                buttonUIState2 = (ButtonUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5;
                passInfoUIState2 = (PassInfoUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4;
                list3 = (List) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3;
                RouteDetailInfoUIState routeDetailInfoUIState23 = (RouteDetailInfoUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2;
                toolbarUIState4 = (ToolbarUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1;
                premiumBusBulkBookingConfirmationDataState5 = (PremiumBusBulkBookingConfirmationDataState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0;
                ResultKt.b(obj9);
                chaloTextStyleHelper2 = chaloTextStyleHelper8;
                routeDetailInfoUIState4 = routeDetailInfoUIState23;
                dialogUIStateFactory = dialogUIStateFactory2;
                objB2 = obj9;
                dialogUIStateFactory.getClass();
                loadingDialogUIStateA = DialogUIStateFactory.a((String) objB2);
                premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState5;
                list4 = premiumBusBulkBookingConfirmationDataState6.m;
                if (list4 != null) {
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState6;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = list4;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = chaloTextStyleHelper2;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = toolbarUIState4;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = routeDetailInfoUIState4;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = list3;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = passInfoUIState2;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = buttonUIState2;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = loadingDialogUIStateA;
                    premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 6;
                    objB3 = stringProvider2.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                    if (objB3 != coroutineSingletons2) {
                        LoadingDialogUIState loadingDialogUIState1119 = loadingDialogUIStateA;
                        obj4 = objB3;
                        loadingDialogUIState = loadingDialogUIState1119;
                        passInfoUIState3 = passInfoUIState2;
                        premiumBusBulkBookingConfirmationDataState7 = premiumBusBulkBookingConfirmationDataState6;
                        chaloTextStyleHelper4 = chaloTextStyleHelper2;
                        List list11115 = list4;
                        list5 = list3;
                        chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) obj4, almostBlackColor, null, UIFontWeight.Bold, null, null, 108);
                        List list11116 = list11115;
                        PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState11112 = premiumBusBulkBookingConfirmationDataState7;
                        arrayList = new ArrayList(CollectionsKt.v(list11116, 10));
                        i = 0;
                        while (r16.hasNext()) {
                            i3 = i + 1;
                            if (i >= 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            ArrayList arrayList19 = arrayList;
                            ChaloTextStyleHelper chaloTextStyleHelper117 = chaloTextStyleHelper2;
                            chaloTextStyleHelper2 = chaloTextStyleHelper117;
                            arrayList19.add(ChaloTextStyleHelper.c(chaloTextStyleHelper117, i3 + str3 + ((String) obj10), shadyGray2, null, null, null, null, 124));
                            stringProvider2 = stringProvider2;
                            arrayList = arrayList19;
                            i = i3;
                            str3 = str3;
                            coroutineSingletons2 = coroutineSingletons2;
                            toolbarUIState4 = toolbarUIState4;
                            routeDetailInfoUIState4 = routeDetailInfoUIState4;
                        }
                        CoroutineSingletons coroutineSingletons19 = coroutineSingletons2;
                        stringProvider = stringProvider2;
                        routeDetailInfoUIState6 = routeDetailInfoUIState4;
                        str2 = str3;
                        shadyGray2 = shadyGray2;
                        obj5 = null;
                        list6 = arrayList;
                        styledTextDataUIStateArr = new StyledTextDataUIState[2];
                        premiumBusBulkBookingConfirmationDataState8 = premiumBusBulkBookingConfirmationDataState11112;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIStateG;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState4;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState6;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState2;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState;
                        loadingDialogUIState2 = loadingDialogUIState;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 0;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 7;
                        objB4 = stringProvider.b(StringEnum.TNC_PREFIX, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                        coroutineSingletons = coroutineSingletons19;
                        if (objB4 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        toolbarUIState5 = toolbarUIState4;
                        routeDetailInfoUIState7 = routeDetailInfoUIState6;
                        obj6 = objB4;
                        chaloTextUIState = chaloTextUIStateG;
                        buttonUIState3 = buttonUIState2;
                        styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                        styledTextDataUIStateArr3 = styledTextDataUIStateArr2;
                        loadingDialogUIState3 = loadingDialogUIState2;
                        i2 = 0;
                        styledTextDataUIStateArr3[i2] = new StyledTextDataUIState((String) obj6, almostBlackColor, null, UITextStyle.BodySmall, null, null, null, 1012);
                        shadyGray = shadyGray2;
                        chaloTextStyleHelper3 = chaloTextStyleHelper2;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr2;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr2;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState5;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState7;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState3;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState3;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 1;
                        premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 8;
                        objB5 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                        if (objB5 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        styledTextDataUIStateArr4 = styledTextDataUIStateArr2;
                        list7 = list5;
                        styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                        obj7 = objB5;
                        i4 = 1;
                        LoadingDialogUIState loadingDialogUIState11110 = loadingDialogUIState3;
                        String lowerCase17 = ((String) obj7).toLowerCase(Locale.ROOT);
                        Intrinsics.h(lowerCase17, "toLowerCase(...)");
                        PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState11113 = premiumBusBulkBookingConfirmationDataState8;
                        premiumBusBulkBookingConfirmationComponent = this;
                        styledTextDataUIStateArr4[i4] = new StyledTextDataUIState(" ".concat(lowerCase17), ChaloColorToken.OrangePrimary.f9835a, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler$Companion$create$1("TNC", "TNC", new mt0(premiumBusBulkBookingConfirmationComponent, 0)), 496);
                        ?? r113 = obj5;
                        termsAndConditionsUIState = new TermsAndConditionsUIState(chaloTextUIState, list6, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), r113, r113, 30));
                        buttonUIState2 = buttonUIState3;
                        list3 = list7;
                        routeDetailInfoUIState5 = routeDetailInfoUIState7;
                        toolbarUIState4 = toolbarUIState5;
                        passInfoUIState2 = passInfoUIState3;
                        premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState11113;
                        loadingDialogUIStateA = loadingDialogUIState11110;
                    }
                    return coroutineSingletons2;
                }
                RouteDetailInfoUIState routeDetailInfoUIState1116 = routeDetailInfoUIState4;
                premiumBusBulkBookingConfirmationComponent = this;
                routeDetailInfoUIState5 = routeDetailInfoUIState1116;
                coroutineSingletons = coroutineSingletons2;
                stringProvider = stringProvider2;
                shadyGray = shadyGray2;
                chaloTextStyleHelper3 = chaloTextStyleHelper2;
                str2 = ". ";
                termsAndConditionsUIState = null;
                if (premiumBusBulkBookingConfirmationDataState6.n) {
                    break;
                }
                routeDetailInfoUIState8 = routeDetailInfoUIState5;
                loadingDialogUIState4 = loadingDialogUIStateA;
                buttonUIState4 = buttonUIState2;
                passInfoUIState4 = passInfoUIState2;
                termsAndConditionsUIState2 = termsAndConditionsUIState;
                list8 = list3;
                toolbarUIState6 = toolbarUIState4;
                termsAndConditionsBottomSheetUIState = null;
                return new PremiumBusBulkBookingConfirmationViewState(toolbarUIState6, routeDetailInfoUIState8, list8, passInfoUIState4, buttonUIState4, loadingDialogUIState4, termsAndConditionsUIState2, termsAndConditionsBottomSheetUIState);
            case 6:
                LoadingDialogUIState loadingDialogUIState20 = (LoadingDialogUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8;
                buttonUIState2 = (ButtonUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7;
                PassInfoUIState passInfoUIState8 = (PassInfoUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6;
                list3 = (List) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5;
                RouteDetailInfoUIState routeDetailInfoUIState24 = (RouteDetailInfoUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4;
                toolbarUIState4 = (ToolbarUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3;
                ChaloTextStyleHelper chaloTextStyleHelper20 = (ChaloTextStyleHelper) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2;
                list4 = (List) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1;
                PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState23 = (PremiumBusBulkBookingConfirmationDataState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0;
                ResultKt.b(obj9);
                passInfoUIState3 = passInfoUIState8;
                premiumBusBulkBookingConfirmationDataState7 = premiumBusBulkBookingConfirmationDataState23;
                chaloTextStyleHelper2 = chaloTextStyleHelper8;
                routeDetailInfoUIState4 = routeDetailInfoUIState24;
                loadingDialogUIState = loadingDialogUIState20;
                obj4 = obj9;
                chaloTextStyleHelper4 = chaloTextStyleHelper20;
                List list11117 = list4;
                list5 = list3;
                chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) obj4, almostBlackColor, null, UIFontWeight.Bold, null, null, 108);
                List list11118 = list11117;
                PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState11114 = premiumBusBulkBookingConfirmationDataState7;
                arrayList = new ArrayList(CollectionsKt.v(list11118, 10));
                i = 0;
                while (r16.hasNext()) {
                    i3 = i + 1;
                    if (i >= 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    ArrayList arrayList110 = arrayList;
                    ChaloTextStyleHelper chaloTextStyleHelper118 = chaloTextStyleHelper2;
                    chaloTextStyleHelper2 = chaloTextStyleHelper118;
                    arrayList110.add(ChaloTextStyleHelper.c(chaloTextStyleHelper118, i3 + str3 + ((String) obj10), shadyGray2, null, null, null, null, 124));
                    stringProvider2 = stringProvider2;
                    arrayList = arrayList110;
                    i = i3;
                    str3 = str3;
                    coroutineSingletons2 = coroutineSingletons2;
                    toolbarUIState4 = toolbarUIState4;
                    routeDetailInfoUIState4 = routeDetailInfoUIState4;
                }
                CoroutineSingletons coroutineSingletons110 = coroutineSingletons2;
                stringProvider = stringProvider2;
                routeDetailInfoUIState6 = routeDetailInfoUIState4;
                str2 = str3;
                shadyGray2 = shadyGray2;
                obj5 = null;
                list6 = arrayList;
                styledTextDataUIStateArr = new StyledTextDataUIState[2];
                premiumBusBulkBookingConfirmationDataState8 = premiumBusBulkBookingConfirmationDataState11114;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIStateG;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState4;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState6;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState2;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState;
                loadingDialogUIState2 = loadingDialogUIState;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 0;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 7;
                objB4 = stringProvider.b(StringEnum.TNC_PREFIX, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                coroutineSingletons = coroutineSingletons110;
                if (objB4 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                toolbarUIState5 = toolbarUIState4;
                routeDetailInfoUIState7 = routeDetailInfoUIState6;
                obj6 = objB4;
                chaloTextUIState = chaloTextUIStateG;
                buttonUIState3 = buttonUIState2;
                styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                styledTextDataUIStateArr3 = styledTextDataUIStateArr2;
                loadingDialogUIState3 = loadingDialogUIState2;
                i2 = 0;
                styledTextDataUIStateArr3[i2] = new StyledTextDataUIState((String) obj6, almostBlackColor, null, UITextStyle.BodySmall, null, null, null, 1012);
                shadyGray = shadyGray2;
                chaloTextStyleHelper3 = chaloTextStyleHelper2;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr2;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr2;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState5;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState7;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState3;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState3;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 1;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 8;
                objB5 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                if (objB5 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                styledTextDataUIStateArr4 = styledTextDataUIStateArr2;
                list7 = list5;
                styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                obj7 = objB5;
                i4 = 1;
                LoadingDialogUIState loadingDialogUIState11111 = loadingDialogUIState3;
                String lowerCase18 = ((String) obj7).toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase18, "toLowerCase(...)");
                PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState11115 = premiumBusBulkBookingConfirmationDataState8;
                premiumBusBulkBookingConfirmationComponent = this;
                styledTextDataUIStateArr4[i4] = new StyledTextDataUIState(" ".concat(lowerCase18), ChaloColorToken.OrangePrimary.f9835a, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler$Companion$create$1("TNC", "TNC", new mt0(premiumBusBulkBookingConfirmationComponent, 0)), 496);
                ?? r114 = obj5;
                termsAndConditionsUIState = new TermsAndConditionsUIState(chaloTextUIState, list6, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), r114, r114, 30));
                buttonUIState2 = buttonUIState3;
                list3 = list7;
                routeDetailInfoUIState5 = routeDetailInfoUIState7;
                toolbarUIState4 = toolbarUIState5;
                passInfoUIState2 = passInfoUIState3;
                premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState11115;
                loadingDialogUIStateA = loadingDialogUIState11111;
                if (premiumBusBulkBookingConfirmationDataState6.n) {
                    break;
                }
                routeDetailInfoUIState8 = routeDetailInfoUIState5;
                loadingDialogUIState4 = loadingDialogUIStateA;
                buttonUIState4 = buttonUIState2;
                passInfoUIState4 = passInfoUIState2;
                termsAndConditionsUIState2 = termsAndConditionsUIState;
                list8 = list3;
                toolbarUIState6 = toolbarUIState4;
                termsAndConditionsBottomSheetUIState = null;
                return new PremiumBusBulkBookingConfirmationViewState(toolbarUIState6, routeDetailInfoUIState8, list8, passInfoUIState4, buttonUIState4, loadingDialogUIState4, termsAndConditionsUIState2, termsAndConditionsBottomSheetUIState);
            case 7:
                int i9 = premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0;
                loadingDialogUIState3 = (LoadingDialogUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10;
                buttonUIState3 = (ButtonUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9;
                PassInfoUIState passInfoUIState9 = (PassInfoUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8;
                List list21 = (List) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7;
                RouteDetailInfoUIState routeDetailInfoUIState25 = (RouteDetailInfoUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6;
                ToolbarUIState toolbarUIState12 = (ToolbarUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5;
                StyledTextDataUIState[] styledTextDataUIStateArr6 = (StyledTextDataUIState[]) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4;
                StyledTextDataUIState[] styledTextDataUIStateArr7 = (StyledTextDataUIState[]) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3;
                List list22 = (List) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState3 = (TextUIState.ChaloTextUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1;
                PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState24 = (PremiumBusBulkBookingConfirmationDataState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0;
                ResultKt.b(obj9);
                coroutineSingletons = coroutineSingletons2;
                stringProvider = stringProvider2;
                str2 = ". ";
                styledTextDataUIStateArr3 = styledTextDataUIStateArr6;
                chaloTextUIState = chaloTextUIState3;
                obj5 = null;
                list6 = list22;
                list5 = list21;
                routeDetailInfoUIState7 = routeDetailInfoUIState25;
                toolbarUIState5 = toolbarUIState12;
                obj6 = obj9;
                passInfoUIState3 = passInfoUIState9;
                chaloTextStyleHelper2 = chaloTextStyleHelper8;
                premiumBusBulkBookingConfirmationDataState8 = premiumBusBulkBookingConfirmationDataState24;
                styledTextDataUIStateArr2 = styledTextDataUIStateArr7;
                i2 = i9;
                styledTextDataUIStateArr3[i2] = new StyledTextDataUIState((String) obj6, almostBlackColor, null, UITextStyle.BodySmall, null, null, null, 1012);
                shadyGray = shadyGray2;
                chaloTextStyleHelper3 = chaloTextStyleHelper2;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState8;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = list6;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = styledTextDataUIStateArr2;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = styledTextDataUIStateArr2;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = toolbarUIState5;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = routeDetailInfoUIState7;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = list5;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = passInfoUIState3;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = buttonUIState3;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = loadingDialogUIState3;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0 = 1;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 8;
                objB5 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                if (objB5 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                styledTextDataUIStateArr4 = styledTextDataUIStateArr2;
                list7 = list5;
                styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                obj7 = objB5;
                i4 = 1;
                LoadingDialogUIState loadingDialogUIState11112 = loadingDialogUIState3;
                String lowerCase19 = ((String) obj7).toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase19, "toLowerCase(...)");
                PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState11116 = premiumBusBulkBookingConfirmationDataState8;
                premiumBusBulkBookingConfirmationComponent = this;
                styledTextDataUIStateArr4[i4] = new StyledTextDataUIState(" ".concat(lowerCase19), ChaloColorToken.OrangePrimary.f9835a, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler$Companion$create$1("TNC", "TNC", new mt0(premiumBusBulkBookingConfirmationComponent, 0)), 496);
                ?? r115 = obj5;
                termsAndConditionsUIState = new TermsAndConditionsUIState(chaloTextUIState, list6, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), r115, r115, 30));
                buttonUIState2 = buttonUIState3;
                list3 = list7;
                routeDetailInfoUIState5 = routeDetailInfoUIState7;
                toolbarUIState4 = toolbarUIState5;
                passInfoUIState2 = passInfoUIState3;
                premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState11116;
                loadingDialogUIStateA = loadingDialogUIState11112;
                if (premiumBusBulkBookingConfirmationDataState6.n) {
                    break;
                }
                routeDetailInfoUIState8 = routeDetailInfoUIState5;
                loadingDialogUIState4 = loadingDialogUIStateA;
                buttonUIState4 = buttonUIState2;
                passInfoUIState4 = passInfoUIState2;
                termsAndConditionsUIState2 = termsAndConditionsUIState;
                list8 = list3;
                toolbarUIState6 = toolbarUIState4;
                termsAndConditionsBottomSheetUIState = null;
                return new PremiumBusBulkBookingConfirmationViewState(toolbarUIState6, routeDetailInfoUIState8, list8, passInfoUIState4, buttonUIState4, loadingDialogUIState4, termsAndConditionsUIState2, termsAndConditionsBottomSheetUIState);
            case 8:
                i4 = premiumBusBulkBookingConfirmationComponent$convertToUiState$1.I$0;
                LoadingDialogUIState loadingDialogUIState21 = (LoadingDialogUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10;
                ButtonUIState buttonUIState7 = (ButtonUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9;
                PassInfoUIState passInfoUIState10 = (PassInfoUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8;
                list7 = (List) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7;
                routeDetailInfoUIState7 = (RouteDetailInfoUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6;
                toolbarUIState5 = (ToolbarUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5;
                StyledTextDataUIState[] styledTextDataUIStateArr8 = (StyledTextDataUIState[]) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4;
                styledTextDataUIStateArr5 = (StyledTextDataUIState[]) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3;
                List list23 = (List) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState4 = (TextUIState.ChaloTextUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1;
                PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState25 = (PremiumBusBulkBookingConfirmationDataState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0;
                ResultKt.b(obj9);
                coroutineSingletons = coroutineSingletons2;
                stringProvider = stringProvider2;
                shadyGray = shadyGray2;
                chaloTextStyleHelper3 = chaloTextStyleHelper8;
                str2 = ". ";
                styledTextDataUIStateArr4 = styledTextDataUIStateArr8;
                list6 = list23;
                chaloTextUIState = chaloTextUIState4;
                obj5 = null;
                premiumBusBulkBookingConfirmationDataState8 = premiumBusBulkBookingConfirmationDataState25;
                passInfoUIState3 = passInfoUIState10;
                obj7 = obj9;
                buttonUIState3 = buttonUIState7;
                loadingDialogUIState3 = loadingDialogUIState21;
                LoadingDialogUIState loadingDialogUIState11113 = loadingDialogUIState3;
                String lowerCase110 = ((String) obj7).toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase110, "toLowerCase(...)");
                PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState11117 = premiumBusBulkBookingConfirmationDataState8;
                premiumBusBulkBookingConfirmationComponent = this;
                styledTextDataUIStateArr4[i4] = new StyledTextDataUIState(" ".concat(lowerCase110), ChaloColorToken.OrangePrimary.f9835a, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, new StyledTextClickHandler$Companion$create$1("TNC", "TNC", new mt0(premiumBusBulkBookingConfirmationComponent, 0)), 496);
                ?? r116 = obj5;
                termsAndConditionsUIState = new TermsAndConditionsUIState(chaloTextUIState, list6, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), r116, r116, 30));
                buttonUIState2 = buttonUIState3;
                list3 = list7;
                routeDetailInfoUIState5 = routeDetailInfoUIState7;
                toolbarUIState4 = toolbarUIState5;
                passInfoUIState2 = passInfoUIState3;
                premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState11117;
                loadingDialogUIStateA = loadingDialogUIState11113;
                if (premiumBusBulkBookingConfirmationDataState6.n) {
                    break;
                }
                routeDetailInfoUIState8 = routeDetailInfoUIState5;
                loadingDialogUIState4 = loadingDialogUIStateA;
                buttonUIState4 = buttonUIState2;
                passInfoUIState4 = passInfoUIState2;
                termsAndConditionsUIState2 = termsAndConditionsUIState;
                list8 = list3;
                toolbarUIState6 = toolbarUIState4;
                termsAndConditionsBottomSheetUIState = null;
                return new PremiumBusBulkBookingConfirmationViewState(toolbarUIState6, routeDetailInfoUIState8, list8, passInfoUIState4, buttonUIState4, loadingDialogUIState4, termsAndConditionsUIState2, termsAndConditionsBottomSheetUIState);
            case 9:
                ChaloTextStyleHelper chaloTextStyleHelper21 = (ChaloTextStyleHelper) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8;
                termsAndConditionsUIState3 = (TermsAndConditionsUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7;
                loadingDialogUIState5 = (LoadingDialogUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6;
                ButtonUIState buttonUIState8 = (ButtonUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5;
                PassInfoUIState passInfoUIState11 = (PassInfoUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4;
                List list24 = (List) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3;
                RouteDetailInfoUIState routeDetailInfoUIState26 = (RouteDetailInfoUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2;
                toolbarUIState7 = (ToolbarUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1;
                PremiumBusBulkBookingConfirmationDataState premiumBusBulkBookingConfirmationDataState26 = (PremiumBusBulkBookingConfirmationDataState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0;
                ResultKt.b(obj9);
                coroutineSingletons = coroutineSingletons2;
                stringProvider = stringProvider2;
                shadyGray = shadyGray2;
                str2 = ". ";
                chaloTextStyleHelper5 = chaloTextStyleHelper8;
                routeDetailInfoUIState5 = routeDetailInfoUIState26;
                premiumBusBulkBookingConfirmationDataState6 = premiumBusBulkBookingConfirmationDataState26;
                obj8 = obj9;
                chaloTextStyleHelper6 = chaloTextStyleHelper21;
                list10 = list24;
                passInfoUIState5 = passInfoUIState11;
                buttonUIState5 = buttonUIState8;
                chaloTextUIStateG2 = ChaloTextStyleHelper.g(chaloTextStyleHelper6, (String) obj8, almostBlackColor, null, UIFontWeight.Bold, null, null, 108);
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0 = premiumBusBulkBookingConfirmationDataState6;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1 = buttonUIStateFactory;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2 = toolbarUIState7;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3 = routeDetailInfoUIState5;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4 = list10;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5 = passInfoUIState5;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6 = buttonUIState5;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7 = loadingDialogUIState5;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8 = termsAndConditionsUIState3;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9 = chaloTextUIStateG2;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10 = chaloTextStyleHelper5;
                routeDetailInfoUIState9 = routeDetailInfoUIState5;
                premiumBusBulkBookingConfirmationComponent$convertToUiState$1.label = 10;
                objB6 = stringProvider.b(StringEnum.OK, new Object[0], premiumBusBulkBookingConfirmationComponent$convertToUiState$1);
                if (objB6 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                list11 = list10;
                loadingDialogUIState6 = loadingDialogUIState5;
                premiumBusBulkBookingConfirmationDataState9 = premiumBusBulkBookingConfirmationDataState6;
                chaloTextUIState2 = chaloTextUIStateG2;
                obj9 = objB6;
                termsAndConditionsUIState4 = termsAndConditionsUIState3;
                chaloTextStyleHelper7 = chaloTextStyleHelper5;
                PassInfoUIState passInfoUIState12 = passInfoUIState5;
                ToolbarUIState toolbarUIState13 = toolbarUIState7;
                ButtonUIState buttonUIState9 = buttonUIState5;
                premiumBusBulkBookingConfirmationComponent2 = this;
                ButtonUIState buttonUIStateF2 = ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.g(chaloTextStyleHelper7, (String) obj9, ChaloColorToken.White.f9870a, null, UIFontWeight.Bold, null, null, 108), new mt0(premiumBusBulkBookingConfirmationComponent2, 1), UIShape.e, false, 0.0f, 52);
                List list120 = premiumBusBulkBookingConfirmationDataState9.m;
                arrayList2 = new ArrayList(CollectionsKt.v(list120, 10));
                i5 = 0;
                while (r2.hasNext()) {
                    i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    ChaloTextStyleHelper chaloTextStyleHelper119 = chaloTextStyleHelper5;
                    arrayList2.add(ChaloTextStyleHelper.c(chaloTextStyleHelper119, i6 + str2 + ((String) obj11), shadyGray, null, null, null, null, 124));
                    chaloTextStyleHelper5 = chaloTextStyleHelper119;
                    premiumBusBulkBookingConfirmationComponent2 = premiumBusBulkBookingConfirmationComponent2;
                    i5 = i6;
                }
                termsAndConditionsUIState2 = termsAndConditionsUIState4;
                loadingDialogUIState4 = loadingDialogUIState6;
                termsAndConditionsBottomSheetUIState = new TermsAndConditionsBottomSheetUIState(chaloTextUIState2, buttonUIStateF2, arrayList2, new mt0(premiumBusBulkBookingConfirmationComponent2, 2));
                buttonUIState4 = buttonUIState9;
                routeDetailInfoUIState8 = routeDetailInfoUIState9;
                passInfoUIState4 = passInfoUIState12;
                list8 = list11;
                toolbarUIState6 = toolbarUIState13;
                return new PremiumBusBulkBookingConfirmationViewState(toolbarUIState6, routeDetailInfoUIState8, list8, passInfoUIState4, buttonUIState4, loadingDialogUIState4, termsAndConditionsUIState2, termsAndConditionsBottomSheetUIState);
            case 10:
                ChaloTextStyleHelper chaloTextStyleHelper22 = (ChaloTextStyleHelper) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$10;
                chaloTextUIState2 = (TextUIState.ChaloTextUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$9;
                TermsAndConditionsUIState termsAndConditionsUIState5 = (TermsAndConditionsUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$8;
                LoadingDialogUIState loadingDialogUIState22 = (LoadingDialogUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$7;
                buttonUIState5 = (ButtonUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$6;
                passInfoUIState5 = (PassInfoUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$5;
                List list25 = (List) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$4;
                RouteDetailInfoUIState routeDetailInfoUIState27 = (RouteDetailInfoUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$3;
                toolbarUIState7 = (ToolbarUIState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$2;
                buttonUIStateFactory = (ButtonUIStateFactory) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$1;
                premiumBusBulkBookingConfirmationDataState9 = (PremiumBusBulkBookingConfirmationDataState) premiumBusBulkBookingConfirmationComponent$convertToUiState$1.L$0;
                ResultKt.b(obj9);
                termsAndConditionsUIState4 = termsAndConditionsUIState5;
                shadyGray = shadyGray2;
                routeDetailInfoUIState9 = routeDetailInfoUIState27;
                str2 = ". ";
                list11 = list25;
                chaloTextStyleHelper7 = chaloTextStyleHelper22;
                loadingDialogUIState6 = loadingDialogUIState22;
                chaloTextStyleHelper5 = chaloTextStyleHelper8;
                PassInfoUIState passInfoUIState13 = passInfoUIState5;
                ToolbarUIState toolbarUIState14 = toolbarUIState7;
                ButtonUIState buttonUIState10 = buttonUIState5;
                premiumBusBulkBookingConfirmationComponent2 = this;
                ButtonUIState buttonUIStateF3 = ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.g(chaloTextStyleHelper7, (String) obj9, ChaloColorToken.White.f9870a, null, UIFontWeight.Bold, null, null, 108), new mt0(premiumBusBulkBookingConfirmationComponent2, 1), UIShape.e, false, 0.0f, 52);
                List list121 = premiumBusBulkBookingConfirmationDataState9.m;
                arrayList2 = new ArrayList(CollectionsKt.v(list121, 10));
                i5 = 0;
                while (r2.hasNext()) {
                    i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    ChaloTextStyleHelper chaloTextStyleHelper1110 = chaloTextStyleHelper5;
                    arrayList2.add(ChaloTextStyleHelper.c(chaloTextStyleHelper1110, i6 + str2 + ((String) obj11), shadyGray, null, null, null, null, 124));
                    chaloTextStyleHelper5 = chaloTextStyleHelper1110;
                    premiumBusBulkBookingConfirmationComponent2 = premiumBusBulkBookingConfirmationComponent2;
                    i5 = i6;
                }
                termsAndConditionsUIState2 = termsAndConditionsUIState4;
                loadingDialogUIState4 = loadingDialogUIState6;
                termsAndConditionsBottomSheetUIState = new TermsAndConditionsBottomSheetUIState(chaloTextUIState2, buttonUIStateF3, arrayList2, new mt0(premiumBusBulkBookingConfirmationComponent2, 2));
                buttonUIState4 = buttonUIState10;
                routeDetailInfoUIState8 = routeDetailInfoUIState9;
                passInfoUIState4 = passInfoUIState13;
                list8 = list11;
                toolbarUIState6 = toolbarUIState14;
                return new PremiumBusBulkBookingConfirmationViewState(toolbarUIState6, routeDetailInfoUIState8, list8, passInfoUIState4, buttonUIState4, loadingDialogUIState4, termsAndConditionsUIState2, termsAndConditionsBottomSheetUIState);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object L0(String str, ContinuationImpl continuationImpl) {
        PremiumBusBulkBookingConfirmationComponent$createBookRideButtonUIState$1 premiumBusBulkBookingConfirmationComponent$createBookRideButtonUIState$1;
        String str2;
        List list;
        int size;
        boolean z;
        if (continuationImpl instanceof PremiumBusBulkBookingConfirmationComponent$createBookRideButtonUIState$1) {
            premiumBusBulkBookingConfirmationComponent$createBookRideButtonUIState$1 = (PremiumBusBulkBookingConfirmationComponent$createBookRideButtonUIState$1) continuationImpl;
            int i = premiumBusBulkBookingConfirmationComponent$createBookRideButtonUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusBulkBookingConfirmationComponent$createBookRideButtonUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusBulkBookingConfirmationComponent$createBookRideButtonUIState$1 = new PremiumBusBulkBookingConfirmationComponent$createBookRideButtonUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusBulkBookingConfirmationComponent$createBookRideButtonUIState$1 = new PremiumBusBulkBookingConfirmationComponent$createBookRideButtonUIState$1(this, continuationImpl);
        }
        Object objB = premiumBusBulkBookingConfirmationComponent$createBookRideButtonUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusBulkBookingConfirmationComponent$createBookRideButtonUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (StringsKt.F(str)) {
                premiumBusBulkBookingConfirmationComponent$createBookRideButtonUIState$1.label = 1;
                objB = this.n.b(StringEnum.BOOK_RIDE, new Object[0], premiumBusBulkBookingConfirmationComponent$createBookRideButtonUIState$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                str2 = str;
            }
            TextUIState.ChaloTextUIState chaloTextUIStateG = ChaloTextStyleHelper.g(ChaloTextStyleHelper.f10078a, str2, ChaloColorToken.White.f9870a, null, UIFontWeight.Bold, null, null, 108);
            UIShape.Rectangle rectangle = UIShape.e;
            list = ((PremiumBusBulkBookingConfirmationDataState) this.f.getValue()).d;
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
            if (size > 0) {
                z = true;
            } else {
                z = false;
            }
            return ButtonUIStateFactory.f(ButtonUIStateFactory.f9921a, chaloTextUIStateG, new mt0(this, 3), rectangle, z, 0.0f, 36);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objB);
        str2 = (String) objB;
        TextUIState.ChaloTextUIState chaloTextUIStateG2 = ChaloTextStyleHelper.g(ChaloTextStyleHelper.f10078a, str2, ChaloColorToken.White.f9870a, null, UIFontWeight.Bold, null, null, 108);
        UIShape.Rectangle rectangle2 = UIShape.e;
        list = ((PremiumBusBulkBookingConfirmationDataState) this.f.getValue()).d;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (size > 0) {
            z = true;
        } else {
            z = false;
        }
        return ButtonUIStateFactory.f(ButtonUIStateFactory.f9921a, chaloTextUIStateG2, new mt0(this, 3), rectangle2, z, 0.0f, 36);
    }

    public final LinkedHashMap M0() {
        String str;
        StateFlow stateFlow = this.f;
        PassInfo passInfo = ((PremiumBusBulkBookingConfirmationDataState) stateFlow.getValue()).g;
        if (passInfo == null || (str = passInfo.b) == null) {
            str = "";
        }
        return MapsKt.k(new Pair("passId", ((PremiumBusBulkBookingConfirmationDataState) stateFlow.getValue()).b), new Pair("configId", str));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object N0(ContinuationImpl continuationImpl) {
        PremiumBusBulkBookingConfirmationComponent$navigateToBookingSuccessScreenForGenderMismatch$1 premiumBusBulkBookingConfirmationComponent$navigateToBookingSuccessScreenForGenderMismatch$1;
        KotlinToastManager kotlinToastManager;
        DateAndSlotSelectedForBulkBooking dateAndSlotSelectedForBulkBooking;
        List list;
        if (continuationImpl instanceof PremiumBusBulkBookingConfirmationComponent$navigateToBookingSuccessScreenForGenderMismatch$1) {
            premiumBusBulkBookingConfirmationComponent$navigateToBookingSuccessScreenForGenderMismatch$1 = (PremiumBusBulkBookingConfirmationComponent$navigateToBookingSuccessScreenForGenderMismatch$1) continuationImpl;
            int i = premiumBusBulkBookingConfirmationComponent$navigateToBookingSuccessScreenForGenderMismatch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusBulkBookingConfirmationComponent$navigateToBookingSuccessScreenForGenderMismatch$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusBulkBookingConfirmationComponent$navigateToBookingSuccessScreenForGenderMismatch$1 = new PremiumBusBulkBookingConfirmationComponent$navigateToBookingSuccessScreenForGenderMismatch$1(this, continuationImpl);
            }
        } else {
            premiumBusBulkBookingConfirmationComponent$navigateToBookingSuccessScreenForGenderMismatch$1 = new PremiumBusBulkBookingConfirmationComponent$navigateToBookingSuccessScreenForGenderMismatch$1(this, continuationImpl);
        }
        Object objB = premiumBusBulkBookingConfirmationComponent$navigateToBookingSuccessScreenForGenderMismatch$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusBulkBookingConfirmationComponent$navigateToBookingSuccessScreenForGenderMismatch$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objB);
            StateFlow stateFlow = this.f;
            String str = ((PremiumBusBulkBookingConfirmationDataState) stateFlow.getValue()).i;
            String str2 = ((PremiumBusBulkBookingConfirmationDataState) stateFlow.getValue()).j;
            String str3 = ((PremiumBusBulkBookingConfirmationDataState) stateFlow.getValue()).k;
            String str4 = ((PremiumBusBulkBookingConfirmationDataState) stateFlow.getValue()).l;
            List list2 = ((PremiumBusBulkBookingConfirmationDataState) stateFlow.getValue()).d;
            SlotsAvailableForSelection slotsAvailableForSelection = (list2 == null || (dateAndSlotSelectedForBulkBooking = (DateAndSlotSelectedForBulkBooking) CollectionsKt.H(list2)) == null || (list = dateAndSlotSelectedForBulkBooking.d) == null) ? null : (SlotsAvailableForSelection) CollectionsKt.H(list);
            if (str != null && str.length() != 0 && str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0 && str4 != null && str4.length() != 0 && slotsAvailableForSelection != null) {
                PremiumBusSelectedLocationType premiumBusSelectedLocationType = PremiumBusSelectedLocationType.STOP;
                PremiumBusProductPurchaseFlowType.FreshPurchase freshPurchase = new PremiumBusProductPurchaseFlowType.FreshPurchase(new PBStopPlaceSelectedAppModel(str, "searchPartnerChaloStop", str3, null, null, premiumBusSelectedLocationType), new PBStopPlaceSelectedAppModel(str2, "searchPartnerChaloStop", str4, null, null, premiumBusSelectedLocationType), slotsAvailableForSelection.f7902a.c);
                Json json = ChaloJson.b;
                json.getClass();
                this.k.b(new ChaloNavigationRequest.Navigate(new BookingSuccessArgs.ProductSuccessScreen(new BookingSuccessProductType.GenderMismatchError(json.a(PremiumBusProductPurchaseFlowType.INSTANCE.serializer(), freshPurchase)), Source.PREMIUM_BUS_PRE_BOOKING_RIDES_CONFIRMATION_SCREEN), null, null, 6));
                return unit;
            }
            KotlinToastManager kotlinToastManager2 = this.m;
            premiumBusBulkBookingConfirmationComponent$navigateToBookingSuccessScreenForGenderMismatch$1.L$0 = kotlinToastManager2;
            premiumBusBulkBookingConfirmationComponent$navigateToBookingSuccessScreenForGenderMismatch$1.label = 1;
            objB = this.n.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], premiumBusBulkBookingConfirmationComponent$navigateToBookingSuccessScreenForGenderMismatch$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            kotlinToastManager = kotlinToastManager2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) premiumBusBulkBookingConfirmationComponent$navigateToBookingSuccessScreenForGenderMismatch$1.L$0;
            ResultKt.b(objB);
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
        return unit;
    }

    public final void O0(PremiumBusBulkBookingConfirmationIntent premiumBusBulkBookingConfirmationIntent) {
        C0(premiumBusBulkBookingConfirmationIntent);
        boolean z = premiumBusBulkBookingConfirmationIntent instanceof PremiumBusBulkBookingConfirmationIntent.InitializationIntent;
        ContextScope contextScope = this.j;
        if (z) {
            E0(new gt0(1));
            BuildersKt.d(contextScope, null, null, new PremiumBusBulkBookingConfirmationComponent$handleInitializationIntent$2((PremiumBusBulkBookingConfirmationIntent.InitializationIntent) premiumBusBulkBookingConfirmationIntent, this, null), 3);
            return;
        }
        if (premiumBusBulkBookingConfirmationIntent.equals(PremiumBusBulkBookingConfirmationIntent.BookRideButtonClickIntent.f7496a)) {
            BuildersKt.d(contextScope, null, null, new PremiumBusBulkBookingConfirmationComponent$handleBookRideButtonClickIntent$1(this, null), 3);
            return;
        }
        if (premiumBusBulkBookingConfirmationIntent instanceof PremiumBusBulkBookingConfirmationIntent.RemoveSlotClickIntent) {
            BuildersKt.d(contextScope, null, null, new PremiumBusBulkBookingConfirmationComponent$handleRemoveSlotClickIntent$1((PremiumBusBulkBookingConfirmationIntent.RemoveSlotClickIntent) premiumBusBulkBookingConfirmationIntent, this, null), 3);
            return;
        }
        if (premiumBusBulkBookingConfirmationIntent.equals(PremiumBusBulkBookingConfirmationIntent.TermsAndConditionsTextClickIntent.f7499a)) {
            E0(new gt0(5));
        } else if (premiumBusBulkBookingConfirmationIntent.equals(PremiumBusBulkBookingConfirmationIntent.TnCBottomSheetOkClickIntent.f7501a)) {
            E0(new gt0(3));
        } else {
            if (!premiumBusBulkBookingConfirmationIntent.equals(PremiumBusBulkBookingConfirmationIntent.TnCBottomSheetDismissIntent.f7500a)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new gt0(6));
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new PremiumBusBulkBookingConfirmationDataState(true, "", null, null, null, null, null, "", null, null, null, null, null, false, false);
    }
}
