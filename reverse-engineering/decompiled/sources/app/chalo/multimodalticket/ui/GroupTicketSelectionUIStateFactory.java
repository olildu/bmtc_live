package app.chalo.multimodalticket.ui;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ShapedContentUIState;
import app.chalo.compose.theme.ShapedContentUIStateFactory;
import app.chalo.compose.theme.UIShape;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.instantticket.data.model.app.response.FareBreakupAppModel;
import app.chalo.livetracking.tripplanner.data.models.app.GroupTicketJourneyLeg;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketCategoryFareDetailsAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketLegBreakupFareDetailsAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketSelectableStepAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketSelectableStepLegDetails;
import app.chalo.multimodalticket.ui.uistates.FareBreakupItemUIState;
import app.chalo.multimodalticket.ui.uistates.FareBreakupLegSectionUIState;
import app.chalo.multimodalticket.ui.uistates.FareBreakupSectionUIState;
import app.chalo.multimodalticket.ui.uistates.GroupTicketLegSelectionBottomSheetUIStateType;
import app.chalo.multimodalticket.ui.uistates.GroupTicketPassengerSelectionBottomSheetUIState;
import app.chalo.multimodalticket.ui.uistates.PassengerSelectionItemsContainerUIState;
import app.chalo.productbooking.common.ui.FareBreakupOperationUIProperties;
import app.chalo.productbooking.common.ui.FareBreakupOperationUIPropertiesKt;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.bottomsheet.BottomSheetContentUiSpecs;
import app.chalo.uistate.bottomsheet.BottomSheetEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetRequestHandler;
import app.chalo.uistate.bottomsheet.BottomSheetStandardContentUiState;
import app.chalo.uistate.bottomsheet.BottomSheetUiSpec;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import app.chalo.uistate.bottomsheet.DrawType;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.divider.DashedDividerUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.multimodal.FromAndToStopUIState;
import app.chalo.uistate.multimodal.StepTicketModeBasedInfoUIStateFactory;
import app.chalo.uistate.radiobutton.RadioButtonUIState;
import app.chalo.uistate.text.SpecialFeaturesTagListUIState;
import app.chalo.uistate.text.SpecialFeaturesTagTextUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.d30;
import defpackage.vo1;
import defpackage.w60;
import defpackage.y60;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketSelectionUIStateFactory;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GroupTicketSelectionUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f5949a;
    public final CurrencyFeature b;
    public final StepTicketModeBasedInfoUIStateFactory c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5950a;

        static {
            int[] iArr = new int[ChaloTransitMode.values().length];
            try {
                iArr[ChaloTransitMode.BUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChaloTransitMode.METRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChaloTransitMode.TRAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChaloTransitMode.MONORAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChaloTransitMode.FERRY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ChaloTransitMode.CAB.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ChaloTransitMode.ALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ChaloTransitMode.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f5950a = iArr;
        }
    }

    public GroupTicketSelectionUIStateFactory(StringProvider stringProvider, CurrencyFeature currencyFeature, StepTicketModeBasedInfoUIStateFactory stepTicketModeBasedInfoUIStateFactory) {
        this.f5949a = stringProvider;
        this.b = currencyFeature;
        this.c = stepTicketModeBasedInfoUIStateFactory;
    }

    public static BottomSheetUiState d(Function1 function1) {
        return new BottomSheetUiState(new BottomSheetUiSpec(new UIShape.Rectangle(ChaloThemeHelper.a().f, ChaloThemeHelper.a().f, 0.0f, 0.0f, 12), 14), new BottomSheetEventHandler(false, false, BottomSheetRequestHandler.Companion.a(new d30(function1, 26)), 63));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x011e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0138 A[PHI: r1 r4 r8 r9 r10
      0x0138: PHI (r1v11 java.lang.Object) = (r1v10 java.lang.Object), (r1v1 java.lang.Object) binds: [B:27:0x0134, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r4v10 app.chalo.multimodalticket.ui.FullJourneyTicketCardUIState) = 
      (r4v7 app.chalo.multimodalticket.ui.FullJourneyTicketCardUIState)
      (r4v14 app.chalo.multimodalticket.ui.FullJourneyTicketCardUIState)
     binds: [B:27:0x0134, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r8v9 app.chalo.uistate.toolbar.ToolbarUIState) = (r8v5 app.chalo.uistate.toolbar.ToolbarUIState), (r8v11 app.chalo.uistate.toolbar.ToolbarUIState) binds: [B:27:0x0134, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r9v9 kotlin.jvm.functions.Function1) = (r9v5 kotlin.jvm.functions.Function1), (r9v11 kotlin.jvm.functions.Function1) binds: [B:27:0x0134, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r10v7 app.chalo.multimodalticket.ui.GroupTicketLegSelectionDataState) = 
      (r10v5 app.chalo.multimodalticket.ui.GroupTicketLegSelectionDataState)
      (r10v10 app.chalo.multimodalticket.ui.GroupTicketLegSelectionDataState)
     binds: [B:27:0x0134, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x015a  */
    /* JADX WARN: Code duplicated, block: B:35:0x017a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0193  */
    /* JADX WARN: Code duplicated, block: B:40:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:43:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:44:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:50:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:52:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:58:0x0204  */
    /* JADX WARN: Code duplicated, block: B:61:0x0212  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(GroupTicketLegSelectionDataState groupTicketLegSelectionDataState, Function1 function1, ContinuationImpl continuationImpl) {
        GroupTicketSelectionUIStateFactory$buildUIState$1 groupTicketSelectionUIStateFactory$buildUIState$1;
        GroupTicketLegSelectionDataState groupTicketLegSelectionDataState2;
        Function1 function2;
        ToolbarUIState toolbarUIState;
        Object objG;
        GroupTicketLegSelectionDataState groupTicketLegSelectionDataState3;
        ToolbarUIState toolbarUIState2;
        Function1 function3;
        FullJourneyTicketCardUIState fullJourneyTicketCardUIState;
        TicketSelectionContainerUIState ticketSelectionContainerUIState;
        ButtonUIStateFactory buttonUIStateFactory;
        TicketSelectionContainerUIState ticketSelectionContainerUIState2;
        GroupTicketLegSelectionDataState groupTicketLegSelectionDataState4;
        ButtonUIStateFactory buttonUIStateFactory2;
        GroupTicketLegSelectionDataState groupTicketLegSelectionDataState5;
        ButtonUIState buttonUIStateG;
        GroupTicketLegSelectionDataState groupTicketLegSelectionDataState6;
        TicketSelectionContainerUIState ticketSelectionContainerUIState3;
        LoadingDialogUIState loadingDialogUIState;
        ToolbarUIState toolbarUIState3;
        ButtonUIState buttonUIState;
        Object objB;
        Function1 function4;
        GroupTicketLegSelectionDataState groupTicketLegSelectionDataState7;
        GroupTicketLegSelectionBottomSheetDataStateType groupTicketLegSelectionBottomSheetDataStateType;
        Object objE;
        ButtonUIState buttonUIState2;
        TicketSelectionContainerUIState ticketSelectionContainerUIState4;
        ToolbarUIState toolbarUIState4;
        LoadingDialogUIState loadingDialogUIState2;
        if (continuationImpl instanceof GroupTicketSelectionUIStateFactory$buildUIState$1) {
            groupTicketSelectionUIStateFactory$buildUIState$1 = (GroupTicketSelectionUIStateFactory$buildUIState$1) continuationImpl;
            int i = groupTicketSelectionUIStateFactory$buildUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupTicketSelectionUIStateFactory$buildUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                groupTicketSelectionUIStateFactory$buildUIState$1 = new GroupTicketSelectionUIStateFactory$buildUIState$1(this, continuationImpl);
            }
        } else {
            groupTicketSelectionUIStateFactory$buildUIState$1 = new GroupTicketSelectionUIStateFactory$buildUIState$1(this, continuationImpl);
        }
        Object objB2 = groupTicketSelectionUIStateFactory$buildUIState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = groupTicketSelectionUIStateFactory$buildUIState$1.label;
        StringProvider stringProvider = this.f5949a;
        switch (i2) {
            case 0:
                ResultKt.b(objB2);
                groupTicketLegSelectionDataState2 = groupTicketLegSelectionDataState;
                groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = groupTicketLegSelectionDataState2;
                groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = function1;
                groupTicketSelectionUIStateFactory$buildUIState$1.label = 1;
                objB2 = stringProvider.b(StringEnum.SELECT_TICKETS, new Object[0], groupTicketSelectionUIStateFactory$buildUIState$1);
                if (objB2 != obj) {
                    function2 = function1;
                    toolbarUIState = new ToolbarUIState(null, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.DisplaySmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), null, UiEventHandler.Companion.a(new y60(function2, 3)), null, 0.0f, null, null, 245);
                    groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = groupTicketLegSelectionDataState2;
                    groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = function2;
                    groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = toolbarUIState;
                    groupTicketSelectionUIStateFactory$buildUIState$1.label = 2;
                    objG = g(groupTicketLegSelectionDataState2, function2, groupTicketSelectionUIStateFactory$buildUIState$1);
                    if (objG != obj) {
                        groupTicketLegSelectionDataState3 = groupTicketLegSelectionDataState2;
                        toolbarUIState2 = toolbarUIState;
                        objB2 = objG;
                        function3 = function2;
                        fullJourneyTicketCardUIState = (FullJourneyTicketCardUIState) objB2;
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = groupTicketLegSelectionDataState3;
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = function3;
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = toolbarUIState2;
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$3 = fullJourneyTicketCardUIState;
                        groupTicketSelectionUIStateFactory$buildUIState$1.label = 3;
                        objB2 = h(groupTicketLegSelectionDataState3, function3, groupTicketSelectionUIStateFactory$buildUIState$1);
                        if (objB2 != obj) {
                            ticketSelectionContainerUIState = new TicketSelectionContainerUIState(fullJourneyTicketCardUIState, (IndividualStepsTicketCardUIState) objB2);
                            groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = groupTicketLegSelectionDataState3;
                            groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = function3;
                            buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                            groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = buttonUIStateFactory;
                            groupTicketSelectionUIStateFactory$buildUIState$1.L$3 = toolbarUIState2;
                            groupTicketSelectionUIStateFactory$buildUIState$1.L$4 = ticketSelectionContainerUIState;
                            groupTicketSelectionUIStateFactory$buildUIState$1.label = 4;
                            objB2 = stringProvider.b(StringEnum.CONTINUE, new Object[0], groupTicketSelectionUIStateFactory$buildUIState$1);
                            if (objB2 != obj) {
                                ticketSelectionContainerUIState2 = ticketSelectionContainerUIState;
                                groupTicketLegSelectionDataState4 = groupTicketLegSelectionDataState3;
                                buttonUIStateFactory2 = buttonUIStateFactory;
                                groupTicketLegSelectionDataState5 = groupTicketLegSelectionDataState4;
                                buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB2, new y60(function3, 4), null, UIShape.e, false, 0.0f, 52);
                                if (groupTicketLegSelectionDataState5.b) {
                                    groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = groupTicketLegSelectionDataState5;
                                    groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = function3;
                                    groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = toolbarUIState2;
                                    groupTicketSelectionUIStateFactory$buildUIState$1.L$3 = ticketSelectionContainerUIState2;
                                    groupTicketSelectionUIStateFactory$buildUIState$1.L$4 = buttonUIStateG;
                                    groupTicketSelectionUIStateFactory$buildUIState$1.label = 5;
                                    objB = stringProvider.b(StringEnum.LOADING, new Object[0], groupTicketSelectionUIStateFactory$buildUIState$1);
                                    if (objB != obj) {
                                        toolbarUIState3 = toolbarUIState2;
                                        function4 = function3;
                                        groupTicketLegSelectionDataState7 = groupTicketLegSelectionDataState5;
                                        objB2 = objB;
                                        ticketSelectionContainerUIState3 = ticketSelectionContainerUIState2;
                                        buttonUIState = buttonUIStateG;
                                        loadingDialogUIState = new LoadingDialogUIState(new TextUIState.ChaloTextUIState((String) objB2, (UITextStyle) null, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8190));
                                        groupTicketLegSelectionDataState6 = groupTicketLegSelectionDataState7;
                                        function3 = function4;
                                        groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = toolbarUIState3;
                                        groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = ticketSelectionContainerUIState3;
                                        groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = buttonUIState;
                                        groupTicketSelectionUIStateFactory$buildUIState$1.L$3 = loadingDialogUIState;
                                        groupTicketSelectionUIStateFactory$buildUIState$1.L$4 = null;
                                        groupTicketSelectionUIStateFactory$buildUIState$1.label = 6;
                                        groupTicketLegSelectionBottomSheetDataStateType = groupTicketLegSelectionDataState6.c;
                                        if (Intrinsics.d(groupTicketLegSelectionBottomSheetDataStateType, GroupTicketLegSelectionBottomSheetDataStateType.None.f5928a)) {
                                            objE = GroupTicketLegSelectionBottomSheetUIStateType.None.b;
                                        } else if (groupTicketLegSelectionBottomSheetDataStateType instanceof GroupTicketLegSelectionBottomSheetDataStateType.PassengerSelectionType) {
                                            objE = i(groupTicketLegSelectionDataState6.f, ((GroupTicketLegSelectionBottomSheetDataStateType.PassengerSelectionType) groupTicketLegSelectionBottomSheetDataStateType).f5929a, function3, groupTicketSelectionUIStateFactory$buildUIState$1);
                                            if (objE != obj) {
                                                objE = (GroupTicketLegSelectionBottomSheetUIStateType) objE;
                                            }
                                        } else {
                                            if (!(groupTicketLegSelectionBottomSheetDataStateType instanceof GroupTicketLegSelectionBottomSheetDataStateType.ErrorType)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            objE = e(((GroupTicketLegSelectionBottomSheetDataStateType.ErrorType) groupTicketLegSelectionBottomSheetDataStateType).f5927a, groupTicketSelectionUIStateFactory$buildUIState$1, function3);
                                            if (objE != obj) {
                                                objE = (GroupTicketLegSelectionBottomSheetUIStateType) objE;
                                            }
                                        }
                                        if (objE != obj) {
                                            buttonUIState2 = buttonUIState;
                                            ticketSelectionContainerUIState4 = ticketSelectionContainerUIState3;
                                            toolbarUIState4 = toolbarUIState3;
                                            loadingDialogUIState2 = loadingDialogUIState;
                                            objB2 = objE;
                                            return new GroupTicketLegSelectionViewState(toolbarUIState4, ticketSelectionContainerUIState4, buttonUIState2, loadingDialogUIState2, (GroupTicketLegSelectionBottomSheetUIStateType) objB2);
                                        }
                                    }
                                } else {
                                    groupTicketLegSelectionDataState6 = groupTicketLegSelectionDataState5;
                                    ticketSelectionContainerUIState3 = ticketSelectionContainerUIState2;
                                    loadingDialogUIState = null;
                                    toolbarUIState3 = toolbarUIState2;
                                    buttonUIState = buttonUIStateG;
                                    groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = toolbarUIState3;
                                    groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = ticketSelectionContainerUIState3;
                                    groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = buttonUIState;
                                    groupTicketSelectionUIStateFactory$buildUIState$1.L$3 = loadingDialogUIState;
                                    groupTicketSelectionUIStateFactory$buildUIState$1.L$4 = null;
                                    groupTicketSelectionUIStateFactory$buildUIState$1.label = 6;
                                    groupTicketLegSelectionBottomSheetDataStateType = groupTicketLegSelectionDataState6.c;
                                    if (Intrinsics.d(groupTicketLegSelectionBottomSheetDataStateType, GroupTicketLegSelectionBottomSheetDataStateType.None.f5928a)) {
                                        objE = GroupTicketLegSelectionBottomSheetUIStateType.None.b;
                                    } else if (groupTicketLegSelectionBottomSheetDataStateType instanceof GroupTicketLegSelectionBottomSheetDataStateType.PassengerSelectionType) {
                                        objE = i(groupTicketLegSelectionDataState6.f, ((GroupTicketLegSelectionBottomSheetDataStateType.PassengerSelectionType) groupTicketLegSelectionBottomSheetDataStateType).f5929a, function3, groupTicketSelectionUIStateFactory$buildUIState$1);
                                        if (objE != obj) {
                                            objE = (GroupTicketLegSelectionBottomSheetUIStateType) objE;
                                        }
                                    } else {
                                        if (!(groupTicketLegSelectionBottomSheetDataStateType instanceof GroupTicketLegSelectionBottomSheetDataStateType.ErrorType)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        objE = e(((GroupTicketLegSelectionBottomSheetDataStateType.ErrorType) groupTicketLegSelectionBottomSheetDataStateType).f5927a, groupTicketSelectionUIStateFactory$buildUIState$1, function3);
                                        if (objE != obj) {
                                            objE = (GroupTicketLegSelectionBottomSheetUIStateType) objE;
                                        }
                                    }
                                    if (objE != obj) {
                                        buttonUIState2 = buttonUIState;
                                        ticketSelectionContainerUIState4 = ticketSelectionContainerUIState3;
                                        toolbarUIState4 = toolbarUIState3;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        objB2 = objE;
                                        return new GroupTicketLegSelectionViewState(toolbarUIState4, ticketSelectionContainerUIState4, buttonUIState2, loadingDialogUIState2, (GroupTicketLegSelectionBottomSheetUIStateType) objB2);
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 1:
                function2 = (Function1) groupTicketSelectionUIStateFactory$buildUIState$1.L$1;
                groupTicketLegSelectionDataState2 = (GroupTicketLegSelectionDataState) groupTicketSelectionUIStateFactory$buildUIState$1.L$0;
                ResultKt.b(objB2);
                toolbarUIState = new ToolbarUIState(null, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.DisplaySmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), null, UiEventHandler.Companion.a(new y60(function2, 3)), null, 0.0f, null, null, 245);
                groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = groupTicketLegSelectionDataState2;
                groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = function2;
                groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = toolbarUIState;
                groupTicketSelectionUIStateFactory$buildUIState$1.label = 2;
                objG = g(groupTicketLegSelectionDataState2, function2, groupTicketSelectionUIStateFactory$buildUIState$1);
                if (objG != obj) {
                    groupTicketLegSelectionDataState3 = groupTicketLegSelectionDataState2;
                    toolbarUIState2 = toolbarUIState;
                    objB2 = objG;
                    function3 = function2;
                    fullJourneyTicketCardUIState = (FullJourneyTicketCardUIState) objB2;
                    groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = groupTicketLegSelectionDataState3;
                    groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = function3;
                    groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = toolbarUIState2;
                    groupTicketSelectionUIStateFactory$buildUIState$1.L$3 = fullJourneyTicketCardUIState;
                    groupTicketSelectionUIStateFactory$buildUIState$1.label = 3;
                    objB2 = h(groupTicketLegSelectionDataState3, function3, groupTicketSelectionUIStateFactory$buildUIState$1);
                    if (objB2 != obj) {
                        ticketSelectionContainerUIState = new TicketSelectionContainerUIState(fullJourneyTicketCardUIState, (IndividualStepsTicketCardUIState) objB2);
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = groupTicketLegSelectionDataState3;
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = function3;
                        buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = buttonUIStateFactory;
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$3 = toolbarUIState2;
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$4 = ticketSelectionContainerUIState;
                        groupTicketSelectionUIStateFactory$buildUIState$1.label = 4;
                        objB2 = stringProvider.b(StringEnum.CONTINUE, new Object[0], groupTicketSelectionUIStateFactory$buildUIState$1);
                        if (objB2 != obj) {
                            ticketSelectionContainerUIState2 = ticketSelectionContainerUIState;
                            groupTicketLegSelectionDataState4 = groupTicketLegSelectionDataState3;
                            buttonUIStateFactory2 = buttonUIStateFactory;
                            groupTicketLegSelectionDataState5 = groupTicketLegSelectionDataState4;
                            buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB2, new y60(function3, 4), null, UIShape.e, false, 0.0f, 52);
                            if (groupTicketLegSelectionDataState5.b) {
                                groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = groupTicketLegSelectionDataState5;
                                groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = function3;
                                groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = toolbarUIState2;
                                groupTicketSelectionUIStateFactory$buildUIState$1.L$3 = ticketSelectionContainerUIState2;
                                groupTicketSelectionUIStateFactory$buildUIState$1.L$4 = buttonUIStateG;
                                groupTicketSelectionUIStateFactory$buildUIState$1.label = 5;
                                objB = stringProvider.b(StringEnum.LOADING, new Object[0], groupTicketSelectionUIStateFactory$buildUIState$1);
                                if (objB != obj) {
                                    toolbarUIState3 = toolbarUIState2;
                                    function4 = function3;
                                    groupTicketLegSelectionDataState7 = groupTicketLegSelectionDataState5;
                                    objB2 = objB;
                                    ticketSelectionContainerUIState3 = ticketSelectionContainerUIState2;
                                    buttonUIState = buttonUIStateG;
                                    loadingDialogUIState = new LoadingDialogUIState(new TextUIState.ChaloTextUIState((String) objB2, (UITextStyle) null, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8190));
                                    groupTicketLegSelectionDataState6 = groupTicketLegSelectionDataState7;
                                    function3 = function4;
                                    groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = toolbarUIState3;
                                    groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = ticketSelectionContainerUIState3;
                                    groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = buttonUIState;
                                    groupTicketSelectionUIStateFactory$buildUIState$1.L$3 = loadingDialogUIState;
                                    groupTicketSelectionUIStateFactory$buildUIState$1.L$4 = null;
                                    groupTicketSelectionUIStateFactory$buildUIState$1.label = 6;
                                    groupTicketLegSelectionBottomSheetDataStateType = groupTicketLegSelectionDataState6.c;
                                    if (Intrinsics.d(groupTicketLegSelectionBottomSheetDataStateType, GroupTicketLegSelectionBottomSheetDataStateType.None.f5928a)) {
                                        objE = GroupTicketLegSelectionBottomSheetUIStateType.None.b;
                                    } else if (groupTicketLegSelectionBottomSheetDataStateType instanceof GroupTicketLegSelectionBottomSheetDataStateType.PassengerSelectionType) {
                                        objE = i(groupTicketLegSelectionDataState6.f, ((GroupTicketLegSelectionBottomSheetDataStateType.PassengerSelectionType) groupTicketLegSelectionBottomSheetDataStateType).f5929a, function3, groupTicketSelectionUIStateFactory$buildUIState$1);
                                        if (objE != obj) {
                                            objE = (GroupTicketLegSelectionBottomSheetUIStateType) objE;
                                        }
                                    } else {
                                        if (!(groupTicketLegSelectionBottomSheetDataStateType instanceof GroupTicketLegSelectionBottomSheetDataStateType.ErrorType)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        objE = e(((GroupTicketLegSelectionBottomSheetDataStateType.ErrorType) groupTicketLegSelectionBottomSheetDataStateType).f5927a, groupTicketSelectionUIStateFactory$buildUIState$1, function3);
                                        if (objE != obj) {
                                            objE = (GroupTicketLegSelectionBottomSheetUIStateType) objE;
                                        }
                                    }
                                    if (objE != obj) {
                                        buttonUIState2 = buttonUIState;
                                        ticketSelectionContainerUIState4 = ticketSelectionContainerUIState3;
                                        toolbarUIState4 = toolbarUIState3;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        objB2 = objE;
                                        return new GroupTicketLegSelectionViewState(toolbarUIState4, ticketSelectionContainerUIState4, buttonUIState2, loadingDialogUIState2, (GroupTicketLegSelectionBottomSheetUIStateType) objB2);
                                    }
                                }
                            } else {
                                groupTicketLegSelectionDataState6 = groupTicketLegSelectionDataState5;
                                ticketSelectionContainerUIState3 = ticketSelectionContainerUIState2;
                                loadingDialogUIState = null;
                                toolbarUIState3 = toolbarUIState2;
                                buttonUIState = buttonUIStateG;
                                groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = toolbarUIState3;
                                groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = ticketSelectionContainerUIState3;
                                groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = buttonUIState;
                                groupTicketSelectionUIStateFactory$buildUIState$1.L$3 = loadingDialogUIState;
                                groupTicketSelectionUIStateFactory$buildUIState$1.L$4 = null;
                                groupTicketSelectionUIStateFactory$buildUIState$1.label = 6;
                                groupTicketLegSelectionBottomSheetDataStateType = groupTicketLegSelectionDataState6.c;
                                if (Intrinsics.d(groupTicketLegSelectionBottomSheetDataStateType, GroupTicketLegSelectionBottomSheetDataStateType.None.f5928a)) {
                                    objE = GroupTicketLegSelectionBottomSheetUIStateType.None.b;
                                } else if (groupTicketLegSelectionBottomSheetDataStateType instanceof GroupTicketLegSelectionBottomSheetDataStateType.PassengerSelectionType) {
                                    objE = i(groupTicketLegSelectionDataState6.f, ((GroupTicketLegSelectionBottomSheetDataStateType.PassengerSelectionType) groupTicketLegSelectionBottomSheetDataStateType).f5929a, function3, groupTicketSelectionUIStateFactory$buildUIState$1);
                                    if (objE != obj) {
                                        objE = (GroupTicketLegSelectionBottomSheetUIStateType) objE;
                                    }
                                } else {
                                    if (!(groupTicketLegSelectionBottomSheetDataStateType instanceof GroupTicketLegSelectionBottomSheetDataStateType.ErrorType)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    objE = e(((GroupTicketLegSelectionBottomSheetDataStateType.ErrorType) groupTicketLegSelectionBottomSheetDataStateType).f5927a, groupTicketSelectionUIStateFactory$buildUIState$1, function3);
                                    if (objE != obj) {
                                        objE = (GroupTicketLegSelectionBottomSheetUIStateType) objE;
                                    }
                                }
                                if (objE != obj) {
                                    buttonUIState2 = buttonUIState;
                                    ticketSelectionContainerUIState4 = ticketSelectionContainerUIState3;
                                    toolbarUIState4 = toolbarUIState3;
                                    loadingDialogUIState2 = loadingDialogUIState;
                                    objB2 = objE;
                                    return new GroupTicketLegSelectionViewState(toolbarUIState4, ticketSelectionContainerUIState4, buttonUIState2, loadingDialogUIState2, (GroupTicketLegSelectionBottomSheetUIStateType) objB2);
                                }
                            }
                        }
                    }
                }
                return obj;
            case 2:
                ToolbarUIState toolbarUIState5 = (ToolbarUIState) groupTicketSelectionUIStateFactory$buildUIState$1.L$2;
                Function1 function5 = (Function1) groupTicketSelectionUIStateFactory$buildUIState$1.L$1;
                GroupTicketLegSelectionDataState groupTicketLegSelectionDataState8 = (GroupTicketLegSelectionDataState) groupTicketSelectionUIStateFactory$buildUIState$1.L$0;
                ResultKt.b(objB2);
                groupTicketLegSelectionDataState3 = groupTicketLegSelectionDataState8;
                function3 = function5;
                toolbarUIState2 = toolbarUIState5;
                fullJourneyTicketCardUIState = (FullJourneyTicketCardUIState) objB2;
                groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = groupTicketLegSelectionDataState3;
                groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = function3;
                groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = toolbarUIState2;
                groupTicketSelectionUIStateFactory$buildUIState$1.L$3 = fullJourneyTicketCardUIState;
                groupTicketSelectionUIStateFactory$buildUIState$1.label = 3;
                objB2 = h(groupTicketLegSelectionDataState3, function3, groupTicketSelectionUIStateFactory$buildUIState$1);
                if (objB2 != obj) {
                    ticketSelectionContainerUIState = new TicketSelectionContainerUIState(fullJourneyTicketCardUIState, (IndividualStepsTicketCardUIState) objB2);
                    groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = groupTicketLegSelectionDataState3;
                    groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = function3;
                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                    groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = buttonUIStateFactory;
                    groupTicketSelectionUIStateFactory$buildUIState$1.L$3 = toolbarUIState2;
                    groupTicketSelectionUIStateFactory$buildUIState$1.L$4 = ticketSelectionContainerUIState;
                    groupTicketSelectionUIStateFactory$buildUIState$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.CONTINUE, new Object[0], groupTicketSelectionUIStateFactory$buildUIState$1);
                    if (objB2 != obj) {
                        ticketSelectionContainerUIState2 = ticketSelectionContainerUIState;
                        groupTicketLegSelectionDataState4 = groupTicketLegSelectionDataState3;
                        buttonUIStateFactory2 = buttonUIStateFactory;
                        groupTicketLegSelectionDataState5 = groupTicketLegSelectionDataState4;
                        buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB2, new y60(function3, 4), null, UIShape.e, false, 0.0f, 52);
                        if (groupTicketLegSelectionDataState5.b) {
                            groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = groupTicketLegSelectionDataState5;
                            groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = function3;
                            groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = toolbarUIState2;
                            groupTicketSelectionUIStateFactory$buildUIState$1.L$3 = ticketSelectionContainerUIState2;
                            groupTicketSelectionUIStateFactory$buildUIState$1.L$4 = buttonUIStateG;
                            groupTicketSelectionUIStateFactory$buildUIState$1.label = 5;
                            objB = stringProvider.b(StringEnum.LOADING, new Object[0], groupTicketSelectionUIStateFactory$buildUIState$1);
                            if (objB != obj) {
                                toolbarUIState3 = toolbarUIState2;
                                function4 = function3;
                                groupTicketLegSelectionDataState7 = groupTicketLegSelectionDataState5;
                                objB2 = objB;
                                ticketSelectionContainerUIState3 = ticketSelectionContainerUIState2;
                                buttonUIState = buttonUIStateG;
                                loadingDialogUIState = new LoadingDialogUIState(new TextUIState.ChaloTextUIState((String) objB2, (UITextStyle) null, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8190));
                                groupTicketLegSelectionDataState6 = groupTicketLegSelectionDataState7;
                                function3 = function4;
                                groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = toolbarUIState3;
                                groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = ticketSelectionContainerUIState3;
                                groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = buttonUIState;
                                groupTicketSelectionUIStateFactory$buildUIState$1.L$3 = loadingDialogUIState;
                                groupTicketSelectionUIStateFactory$buildUIState$1.L$4 = null;
                                groupTicketSelectionUIStateFactory$buildUIState$1.label = 6;
                                groupTicketLegSelectionBottomSheetDataStateType = groupTicketLegSelectionDataState6.c;
                                if (Intrinsics.d(groupTicketLegSelectionBottomSheetDataStateType, GroupTicketLegSelectionBottomSheetDataStateType.None.f5928a)) {
                                    objE = GroupTicketLegSelectionBottomSheetUIStateType.None.b;
                                } else if (groupTicketLegSelectionBottomSheetDataStateType instanceof GroupTicketLegSelectionBottomSheetDataStateType.PassengerSelectionType) {
                                    objE = i(groupTicketLegSelectionDataState6.f, ((GroupTicketLegSelectionBottomSheetDataStateType.PassengerSelectionType) groupTicketLegSelectionBottomSheetDataStateType).f5929a, function3, groupTicketSelectionUIStateFactory$buildUIState$1);
                                    if (objE != obj) {
                                        objE = (GroupTicketLegSelectionBottomSheetUIStateType) objE;
                                    }
                                } else {
                                    if (!(groupTicketLegSelectionBottomSheetDataStateType instanceof GroupTicketLegSelectionBottomSheetDataStateType.ErrorType)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    objE = e(((GroupTicketLegSelectionBottomSheetDataStateType.ErrorType) groupTicketLegSelectionBottomSheetDataStateType).f5927a, groupTicketSelectionUIStateFactory$buildUIState$1, function3);
                                    if (objE != obj) {
                                        objE = (GroupTicketLegSelectionBottomSheetUIStateType) objE;
                                    }
                                }
                                if (objE != obj) {
                                    buttonUIState2 = buttonUIState;
                                    ticketSelectionContainerUIState4 = ticketSelectionContainerUIState3;
                                    toolbarUIState4 = toolbarUIState3;
                                    loadingDialogUIState2 = loadingDialogUIState;
                                    objB2 = objE;
                                    return new GroupTicketLegSelectionViewState(toolbarUIState4, ticketSelectionContainerUIState4, buttonUIState2, loadingDialogUIState2, (GroupTicketLegSelectionBottomSheetUIStateType) objB2);
                                }
                            }
                        } else {
                            groupTicketLegSelectionDataState6 = groupTicketLegSelectionDataState5;
                            ticketSelectionContainerUIState3 = ticketSelectionContainerUIState2;
                            loadingDialogUIState = null;
                            toolbarUIState3 = toolbarUIState2;
                            buttonUIState = buttonUIStateG;
                            groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = toolbarUIState3;
                            groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = ticketSelectionContainerUIState3;
                            groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = buttonUIState;
                            groupTicketSelectionUIStateFactory$buildUIState$1.L$3 = loadingDialogUIState;
                            groupTicketSelectionUIStateFactory$buildUIState$1.L$4 = null;
                            groupTicketSelectionUIStateFactory$buildUIState$1.label = 6;
                            groupTicketLegSelectionBottomSheetDataStateType = groupTicketLegSelectionDataState6.c;
                            if (Intrinsics.d(groupTicketLegSelectionBottomSheetDataStateType, GroupTicketLegSelectionBottomSheetDataStateType.None.f5928a)) {
                                objE = GroupTicketLegSelectionBottomSheetUIStateType.None.b;
                            } else if (groupTicketLegSelectionBottomSheetDataStateType instanceof GroupTicketLegSelectionBottomSheetDataStateType.PassengerSelectionType) {
                                objE = i(groupTicketLegSelectionDataState6.f, ((GroupTicketLegSelectionBottomSheetDataStateType.PassengerSelectionType) groupTicketLegSelectionBottomSheetDataStateType).f5929a, function3, groupTicketSelectionUIStateFactory$buildUIState$1);
                                if (objE != obj) {
                                    objE = (GroupTicketLegSelectionBottomSheetUIStateType) objE;
                                }
                            } else {
                                if (!(groupTicketLegSelectionBottomSheetDataStateType instanceof GroupTicketLegSelectionBottomSheetDataStateType.ErrorType)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                objE = e(((GroupTicketLegSelectionBottomSheetDataStateType.ErrorType) groupTicketLegSelectionBottomSheetDataStateType).f5927a, groupTicketSelectionUIStateFactory$buildUIState$1, function3);
                                if (objE != obj) {
                                    objE = (GroupTicketLegSelectionBottomSheetUIStateType) objE;
                                }
                            }
                            if (objE != obj) {
                                buttonUIState2 = buttonUIState;
                                ticketSelectionContainerUIState4 = ticketSelectionContainerUIState3;
                                toolbarUIState4 = toolbarUIState3;
                                loadingDialogUIState2 = loadingDialogUIState;
                                objB2 = objE;
                                return new GroupTicketLegSelectionViewState(toolbarUIState4, ticketSelectionContainerUIState4, buttonUIState2, loadingDialogUIState2, (GroupTicketLegSelectionBottomSheetUIStateType) objB2);
                            }
                        }
                    }
                }
                return obj;
            case 3:
                fullJourneyTicketCardUIState = (FullJourneyTicketCardUIState) groupTicketSelectionUIStateFactory$buildUIState$1.L$3;
                toolbarUIState2 = (ToolbarUIState) groupTicketSelectionUIStateFactory$buildUIState$1.L$2;
                function3 = (Function1) groupTicketSelectionUIStateFactory$buildUIState$1.L$1;
                groupTicketLegSelectionDataState3 = (GroupTicketLegSelectionDataState) groupTicketSelectionUIStateFactory$buildUIState$1.L$0;
                ResultKt.b(objB2);
                ticketSelectionContainerUIState = new TicketSelectionContainerUIState(fullJourneyTicketCardUIState, (IndividualStepsTicketCardUIState) objB2);
                groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = groupTicketLegSelectionDataState3;
                groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = function3;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = buttonUIStateFactory;
                groupTicketSelectionUIStateFactory$buildUIState$1.L$3 = toolbarUIState2;
                groupTicketSelectionUIStateFactory$buildUIState$1.L$4 = ticketSelectionContainerUIState;
                groupTicketSelectionUIStateFactory$buildUIState$1.label = 4;
                objB2 = stringProvider.b(StringEnum.CONTINUE, new Object[0], groupTicketSelectionUIStateFactory$buildUIState$1);
                if (objB2 != obj) {
                    ticketSelectionContainerUIState2 = ticketSelectionContainerUIState;
                    groupTicketLegSelectionDataState4 = groupTicketLegSelectionDataState3;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    groupTicketLegSelectionDataState5 = groupTicketLegSelectionDataState4;
                    buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB2, new y60(function3, 4), null, UIShape.e, false, 0.0f, 52);
                    if (groupTicketLegSelectionDataState5.b) {
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = groupTicketLegSelectionDataState5;
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = function3;
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = toolbarUIState2;
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$3 = ticketSelectionContainerUIState2;
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$4 = buttonUIStateG;
                        groupTicketSelectionUIStateFactory$buildUIState$1.label = 5;
                        objB = stringProvider.b(StringEnum.LOADING, new Object[0], groupTicketSelectionUIStateFactory$buildUIState$1);
                        if (objB != obj) {
                            toolbarUIState3 = toolbarUIState2;
                            function4 = function3;
                            groupTicketLegSelectionDataState7 = groupTicketLegSelectionDataState5;
                            objB2 = objB;
                            ticketSelectionContainerUIState3 = ticketSelectionContainerUIState2;
                            buttonUIState = buttonUIStateG;
                            loadingDialogUIState = new LoadingDialogUIState(new TextUIState.ChaloTextUIState((String) objB2, (UITextStyle) null, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8190));
                            groupTicketLegSelectionDataState6 = groupTicketLegSelectionDataState7;
                            function3 = function4;
                            groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = toolbarUIState3;
                            groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = ticketSelectionContainerUIState3;
                            groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = buttonUIState;
                            groupTicketSelectionUIStateFactory$buildUIState$1.L$3 = loadingDialogUIState;
                            groupTicketSelectionUIStateFactory$buildUIState$1.L$4 = null;
                            groupTicketSelectionUIStateFactory$buildUIState$1.label = 6;
                            groupTicketLegSelectionBottomSheetDataStateType = groupTicketLegSelectionDataState6.c;
                            if (Intrinsics.d(groupTicketLegSelectionBottomSheetDataStateType, GroupTicketLegSelectionBottomSheetDataStateType.None.f5928a)) {
                                objE = GroupTicketLegSelectionBottomSheetUIStateType.None.b;
                            } else if (groupTicketLegSelectionBottomSheetDataStateType instanceof GroupTicketLegSelectionBottomSheetDataStateType.PassengerSelectionType) {
                                objE = i(groupTicketLegSelectionDataState6.f, ((GroupTicketLegSelectionBottomSheetDataStateType.PassengerSelectionType) groupTicketLegSelectionBottomSheetDataStateType).f5929a, function3, groupTicketSelectionUIStateFactory$buildUIState$1);
                                if (objE != obj) {
                                    objE = (GroupTicketLegSelectionBottomSheetUIStateType) objE;
                                }
                            } else {
                                if (!(groupTicketLegSelectionBottomSheetDataStateType instanceof GroupTicketLegSelectionBottomSheetDataStateType.ErrorType)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                objE = e(((GroupTicketLegSelectionBottomSheetDataStateType.ErrorType) groupTicketLegSelectionBottomSheetDataStateType).f5927a, groupTicketSelectionUIStateFactory$buildUIState$1, function3);
                                if (objE != obj) {
                                    objE = (GroupTicketLegSelectionBottomSheetUIStateType) objE;
                                }
                            }
                            if (objE != obj) {
                                buttonUIState2 = buttonUIState;
                                ticketSelectionContainerUIState4 = ticketSelectionContainerUIState3;
                                toolbarUIState4 = toolbarUIState3;
                                loadingDialogUIState2 = loadingDialogUIState;
                                objB2 = objE;
                                return new GroupTicketLegSelectionViewState(toolbarUIState4, ticketSelectionContainerUIState4, buttonUIState2, loadingDialogUIState2, (GroupTicketLegSelectionBottomSheetUIStateType) objB2);
                            }
                        }
                    } else {
                        groupTicketLegSelectionDataState6 = groupTicketLegSelectionDataState5;
                        ticketSelectionContainerUIState3 = ticketSelectionContainerUIState2;
                        loadingDialogUIState = null;
                        toolbarUIState3 = toolbarUIState2;
                        buttonUIState = buttonUIStateG;
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = toolbarUIState3;
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = ticketSelectionContainerUIState3;
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = buttonUIState;
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$3 = loadingDialogUIState;
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$4 = null;
                        groupTicketSelectionUIStateFactory$buildUIState$1.label = 6;
                        groupTicketLegSelectionBottomSheetDataStateType = groupTicketLegSelectionDataState6.c;
                        if (Intrinsics.d(groupTicketLegSelectionBottomSheetDataStateType, GroupTicketLegSelectionBottomSheetDataStateType.None.f5928a)) {
                            objE = GroupTicketLegSelectionBottomSheetUIStateType.None.b;
                        } else if (groupTicketLegSelectionBottomSheetDataStateType instanceof GroupTicketLegSelectionBottomSheetDataStateType.PassengerSelectionType) {
                            objE = i(groupTicketLegSelectionDataState6.f, ((GroupTicketLegSelectionBottomSheetDataStateType.PassengerSelectionType) groupTicketLegSelectionBottomSheetDataStateType).f5929a, function3, groupTicketSelectionUIStateFactory$buildUIState$1);
                            if (objE != obj) {
                                objE = (GroupTicketLegSelectionBottomSheetUIStateType) objE;
                            }
                        } else {
                            if (!(groupTicketLegSelectionBottomSheetDataStateType instanceof GroupTicketLegSelectionBottomSheetDataStateType.ErrorType)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            objE = e(((GroupTicketLegSelectionBottomSheetDataStateType.ErrorType) groupTicketLegSelectionBottomSheetDataStateType).f5927a, groupTicketSelectionUIStateFactory$buildUIState$1, function3);
                            if (objE != obj) {
                                objE = (GroupTicketLegSelectionBottomSheetUIStateType) objE;
                            }
                        }
                        if (objE != obj) {
                            buttonUIState2 = buttonUIState;
                            ticketSelectionContainerUIState4 = ticketSelectionContainerUIState3;
                            toolbarUIState4 = toolbarUIState3;
                            loadingDialogUIState2 = loadingDialogUIState;
                            objB2 = objE;
                            return new GroupTicketLegSelectionViewState(toolbarUIState4, ticketSelectionContainerUIState4, buttonUIState2, loadingDialogUIState2, (GroupTicketLegSelectionBottomSheetUIStateType) objB2);
                        }
                    }
                }
                return obj;
            case 4:
                ticketSelectionContainerUIState2 = (TicketSelectionContainerUIState) groupTicketSelectionUIStateFactory$buildUIState$1.L$4;
                toolbarUIState2 = (ToolbarUIState) groupTicketSelectionUIStateFactory$buildUIState$1.L$3;
                ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) groupTicketSelectionUIStateFactory$buildUIState$1.L$2;
                Function1 function6 = (Function1) groupTicketSelectionUIStateFactory$buildUIState$1.L$1;
                groupTicketLegSelectionDataState4 = (GroupTicketLegSelectionDataState) groupTicketSelectionUIStateFactory$buildUIState$1.L$0;
                ResultKt.b(objB2);
                buttonUIStateFactory2 = buttonUIStateFactory3;
                function3 = function6;
                groupTicketLegSelectionDataState5 = groupTicketLegSelectionDataState4;
                buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB2, new y60(function3, 4), null, UIShape.e, false, 0.0f, 52);
                if (groupTicketLegSelectionDataState5.b) {
                    groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = groupTicketLegSelectionDataState5;
                    groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = function3;
                    groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = toolbarUIState2;
                    groupTicketSelectionUIStateFactory$buildUIState$1.L$3 = ticketSelectionContainerUIState2;
                    groupTicketSelectionUIStateFactory$buildUIState$1.L$4 = buttonUIStateG;
                    groupTicketSelectionUIStateFactory$buildUIState$1.label = 5;
                    objB = stringProvider.b(StringEnum.LOADING, new Object[0], groupTicketSelectionUIStateFactory$buildUIState$1);
                    if (objB != obj) {
                        toolbarUIState3 = toolbarUIState2;
                        function4 = function3;
                        groupTicketLegSelectionDataState7 = groupTicketLegSelectionDataState5;
                        objB2 = objB;
                        ticketSelectionContainerUIState3 = ticketSelectionContainerUIState2;
                        buttonUIState = buttonUIStateG;
                        loadingDialogUIState = new LoadingDialogUIState(new TextUIState.ChaloTextUIState((String) objB2, (UITextStyle) null, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8190));
                        groupTicketLegSelectionDataState6 = groupTicketLegSelectionDataState7;
                        function3 = function4;
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = toolbarUIState3;
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = ticketSelectionContainerUIState3;
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = buttonUIState;
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$3 = loadingDialogUIState;
                        groupTicketSelectionUIStateFactory$buildUIState$1.L$4 = null;
                        groupTicketSelectionUIStateFactory$buildUIState$1.label = 6;
                        groupTicketLegSelectionBottomSheetDataStateType = groupTicketLegSelectionDataState6.c;
                        if (Intrinsics.d(groupTicketLegSelectionBottomSheetDataStateType, GroupTicketLegSelectionBottomSheetDataStateType.None.f5928a)) {
                            objE = GroupTicketLegSelectionBottomSheetUIStateType.None.b;
                        } else if (groupTicketLegSelectionBottomSheetDataStateType instanceof GroupTicketLegSelectionBottomSheetDataStateType.PassengerSelectionType) {
                            objE = i(groupTicketLegSelectionDataState6.f, ((GroupTicketLegSelectionBottomSheetDataStateType.PassengerSelectionType) groupTicketLegSelectionBottomSheetDataStateType).f5929a, function3, groupTicketSelectionUIStateFactory$buildUIState$1);
                            if (objE != obj) {
                                objE = (GroupTicketLegSelectionBottomSheetUIStateType) objE;
                            }
                        } else {
                            if (!(groupTicketLegSelectionBottomSheetDataStateType instanceof GroupTicketLegSelectionBottomSheetDataStateType.ErrorType)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            objE = e(((GroupTicketLegSelectionBottomSheetDataStateType.ErrorType) groupTicketLegSelectionBottomSheetDataStateType).f5927a, groupTicketSelectionUIStateFactory$buildUIState$1, function3);
                            if (objE != obj) {
                                objE = (GroupTicketLegSelectionBottomSheetUIStateType) objE;
                            }
                        }
                        if (objE != obj) {
                            buttonUIState2 = buttonUIState;
                            ticketSelectionContainerUIState4 = ticketSelectionContainerUIState3;
                            toolbarUIState4 = toolbarUIState3;
                            loadingDialogUIState2 = loadingDialogUIState;
                            objB2 = objE;
                            return new GroupTicketLegSelectionViewState(toolbarUIState4, ticketSelectionContainerUIState4, buttonUIState2, loadingDialogUIState2, (GroupTicketLegSelectionBottomSheetUIStateType) objB2);
                        }
                    }
                } else {
                    groupTicketLegSelectionDataState6 = groupTicketLegSelectionDataState5;
                    ticketSelectionContainerUIState3 = ticketSelectionContainerUIState2;
                    loadingDialogUIState = null;
                    toolbarUIState3 = toolbarUIState2;
                    buttonUIState = buttonUIStateG;
                    groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = toolbarUIState3;
                    groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = ticketSelectionContainerUIState3;
                    groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = buttonUIState;
                    groupTicketSelectionUIStateFactory$buildUIState$1.L$3 = loadingDialogUIState;
                    groupTicketSelectionUIStateFactory$buildUIState$1.L$4 = null;
                    groupTicketSelectionUIStateFactory$buildUIState$1.label = 6;
                    groupTicketLegSelectionBottomSheetDataStateType = groupTicketLegSelectionDataState6.c;
                    if (Intrinsics.d(groupTicketLegSelectionBottomSheetDataStateType, GroupTicketLegSelectionBottomSheetDataStateType.None.f5928a)) {
                        objE = GroupTicketLegSelectionBottomSheetUIStateType.None.b;
                    } else if (groupTicketLegSelectionBottomSheetDataStateType instanceof GroupTicketLegSelectionBottomSheetDataStateType.PassengerSelectionType) {
                        objE = i(groupTicketLegSelectionDataState6.f, ((GroupTicketLegSelectionBottomSheetDataStateType.PassengerSelectionType) groupTicketLegSelectionBottomSheetDataStateType).f5929a, function3, groupTicketSelectionUIStateFactory$buildUIState$1);
                        if (objE != obj) {
                            objE = (GroupTicketLegSelectionBottomSheetUIStateType) objE;
                        }
                    } else {
                        if (!(groupTicketLegSelectionBottomSheetDataStateType instanceof GroupTicketLegSelectionBottomSheetDataStateType.ErrorType)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objE = e(((GroupTicketLegSelectionBottomSheetDataStateType.ErrorType) groupTicketLegSelectionBottomSheetDataStateType).f5927a, groupTicketSelectionUIStateFactory$buildUIState$1, function3);
                        if (objE != obj) {
                            objE = (GroupTicketLegSelectionBottomSheetUIStateType) objE;
                        }
                    }
                    if (objE != obj) {
                        buttonUIState2 = buttonUIState;
                        ticketSelectionContainerUIState4 = ticketSelectionContainerUIState3;
                        toolbarUIState4 = toolbarUIState3;
                        loadingDialogUIState2 = loadingDialogUIState;
                        objB2 = objE;
                        return new GroupTicketLegSelectionViewState(toolbarUIState4, ticketSelectionContainerUIState4, buttonUIState2, loadingDialogUIState2, (GroupTicketLegSelectionBottomSheetUIStateType) objB2);
                    }
                }
                return obj;
            case 5:
                buttonUIState = (ButtonUIState) groupTicketSelectionUIStateFactory$buildUIState$1.L$4;
                ticketSelectionContainerUIState3 = (TicketSelectionContainerUIState) groupTicketSelectionUIStateFactory$buildUIState$1.L$3;
                toolbarUIState3 = (ToolbarUIState) groupTicketSelectionUIStateFactory$buildUIState$1.L$2;
                function4 = (Function1) groupTicketSelectionUIStateFactory$buildUIState$1.L$1;
                groupTicketLegSelectionDataState7 = (GroupTicketLegSelectionDataState) groupTicketSelectionUIStateFactory$buildUIState$1.L$0;
                ResultKt.b(objB2);
                loadingDialogUIState = new LoadingDialogUIState(new TextUIState.ChaloTextUIState((String) objB2, (UITextStyle) null, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8190));
                groupTicketLegSelectionDataState6 = groupTicketLegSelectionDataState7;
                function3 = function4;
                groupTicketSelectionUIStateFactory$buildUIState$1.L$0 = toolbarUIState3;
                groupTicketSelectionUIStateFactory$buildUIState$1.L$1 = ticketSelectionContainerUIState3;
                groupTicketSelectionUIStateFactory$buildUIState$1.L$2 = buttonUIState;
                groupTicketSelectionUIStateFactory$buildUIState$1.L$3 = loadingDialogUIState;
                groupTicketSelectionUIStateFactory$buildUIState$1.L$4 = null;
                groupTicketSelectionUIStateFactory$buildUIState$1.label = 6;
                groupTicketLegSelectionBottomSheetDataStateType = groupTicketLegSelectionDataState6.c;
                if (Intrinsics.d(groupTicketLegSelectionBottomSheetDataStateType, GroupTicketLegSelectionBottomSheetDataStateType.None.f5928a)) {
                    objE = GroupTicketLegSelectionBottomSheetUIStateType.None.b;
                } else if (groupTicketLegSelectionBottomSheetDataStateType instanceof GroupTicketLegSelectionBottomSheetDataStateType.PassengerSelectionType) {
                    objE = i(groupTicketLegSelectionDataState6.f, ((GroupTicketLegSelectionBottomSheetDataStateType.PassengerSelectionType) groupTicketLegSelectionBottomSheetDataStateType).f5929a, function3, groupTicketSelectionUIStateFactory$buildUIState$1);
                    if (objE != obj) {
                        objE = (GroupTicketLegSelectionBottomSheetUIStateType) objE;
                    }
                } else {
                    if (!(groupTicketLegSelectionBottomSheetDataStateType instanceof GroupTicketLegSelectionBottomSheetDataStateType.ErrorType)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objE = e(((GroupTicketLegSelectionBottomSheetDataStateType.ErrorType) groupTicketLegSelectionBottomSheetDataStateType).f5927a, groupTicketSelectionUIStateFactory$buildUIState$1, function3);
                    if (objE != obj) {
                        objE = (GroupTicketLegSelectionBottomSheetUIStateType) objE;
                    }
                }
                if (objE != obj) {
                    buttonUIState2 = buttonUIState;
                    ticketSelectionContainerUIState4 = ticketSelectionContainerUIState3;
                    toolbarUIState4 = toolbarUIState3;
                    loadingDialogUIState2 = loadingDialogUIState;
                    objB2 = objE;
                    return new GroupTicketLegSelectionViewState(toolbarUIState4, ticketSelectionContainerUIState4, buttonUIState2, loadingDialogUIState2, (GroupTicketLegSelectionBottomSheetUIStateType) objB2);
                }
                return obj;
            case 6:
                LoadingDialogUIState loadingDialogUIState3 = (LoadingDialogUIState) groupTicketSelectionUIStateFactory$buildUIState$1.L$3;
                ButtonUIState buttonUIState3 = (ButtonUIState) groupTicketSelectionUIStateFactory$buildUIState$1.L$2;
                TicketSelectionContainerUIState ticketSelectionContainerUIState5 = (TicketSelectionContainerUIState) groupTicketSelectionUIStateFactory$buildUIState$1.L$1;
                ToolbarUIState toolbarUIState6 = (ToolbarUIState) groupTicketSelectionUIStateFactory$buildUIState$1.L$0;
                ResultKt.b(objB2);
                buttonUIState2 = buttonUIState3;
                ticketSelectionContainerUIState4 = ticketSelectionContainerUIState5;
                loadingDialogUIState2 = loadingDialogUIState3;
                toolbarUIState4 = toolbarUIState6;
                return new GroupTicketLegSelectionViewState(toolbarUIState4, ticketSelectionContainerUIState4, buttonUIState2, loadingDialogUIState2, (GroupTicketLegSelectionBottomSheetUIStateType) objB2);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object b(ChaloTransitMode chaloTransitMode, Continuation continuation) {
        int i = WhenMappings.f5950a[chaloTransitMode.ordinal()];
        StringProvider stringProvider = this.f5949a;
        switch (i) {
            case 1:
                return stringProvider.b(StringEnum.BUS_LOWERCASE, new Object[0], continuation);
            case 2:
                return stringProvider.b(StringEnum.METRO_LOWERCASE, new Object[0], continuation);
            case 3:
                return stringProvider.b(StringEnum.TRAIN_LOWERCASE, new Object[0], continuation);
            case 4:
                return stringProvider.b(StringEnum.MONORAIL_LOWERCASE, new Object[0], continuation);
            case 5:
                return stringProvider.b(StringEnum.FERRY_LOWERCASE, new Object[0], continuation);
            case 6:
                return stringProvider.b(StringEnum.CAB_LOWERCASE, new Object[0], continuation);
            case 7:
                return stringProvider.b(StringEnum.TRANSIT_LOWERCASE, new Object[0], continuation);
            case 8:
                return "";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x013f  */
    /* JADX WARN: Code duplicated, block: B:51:0x015e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x015e -> B:52:0x015f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(java.util.List r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.multimodalticket.ui.GroupTicketSelectionUIStateFactory.c(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0191  */
    /* JADX WARN: Code duplicated, block: B:44:0x0217  */
    /* JADX WARN: Code duplicated, block: B:48:0x0277  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(String str, ContinuationImpl continuationImpl, Function1 function1) {
        GroupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1 groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1;
        Function1 function2;
        String str2;
        String str3;
        BottomSheetUiState bottomSheetUiStateD;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs;
        ImageUIState imageUIState;
        DrawType.Icon icon;
        Object objB;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs2;
        ImageUIState imageUIState2;
        Function1 function3;
        BottomSheetUiState bottomSheetUiState;
        ImageUIState imageUIState3;
        DrawType.Icon icon2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs3;
        Function1 function4;
        BottomSheetUiState bottomSheetUiState2;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        ButtonUIStateFactory buttonUIStateFactory;
        StringProvider stringProvider;
        Object objB2;
        CoroutineSingletons coroutineSingletons;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs4;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        Function1 function5;
        DrawType.Icon icon3;
        ImageUIState imageUIState4;
        BottomSheetUiState bottomSheetUiState3;
        ButtonUIStateFactory buttonUIStateFactory2;
        ButtonUIState buttonUIStateF;
        Object objB3;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        ImageUIState imageUIState5;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        ButtonUIStateFactory buttonUIStateFactory3;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs5;
        ButtonUIState buttonUIState;
        Function1 function6;
        if (continuationImpl instanceof GroupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1) {
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1 = (GroupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1) continuationImpl;
            int i = groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1 = new GroupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1(this, continuationImpl);
            }
        } else {
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1 = new GroupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1(this, continuationImpl);
        }
        Object objB4 = groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.label;
        ButtonUIStateFactory buttonUIStateFactory4 = ButtonUIStateFactory.f9921a;
        ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
        StringProvider stringProvider2 = this.f5949a;
        if (i2 == 0) {
            ResultKt.b(objB4);
            if (str != null) {
                str2 = !StringsKt.F(str) ? str : null;
                if (str2 != null) {
                    function2 = function1;
                    str3 = str2;
                    bottomSheetUiStateD = d(function2);
                    float f = ChaloThemeHelper.a().h;
                    bottomSheetContentUiSpecs = new BottomSheetContentUiSpecs(new ChaloPadding(f, f, f, f), null, ChaloThemeHelper.a().q, ChaloThemeHelper.a().g, ChaloThemeHelper.a().q, 158);
                    imageUIState = new ImageUIState(IconType.CLOSE_NEARBY, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new d30(function2, 28)), WebSocketProtocol.PAYLOAD_SHORT);
                    icon = new DrawType.Icon(new ImageUIState(IconType.IC_ALERT_TRIANGLE_WITH_REFLECTION, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().r), Dp.m7276boximpl(ChaloThemeHelper.a().o0)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246));
                    groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$0 = function2;
                    groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$1 = str3;
                    groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$2 = bottomSheetContentUiSpecs;
                    groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$3 = imageUIState;
                    groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$4 = icon;
                    groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$5 = bottomSheetUiStateD;
                    groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.label = 2;
                    objB = stringProvider2.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1);
                    if (objB != coroutineSingletons2) {
                        bottomSheetContentUiSpecs2 = bottomSheetContentUiSpecs;
                        imageUIState2 = imageUIState;
                        function3 = function2;
                        bottomSheetUiState = bottomSheetUiStateD;
                        objB4 = objB;
                        String str4 = str3;
                        imageUIState3 = imageUIState2;
                        UITextStyle uITextStyle = UITextStyle.DisplaySmall;
                        UIFontWeight uIFontWeight = UIFontWeight.Bold;
                        UITextAlign uITextAlign = UITextAlign.Center;
                        icon2 = icon;
                        bottomSheetContentUiSpecs3 = bottomSheetContentUiSpecs2;
                        function4 = function3;
                        bottomSheetUiState2 = bottomSheetUiState;
                        chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB4, uITextStyle, almostBlackColor, 0, uITextAlign, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8088);
                        chaloTextUIState2 = new TextUIState.ChaloTextUIState(str4, UITextStyle.BodyMedium, ChaloColorToken.ShadyGray.f9851a, 0, uITextAlign, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
                        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$0 = function4;
                        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$1 = bottomSheetContentUiSpecs3;
                        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$2 = imageUIState3;
                        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$3 = icon2;
                        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$4 = chaloTextUIState;
                        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$5 = chaloTextUIState2;
                        buttonUIStateFactory = buttonUIStateFactory4;
                        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$6 = buttonUIStateFactory;
                        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$7 = bottomSheetUiState2;
                        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.label = 3;
                        stringProvider = stringProvider2;
                        objB2 = stringProvider.b(StringEnum.TRY_AGAIN, new Object[0], groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1);
                        coroutineSingletons = coroutineSingletons2;
                        if (objB2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        bottomSheetContentUiSpecs4 = bottomSheetContentUiSpecs3;
                        chaloTextUIState3 = chaloTextUIState;
                        function5 = function4;
                        objB4 = objB2;
                        icon3 = icon2;
                        imageUIState4 = imageUIState3;
                        bottomSheetUiState3 = bottomSheetUiState2;
                        buttonUIStateFactory2 = buttonUIStateFactory;
                        buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB4, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new d30(function5, 29), UIShape.e, false, 0.0f, 52);
                        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$0 = function5;
                        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$1 = bottomSheetContentUiSpecs4;
                        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$2 = imageUIState4;
                        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$3 = icon3;
                        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$4 = chaloTextUIState3;
                        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$5 = chaloTextUIState2;
                        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$6 = buttonUIStateF;
                        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$7 = buttonUIStateFactory;
                        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$8 = bottomSheetUiState3;
                        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.label = 4;
                        objB3 = stringProvider.b(StringEnum.CANCEL, new Object[0], groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1);
                        if (objB3 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        chaloTextUIState4 = chaloTextUIState3;
                        imageUIState5 = imageUIState4;
                        chaloTextUIState5 = chaloTextUIState2;
                        buttonUIStateFactory3 = buttonUIStateFactory;
                        bottomSheetContentUiSpecs5 = bottomSheetContentUiSpecs4;
                        buttonUIState = buttonUIStateF;
                        objB4 = objB3;
                        function6 = function5;
                        return new GroupTicketLegSelectionBottomSheetUIStateType.Error(bottomSheetUiState3, new BottomSheetStandardContentUiState(null, bottomSheetContentUiSpecs5, icon3, chaloTextUIState4, chaloTextUIState5, buttonUIState, ButtonUIStateFactory.d(buttonUIStateFactory3, new TextUIState.ChaloTextUIState((String) objB4, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new y60(function6, 0), UIShape.e, false, 52), imageUIState5, 1));
                    }
                }
                return coroutineSingletons2;
            }
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$0 = function1;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.label = 1;
            objB4 = stringProvider2.b(StringEnum.CHOOSE_NUMBER_OF_PASSENGERS_ERROR_SUB_TITLE, new Object[0], groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1);
            if (objB4 != coroutineSingletons2) {
                function2 = function1;
            }
            return coroutineSingletons2;
        }
        if (i2 == 1) {
            function2 = (Function1) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$0;
            ResultKt.b(objB4);
        } else if (i2 == 2) {
            bottomSheetUiState = (BottomSheetUiState) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$5;
            icon = (DrawType.Icon) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$4;
            imageUIState2 = (ImageUIState) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$3;
            bottomSheetContentUiSpecs2 = (BottomSheetContentUiSpecs) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$2;
            str3 = (String) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$1;
            function3 = (Function1) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$0;
            ResultKt.b(objB4);
            String str5 = str3;
            imageUIState3 = imageUIState2;
            UITextStyle uITextStyle2 = UITextStyle.DisplaySmall;
            UIFontWeight uIFontWeight2 = UIFontWeight.Bold;
            UITextAlign uITextAlign2 = UITextAlign.Center;
            icon2 = icon;
            bottomSheetContentUiSpecs3 = bottomSheetContentUiSpecs2;
            function4 = function3;
            bottomSheetUiState2 = bottomSheetUiState;
            chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB4, uITextStyle2, almostBlackColor, 0, uITextAlign2, uIFontWeight2, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8088);
            chaloTextUIState2 = new TextUIState.ChaloTextUIState(str5, UITextStyle.BodyMedium, ChaloColorToken.ShadyGray.f9851a, 0, uITextAlign2, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$0 = function4;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$1 = bottomSheetContentUiSpecs3;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$2 = imageUIState3;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$3 = icon2;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$4 = chaloTextUIState;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$5 = chaloTextUIState2;
            buttonUIStateFactory = buttonUIStateFactory4;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$6 = buttonUIStateFactory;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$7 = bottomSheetUiState2;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.label = 3;
            stringProvider = stringProvider2;
            objB2 = stringProvider.b(StringEnum.TRY_AGAIN, new Object[0], groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1);
            coroutineSingletons = coroutineSingletons2;
            if (objB2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            bottomSheetContentUiSpecs4 = bottomSheetContentUiSpecs3;
            chaloTextUIState3 = chaloTextUIState;
            function5 = function4;
            objB4 = objB2;
            icon3 = icon2;
            imageUIState4 = imageUIState3;
            bottomSheetUiState3 = bottomSheetUiState2;
            buttonUIStateFactory2 = buttonUIStateFactory;
            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB4, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new d30(function5, 29), UIShape.e, false, 0.0f, 52);
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$0 = function5;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$1 = bottomSheetContentUiSpecs4;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$2 = imageUIState4;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$3 = icon3;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$4 = chaloTextUIState3;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$5 = chaloTextUIState2;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$6 = buttonUIStateF;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$7 = buttonUIStateFactory;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$8 = bottomSheetUiState3;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.label = 4;
            objB3 = stringProvider.b(StringEnum.CANCEL, new Object[0], groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1);
            if (objB3 == coroutineSingletons) {
                return coroutineSingletons;
            }
            chaloTextUIState4 = chaloTextUIState3;
            imageUIState5 = imageUIState4;
            chaloTextUIState5 = chaloTextUIState2;
            buttonUIStateFactory3 = buttonUIStateFactory;
            bottomSheetContentUiSpecs5 = bottomSheetContentUiSpecs4;
            buttonUIState = buttonUIStateF;
            objB4 = objB3;
            function6 = function5;
        } else if (i2 == 3) {
            BottomSheetUiState bottomSheetUiState4 = (BottomSheetUiState) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$7;
            ButtonUIStateFactory buttonUIStateFactory5 = (ButtonUIStateFactory) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$6;
            TextUIState.ChaloTextUIState chaloTextUIState6 = (TextUIState.ChaloTextUIState) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$5;
            TextUIState.ChaloTextUIState chaloTextUIState7 = (TextUIState.ChaloTextUIState) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$4;
            DrawType.Icon icon4 = (DrawType.Icon) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$3;
            ImageUIState imageUIState6 = (ImageUIState) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$2;
            BottomSheetContentUiSpecs bottomSheetContentUiSpecs6 = (BottomSheetContentUiSpecs) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$1;
            function5 = (Function1) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$0;
            ResultKt.b(objB4);
            buttonUIStateFactory = buttonUIStateFactory4;
            chaloTextUIState3 = chaloTextUIState7;
            coroutineSingletons = coroutineSingletons2;
            bottomSheetUiState3 = bottomSheetUiState4;
            imageUIState4 = imageUIState6;
            buttonUIStateFactory2 = buttonUIStateFactory5;
            chaloTextUIState2 = chaloTextUIState6;
            icon3 = icon4;
            stringProvider = stringProvider2;
            bottomSheetContentUiSpecs4 = bottomSheetContentUiSpecs6;
            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB4, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new d30(function5, 29), UIShape.e, false, 0.0f, 52);
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$0 = function5;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$1 = bottomSheetContentUiSpecs4;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$2 = imageUIState4;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$3 = icon3;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$4 = chaloTextUIState3;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$5 = chaloTextUIState2;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$6 = buttonUIStateF;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$7 = buttonUIStateFactory;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$8 = bottomSheetUiState3;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.label = 4;
            objB3 = stringProvider.b(StringEnum.CANCEL, new Object[0], groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1);
            if (objB3 == coroutineSingletons) {
                return coroutineSingletons;
            }
            chaloTextUIState4 = chaloTextUIState3;
            imageUIState5 = imageUIState4;
            chaloTextUIState5 = chaloTextUIState2;
            buttonUIStateFactory3 = buttonUIStateFactory;
            bottomSheetContentUiSpecs5 = bottomSheetContentUiSpecs4;
            buttonUIState = buttonUIStateF;
            objB4 = objB3;
            function6 = function5;
        } else {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bottomSheetUiState3 = (BottomSheetUiState) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$8;
            buttonUIStateFactory3 = (ButtonUIStateFactory) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$7;
            buttonUIState = (ButtonUIState) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$6;
            TextUIState.ChaloTextUIState chaloTextUIState8 = (TextUIState.ChaloTextUIState) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$5;
            TextUIState.ChaloTextUIState chaloTextUIState9 = (TextUIState.ChaloTextUIState) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$4;
            icon3 = (DrawType.Icon) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$3;
            ImageUIState imageUIState7 = (ImageUIState) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$2;
            BottomSheetContentUiSpecs bottomSheetContentUiSpecs7 = (BottomSheetContentUiSpecs) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$1;
            function6 = (Function1) groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$0;
            ResultKt.b(objB4);
            chaloTextUIState5 = chaloTextUIState8;
            chaloTextUIState4 = chaloTextUIState9;
            imageUIState5 = imageUIState7;
            bottomSheetContentUiSpecs5 = bottomSheetContentUiSpecs7;
        }
        return new GroupTicketLegSelectionBottomSheetUIStateType.Error(bottomSheetUiState3, new BottomSheetStandardContentUiState(null, bottomSheetContentUiSpecs5, icon3, chaloTextUIState4, chaloTextUIState5, buttonUIState, ButtonUIStateFactory.d(buttonUIStateFactory3, new TextUIState.ChaloTextUIState((String) objB4, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new y60(function6, 0), UIShape.e, false, 52), imageUIState5, 1));
        str2 = (String) objB4;
        str3 = str2;
        bottomSheetUiStateD = d(function2);
        float f2 = ChaloThemeHelper.a().h;
        bottomSheetContentUiSpecs = new BottomSheetContentUiSpecs(new ChaloPadding(f2, f2, f2, f2), null, ChaloThemeHelper.a().q, ChaloThemeHelper.a().g, ChaloThemeHelper.a().q, 158);
        imageUIState = new ImageUIState(IconType.CLOSE_NEARBY, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new d30(function2, 28)), WebSocketProtocol.PAYLOAD_SHORT);
        icon = new DrawType.Icon(new ImageUIState(IconType.IC_ALERT_TRIANGLE_WITH_REFLECTION, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().r), Dp.m7276boximpl(ChaloThemeHelper.a().o0)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246));
        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$0 = function2;
        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$1 = str3;
        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$2 = bottomSheetContentUiSpecs;
        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$3 = imageUIState;
        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$4 = icon;
        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$5 = bottomSheetUiStateD;
        groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.label = 2;
        objB = stringProvider2.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1);
        if (objB != coroutineSingletons2) {
            bottomSheetContentUiSpecs2 = bottomSheetContentUiSpecs;
            imageUIState2 = imageUIState;
            function3 = function2;
            bottomSheetUiState = bottomSheetUiStateD;
            objB4 = objB;
            String str6 = str3;
            imageUIState3 = imageUIState2;
            UITextStyle uITextStyle3 = UITextStyle.DisplaySmall;
            UIFontWeight uIFontWeight3 = UIFontWeight.Bold;
            UITextAlign uITextAlign3 = UITextAlign.Center;
            icon2 = icon;
            bottomSheetContentUiSpecs3 = bottomSheetContentUiSpecs2;
            function4 = function3;
            bottomSheetUiState2 = bottomSheetUiState;
            chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB4, uITextStyle3, almostBlackColor, 0, uITextAlign3, uIFontWeight3, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8088);
            chaloTextUIState2 = new TextUIState.ChaloTextUIState(str6, UITextStyle.BodyMedium, ChaloColorToken.ShadyGray.f9851a, 0, uITextAlign3, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$0 = function4;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$1 = bottomSheetContentUiSpecs3;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$2 = imageUIState3;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$3 = icon2;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$4 = chaloTextUIState;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$5 = chaloTextUIState2;
            buttonUIStateFactory = buttonUIStateFactory4;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$6 = buttonUIStateFactory;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$7 = bottomSheetUiState2;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.label = 3;
            stringProvider = stringProvider2;
            objB2 = stringProvider.b(StringEnum.TRY_AGAIN, new Object[0], groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1);
            coroutineSingletons = coroutineSingletons2;
            if (objB2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            bottomSheetContentUiSpecs4 = bottomSheetContentUiSpecs3;
            chaloTextUIState3 = chaloTextUIState;
            function5 = function4;
            objB4 = objB2;
            icon3 = icon2;
            imageUIState4 = imageUIState3;
            bottomSheetUiState3 = bottomSheetUiState2;
            buttonUIStateFactory2 = buttonUIStateFactory;
            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB4, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new d30(function5, 29), UIShape.e, false, 0.0f, 52);
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$0 = function5;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$1 = bottomSheetContentUiSpecs4;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$2 = imageUIState4;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$3 = icon3;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$4 = chaloTextUIState3;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$5 = chaloTextUIState2;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$6 = buttonUIStateF;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$7 = buttonUIStateFactory;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.L$8 = bottomSheetUiState3;
            groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1.label = 4;
            objB3 = stringProvider.b(StringEnum.CANCEL, new Object[0], groupTicketSelectionUIStateFactory$getErrorBottomSheetUIState$1);
            if (objB3 == coroutineSingletons) {
                return coroutineSingletons;
            }
            chaloTextUIState4 = chaloTextUIState3;
            imageUIState5 = imageUIState4;
            chaloTextUIState5 = chaloTextUIState2;
            buttonUIStateFactory3 = buttonUIStateFactory;
            bottomSheetContentUiSpecs5 = bottomSheetContentUiSpecs4;
            buttonUIState = buttonUIStateF;
            objB4 = objB3;
            function6 = function5;
            return new GroupTicketLegSelectionBottomSheetUIStateType.Error(bottomSheetUiState3, new BottomSheetStandardContentUiState(null, bottomSheetContentUiSpecs5, icon3, chaloTextUIState4, chaloTextUIState5, buttonUIState, ButtonUIStateFactory.d(buttonUIStateFactory3, new TextUIState.ChaloTextUIState((String) objB4, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new y60(function6, 0), UIShape.e, false, 52), imageUIState5, 1));
        }
        return coroutineSingletons2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object f(String str, GroupTicketCategoryFareDetailsAppModel groupTicketCategoryFareDetailsAppModel, Function1 function1, ContinuationImpl continuationImpl) {
        GroupTicketSelectionUIStateFactory$getFareBreakupSectionUIState$1 groupTicketSelectionUIStateFactory$getFareBreakupSectionUIState$1;
        CurrencyFeature currencyFeature;
        String strA;
        List list;
        String str2;
        Function1 function2;
        if (continuationImpl instanceof GroupTicketSelectionUIStateFactory$getFareBreakupSectionUIState$1) {
            groupTicketSelectionUIStateFactory$getFareBreakupSectionUIState$1 = (GroupTicketSelectionUIStateFactory$getFareBreakupSectionUIState$1) continuationImpl;
            int i = groupTicketSelectionUIStateFactory$getFareBreakupSectionUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupTicketSelectionUIStateFactory$getFareBreakupSectionUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                groupTicketSelectionUIStateFactory$getFareBreakupSectionUIState$1 = new GroupTicketSelectionUIStateFactory$getFareBreakupSectionUIState$1(this, continuationImpl);
            }
        } else {
            groupTicketSelectionUIStateFactory$getFareBreakupSectionUIState$1 = new GroupTicketSelectionUIStateFactory$getFareBreakupSectionUIState$1(this, continuationImpl);
        }
        Object objB = groupTicketSelectionUIStateFactory$getFareBreakupSectionUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = groupTicketSelectionUIStateFactory$getFareBreakupSectionUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            List list2 = groupTicketCategoryFareDetailsAppModel.g;
            int i3 = 10;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            Iterator it = list2.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                currencyFeature = this.b;
                int i4 = 0;
                if (!zHasNext) {
                    break;
                }
                ArrayList arrayList2 = ((GroupTicketLegBreakupFareDetailsAppModel) it.next()).g;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.v(arrayList2, i3));
                int size = arrayList2.size();
                while (i4 < size) {
                    Object obj = arrayList2.get(i4);
                    i4++;
                    FareBreakupAppModel fareBreakupAppModel = (FareBreakupAppModel) obj;
                    String strA2 = currencyFeature.a(fareBreakupAppModel.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                    FareBreakupOperationUIProperties fareBreakupOperationUIPropertiesA = FareBreakupOperationUIPropertiesKt.a(fareBreakupAppModel.b, (3 & 1) != 0 ? ChaloColorToken.Black.f9759a : ChaloColorToken.AlmostBlackColor.f9756a, (3 & 2) != 0);
                    arrayList3.add(new FareBreakupItemUIState(new TextUIState.ChaloTextUIState(fareBreakupAppModel.f3890a, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(vo1.A(fareBreakupOperationUIPropertiesA.f8267a, strA2), UITextStyle.TitleLarge, fareBreakupOperationUIPropertiesA.b, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)));
                }
                arrayList.add(new FareBreakupLegSectionUIState(arrayList3));
                i3 = 10;
            }
            strA = currencyFeature.a(groupTicketCategoryFareDetailsAppModel.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
            groupTicketSelectionUIStateFactory$getFareBreakupSectionUIState$1.L$0 = str;
            groupTicketSelectionUIStateFactory$getFareBreakupSectionUIState$1.L$1 = function1;
            groupTicketSelectionUIStateFactory$getFareBreakupSectionUIState$1.L$2 = arrayList;
            groupTicketSelectionUIStateFactory$getFareBreakupSectionUIState$1.L$3 = strA;
            groupTicketSelectionUIStateFactory$getFareBreakupSectionUIState$1.label = 1;
            objB = this.f5949a.b(StringEnum.TOTAL, new Object[0], groupTicketSelectionUIStateFactory$getFareBreakupSectionUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            list = arrayList;
            str2 = str;
            function2 = function1;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            strA = (String) groupTicketSelectionUIStateFactory$getFareBreakupSectionUIState$1.L$3;
            list = (List) groupTicketSelectionUIStateFactory$getFareBreakupSectionUIState$1.L$2;
            function2 = (Function1) groupTicketSelectionUIStateFactory$getFareBreakupSectionUIState$1.L$1;
            str2 = (String) groupTicketSelectionUIStateFactory$getFareBreakupSectionUIState$1.L$0;
            ResultKt.b(objB);
        }
        String str3 = strA;
        UITextStyle uITextStyle = UITextStyle.BodySmall;
        ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
        return new FareBreakupSectionUIState(UiEventHandler.Companion.a(new w60(0, str2, function2)), list, new FareBreakupItemUIState(new TextUIState.ChaloTextUIState((String) objB, uITextStyle, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str3, uITextStyle, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120)), new DashedDividerUIState(ChaloThemeHelper.a().b, 12, ChaloColorToken.LightGray.f9814a));
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:107:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:109:0x02af  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:113:0x02be  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0321  */
    /* JADX WARN: Code duplicated, block: B:118:0x0323  */
    /* JADX WARN: Code duplicated, block: B:121:0x034d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0353  */
    /* JADX WARN: Code duplicated, block: B:126:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0181  */
    /* JADX WARN: Code duplicated, block: B:36:0x018f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0194  */
    /* JADX WARN: Code duplicated, block: B:40:0x0198  */
    /* JADX WARN: Code duplicated, block: B:49:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:52:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x0206  */
    /* JADX WARN: Code duplicated, block: B:55:0x020d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0211  */
    /* JADX WARN: Code duplicated, block: B:58:0x0218  */
    /* JADX WARN: Code duplicated, block: B:60:0x021b  */
    /* JADX WARN: Code duplicated, block: B:61:0x021e A[PHI: r2
      0x021e: PHI (r2v34 java.lang.String) = (r2v26 java.lang.String), (r2v73 java.lang.String) binds: [B:75:0x024c, B:59:0x0219] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0221  */
    /* JADX WARN: Code duplicated, block: B:64:0x0225  */
    /* JADX WARN: Code duplicated, block: B:74:0x024b  */
    /* JADX WARN: Code duplicated, block: B:77:0x024f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:84:0x0261  */
    /* JADX WARN: Code duplicated, block: B:87:0x0266  */
    /* JADX WARN: Code duplicated, block: B:89:0x0270  */
    /* JADX WARN: Code duplicated, block: B:90:0x0277  */
    /* JADX WARN: Code duplicated, block: B:92:0x027b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0282  */
    /* JADX WARN: Code duplicated, block: B:96:0x0289  */
    /* JADX WARN: Code duplicated, block: B:97:0x028b  */
    /* JADX WARN: Code duplicated, block: B:99:0x028f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object g(GroupTicketLegSelectionDataState groupTicketLegSelectionDataState, Function1 function1, ContinuationImpl continuationImpl) {
        GroupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1 groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1;
        int i;
        ChaloColorToken.OrangePrimary orangePrimary;
        int i2;
        FullJourneyTicketCardUISpecs fullJourneyTicketCardUISpecs;
        List list;
        Function1 function2;
        List list2;
        SpecialFeaturesTagListUIState specialFeaturesTagListUIState;
        Function1 function3;
        FullJourneyTicketCardUISpecs fullJourneyTicketCardUISpecs2;
        ArrayList arrayList;
        Iterator it;
        GroupTicketSelectableStepDataState groupTicketSelectableStepDataState;
        String str;
        GroupTicketSelectableStepLegDetails groupTicketSelectableStepLegDetails;
        String str2;
        GroupTicketJourneyLeg groupTicketJourneyLeg;
        String str3;
        TripPlannerLegAppModel tripPlannerLegAppModel;
        String str4;
        GroupTicketSelectableStepDataState groupTicketSelectableStepDataState2;
        GroupTicketSelectableStepLegDetails groupTicketSelectableStepLegDetails2;
        GroupTicketJourneyLeg groupTicketJourneyLeg2;
        TripPlannerLegAppModel tripPlannerLegAppModel2;
        String f;
        boolean z;
        TripPlannerLegAppModel tripPlannerLegAppModel3;
        String f2;
        GroupTicketSelectableStepAppModel groupTicketSelectableStepAppModel;
        TripPlannerLegAppModel tripPlannerLegAppModel4;
        GroupTicketSelectableStepAppModel groupTicketSelectableStepAppModel2;
        GroupTicketSelectableStepLegDetails groupTicketSelectableStepLegDetails3;
        IconType iconType;
        if (continuationImpl instanceof GroupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1) {
            groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1 = (GroupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1) continuationImpl;
            int i3 = groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.label = i3 - Integer.MIN_VALUE;
            } else {
                groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1 = new GroupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1(this, continuationImpl);
            }
        } else {
            groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1 = new GroupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1(this, continuationImpl);
        }
        Object objB = groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.label;
        StringProvider stringProvider = this.f5949a;
        ChaloColorToken.Transparent transparent = ChaloColorToken.Transparent.f9864a;
        ChaloColorToken.OrangePrimary orangePrimary2 = ChaloColorToken.OrangePrimary.f9835a;
        boolean z2 = true;
        if (i4 == 0) {
            ResultKt.b(objB);
            List listV0 = CollectionsKt.v0(new GroupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$$inlined$sortedBy$1(), groupTicketLegSelectionDataState.e.values());
            i = groupTicketLegSelectionDataState.f5931a == GroupTicketJourneySelectionMode.FullJourney ? 1 : 0;
            if (i != 0) {
                fullJourneyTicketCardUISpecs = new FullJourneyTicketCardUISpecs(null, ChaloColorToken.OrangeBackgroundLight.f9834a, new BorderUISpec(ChaloThemeHelper.a().b, orangePrimary2, UIShape.e), null, null, null, null, TypedValues.PositionType.TYPE_SIZE_PERCENT);
                orangePrimary = orangePrimary2;
                i2 = 0;
            } else {
                orangePrimary = orangePrimary2;
                i2 = 0;
                fullJourneyTicketCardUISpecs = new FullJourneyTicketCardUISpecs(null, transparent, null, null, null, null, null, TypedValues.PositionType.TYPE_SIZE_PERCENT);
            }
            groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.L$0 = function1;
            groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.L$1 = listV0;
            groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.L$2 = fullJourneyTicketCardUISpecs;
            groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.I$0 = i;
            z2 = true;
            groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.label = 1;
            Object objB2 = stringProvider.b(StringEnum.RECOMMENDED_NORMAL_CASE, new Object[i2], groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1);
            if (objB2 != coroutineSingletons) {
                list = listV0;
                objB = objB2;
                function2 = function1;
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            i = groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.I$0;
            FullJourneyTicketCardUISpecs fullJourneyTicketCardUISpecs3 = (FullJourneyTicketCardUISpecs) groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.L$2;
            List list3 = (List) groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.L$1;
            function2 = (Function1) groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.L$0;
            ResultKt.b(objB);
            orangePrimary = orangePrimary2;
            list = list3;
            fullJourneyTicketCardUISpecs = fullJourneyTicketCardUISpecs3;
            i2 = 0;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.I$0;
            SpecialFeaturesTagListUIState specialFeaturesTagListUIState2 = (SpecialFeaturesTagListUIState) groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.L$3;
            FullJourneyTicketCardUISpecs fullJourneyTicketCardUISpecs4 = (FullJourneyTicketCardUISpecs) groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.L$2;
            list2 = (List) groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.L$1;
            function3 = (Function1) groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.L$0;
            ResultKt.b(objB);
            specialFeaturesTagListUIState = specialFeaturesTagListUIState2;
            fullJourneyTicketCardUISpecs2 = fullJourneyTicketCardUISpecs4;
            i2 = 0;
        }
        TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyLarge, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
        List list4 = list2;
        arrayList = new ArrayList(CollectionsKt.v(list4, 10));
        it = list4.iterator();
        while (it.hasNext()) {
            groupTicketSelectableStepLegDetails3 = ((GroupTicketSelectableStepDataState) it.next()).b.c;
            if (groupTicketSelectableStepLegDetails3 instanceof GroupTicketSelectableStepLegDetails.Bus) {
                iconType = IconType.GROUP_TICKET_BUS;
            } else {
                if (groupTicketSelectableStepLegDetails3 instanceof GroupTicketSelectableStepLegDetails.Metro) {
                    throw new NoWhenBranchMatchedException();
                }
                iconType = IconType.METRO_GROUP_TICKET;
            }
            arrayList.add(new ImageUIState(iconType, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246));
        }
        ImageUIState imageUIState = new ImageUIState(IconType.IC_ARROW_UP, (String) null, ChaloColorToken.Black_87.f9768a, new ImageUISize(ChaloThemeHelper.a().g), (UIContentScale) null, 90.0f, (UiEventHandler) null, 178);
        groupTicketSelectableStepDataState = (GroupTicketSelectableStepDataState) CollectionsKt.H(list2);
        str = null;
        if (groupTicketSelectableStepDataState != null || (groupTicketSelectableStepAppModel2 = groupTicketSelectableStepDataState.b) == null) {
            groupTicketSelectableStepLegDetails = null;
        } else {
            groupTicketSelectableStepLegDetails = groupTicketSelectableStepAppModel2.c;
        }
        str2 = "";
        if (groupTicketSelectableStepLegDetails instanceof GroupTicketSelectableStepLegDetails.Bus) {
            tripPlannerLegAppModel4 = ((GroupTicketSelectableStepLegDetails.Bus) groupTicketSelectableStepLegDetails).f5865a.d;
            if (tripPlannerLegAppModel4 instanceof TripPlannerLegAppModel.Bus) {
                str3 = ((TripPlannerLegAppModel.Bus) tripPlannerLegAppModel4).s.b;
            } else if (tripPlannerLegAppModel4 instanceof TripPlannerLegAppModel.Metro) {
                str3 = ((TripPlannerLegAppModel.Metro) tripPlannerLegAppModel4).s.b;
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str4 = "";
            } else {
                str4 = str3;
            }
        } else {
            if (groupTicketSelectableStepLegDetails instanceof GroupTicketSelectableStepLegDetails.Metro) {
                groupTicketJourneyLeg = (GroupTicketJourneyLeg) CollectionsKt.H(((GroupTicketSelectableStepLegDetails.Metro) groupTicketSelectableStepLegDetails).f5866a);
                if (groupTicketJourneyLeg != null || (tripPlannerLegAppModel = groupTicketJourneyLeg.d) == null) {
                    str3 = null;
                } else if (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Bus) {
                    str3 = ((TripPlannerLegAppModel.Bus) tripPlannerLegAppModel).s.b;
                } else if (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Metro) {
                    str3 = ((TripPlannerLegAppModel.Metro) tripPlannerLegAppModel).s.b;
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str4 = str3;
                }
            } else if (groupTicketSelectableStepLegDetails != null) {
                throw new NoWhenBranchMatchedException();
            }
            str4 = "";
        }
        groupTicketSelectableStepDataState2 = (GroupTicketSelectableStepDataState) CollectionsKt.Q(list2);
        if (groupTicketSelectableStepDataState2 != null || (groupTicketSelectableStepAppModel = groupTicketSelectableStepDataState2.b) == null) {
            groupTicketSelectableStepLegDetails2 = null;
        } else {
            groupTicketSelectableStepLegDetails2 = groupTicketSelectableStepAppModel.c;
        }
        if (groupTicketSelectableStepLegDetails2 instanceof GroupTicketSelectableStepLegDetails.Bus) {
            tripPlannerLegAppModel3 = ((GroupTicketSelectableStepLegDetails.Bus) groupTicketSelectableStepLegDetails2).f5865a.d;
            if (tripPlannerLegAppModel3 instanceof TripPlannerLegAppModel.Bus) {
                f2 = ((TripPlannerLegAppModel.Bus) tripPlannerLegAppModel3).t.b;
            } else if (tripPlannerLegAppModel3 instanceof TripPlannerLegAppModel.Metro) {
                f2 = ((TripPlannerLegAppModel.Metro) tripPlannerLegAppModel3).t.b;
            } else {
                f2 = tripPlannerLegAppModel3.getF();
            }
            if (f2 != null) {
                str2 = f2;
            }
        } else if (groupTicketSelectableStepLegDetails2 instanceof GroupTicketSelectableStepLegDetails.Metro) {
            groupTicketJourneyLeg2 = (GroupTicketJourneyLeg) CollectionsKt.Q(((GroupTicketSelectableStepLegDetails.Metro) groupTicketSelectableStepLegDetails2).f5866a);
            if (groupTicketJourneyLeg2 != null && (tripPlannerLegAppModel2 = groupTicketJourneyLeg2.d) != null) {
                if (tripPlannerLegAppModel2 instanceof TripPlannerLegAppModel.Bus) {
                    f = ((TripPlannerLegAppModel.Bus) tripPlannerLegAppModel2).t.b;
                } else if (tripPlannerLegAppModel2 instanceof TripPlannerLegAppModel.Metro) {
                    f = ((TripPlannerLegAppModel.Metro) tripPlannerLegAppModel2).t.b;
                } else {
                    f = tripPlannerLegAppModel2.getF();
                }
                str = f;
            }
            if (str != null) {
                str2 = str;
            }
        } else if (groupTicketSelectableStepLegDetails2 != null) {
            throw new NoWhenBranchMatchedException();
        }
        float f3 = ChaloThemeHelper.a().d;
        float f4 = ChaloThemeHelper.a().b;
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        ShapedContentUIState shapedContentUIStateA = ShapedContentUIStateFactory.a(f3, f4, transparent, shadyGray);
        ShapedContentUIState shapedContentUIStateA2 = ShapedContentUIStateFactory.a(ChaloThemeHelper.a().d, ChaloThemeHelper.a().b, shadyGray, shadyGray);
        UITextStyle uITextStyle = UITextStyle.BodySmall;
        FromAndToStopUIState fromAndToStopUIState = new FromAndToStopUIState(shapedContentUIStateA, shapedContentUIStateA2, new TextUIState.ChaloTextUIState(str4, uITextStyle, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str2, uITextStyle, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
        if (i != 0) {
            z = z2;
        } else {
            z = i2;
        }
        return new FullJourneyTicketCardUIState(fullJourneyTicketCardUISpecs2, specialFeaturesTagListUIState, chaloTextUIState, arrayList, imageUIState, fromAndToStopUIState, new RadioButtonUIState(z, UiEventHandler.Companion.a(new d30(function3, 23)), 60), UiEventHandler.Companion.a(new d30(function3, 27)));
        TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        UIShape.Rectangle rectangle = UIShape.c;
        float f5 = ChaloThemeHelper.a().f;
        float f6 = ChaloThemeHelper.a().c;
        SpecialFeaturesTagListUIState specialFeaturesTagListUIState3 = new SpecialFeaturesTagListUIState(CollectionsKt.R(new SpecialFeaturesTagTextUIState(chaloTextUIState2, orangePrimary, rectangle, new ChaloPadding(f6, f5, f5, f6))));
        groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.L$0 = function2;
        groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.L$1 = list;
        groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.L$2 = fullJourneyTicketCardUISpecs;
        groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.L$3 = specialFeaturesTagListUIState3;
        groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.I$0 = i;
        groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1.label = 2;
        objB = stringProvider.b(StringEnum.FULL_JOURNEY, new Object[i2], groupTicketSelectionUIStateFactory$getFullJourneyTicketCardUIState$1);
        if (objB != coroutineSingletons) {
            list2 = list;
            specialFeaturesTagListUIState = specialFeaturesTagListUIState3;
            function3 = function2;
            fullJourneyTicketCardUISpecs2 = fullJourneyTicketCardUISpecs;
            TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyLarge, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
            List list5 = list2;
            arrayList = new ArrayList(CollectionsKt.v(list5, 10));
            it = list5.iterator();
            while (it.hasNext()) {
                groupTicketSelectableStepLegDetails3 = ((GroupTicketSelectableStepDataState) it.next()).b.c;
                if (groupTicketSelectableStepLegDetails3 instanceof GroupTicketSelectableStepLegDetails.Bus) {
                    iconType = IconType.GROUP_TICKET_BUS;
                } else {
                    if (groupTicketSelectableStepLegDetails3 instanceof GroupTicketSelectableStepLegDetails.Metro) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iconType = IconType.METRO_GROUP_TICKET;
                }
                arrayList.add(new ImageUIState(iconType, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246));
            }
            ImageUIState imageUIState2 = new ImageUIState(IconType.IC_ARROW_UP, (String) null, ChaloColorToken.Black_87.f9768a, new ImageUISize(ChaloThemeHelper.a().g), (UIContentScale) null, 90.0f, (UiEventHandler) null, 178);
            groupTicketSelectableStepDataState = (GroupTicketSelectableStepDataState) CollectionsKt.H(list2);
            str = null;
            if (groupTicketSelectableStepDataState != null) {
                groupTicketSelectableStepLegDetails = null;
            } else {
                groupTicketSelectableStepLegDetails = null;
            }
            str2 = "";
            if (groupTicketSelectableStepLegDetails instanceof GroupTicketSelectableStepLegDetails.Bus) {
                tripPlannerLegAppModel4 = ((GroupTicketSelectableStepLegDetails.Bus) groupTicketSelectableStepLegDetails).f5865a.d;
                if (tripPlannerLegAppModel4 instanceof TripPlannerLegAppModel.Bus) {
                    str3 = ((TripPlannerLegAppModel.Bus) tripPlannerLegAppModel4).s.b;
                } else if (tripPlannerLegAppModel4 instanceof TripPlannerLegAppModel.Metro) {
                    str3 = ((TripPlannerLegAppModel.Metro) tripPlannerLegAppModel4).s.b;
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
            } else {
                if (groupTicketSelectableStepLegDetails instanceof GroupTicketSelectableStepLegDetails.Metro) {
                    groupTicketJourneyLeg = (GroupTicketJourneyLeg) CollectionsKt.H(((GroupTicketSelectableStepLegDetails.Metro) groupTicketSelectableStepLegDetails).f5866a);
                    if (groupTicketJourneyLeg != null) {
                        str3 = null;
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str4 = str3;
                    }
                } else if (groupTicketSelectableStepLegDetails != null) {
                    throw new NoWhenBranchMatchedException();
                }
                str4 = "";
            }
            groupTicketSelectableStepDataState2 = (GroupTicketSelectableStepDataState) CollectionsKt.Q(list2);
            if (groupTicketSelectableStepDataState2 != null) {
                groupTicketSelectableStepLegDetails2 = null;
            } else {
                groupTicketSelectableStepLegDetails2 = null;
            }
            if (groupTicketSelectableStepLegDetails2 instanceof GroupTicketSelectableStepLegDetails.Bus) {
                tripPlannerLegAppModel3 = ((GroupTicketSelectableStepLegDetails.Bus) groupTicketSelectableStepLegDetails2).f5865a.d;
                if (tripPlannerLegAppModel3 instanceof TripPlannerLegAppModel.Bus) {
                    f2 = ((TripPlannerLegAppModel.Bus) tripPlannerLegAppModel3).t.b;
                } else if (tripPlannerLegAppModel3 instanceof TripPlannerLegAppModel.Metro) {
                    f2 = ((TripPlannerLegAppModel.Metro) tripPlannerLegAppModel3).t.b;
                } else {
                    f2 = tripPlannerLegAppModel3.getF();
                }
                if (f2 != null) {
                    str2 = f2;
                }
            } else if (groupTicketSelectableStepLegDetails2 instanceof GroupTicketSelectableStepLegDetails.Metro) {
                groupTicketJourneyLeg2 = (GroupTicketJourneyLeg) CollectionsKt.Q(((GroupTicketSelectableStepLegDetails.Metro) groupTicketSelectableStepLegDetails2).f5866a);
                if (groupTicketJourneyLeg2 != null) {
                    if (tripPlannerLegAppModel2 instanceof TripPlannerLegAppModel.Bus) {
                        f = ((TripPlannerLegAppModel.Bus) tripPlannerLegAppModel2).t.b;
                    } else if (tripPlannerLegAppModel2 instanceof TripPlannerLegAppModel.Metro) {
                        f = ((TripPlannerLegAppModel.Metro) tripPlannerLegAppModel2).t.b;
                    } else {
                        f = tripPlannerLegAppModel2.getF();
                    }
                    str = f;
                }
                if (str != null) {
                    str2 = str;
                }
            } else if (groupTicketSelectableStepLegDetails2 != null) {
                throw new NoWhenBranchMatchedException();
            }
            float f7 = ChaloThemeHelper.a().d;
            float f8 = ChaloThemeHelper.a().b;
            ChaloColorToken.ShadyGray shadyGray2 = ChaloColorToken.ShadyGray.f9851a;
            ShapedContentUIState shapedContentUIStateA3 = ShapedContentUIStateFactory.a(f7, f8, transparent, shadyGray2);
            ShapedContentUIState shapedContentUIStateA4 = ShapedContentUIStateFactory.a(ChaloThemeHelper.a().d, ChaloThemeHelper.a().b, shadyGray2, shadyGray2);
            UITextStyle uITextStyle2 = UITextStyle.BodySmall;
            FromAndToStopUIState fromAndToStopUIState2 = new FromAndToStopUIState(shapedContentUIStateA3, shapedContentUIStateA4, new TextUIState.ChaloTextUIState(str4, uITextStyle2, shadyGray2, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str2, uITextStyle2, shadyGray2, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
            if (i != 0) {
                z = z2;
            } else {
                z = i2;
            }
            return new FullJourneyTicketCardUIState(fullJourneyTicketCardUISpecs2, specialFeaturesTagListUIState, chaloTextUIState3, arrayList, imageUIState2, fromAndToStopUIState2, new RadioButtonUIState(z, UiEventHandler.Companion.a(new d30(function3, 23)), 60), UiEventHandler.Companion.a(new d30(function3, 27)));
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0137  */
    /* JADX WARN: Code duplicated, block: B:39:0x0143  */
    /* JADX WARN: Code duplicated, block: B:40:0x0145  */
    /* JADX WARN: Code duplicated, block: B:43:0x016e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0175  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object h(GroupTicketLegSelectionDataState groupTicketLegSelectionDataState, Function1 function1, ContinuationImpl continuationImpl) {
        GroupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1 groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1;
        IndividualStepsTicketCardUISpecs individualStepsTicketCardUISpecs;
        GroupTicketLegSelectionDataState groupTicketLegSelectionDataState2;
        int i;
        Function1 function2;
        IndividualStepsTicketCardUISpecs individualStepsTicketCardUISpecs2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        Function1 function3;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        IndividualStepsTicketCardUISpecs individualStepsTicketCardUISpecs3;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        boolean z;
        boolean z2;
        if (continuationImpl instanceof GroupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1) {
            groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1 = (GroupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1) continuationImpl;
            int i2 = groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1 = new GroupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1(this, continuationImpl);
            }
        } else {
            groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1 = new GroupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1(this, continuationImpl);
        }
        Object objB = groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.label;
        StringProvider stringProvider = this.f5949a;
        if (i3 == 0) {
            ResultKt.b(objB);
            int i4 = groupTicketLegSelectionDataState.f5931a == GroupTicketJourneySelectionMode.IndividualSteps ? 1 : 0;
            individualStepsTicketCardUISpecs = i4 != 0 ? new IndividualStepsTicketCardUISpecs(new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.OrangePrimary.f9835a, UIShape.e), ChaloColorToken.OrangeBackgroundLight.f9834a) : new IndividualStepsTicketCardUISpecs(null, ChaloColorToken.Transparent.f9864a);
            groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$0 = groupTicketLegSelectionDataState;
            groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$1 = function1;
            groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$2 = individualStepsTicketCardUISpecs;
            groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.I$0 = i4;
            groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.label = 1;
            Object objB2 = stringProvider.b(StringEnum.INDIVIDUAL_STEPS, new Object[0], groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1);
            if (objB2 != obj) {
                groupTicketLegSelectionDataState2 = groupTicketLegSelectionDataState;
                i = i4;
                objB = objB2;
                function2 = function1;
            }
            return obj;
        }
        if (i3 == 1) {
            i = groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.I$0;
            individualStepsTicketCardUISpecs = (IndividualStepsTicketCardUISpecs) groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$2;
            function2 = (Function1) groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$1;
            groupTicketLegSelectionDataState2 = (GroupTicketLegSelectionDataState) groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i3 == 2) {
                i = groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.I$0;
                chaloTextUIState = (TextUIState.ChaloTextUIState) groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$3;
                individualStepsTicketCardUISpecs2 = (IndividualStepsTicketCardUISpecs) groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$2;
                Function1 function4 = (Function1) groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$1;
                GroupTicketLegSelectionDataState groupTicketLegSelectionDataState3 = (GroupTicketLegSelectionDataState) groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$0;
                ResultKt.b(objB);
                groupTicketLegSelectionDataState2 = groupTicketLegSelectionDataState3;
                function2 = function4;
                chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                Map map = groupTicketLegSelectionDataState2.e;
                groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$0 = function2;
                groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$1 = individualStepsTicketCardUISpecs2;
                groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$2 = chaloTextUIState;
                groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$3 = chaloTextUIState2;
                groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.I$0 = i;
                groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.label = 3;
                objB = k(map, function2, groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1);
                if (objB != obj) {
                    function3 = function2;
                    chaloTextUIState3 = chaloTextUIState2;
                    individualStepsTicketCardUISpecs3 = individualStepsTicketCardUISpecs2;
                    chaloTextUIState4 = chaloTextUIState;
                }
                return obj;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.I$0;
            TextUIState.ChaloTextUIState chaloTextUIState5 = (TextUIState.ChaloTextUIState) groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$3;
            TextUIState.ChaloTextUIState chaloTextUIState6 = (TextUIState.ChaloTextUIState) groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$2;
            IndividualStepsTicketCardUISpecs individualStepsTicketCardUISpecs4 = (IndividualStepsTicketCardUISpecs) groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$1;
            function3 = (Function1) groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$0;
            ResultKt.b(objB);
            chaloTextUIState3 = chaloTextUIState5;
            chaloTextUIState4 = chaloTextUIState6;
            individualStepsTicketCardUISpecs3 = individualStepsTicketCardUISpecs4;
        }
        List list = (List) objB;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        RadioButtonUIState radioButtonUIState = new RadioButtonUIState(z, UiEventHandler.Companion.a(new d30(function3, 24)), 60);
        DividerUIState dividerUIState = new DividerUIState(0.0f, ChaloColorToken.LightGray.f9814a, null, 5);
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new d30(function3, 25));
        if (i != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new IndividualStepsTicketCardUIState(individualStepsTicketCardUISpecs3, chaloTextUIState4, chaloTextUIState3, z2, list, radioButtonUIState, dividerUIState, uiEventHandler$Companion$fromLambda$1A);
        TextUIState.ChaloTextUIState chaloTextUIState7 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyLarge, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
        groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$0 = groupTicketLegSelectionDataState2;
        groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$1 = function2;
        groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$2 = individualStepsTicketCardUISpecs;
        groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$3 = chaloTextUIState7;
        groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.I$0 = i;
        groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.label = 2;
        objB = stringProvider.b(StringEnum.INDIVIDUAL_STEPS_SUB_TITLE, new Object[0], groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1);
        if (objB != obj) {
            individualStepsTicketCardUISpecs2 = individualStepsTicketCardUISpecs;
            chaloTextUIState = chaloTextUIState7;
            chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            Map map2 = groupTicketLegSelectionDataState2.e;
            groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$0 = function2;
            groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$1 = individualStepsTicketCardUISpecs2;
            groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$2 = chaloTextUIState;
            groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.L$3 = chaloTextUIState2;
            groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.I$0 = i;
            groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1.label = 3;
            objB = k(map2, function2, groupTicketSelectionUIStateFactory$getIndividualStepsTicketCardUIState$1);
            if (objB != obj) {
                function3 = function2;
                chaloTextUIState3 = chaloTextUIState2;
                individualStepsTicketCardUISpecs3 = individualStepsTicketCardUISpecs2;
                chaloTextUIState4 = chaloTextUIState;
                List list2 = (List) objB;
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                RadioButtonUIState radioButtonUIState2 = new RadioButtonUIState(z, UiEventHandler.Companion.a(new d30(function3, 24)), 60);
                DividerUIState dividerUIState2 = new DividerUIState(0.0f, ChaloColorToken.LightGray.f9814a, null, 5);
                UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A2 = UiEventHandler.Companion.a(new d30(function3, 25));
                if (i != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new IndividualStepsTicketCardUIState(individualStepsTicketCardUISpecs3, chaloTextUIState4, chaloTextUIState3, z2, list2, radioButtonUIState2, dividerUIState2, uiEventHandler$Companion$fromLambda$1A2);
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x012d  */
    /* JADX WARN: Code duplicated, block: B:34:0x014c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object i(Map map, List list, Function1 function1, ContinuationImpl continuationImpl) {
        GroupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1 groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1;
        Map map2;
        List list2;
        Function1 function2;
        Map map3;
        Function1 function3;
        TextUIState.ChaloTextUIState chaloTextUIState;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        ImageUIState imageUIState;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        ImageUIState imageUIState2;
        PassengerSelectionItemsContainerUIState passengerSelectionItemsContainerUIState;
        ButtonUIStateFactory buttonUIStateFactory;
        Object objB;
        PassengerSelectionItemsContainerUIState passengerSelectionItemsContainerUIState2;
        ImageUIState imageUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        Function1 function4;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        ButtonUIStateFactory buttonUIStateFactory2;
        if (continuationImpl instanceof GroupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1) {
            groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1 = (GroupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1) continuationImpl;
            int i = groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.label = i - Integer.MIN_VALUE;
            } else {
                groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1 = new GroupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1(this, continuationImpl);
            }
        } else {
            groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1 = new GroupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1(this, continuationImpl);
        }
        Object objB2 = groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.label;
        StringProvider stringProvider = this.f5949a;
        if (i2 == 0) {
            ResultKt.b(objB2);
            map2 = map;
            groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$0 = map2;
            list2 = list;
            groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$1 = list2;
            function2 = function1;
            groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$2 = function2;
            groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.label = 1;
            objB2 = stringProvider.b(StringEnum.CHOOSE_NUMBER_OF_PASSENGERS, new Object[0], groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1);
            if (objB2 != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            Function1 function5 = (Function1) groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$2;
            List list3 = (List) groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$1;
            map2 = (Map) groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$0;
            ResultKt.b(objB2);
            function2 = function5;
            list2 = list3;
        } else {
            if (i2 == 2) {
                chaloTextUIState = (TextUIState.ChaloTextUIState) groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$2;
                function3 = (Function1) groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$1;
                map3 = (Map) groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$0;
                ResultKt.b(objB2);
                chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                imageUIState = new ImageUIState(IconType.CLOSE_NEARBY, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new y60(function3, 1)), WebSocketProtocol.PAYLOAD_SHORT);
                groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$0 = function3;
                groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$1 = chaloTextUIState;
                groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$2 = chaloTextUIState2;
                groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$3 = imageUIState;
                groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.label = 3;
                objB2 = j(map3, function3, groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1);
                if (objB2 != obj) {
                    chaloTextUIState3 = chaloTextUIState;
                    imageUIState2 = imageUIState;
                    passengerSelectionItemsContainerUIState = (PassengerSelectionItemsContainerUIState) objB2;
                    groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$0 = function3;
                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                    groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$1 = buttonUIStateFactory;
                    groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$2 = chaloTextUIState3;
                    groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$3 = chaloTextUIState2;
                    groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$4 = imageUIState2;
                    groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$5 = passengerSelectionItemsContainerUIState;
                    groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.label = 4;
                    objB = stringProvider.b(StringEnum.PROCEED_SENTENCE_CASE, new Object[0], groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1);
                    if (objB != obj) {
                        passengerSelectionItemsContainerUIState2 = passengerSelectionItemsContainerUIState;
                        objB2 = objB;
                        imageUIState3 = imageUIState2;
                        chaloTextUIState4 = chaloTextUIState3;
                        function4 = function3;
                        chaloTextUIState5 = chaloTextUIState2;
                        buttonUIStateFactory2 = buttonUIStateFactory;
                    }
                }
                return obj;
            }
            if (i2 == 3) {
                imageUIState2 = (ImageUIState) groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$3;
                TextUIState.ChaloTextUIState chaloTextUIState6 = (TextUIState.ChaloTextUIState) groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState7 = (TextUIState.ChaloTextUIState) groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$1;
                Function1 function6 = (Function1) groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$0;
                ResultKt.b(objB2);
                chaloTextUIState2 = chaloTextUIState6;
                chaloTextUIState3 = chaloTextUIState7;
                function3 = function6;
                passengerSelectionItemsContainerUIState = (PassengerSelectionItemsContainerUIState) objB2;
                groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$0 = function3;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$1 = buttonUIStateFactory;
                groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$2 = chaloTextUIState3;
                groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$3 = chaloTextUIState2;
                groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$4 = imageUIState2;
                groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$5 = passengerSelectionItemsContainerUIState;
                groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.label = 4;
                objB = stringProvider.b(StringEnum.PROCEED_SENTENCE_CASE, new Object[0], groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1);
                if (objB != obj) {
                    passengerSelectionItemsContainerUIState2 = passengerSelectionItemsContainerUIState;
                    objB2 = objB;
                    imageUIState3 = imageUIState2;
                    chaloTextUIState4 = chaloTextUIState3;
                    function4 = function3;
                    chaloTextUIState5 = chaloTextUIState2;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                }
                return obj;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PassengerSelectionItemsContainerUIState passengerSelectionItemsContainerUIState3 = (PassengerSelectionItemsContainerUIState) groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$5;
            ImageUIState imageUIState4 = (ImageUIState) groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$4;
            chaloTextUIState5 = (TextUIState.ChaloTextUIState) groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$3;
            TextUIState.ChaloTextUIState chaloTextUIState8 = (TextUIState.ChaloTextUIState) groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$2;
            ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$1;
            function4 = (Function1) groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$0;
            ResultKt.b(objB2);
            imageUIState3 = imageUIState4;
            chaloTextUIState4 = chaloTextUIState8;
            buttonUIStateFactory2 = buttonUIStateFactory3;
            passengerSelectionItemsContainerUIState2 = passengerSelectionItemsContainerUIState3;
        }
        return new GroupTicketLegSelectionBottomSheetUIStateType.PassengerSelection(d(function4), new GroupTicketPassengerSelectionBottomSheetUIState(chaloTextUIState4, chaloTextUIState5, imageUIState3, passengerSelectionItemsContainerUIState2, ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new y60(function4, 2), UIShape.e, false, 0.0f, 52)));
        TextUIState.ChaloTextUIState chaloTextUIState9 = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.DisplaySmall, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
        groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$0 = map2;
        groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$1 = function2;
        groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$2 = chaloTextUIState9;
        groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.label = 2;
        objB2 = c(list2, groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1);
        if (objB2 != obj) {
            map3 = map2;
            function3 = function2;
            chaloTextUIState = chaloTextUIState9;
            chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            imageUIState = new ImageUIState(IconType.CLOSE_NEARBY, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new y60(function3, 1)), WebSocketProtocol.PAYLOAD_SHORT);
            groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$0 = function3;
            groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$1 = chaloTextUIState;
            groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$2 = chaloTextUIState2;
            groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$3 = imageUIState;
            groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.label = 3;
            objB2 = j(map3, function3, groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1);
            if (objB2 != obj) {
                chaloTextUIState3 = chaloTextUIState;
                imageUIState2 = imageUIState;
                passengerSelectionItemsContainerUIState = (PassengerSelectionItemsContainerUIState) objB2;
                groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$0 = function3;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$1 = buttonUIStateFactory;
                groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$2 = chaloTextUIState3;
                groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$3 = chaloTextUIState2;
                groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$4 = imageUIState2;
                groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.L$5 = passengerSelectionItemsContainerUIState;
                groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1.label = 4;
                objB = stringProvider.b(StringEnum.PROCEED_SENTENCE_CASE, new Object[0], groupTicketSelectionUIStateFactory$getPassengerSelectionBottomSheetUIStateType$1);
                if (objB != obj) {
                    passengerSelectionItemsContainerUIState2 = passengerSelectionItemsContainerUIState;
                    objB2 = objB;
                    imageUIState3 = imageUIState2;
                    chaloTextUIState4 = chaloTextUIState3;
                    function4 = function3;
                    chaloTextUIState5 = chaloTextUIState2;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    return new GroupTicketLegSelectionBottomSheetUIStateType.PassengerSelection(d(function4), new GroupTicketPassengerSelectionBottomSheetUIState(chaloTextUIState4, chaloTextUIState5, imageUIState3, passengerSelectionItemsContainerUIState2, ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new y60(function4, 2), UIShape.e, false, 0.0f, 52)));
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0083  */
    /* JADX WARN: Code duplicated, block: B:23:0x0094  */
    /* JADX WARN: Code duplicated, block: B:26:0x009d  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:33:0x0104  */
    /* JADX WARN: Code duplicated, block: B:36:0x012d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0158  */
    /* JADX WARN: Code duplicated, block: B:39:0x015b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0161  */
    /* JADX WARN: Code duplicated, block: B:44:0x0164  */
    /* JADX WARN: Code duplicated, block: B:46:0x0181 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0182  */
    /* JADX WARN: Code duplicated, block: B:49:0x0191  */
    /* JADX WARN: Code duplicated, block: B:52:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:54:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:61:0x0221  */
    /* JADX WARN: Code duplicated, block: B:62:0x0224  */
    /* JADX WARN: Code duplicated, block: B:65:0x0233  */
    /* JADX WARN: Code duplicated, block: B:66:0x0240  */
    /* JADX WARN: Code duplicated, block: B:69:0x025a  */
    /* JADX WARN: Code duplicated, block: B:70:0x025c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0182 -> B:48:0x0187). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0191 -> B:50:0x0197). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:32:0x00e4
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object j(java.util.Map r34, kotlin.jvm.functions.Function1 r35, kotlin.coroutines.jvm.internal.ContinuationImpl r36) {
        /*
            Method dump skipped, instruction units count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.multimodalticket.ui.GroupTicketSelectionUIStateFactory.j(java.util.Map, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:45:0x018b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0197  */
    /* JADX WARN: Code duplicated, block: B:48:0x019a  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:61:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x016d -> B:43:0x0185). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01cf -> B:62:0x01d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0216 -> B:77:0x022d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object k(java.util.Map r27, kotlin.jvm.functions.Function1 r28, kotlin.coroutines.jvm.internal.ContinuationImpl r29) {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.multimodalticket.ui.GroupTicketSelectionUIStateFactory.k(java.util.Map, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
