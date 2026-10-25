package app.chalo.home.ui.history.factory;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.data.ChaloTextDataAppModel;
import app.chalo.home.ui.history.TicketsPageErrorImage;
import app.chalo.home.ui.history.TicketsPageInfoBottomSheetData;
import app.chalo.home.ui.history.TicketsPassesTabType;
import app.chalo.home.ui.history.TicketsScreenBottomSheetType;
import app.chalo.home.ui.history.factory.mapper.HistoryPassUiStateMapperHelper;
import app.chalo.home.ui.history.factory.mapper.active.HistoryActiveTicketsUiStateMapperHelper;
import app.chalo.home.ui.history.factory.mapper.expired.HistoryExpiredTicketsUiStateMapperHelper;
import app.chalo.home.ui.history.uistate.ChaloCitySelectedContainerSpec;
import app.chalo.home.ui.history.uistate.ChaloCitySelectedContainerUiState;
import app.chalo.home.ui.history.uistate.ChaloWidgetCardSpec;
import app.chalo.home.ui.history.uistate.ChaloWidgetCardUiState;
import app.chalo.home.ui.history.uistate.EmptyScreenProductBookingOptionsUiState;
import app.chalo.home.ui.history.uistate.ProductsTabUiState;
import app.chalo.home.ui.history.uistate.TabSpec;
import app.chalo.home.ui.history.uistate.TabUiState;
import app.chalo.home.ui.history.uistate.TextWithBackgroundUiState;
import app.chalo.home.ui.history.uistate.bottomsheet.MyTicketBottomSheetUiState;
import app.chalo.home.ui.history.uistate.tabheader.HeaderAndIconContainerSpec;
import app.chalo.home.ui.history.uistate.tabheader.HeaderAndIconContainerUiState;
import app.chalo.home.ui.history.uistate.tabheader.HeaderTextUiState;
import app.chalo.home.ui.history.uistate.tabheader.ProfileAndCityContainerUiState;
import app.chalo.home.ui.history.uistate.tabheader.TabHeaderUiState;
import app.chalo.homescreen.data.model.app.HeaderItemType;
import app.chalo.homescreen.data.model.app.ItemTextDataAppModel;
import app.chalo.homescreen.data.model.app.TabMetaDataAppModel;
import app.chalo.homescreen.data.model.app.TicketsPassesSectionWidgetAppModel;
import app.chalo.homescreen.data.model.app.TicketsTabHooksCardSectionData;
import app.chalo.models.contactsupport.ContactSupportCtaUIState;
import app.chalo.models.contactsupport.ContactSupportUIState;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorToken_androidKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetStandardContentUiState;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import app.chalo.uistate.bottomsheet.DrawType;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.components.ProductGridContainerSpec;
import app.chalo.uistate.dialog.ConfirmationDialogActionCtaContainerUiState;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.DialogueCtaUiState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.multimodal.StepTicketModeBasedInfoUIStateFactory;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.bl0;
import defpackage.gd0;
import defpackage.qk0;
import defpackage.u10;
import defpackage.wg0;
import defpackage.zf0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/factory/MyTicketsUiStateFactory;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MyTicketsUiStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f3453a;
    public final HistoryPassUiStateMapperHelper b;
    public final HistoryActiveTicketsUiStateMapperHelper c;
    public final HistoryExpiredTicketsUiStateMapperHelper d;
    public final CityProvider e;
    public final StepTicketModeBasedInfoUIStateFactory f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3454a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[TicketsPageErrorImage.values().length];
            try {
                iArr[TicketsPageErrorImage.PRODUCT_USE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TicketsPageErrorImage.APP_RECLAIM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TicketsPageErrorImage.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3454a = iArr;
            int[] iArr2 = new int[TicketsPassesTabType.values().length];
            try {
                iArr2[TicketsPassesTabType.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TicketsPassesTabType.EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
        }
    }

    public MyTicketsUiStateFactory(StringProvider stringProvider, HistoryPassUiStateMapperHelper historyPassUiStateMapperHelper, HistoryActiveTicketsUiStateMapperHelper historyActiveTicketsUiStateMapperHelper, HistoryExpiredTicketsUiStateMapperHelper historyExpiredTicketsUiStateMapperHelper, CityProvider cityProvider, StepTicketModeBasedInfoUIStateFactory stepTicketModeBasedInfoUIStateFactory) {
        this.f3453a = stringProvider;
        this.b = historyPassUiStateMapperHelper;
        this.c = historyActiveTicketsUiStateMapperHelper;
        this.d = historyExpiredTicketsUiStateMapperHelper;
        this.e = cityProvider;
        this.f = stepTicketModeBasedInfoUIStateFactory;
    }

    public static BottomSheetStandardContentUiState h(TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet ticketsPageInfoBottomSheet, Function1 function1) {
        IconType iconType;
        Intrinsics.i(ticketsPageInfoBottomSheet, "ticketsPageInfoBottomSheet");
        TicketsPageInfoBottomSheetData ticketsPageInfoBottomSheetData = ticketsPageInfoBottomSheet.f3448a;
        int i = WhenMappings.f3454a[ticketsPageInfoBottomSheetData.f3445a.ordinal()];
        if (i == 1) {
            iconType = IconType.IC_PRODUCT_USE;
        } else if (i == 2) {
            iconType = IconType.IC_SUPER_SAVER_RECLAIM_UNSUCCESS;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iconType = IconType.IC_DAILY_LIMIT;
        }
        DrawType.Icon icon = new DrawType.Icon(new ImageUIState(iconType, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
        String str = ticketsPageInfoBottomSheetData.b;
        UITextAlign uITextAlign = UITextAlign.Center;
        UIFontWeight uIFontWeight = UIFontWeight.Bold;
        ChaloTextStyleHelper chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
        TextUIState.ChaloTextUIState chaloTextUIStateE = ChaloTextStyleHelper.e(chaloTextStyleHelper, str, null, uITextAlign, uIFontWeight, null, 102);
        TextUIState.ChaloTextUIState chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper, ticketsPageInfoBottomSheetData.c, ChaloColorToken.ShadyGray.f9851a, uITextAlign, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
        TextUIState.ChaloTextUIState chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper, ticketsPageInfoBottomSheetData.d, ChaloColorToken.White.f9870a, null, null, 124);
        bl0 bl0Var = new bl0(function1, ticketsPageInfoBottomSheet);
        ButtonUIStateFactory buttonUIStateFactory = ButtonUIStateFactory.f9921a;
        ButtonUIState buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, chaloTextUIStateF, bl0Var, null, false, 0.0f, 60);
        String str2 = ticketsPageInfoBottomSheetData.e;
        ButtonUIState buttonUIStateD = null;
        if (str2 != null) {
            String str3 = str2.length() == 0 ? null : str2;
            if (str3 != null) {
                buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory, ChaloTextStyleHelper.f(chaloTextStyleHelper, str3, ChaloColorToken.Black_87.f9768a, null, null, 124), new bl0(ticketsPageInfoBottomSheet, function1), null, false, 60);
            }
        }
        return new BottomSheetStandardContentUiState(null, null, icon, chaloTextUIStateE, chaloTextUIStateC, buttonUIStateF, buttonUIStateD, null, 131);
    }

    public static EmptyScreenProductBookingOptionsUiState.ProductGridContainer k(TicketsPassesSectionWidgetAppModel.TicketsTabHooksSectionWidgetAppModel ticketsTabHooksSectionWidgetAppModel, Function1 function1) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List listV0 = CollectionsKt.v0(new MyTicketsUiStateFactory$getWidgetCardUiList$$inlined$sortedBy$1(), ticketsTabHooksSectionWidgetAppModel.d.f3820a);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.v(listV0, 10));
        int i = 0;
        for (Object obj : listV0) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            TicketsTabHooksCardSectionData ticketsTabHooksCardSectionData = (TicketsTabHooksCardSectionData) obj;
            ItemTextDataAppModel itemTextDataAppModel = ticketsTabHooksCardSectionData.d;
            ChaloTextDataAppModel chaloTextDataAppModel = itemTextDataAppModel.c;
            TextWithBackgroundUiState textWithBackgroundUiStateA = chaloTextDataAppModel != null ? MyTicketsUiStateFactoryKt.a(chaloTextDataAppModel) : null;
            List list = itemTextDataAppModel.f3757a;
            if (list != null) {
                List list2 = list;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.v(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList4.add(MyTicketsUiStateFactoryKt.a((ChaloTextDataAppModel) it.next()));
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            List list3 = itemTextDataAppModel.b;
            if (list3 != null) {
                List list4 = list3;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.v(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(MyTicketsUiStateFactoryKt.a((ChaloTextDataAppModel) it2.next()));
                }
                arrayList2 = arrayList5;
            } else {
                arrayList2 = null;
            }
            IconType iconType = ticketsTabHooksCardSectionData.f;
            ImageUIState imageUIState = iconType != null ? new ImageUIState(iconType, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254) : null;
            String str = ticketsTabHooksCardSectionData.b;
            ImageUrlUIState imageUrlUIState = str != null ? new ImageUrlUIState(str, null, null, null, WebSocketProtocol.PAYLOAD_SHORT) : null;
            String str2 = ticketsTabHooksCardSectionData.f3819a;
            ChaloColorToken custom = ChaloColorToken.Transparent.f9864a;
            if (str2 != null && str2.length() > 0) {
                custom = new ChaloColorToken.Custom(ChaloColorToken_androidKt.a(Color.INSTANCE, str2, Color.INSTANCE.m4640getTransparent0d7_KjU()));
            }
            arrayList3.add(new ChaloWidgetCardUiState(new ChaloWidgetCardSpec(custom), imageUrlUIState, imageUIState, textWithBackgroundUiStateA, arrayList, arrayList2, UiEventHandler.Companion.a(new u10(function1, ticketsTabHooksCardSectionData, i, 4))));
            i = i2;
        }
        return new EmptyScreenProductBookingOptionsUiState.ProductGridContainer(new ProductGridContainerSpec(0.0f, 2, arrayList3.size(), 57), arrayList3);
    }

    public static ProductsTabUiState l(List list, TicketsPassesTabType ticketsPassesTabType, Function1 function1) {
        int iIndexOf = list.indexOf(ticketsPassesTabType);
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it = list2.iterator();
        int i = 0;
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                return new ProductsTabUiState(arrayList, iIndexOf, 1);
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            TicketsPassesTabType ticketsPassesTabType2 = (TicketsPassesTabType) next;
            if (ticketsPassesTabType2 == ticketsPassesTabType) {
                iIndexOf = i;
            } else {
                z = false;
            }
            arrayList.add(new TabUiState(new TabSpec(z ? 2.0f : 0.0f, z ? ChaloColorToken.Transparent.f9864a : ChaloColorToken.GreyColor.f9806a), new TextUIState.ChaloTextUIState(ticketsPassesTabType2.getTabName(), UITextStyle.HeadlineSmall, z ? ChaloColorToken.White.f9870a : ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), z, new zf0(8, function1, ticketsPassesTabType2)));
            i = i2;
        }
    }

    public final Object a(Map map, String str, List list, Function2 function2, Continuation continuation) {
        return this.c.a(map, str, list, function2, (ContinuationImpl) continuation);
    }

    public final Object b(String str, List list, Function2 function2, Continuation continuation) {
        return this.b.c(str, list, function2, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(int i, boolean z, Function1 function1, ContinuationImpl continuationImpl) {
        MyTicketsUiStateFactory$getContactSupportDialogUIState$1 myTicketsUiStateFactory$getContactSupportDialogUIState$1;
        Function1 function2;
        Function1 function3;
        TextUIState.ChaloTextUIState chaloTextUIState;
        if (continuationImpl instanceof MyTicketsUiStateFactory$getContactSupportDialogUIState$1) {
            myTicketsUiStateFactory$getContactSupportDialogUIState$1 = (MyTicketsUiStateFactory$getContactSupportDialogUIState$1) continuationImpl;
            int i2 = myTicketsUiStateFactory$getContactSupportDialogUIState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                myTicketsUiStateFactory$getContactSupportDialogUIState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                myTicketsUiStateFactory$getContactSupportDialogUIState$1 = new MyTicketsUiStateFactory$getContactSupportDialogUIState$1(this, continuationImpl);
            }
        } else {
            myTicketsUiStateFactory$getContactSupportDialogUIState$1 = new MyTicketsUiStateFactory$getContactSupportDialogUIState$1(this, continuationImpl);
        }
        Object objB = myTicketsUiStateFactory$getContactSupportDialogUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = myTicketsUiStateFactory$getContactSupportDialogUIState$1.label;
        StringProvider stringProvider = this.f3453a;
        if (i3 == 0) {
            ResultKt.b(objB);
            StringEnum stringEnum = z ? StringEnum.NO_TICKET_PASS_EMAIL_STATEMENT_MESSAGE : StringEnum.TICKET_PASS_EMAIL_STATEMENT_MESSAGE;
            Object[] objArr = {new Integer(i)};
            function2 = function1;
            myTicketsUiStateFactory$getContactSupportDialogUIState$1.L$0 = function2;
            myTicketsUiStateFactory$getContactSupportDialogUIState$1.label = 1;
            objB = stringProvider.b(stringEnum, objArr, myTicketsUiStateFactory$getContactSupportDialogUIState$1);
            if (objB != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            function2 = (Function1) myTicketsUiStateFactory$getContactSupportDialogUIState$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TextUIState.ChaloTextUIState chaloTextUIState2 = (TextUIState.ChaloTextUIState) myTicketsUiStateFactory$getContactSupportDialogUIState$1.L$1;
            function3 = (Function1) myTicketsUiStateFactory$getContactSupportDialogUIState$1.L$0;
            ResultKt.b(objB);
            chaloTextUIState = chaloTextUIState2;
        }
        return new ConfirmationDialogUiState(chaloTextUIState, null, new ConfirmationDialogActionCtaContainerUiState(new DialogueCtaUiState(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(new wg0(function3, 25))), null, 5), null, 21);
        TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        myTicketsUiStateFactory$getContactSupportDialogUIState$1.L$0 = function2;
        myTicketsUiStateFactory$getContactSupportDialogUIState$1.L$1 = chaloTextUIState3;
        myTicketsUiStateFactory$getContactSupportDialogUIState$1.label = 2;
        objB = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsUiStateFactory$getContactSupportDialogUIState$1);
        if (objB != coroutineSingletons) {
            function3 = function2;
            chaloTextUIState = chaloTextUIState3;
            return new ConfirmationDialogUiState(chaloTextUIState, null, new ConfirmationDialogActionCtaContainerUiState(new DialogueCtaUiState(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(new wg0(function3, 25))), null, 5), null, 21);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(int i, Function1 function1, ContinuationImpl continuationImpl) {
        MyTicketsUiStateFactory$getContactSupportUIState$1 myTicketsUiStateFactory$getContactSupportUIState$1;
        Function1 function2;
        Function1 function3;
        TextUIState.ChaloTextUIState chaloTextUIState;
        if (continuationImpl instanceof MyTicketsUiStateFactory$getContactSupportUIState$1) {
            myTicketsUiStateFactory$getContactSupportUIState$1 = (MyTicketsUiStateFactory$getContactSupportUIState$1) continuationImpl;
            int i2 = myTicketsUiStateFactory$getContactSupportUIState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                myTicketsUiStateFactory$getContactSupportUIState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                myTicketsUiStateFactory$getContactSupportUIState$1 = new MyTicketsUiStateFactory$getContactSupportUIState$1(this, continuationImpl);
            }
        } else {
            myTicketsUiStateFactory$getContactSupportUIState$1 = new MyTicketsUiStateFactory$getContactSupportUIState$1(this, continuationImpl);
        }
        Object objB = myTicketsUiStateFactory$getContactSupportUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = myTicketsUiStateFactory$getContactSupportUIState$1.label;
        StringProvider stringProvider = this.f3453a;
        if (i3 != 0) {
            if (i3 == 1) {
                function2 = (Function1) myTicketsUiStateFactory$getContactSupportUIState$1.L$0;
                ResultKt.b(objB);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chaloTextUIState = (TextUIState.ChaloTextUIState) myTicketsUiStateFactory$getContactSupportUIState$1.L$1;
                function3 = (Function1) myTicketsUiStateFactory$getContactSupportUIState$1.L$0;
                ResultKt.b(objB);
            }
            return new ContactSupportUIState(null, chaloTextUIState, new ContactSupportCtaUIState(new TextWithLeftAndRightIconUIState(null, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineSmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ImageUIState(IconType.IC_ORANGE_TINT_ARROW, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), 0.0f, Dp.m7276boximpl(ChaloThemeHelper.a().f), 9), UiEventHandler.Companion.a(new wg0(function3, 24))), 3);
        }
        ResultKt.b(objB);
        StringEnum stringEnum = StringEnum.ACTIVE_TICKET_PASS_X_HISTORY_SUPPORT_TEXT;
        Object[] objArr = {new Integer(i)};
        function2 = function1;
        myTicketsUiStateFactory$getContactSupportUIState$1.L$0 = function2;
        myTicketsUiStateFactory$getContactSupportUIState$1.label = 1;
        objB = stringProvider.b(stringEnum, objArr, myTicketsUiStateFactory$getContactSupportUIState$1);
        if (objB != coroutineSingletons) {
        }
        return coroutineSingletons;
        TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
        myTicketsUiStateFactory$getContactSupportUIState$1.L$0 = function2;
        myTicketsUiStateFactory$getContactSupportUIState$1.L$1 = chaloTextUIState2;
        myTicketsUiStateFactory$getContactSupportUIState$1.label = 2;
        objB = stringProvider.b(StringEnum.REQUEST_HISTORY, new Object[0], myTicketsUiStateFactory$getContactSupportUIState$1);
        if (objB != coroutineSingletons) {
            function3 = function2;
            chaloTextUIState = chaloTextUIState2;
            return new ContactSupportUIState(null, chaloTextUIState, new ContactSupportCtaUIState(new TextWithLeftAndRightIconUIState(null, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineSmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ImageUIState(IconType.IC_ORANGE_TINT_ARROW, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), 0.0f, Dp.m7276boximpl(ChaloThemeHelper.a().f), 9), UiEventHandler.Companion.a(new wg0(function3, 24))), 3);
        }
        return coroutineSingletons;
    }

    public final Object f(String str, List list, Function2 function2, Continuation continuation) {
        return this.d.c(str, list, function2, (ContinuationImpl) continuation);
    }

    public final Object g(String str, List list, Function2 function2, Continuation continuation) {
        return this.b.d(str, list, function2, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0161 -> B:63:0x0179). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01b0 -> B:69:0x01be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 6791. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final java.lang.Object i(app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel r28, app.chalo.uistate.bottomsheet.BottomSheetUiState r29, kotlin.jvm.functions.Function1 r30, kotlin.coroutines.jvm.internal.ContinuationImpl r31) {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.history.factory.MyTicketsUiStateFactory.i(app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel, app.chalo.uistate.bottomsheet.BottomSheetUiState, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(TicketsPassesSectionWidgetAppModel ticketsPassesSectionWidgetAppModel, BottomSheetUiState bottomSheetUiState, Function1 function1, ContinuationImpl continuationImpl) {
        MyTicketsUiStateFactory$getProductPurchaseBottomsheetUiState$1 myTicketsUiStateFactory$getProductPurchaseBottomsheetUiState$1;
        ChaloTextStyleHelper chaloTextStyleHelper;
        if (continuationImpl instanceof MyTicketsUiStateFactory$getProductPurchaseBottomsheetUiState$1) {
            myTicketsUiStateFactory$getProductPurchaseBottomsheetUiState$1 = (MyTicketsUiStateFactory$getProductPurchaseBottomsheetUiState$1) continuationImpl;
            int i = myTicketsUiStateFactory$getProductPurchaseBottomsheetUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                myTicketsUiStateFactory$getProductPurchaseBottomsheetUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                myTicketsUiStateFactory$getProductPurchaseBottomsheetUiState$1 = new MyTicketsUiStateFactory$getProductPurchaseBottomsheetUiState$1(this, continuationImpl);
            }
        } else {
            myTicketsUiStateFactory$getProductPurchaseBottomsheetUiState$1 = new MyTicketsUiStateFactory$getProductPurchaseBottomsheetUiState$1(this, continuationImpl);
        }
        Object objB = myTicketsUiStateFactory$getProductPurchaseBottomsheetUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = myTicketsUiStateFactory$getProductPurchaseBottomsheetUiState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (ticketsPassesSectionWidgetAppModel == null) {
                return null;
            }
            if (!(ticketsPassesSectionWidgetAppModel instanceof TicketsPassesSectionWidgetAppModel.TicketsTabHooksSectionWidgetAppModel)) {
                if (ticketsPassesSectionWidgetAppModel instanceof TicketsPassesSectionWidgetAppModel.PurchaseProductCardWidgetAppModel) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            myTicketsUiStateFactory$getProductPurchaseBottomsheetUiState$1.L$0 = function1;
            myTicketsUiStateFactory$getProductPurchaseBottomsheetUiState$1.L$1 = ticketsPassesSectionWidgetAppModel;
            ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
            myTicketsUiStateFactory$getProductPurchaseBottomsheetUiState$1.L$2 = chaloTextStyleHelper2;
            myTicketsUiStateFactory$getProductPurchaseBottomsheetUiState$1.L$3 = bottomSheetUiState;
            myTicketsUiStateFactory$getProductPurchaseBottomsheetUiState$1.label = 1;
            objB = this.f3453a.b(StringEnum.PRODUCT_PURCHASE_TITLE, new Object[0], myTicketsUiStateFactory$getProductPurchaseBottomsheetUiState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            chaloTextStyleHelper = chaloTextStyleHelper2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bottomSheetUiState = (BottomSheetUiState) myTicketsUiStateFactory$getProductPurchaseBottomsheetUiState$1.L$3;
            ChaloTextStyleHelper chaloTextStyleHelper3 = (ChaloTextStyleHelper) myTicketsUiStateFactory$getProductPurchaseBottomsheetUiState$1.L$2;
            TicketsPassesSectionWidgetAppModel ticketsPassesSectionWidgetAppModel2 = (TicketsPassesSectionWidgetAppModel) myTicketsUiStateFactory$getProductPurchaseBottomsheetUiState$1.L$1;
            Function1 function2 = (Function1) myTicketsUiStateFactory$getProductPurchaseBottomsheetUiState$1.L$0;
            ResultKt.b(objB);
            chaloTextStyleHelper = chaloTextStyleHelper3;
            ticketsPassesSectionWidgetAppModel = ticketsPassesSectionWidgetAppModel2;
            function1 = function2;
        }
        return new MyTicketBottomSheetUiState.ProductPurchaseBottomSheetUiState(bottomSheetUiState, ChaloTextStyleHelper.d(chaloTextStyleHelper, (String) objB, null, null, UIFontWeight.Bold, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), k((TicketsPassesSectionWidgetAppModel.TicketsTabHooksSectionWidgetAppModel) ticketsPassesSectionWidgetAppModel, function1));
    }

    public final TabHeaderUiState m(TabMetaDataAppModel tabMetaDataAppModel, qk0 qk0Var) {
        ProfileAndCityContainerUiState profileAndCityContainerUiState;
        HeaderAndIconContainerUiState headerAndIconContainerUiState;
        HeaderTextUiState headerTextUiState;
        ImageUIState imageUIState;
        Intrinsics.i(tabMetaDataAppModel, "tabMetaDataAppModel");
        IconType iconType = tabMetaDataAppModel.c;
        String strB = CityProviderKt.b(this.e);
        if (!tabMetaDataAppModel.d.contains(HeaderItemType.PROFILE_LOCATION) || strB == null) {
            profileAndCityContainerUiState = null;
        } else {
            profileAndCityContainerUiState = new ProfileAndCityContainerUiState(new ImageUrlUIState("", new ImageUISize(ChaloThemeHelper.a().l), null, null, 118), iconType != null ? new ImageUIState(iconType, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().h), Dp.m7276boximpl(ChaloThemeHelper.a().F)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246) : null, new ChaloCitySelectedContainerUiState(new ChaloCitySelectedContainerSpec(), new ImageUIState(IconType.IC_LOCATION_PIN, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), new TextUIState.ChaloTextUIState(strB, UITextStyle.BodySmall, (ChaloColorToken) null, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7156), new ImageUIState(IconType.IC_ARROW_UP, (String) null, ChaloColorToken.Orange2.f9830a, new ImageUISize(ChaloThemeHelper.a().g), (UIContentScale) null, 90.0f, (UiEventHandler) null, 178)));
        }
        if (profileAndCityContainerUiState != null || tabMetaDataAppModel.e.length() <= 0) {
            headerAndIconContainerUiState = null;
        } else {
            String str = tabMetaDataAppModel.e;
            HeaderAndIconContainerSpec headerAndIconContainerSpec = new HeaderAndIconContainerSpec(new ChaloPadding(0.0f, 0.0f, 3));
            HeaderTextUiState headerTextUiState2 = new HeaderTextUiState(new TextUIState.ChaloTextUIState(str, UITextStyle.DisplayMedium, (ChaloColorToken) null, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) 24, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7996));
            if (iconType != null) {
                headerTextUiState = headerTextUiState2;
                imageUIState = new ImageUIState(iconType, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
            } else {
                headerTextUiState = headerTextUiState2;
                imageUIState = null;
            }
            headerAndIconContainerUiState = new HeaderAndIconContainerUiState(headerAndIconContainerSpec, headerTextUiState, imageUIState, UiEventHandler.Companion.a(new gd0(qk0Var, 24)));
        }
        return new TabHeaderUiState(profileAndCityContainerUiState, headerAndIconContainerUiState);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
    
        if (r3 == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        if (r3 == r5) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.String r24, boolean r25, boolean r26, kotlin.jvm.functions.Function0 r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.history.factory.MyTicketsUiStateFactory.n(java.lang.String, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:52:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:54:0x0232  */
    /* JADX WARN: Code duplicated, block: B:57:0x0289  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b3, code lost:
    
        if (r3 == r5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
    
        if (r3 == r5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f1, code lost:
    
        if (r3 == r5) goto L44;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x01f1, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(app.chalo.homescreen.data.model.app.TicketsPassesSectionWidgetAppModel r32, app.chalo.home.ui.history.TicketsPassesTabType r33, kotlin.jvm.functions.Function1 r34, kotlin.coroutines.jvm.internal.ContinuationImpl r35) {
        /*
            Method dump skipped, instruction units count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.history.factory.MyTicketsUiStateFactory.o(app.chalo.homescreen.data.model.app.TicketsPassesSectionWidgetAppModel, app.chalo.home.ui.history.TicketsPassesTabType, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
