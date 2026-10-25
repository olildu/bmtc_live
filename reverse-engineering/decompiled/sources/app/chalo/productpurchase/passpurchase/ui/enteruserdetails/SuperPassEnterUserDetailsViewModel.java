package app.chalo.productpurchase.passpurchase.ui.enteruserdetails;

import androidx.autofill.HintConstants;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.contract.BasicInfoContract;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.network.config.ChaloJson;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent;
import app.chalo.productpurchase.passpurchase.utils.SmartSuperPassPassengerSelectionHelper;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.ChaloScenes;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.SuperPassBasicUserPurpose;
import app.chalo.scenes.args.SuperPassPurchaseArgs;
import app.chalo.superpass.data.models.entities.PassApplicationActionRequired;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.dialog.DatePickerUIState;
import app.chalo.uistate.dialog.GenderSelectionDialogUIState;
import app.chalo.uistate.dialog.GenderSelectionDialogUIStateFactory;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.uistate.textField.TextFieldEventHandlerHelper;
import app.chalo.uistate.textField.TextFieldEventHandlerHelper$basic$3;
import app.chalo.uistate.textField.TextFieldLabelPlaceholderUIState;
import app.chalo.uistate.textField.UIKeyboardCapitalization;
import app.chalo.uistate.textField.UIKeyboardOption;
import app.chalo.uistate.textField.UITextFieldColors;
import app.chalo.uistate.toolbar.ToolbarActionsUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.usecase.GetTimeInMillisAfterXTimeUseCase;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.GenderKt;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.wf1;
import defpackage.xf1;
import defpackage.yf1;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsViewModel;", "Lapp/chalo/productpurchase/passpurchase/ui/decompose/SuperPassScreenBaseComponent;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsDataState;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsUIState;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassEnterUserDetailsViewModel extends SuperPassScreenBaseComponent<SuperPassEnterUserDetailsIntent, SuperPassEnterUserDetailsDataState, SuperPassEnterUserDetailsUIState, SuperPassEnterUserDetailsEffect> {
    public final SuperPassPurchaseArgs.EnterUserDetailsArgs k;
    public final SuperPassUserDetailsManager l;
    public final AnalyticsContract m;
    public final BasicInfoContract n;
    public final StringProvider o;
    public final ChaloNavigationManager p;
    public final TimeUtilsContract q;
    public final GetTimeInMillisAfterXTimeUseCase r;
    public final SmartSuperPassPassengerSelectionHelper s;
    public final ChaloAppFeatureHelper t;
    public final UserProfileDetailsProvider u;
    public final Lazy v;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsViewModel$Companion;", "", "", "SUPER_PASS_ENTER_USER_DETAILS_STATE_KEEPER_KEY", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8428a;

        static {
            int[] iArr = new int[SuperPassBasicUserPurpose.values().length];
            try {
                iArr[SuperPassBasicUserPurpose.COMPLETE_DETAILS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperPassBasicUserPurpose.ONLY_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SuperPassBasicUserPurpose.EDIT_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8428a = iArr;
        }
    }

    public SuperPassEnterUserDetailsViewModel(SuperPassPurchaseArgs.EnterUserDetailsArgs enterUserDetailsArgs, ComponentContext componentContext, SuperPassUserDetailsManager superPassUserDetailsManager, AnalyticsContract analyticsContract, BasicInfoContract basicInfoContract, StringProvider stringProvider, ChaloNavigationManager chaloNavigationManager, TimeUtilsContract timeUtilsContract, GetTimeInMillisAfterXTimeUseCase getTimeInMillisAfterXTimeUseCase, SmartSuperPassPassengerSelectionHelper smartSuperPassPassengerSelectionHelper, ChaloAppFeatureHelper chaloAppFeatureHelper, UserProfileDetailsProvider userProfileDetailsProvider) {
        super(componentContext, superPassUserDetailsManager);
        this.k = enterUserDetailsArgs;
        this.l = superPassUserDetailsManager;
        this.m = analyticsContract;
        this.n = basicInfoContract;
        this.o = stringProvider;
        this.p = chaloNavigationManager;
        this.q = timeUtilsContract;
        this.r = getTimeInMillisAfterXTimeUseCase;
        this.s = smartSuperPassPassengerSelectionHelper;
        this.t = chaloAppFeatureHelper;
        this.u = userProfileDetailsProvider;
        this.v = LazyKt.b(new Function0() { // from class: app.chalo.productpurchase.passpurchase.ui.enteruserdetails.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new ToolbarUIState(null, null, null, null, CollectionsKt.R(new ToolbarActionsUIState(UiEventHandler.Companion.a(new SuperPassEnterUserDetailsViewModel$toolbar$2$1(0, this.f8431a.l, SuperPassUserDetailsManager.class, "reportProblem", "reportProblem()V", 0)), new ImageUIState(IconType.ICON_HELP, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().j), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), null, null, 12)), 0.0f, null, null, 239);
            }
        });
        componentContext.getB().d("superPassEnterUserDetailsStateKeeperKey", SuperPassEnterUserDetailsRestoredState.INSTANCE.serializer(), new xf1(this, 2));
        n(new xf1(this, 3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object q(SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel, ContinuationImpl continuationImpl) {
        SuperPassEnterUserDetailsViewModel$getDobMinLowerBound$1 superPassEnterUserDetailsViewModel$getDobMinLowerBound$1;
        superPassEnterUserDetailsViewModel.getClass();
        if (continuationImpl instanceof SuperPassEnterUserDetailsViewModel$getDobMinLowerBound$1) {
            superPassEnterUserDetailsViewModel$getDobMinLowerBound$1 = (SuperPassEnterUserDetailsViewModel$getDobMinLowerBound$1) continuationImpl;
            int i = superPassEnterUserDetailsViewModel$getDobMinLowerBound$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassEnterUserDetailsViewModel$getDobMinLowerBound$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassEnterUserDetailsViewModel$getDobMinLowerBound$1 = new SuperPassEnterUserDetailsViewModel$getDobMinLowerBound$1(superPassEnterUserDetailsViewModel, continuationImpl);
            }
        } else {
            superPassEnterUserDetailsViewModel$getDobMinLowerBound$1 = new SuperPassEnterUserDetailsViewModel$getDobMinLowerBound$1(superPassEnterUserDetailsViewModel, continuationImpl);
        }
        Object objC = superPassEnterUserDetailsViewModel$getDobMinLowerBound$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassEnterUserDetailsViewModel$getDobMinLowerBound$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            BasicInfoContract basicInfoContract = superPassEnterUserDetailsViewModel.n;
            superPassEnterUserDetailsViewModel$getDobMinLowerBound$1.label = 1;
            objC = basicInfoContract.c(superPassEnterUserDetailsViewModel$getDobMinLowerBound$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        return new Long(((Number) objC).longValue() - 3153600000000L);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public static final Object r(SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel, String str, Gender gender, String str2, long j, long j2, ContinuationImpl continuationImpl) {
        SuperPassEnterUserDetailsViewModel$processNextBtnClickedForCompleteDetails$1 superPassEnterUserDetailsViewModel$processNextBtnClickedForCompleteDetails$1;
        TimeUtilsContract timeUtilsContract = superPassEnterUserDetailsViewModel.q;
        SuperPassUserDetailsManager superPassUserDetailsManager = superPassEnterUserDetailsViewModel.l;
        if (continuationImpl instanceof SuperPassEnterUserDetailsViewModel$processNextBtnClickedForCompleteDetails$1) {
            superPassEnterUserDetailsViewModel$processNextBtnClickedForCompleteDetails$1 = (SuperPassEnterUserDetailsViewModel$processNextBtnClickedForCompleteDetails$1) continuationImpl;
            int i = superPassEnterUserDetailsViewModel$processNextBtnClickedForCompleteDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassEnterUserDetailsViewModel$processNextBtnClickedForCompleteDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassEnterUserDetailsViewModel$processNextBtnClickedForCompleteDetails$1 = new SuperPassEnterUserDetailsViewModel$processNextBtnClickedForCompleteDetails$1(superPassEnterUserDetailsViewModel, continuationImpl);
            }
        } else {
            superPassEnterUserDetailsViewModel$processNextBtnClickedForCompleteDetails$1 = new SuperPassEnterUserDetailsViewModel$processNextBtnClickedForCompleteDetails$1(superPassEnterUserDetailsViewModel, continuationImpl);
        }
        SuperPassEnterUserDetailsViewModel$processNextBtnClickedForCompleteDetails$1 superPassEnterUserDetailsViewModel$processNextBtnClickedForCompleteDetails$2 = superPassEnterUserDetailsViewModel$processNextBtnClickedForCompleteDetails$1;
        Object objB = superPassEnterUserDetailsViewModel$processNextBtnClickedForCompleteDetails$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassEnterUserDetailsViewModel$processNextBtnClickedForCompleteDetails$2.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            AnalyticsContract analyticsContract = superPassEnterUserDetailsViewModel.m;
            Pair pair = new Pair("fullName", str);
            Pair pair2 = new Pair("dateOfBirth", timeUtilsContract.g(j));
            Pair pair3 = new Pair(HintConstants.AUTOFILL_HINT_GENDER, gender.name());
            Pair pair4 = new Pair("passStartDate", timeUtilsContract.g(j2));
            String str3 = ((SuperPassPurchaseSharedState) superPassUserDetailsManager.getF().getValue()).d;
            if (str3 == null) {
                str3 = "";
            }
            AnalyticsContract.DefaultImpls.a(analyticsContract, "basic user details next clicked", "basicUserDetailsFragment", MapsKt.i(pair, pair2, pair3, pair4, new Pair("flow", str3), new Pair("isSuperPass", Boolean.TRUE)), null, false, 24);
            superPassEnterUserDetailsViewModel.l.Q(str, gender, str2, j, j2);
            BookableSuperPassConfiguration bookableSuperPassConfiguration = ((SuperPassPurchaseSharedState) superPassUserDetailsManager.getF().getValue()).i;
            if (bookableSuperPassConfiguration != null) {
                SmartSuperPassPassengerSelectionHelper smartSuperPassPassengerSelectionHelper = superPassEnterUserDetailsViewModel.s;
                SuperPassUserDetails superPassUserDetails = ((SuperPassPurchaseSharedState) superPassUserDetailsManager.getF().getValue()).h;
                superPassEnterUserDetailsViewModel$processNextBtnClickedForCompleteDetails$2.label = 1;
                objB = smartSuperPassPassengerSelectionHelper.b(bookableSuperPassConfiguration, j2, superPassUserDetails, superPassEnterUserDetailsViewModel$processNextBtnClickedForCompleteDetails$2);
                if (objB == obj) {
                    return obj;
                }
            }
            ChaloNavigationManager chaloNavigationManager = superPassEnterUserDetailsViewModel.p;
            PassApplicationActionRequired lPassApplicationActionRequired = ((SuperPassPurchaseSharedState) superPassUserDetailsManager.getF().getValue()).e;
            PassApplicationActionRequired.Companion companion = PassApplicationActionRequired.INSTANCE;
            companion.getClass();
            Intrinsics.i(lPassApplicationActionRequired, "lPassApplicationActionRequired");
            Json json = ChaloJson.b;
            json.getClass();
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new SuperPassPurchaseArgs.UserProofsOverviewArgs.InternalArgs(json.a(companion.serializer(), lPassApplicationActionRequired)), null, null, 6));
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objB);
        superPassUserDetailsManager.J((Map) objB);
        ChaloNavigationManager chaloNavigationManager2 = superPassEnterUserDetailsViewModel.p;
        PassApplicationActionRequired lPassApplicationActionRequired2 = ((SuperPassPurchaseSharedState) superPassUserDetailsManager.getF().getValue()).e;
        PassApplicationActionRequired.Companion companion2 = PassApplicationActionRequired.INSTANCE;
        companion2.getClass();
        Intrinsics.i(lPassApplicationActionRequired2, "lPassApplicationActionRequired");
        Json json2 = ChaloJson.b;
        json2.getClass();
        chaloNavigationManager2.b(new ChaloNavigationRequest.Navigate(new SuperPassPurchaseArgs.UserProofsOverviewArgs.InternalArgs(json2.a(companion2.serializer(), lPassApplicationActionRequired2)), null, null, 6));
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0112  */
    /* JADX WARN: Code duplicated, block: B:35:0x011f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static final Object s(SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel, String str, boolean z, ContinuationImpl continuationImpl) {
        SuperPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1 superPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1;
        Gender gender;
        long j;
        boolean z2;
        String str2;
        String str3;
        long jLongValue;
        SuperPassUserDetailsManager superPassUserDetailsManager;
        Gender gender2;
        String str4;
        long j2;
        ChaloNavigationRequest navigate;
        String str5 = str;
        StateFlow stateFlow = superPassEnterUserDetailsViewModel.f;
        SuperPassUserDetailsManager superPassUserDetailsManager2 = superPassEnterUserDetailsViewModel.l;
        if (continuationImpl instanceof SuperPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1) {
            superPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1 = (SuperPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1) continuationImpl;
            int i = superPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1 = new SuperPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1(superPassEnterUserDetailsViewModel, continuationImpl);
            }
        } else {
            superPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1 = new SuperPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1(superPassEnterUserDetailsViewModel, continuationImpl);
        }
        Object objC = superPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String str6 = ((SuperPassEnterUserDetailsDataState) stateFlow.getValue()).f == SuperPassBasicUserPurpose.EDIT_NAME ? "sourceSuperPassPurchaseFragment" : "";
            AnalyticsContract analyticsContract = superPassEnterUserDetailsViewModel.m;
            Pair pair = new Pair("fullName", str5);
            Pair pair2 = new Pair("coming from source", str6);
            String str7 = ((SuperPassPurchaseSharedState) superPassUserDetailsManager2.getF().getValue()).d;
            if (str7 == null) {
                str7 = "";
            }
            AnalyticsContract.DefaultImpls.a(analyticsContract, "superPass enter user name next clicked", "superPassEnterUserNameFragment", MapsKt.i(pair, pair2, new Pair("flow", str7), new Pair("isSuperPass", Boolean.TRUE)), null, false, 24);
            gender = Gender.NULL;
            Long l = ((SuperPassEnterUserDetailsDataState) stateFlow.getValue()).d;
            j = -1;
            if (l == null && (l = ((SuperPassPurchaseSharedState) superPassUserDetailsManager2.getF().getValue()).j) == null) {
                BasicInfoContract basicInfoContract = superPassEnterUserDetailsViewModel.n;
                superPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1.L$0 = superPassUserDetailsManager2;
                superPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1.L$1 = str5;
                superPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1.L$2 = gender;
                superPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1.L$3 = "";
                z2 = z;
                superPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1.Z$0 = z2;
                superPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1.J$0 = -1L;
                superPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1.label = 1;
                objC = basicInfoContract.c(superPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str2 = "";
            } else {
                str3 = str5;
                jLongValue = l.longValue();
                superPassUserDetailsManager = superPassUserDetailsManager2;
                gender2 = gender;
                str4 = "";
                j2 = -1;
                z2 = z;
            }
            superPassUserDetailsManager.Q(str3, gender2, str4, j2, jLongValue);
            if (z2) {
                navigate = new ChaloNavigationRequest.GoBack(new PopUpToConfig.Scene(ChaloScenes.ConfirmSuperPassScreen, false));
            } else {
                navigate = new ChaloNavigationRequest.Navigate(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.InternalArgs.INSTANCE, null, null, 6);
            }
            superPassEnterUserDetailsViewModel.p.b(navigate);
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j3 = superPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1.J$0;
        boolean z3 = superPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1.Z$0;
        str2 = (String) superPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1.L$3;
        gender = (Gender) superPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1.L$2;
        String str8 = (String) superPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1.L$1;
        SuperPassUserDetailsManager superPassUserDetailsManager3 = (SuperPassUserDetailsManager) superPassEnterUserDetailsViewModel$processNextBtnClickedForUserNameOnly$1.L$0;
        ResultKt.b(objC);
        j = j3;
        superPassUserDetailsManager2 = superPassUserDetailsManager3;
        z2 = z3;
        str5 = str8;
        str3 = str5;
        superPassUserDetailsManager = superPassUserDetailsManager2;
        str4 = str2;
        gender2 = gender;
        jLongValue = ((Number) objC).longValue();
        j2 = j;
        superPassUserDetailsManager.Q(str3, gender2, str4, j2, jLongValue);
        if (z2) {
            navigate = new ChaloNavigationRequest.GoBack(new PopUpToConfig.Scene(ChaloScenes.ConfirmSuperPassScreen, false));
        } else {
            navigate = new ChaloNavigationRequest.Navigate(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.InternalArgs.INSTANCE, null, null, 6);
        }
        superPassEnterUserDetailsViewModel.p.b(navigate);
        return Unit.f17538a;
    }

    public static BaseTextFieldUIState.ClickableTextFieldUIState t(String str, String str2, Function0 function0) {
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(function0);
        UITextStyle uITextStyle = UITextStyle.DisplayMedium;
        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
        ChaloColorToken.TextFieldIndicator textFieldIndicator = ChaloColorToken.TextFieldIndicator.f9859a;
        UITextFieldColors uITextFieldColors = new UITextFieldColors(black_87, black_87, null, null, null, null, textFieldIndicator, textFieldIndicator, textFieldIndicator, null, null, null, 4187128);
        return new BaseTextFieldUIState.ClickableTextFieldUIState(str, uiEventHandler$Companion$fromLambda$1A, uITextStyle, str2 != null ? new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState(str2, UITextStyle.BodyLarge, ChaloColorToken.Black_40.f9764a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)) : null, null, null, false, new UIKeyboardOption(UIKeyboardCapitalization.Words, null, null, 6), null, uITextFieldColors, 0.0f, 57072);
    }

    public static BaseTextFieldUIState.TextFieldUIState y(String str, Function1 function1, String str2, ChaloColorToken chaloColorToken, ChaloColorToken chaloColorToken2) {
        TextFieldEventHandlerHelper$basic$3 textFieldEventHandlerHelper$basic$3B = TextFieldEventHandlerHelper.b(2, function1, null);
        UITextStyle uITextStyle = UITextStyle.DisplayMedium;
        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
        UITextFieldColors uITextFieldColors = new UITextFieldColors(black_87, black_87, null, null, null, null, chaloColorToken2, chaloColorToken, null, null, null, null, 4191224);
        return new BaseTextFieldUIState.TextFieldUIState(str, textFieldEventHandlerHelper$basic$3B, uITextStyle, str2 != null ? new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState(str2, UITextStyle.BodyLarge, ChaloColorToken.Black_40.f9764a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)) : null, null, null, false, new UIKeyboardOption(UIKeyboardCapitalization.Words, null, null, 6), 0, null, uITextFieldColors, 0.0f, 97228);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState, ContinuationImpl continuationImpl) {
        SuperPassEnterUserDetailsViewModel$fieldsSectionForOnlyName$1 superPassEnterUserDetailsViewModel$fieldsSectionForOnlyName$1;
        TextUIState textUIState;
        SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState2;
        if (continuationImpl instanceof SuperPassEnterUserDetailsViewModel$fieldsSectionForOnlyName$1) {
            superPassEnterUserDetailsViewModel$fieldsSectionForOnlyName$1 = (SuperPassEnterUserDetailsViewModel$fieldsSectionForOnlyName$1) continuationImpl;
            int i = superPassEnterUserDetailsViewModel$fieldsSectionForOnlyName$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassEnterUserDetailsViewModel$fieldsSectionForOnlyName$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassEnterUserDetailsViewModel$fieldsSectionForOnlyName$1 = new SuperPassEnterUserDetailsViewModel$fieldsSectionForOnlyName$1(this, continuationImpl);
            }
        } else {
            superPassEnterUserDetailsViewModel$fieldsSectionForOnlyName$1 = new SuperPassEnterUserDetailsViewModel$fieldsSectionForOnlyName$1(this, continuationImpl);
        }
        Object objC = superPassEnterUserDetailsViewModel$fieldsSectionForOnlyName$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassEnterUserDetailsViewModel$fieldsSectionForOnlyName$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            SuperPassBasicUserPurpose superPassBasicUserPurpose = superPassEnterUserDetailsDataState.f;
            superPassEnterUserDetailsViewModel$fieldsSectionForOnlyName$1.L$0 = superPassEnterUserDetailsDataState;
            superPassEnterUserDetailsViewModel$fieldsSectionForOnlyName$1.label = 1;
            objC = C(superPassBasicUserPurpose, superPassEnterUserDetailsViewModel$fieldsSectionForOnlyName$1);
            if (objC != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            superPassEnterUserDetailsDataState = (SuperPassEnterUserDetailsDataState) superPassEnterUserDetailsViewModel$fieldsSectionForOnlyName$1.L$0;
            ResultKt.b(objC);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TextUIState textUIState2 = (TextUIState) superPassEnterUserDetailsViewModel$fieldsSectionForOnlyName$1.L$1;
            superPassEnterUserDetailsDataState2 = (SuperPassEnterUserDetailsDataState) superPassEnterUserDetailsViewModel$fieldsSectionForOnlyName$1.L$0;
            ResultKt.b(objC);
            textUIState = textUIState2;
        }
        return CollectionsKt.R(new SuperPassBasicUserInfoSectionUIState(textUIState, (TextUIState) objC, CollectionsKt.R(y(superPassEnterUserDetailsDataState2.f8412a, new wf1(this, superPassEnterUserDetailsDataState2, 0), null, ChaloColorToken.OrangePrimary.f9835a, ChaloColorToken.Grey9E.f9803a)), null, 48));
        TextUIState textUIState3 = (TextUIState) objC;
        SuperPassBasicUserPurpose superPassBasicUserPurpose2 = superPassEnterUserDetailsDataState.f;
        superPassEnterUserDetailsViewModel$fieldsSectionForOnlyName$1.L$0 = superPassEnterUserDetailsDataState;
        superPassEnterUserDetailsViewModel$fieldsSectionForOnlyName$1.L$1 = textUIState3;
        superPassEnterUserDetailsViewModel$fieldsSectionForOnlyName$1.label = 2;
        Object objX = x(superPassBasicUserPurpose2, superPassEnterUserDetailsViewModel$fieldsSectionForOnlyName$1);
        if (objX != obj) {
            textUIState = textUIState3;
            objC = objX;
            superPassEnterUserDetailsDataState2 = superPassEnterUserDetailsDataState;
            return CollectionsKt.R(new SuperPassBasicUserInfoSectionUIState(textUIState, (TextUIState) objC, CollectionsKt.R(y(superPassEnterUserDetailsDataState2.f8412a, new wf1(this, superPassEnterUserDetailsDataState2, 0), null, ChaloColorToken.OrangePrimary.f9835a, ChaloColorToken.Grey9E.f9803a)), null, 48));
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r1 == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (r1 == r3) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(app.chalo.scenes.args.SuperPassBasicUserPurpose r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel$header$1
            if (r2 == 0) goto L17
            r2 = r1
            app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel$header$1 r2 = (app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel$header$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel$header$1 r2 = new app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel$header$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.label
            app.chalo.uistate.base.ChaloColorToken$Black_87 r8 = app.chalo.uistate.base.ChaloColorToken.Black_87.f9768a
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3c
            if (r4 == r6) goto L38
            if (r4 != r5) goto L30
            kotlin.ResultKt.b(r1)
            goto L67
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            kotlin.ResultKt.b(r1)
            goto L8c
        L3c:
            kotlin.ResultKt.b(r1)
            if (r20 == 0) goto La4
            int[] r1 = app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel.WhenMappings.f8428a
            int r4 = r20.ordinal()
            r1 = r1[r4]
            r4 = 0
            app.chalo.providers.stringprovider.StringProvider r7 = r0.o
            if (r1 == r6) goto L7f
            if (r1 == r5) goto L5a
            r6 = 3
            if (r1 != r6) goto L54
            goto L5a
        L54:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L5a:
            app.chalo.providers.stringprovider.StringEnum r1 = app.chalo.providers.stringprovider.StringEnum.SUPER_PASS_ENTER_USER_NAME_FRAGMENT_TITLE
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r2.label = r5
            java.lang.Object r1 = r7.b(r1, r4, r2)
            if (r1 != r3) goto L67
            goto L8b
        L67:
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            app.chalo.uistate.text.UITextStyle r7 = app.chalo.uistate.text.UITextStyle.DisplayMedium
            app.chalo.uistate.text.TextUIState$ChaloTextUIState r5 = new app.chalo.uistate.text.TextUIState$ChaloTextUIState
            r17 = 0
            r18 = 8184(0x1ff8, float:1.1468E-41)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r5
        L7f:
            app.chalo.providers.stringprovider.StringEnum r1 = app.chalo.providers.stringprovider.StringEnum.BASIC_USER_DETAILS_FRAGMENT_TITLE
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r2.label = r6
            java.lang.Object r1 = r7.b(r1, r4, r2)
            if (r1 != r3) goto L8c
        L8b:
            return r3
        L8c:
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            app.chalo.uistate.text.UITextStyle r7 = app.chalo.uistate.text.UITextStyle.DisplayMedium
            app.chalo.uistate.text.TextUIState$ChaloTextUIState r5 = new app.chalo.uistate.text.TextUIState$ChaloTextUIState
            r17 = 0
            r18 = 8184(0x1ff8, float:1.1468E-41)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r5
        La4:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel.C(app.chalo.scenes.args.SuperPassBasicUserPurpose, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void D(SuperPassEnterUserDetailsIntent intent) {
        MutableStateFlow mutableStateFlow;
        Object value;
        SuperPassEnterUserDetailsDataState it;
        Intrinsics.i(intent, "intent");
        o(intent);
        boolean z = intent instanceof SuperPassEnterUserDetailsIntent.InitializationIntent;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new SuperPassEnterUserDetailsViewModel$handleInitializationIntent$1(this, (SuperPassEnterUserDetailsIntent.InitializationIntent) intent, null), 3);
            return;
        }
        if (intent.equals(SuperPassEnterUserDetailsIntent.NextBtnClickIntent.f8419a)) {
            BuildersKt.d(contextScope, null, null, new SuperPassEnterUserDetailsViewModel$handleNextBtnClickIntent$1(this, null), 3);
            return;
        }
        if (intent instanceof SuperPassEnterUserDetailsIntent.FieldUpdatedIntent) {
            BuildersKt.d(contextScope, null, null, new SuperPassEnterUserDetailsViewModel$handleFieldUpdatedIntent$1((SuperPassEnterUserDetailsIntent.FieldUpdatedIntent) intent, this, null), 3);
            return;
        }
        if (intent.equals(SuperPassEnterUserDetailsIntent.GenderSelectionDialogClickedIntent.f8417a)) {
            BuildersKt.d(contextScope, null, null, new SuperPassEnterUserDetailsViewModel$handleGenderSelectionDialogClickedIntent$1(this, null), 3);
            return;
        }
        if (intent.equals(SuperPassEnterUserDetailsIntent.DismissDialogIntent.f8414a)) {
            do {
                mutableStateFlow = this.e;
                value = mutableStateFlow.getValue();
                it = (SuperPassEnterUserDetailsDataState) value;
                Intrinsics.i(it, "it");
            } while (!mutableStateFlow.c(value, SuperPassEnterUserDetailsDataState.a(it, null, null, null, null, false, null, null, 63)));
            return;
        }
        if (intent.equals(SuperPassEnterUserDetailsIntent.DobFieldClickedIntent.f8415a)) {
            BuildersKt.d(contextScope, null, null, new SuperPassEnterUserDetailsViewModel$handleDobFieldClickedIntent$1(this, null), 3);
        } else {
            if (!intent.equals(SuperPassEnterUserDetailsIntent.PassStartTimeFieldClickedIntent.f8420a)) {
                throw new NoWhenBranchMatchedException();
            }
            BuildersKt.d(contextScope, null, null, new SuperPassEnterUserDetailsViewModel$handlePassStartTimeFieldClickedIntent$1(this, null), 3);
        }
    }

    @Override // app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent
    public final /* bridge */ /* synthetic */ Object a(SuperPassPurchaseSharedState superPassPurchaseSharedState, Object obj, SuspendLambda suspendLambda) {
        return u((SuperPassEnterUserDetailsDataState) obj, suspendLambda);
    }

    @Override // app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent
    public final Object m() {
        SuperPassEnterUserDetailsRestoredState superPassEnterUserDetailsRestoredState = (SuperPassEnterUserDetailsRestoredState) this.f8402a.getB().a("superPassEnterUserDetailsStateKeeperKey", SuperPassEnterUserDetailsRestoredState.INSTANCE.serializer());
        return superPassEnterUserDetailsRestoredState != null ? new SuperPassEnterUserDetailsDataState(superPassEnterUserDetailsRestoredState.f8421a, superPassEnterUserDetailsRestoredState.b, superPassEnterUserDetailsRestoredState.c, superPassEnterUserDetailsRestoredState.d, superPassEnterUserDetailsRestoredState.e, superPassEnterUserDetailsRestoredState.f, null) : new SuperPassEnterUserDetailsDataState();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006f A[PHI: r1 r3 r12 r13 r14
      0x006f: PHI (r1v19 java.lang.Object) = (r1v15 java.lang.Object), (r1v1 java.lang.Object) binds: [B:58:0x016f, B:18:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r3v21 java.util.List) = (r3v19 java.util.List), (r3v29 java.util.List) binds: [B:58:0x016f, B:18:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r12v3 app.chalo.uistate.button.ButtonUIState) = (r12v2 app.chalo.uistate.button.ButtonUIState), (r12v5 app.chalo.uistate.button.ButtonUIState) binds: [B:58:0x016f, B:18:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r13v3 app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsDataState) = 
      (r13v2 app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsDataState)
      (r13v4 app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsDataState)
     binds: [B:58:0x016f, B:18:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r14v2 app.chalo.uistate.toolbar.ToolbarUIState) = (r14v1 app.chalo.uistate.toolbar.ToolbarUIState), (r14v3 app.chalo.uistate.toolbar.ToolbarUIState) binds: [B:58:0x016f, B:18:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x013a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0158  */
    /* JADX WARN: Code duplicated, block: B:49:0x015b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0193  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object u(SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState, ContinuationImpl continuationImpl) {
        SuperPassEnterUserDetailsViewModel$convertToUiState$1 superPassEnterUserDetailsViewModel$convertToUiState$1;
        Object objZ;
        ToolbarUIState toolbarUIState;
        ButtonUIStateFactory buttonUIStateFactory;
        List list;
        ToolbarUIState toolbarUIState2;
        ButtonUIState buttonUIStateG;
        SuperPassEnterUserDetailsViewModel$convertToUiState$3 superPassEnterUserDetailsViewModel$convertToUiState$3;
        SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState2;
        ToolbarUIState toolbarUIState3;
        SuperPassBasicDetailsDialogType superPassBasicDetailsDialogType;
        List list2;
        Object objA;
        List list3;
        GenderSelectionDialogUIState genderSelectionDialogUIState;
        List list4;
        GenderSelectionDialogUIState genderSelectionDialogUIState2;
        ButtonUIState buttonUIState;
        ToolbarUIState toolbarUIState4;
        SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState3 = superPassEnterUserDetailsDataState;
        if (continuationImpl instanceof SuperPassEnterUserDetailsViewModel$convertToUiState$1) {
            superPassEnterUserDetailsViewModel$convertToUiState$1 = (SuperPassEnterUserDetailsViewModel$convertToUiState$1) continuationImpl;
            int i = superPassEnterUserDetailsViewModel$convertToUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassEnterUserDetailsViewModel$convertToUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassEnterUserDetailsViewModel$convertToUiState$1 = new SuperPassEnterUserDetailsViewModel$convertToUiState$1(this, continuationImpl);
            }
        } else {
            superPassEnterUserDetailsViewModel$convertToUiState$1 = new SuperPassEnterUserDetailsViewModel$convertToUiState$1(this, continuationImpl);
        }
        SuperPassEnterUserDetailsViewModel$convertToUiState$1 superPassEnterUserDetailsViewModel$convertToUiState$2 = superPassEnterUserDetailsViewModel$convertToUiState$1;
        Object objW = superPassEnterUserDetailsViewModel$convertToUiState$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassEnterUserDetailsViewModel$convertToUiState$2.label;
        if (i2 == 0) {
            ResultKt.b(objW);
            ToolbarUIState toolbarUIState5 = (ToolbarUIState) this.v.getValue();
            superPassEnterUserDetailsViewModel$convertToUiState$2.L$0 = superPassEnterUserDetailsDataState3;
            superPassEnterUserDetailsViewModel$convertToUiState$2.L$1 = toolbarUIState5;
            superPassEnterUserDetailsViewModel$convertToUiState$2.label = 1;
            SuperPassBasicUserPurpose superPassBasicUserPurpose = superPassEnterUserDetailsDataState3.f;
            int i3 = superPassBasicUserPurpose == null ? -1 : WhenMappings.f8428a[superPassBasicUserPurpose.ordinal()];
            if (i3 == -1) {
                objZ = EmptyList.f17557a;
            } else if (i3 == 1) {
                objZ = z(superPassEnterUserDetailsDataState3, superPassEnterUserDetailsViewModel$convertToUiState$2);
            } else {
                if (i3 != 2 && i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                objZ = B(superPassEnterUserDetailsDataState3, superPassEnterUserDetailsViewModel$convertToUiState$2);
            }
            if (objZ != obj) {
                Object obj2 = objZ;
                toolbarUIState = toolbarUIState5;
                objW = obj2;
            }
            return obj;
        }
        if (i2 == 1) {
            ToolbarUIState toolbarUIState6 = (ToolbarUIState) superPassEnterUserDetailsViewModel$convertToUiState$2.L$1;
            SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState4 = (SuperPassEnterUserDetailsDataState) superPassEnterUserDetailsViewModel$convertToUiState$2.L$0;
            ResultKt.b(objW);
            toolbarUIState = toolbarUIState6;
            superPassEnterUserDetailsDataState3 = superPassEnterUserDetailsDataState4;
        } else {
            if (i2 == 2) {
                ButtonUIStateFactory buttonUIStateFactory2 = (ButtonUIStateFactory) superPassEnterUserDetailsViewModel$convertToUiState$2.L$3;
                List list5 = (List) superPassEnterUserDetailsViewModel$convertToUiState$2.L$2;
                toolbarUIState2 = (ToolbarUIState) superPassEnterUserDetailsViewModel$convertToUiState$2.L$1;
                SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState5 = (SuperPassEnterUserDetailsDataState) superPassEnterUserDetailsViewModel$convertToUiState$2.L$0;
                ResultKt.b(objW);
                buttonUIStateFactory = buttonUIStateFactory2;
                list = list5;
                superPassEnterUserDetailsDataState3 = superPassEnterUserDetailsDataState5;
                buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, (String) objW, new xf1(this, 0), null, null, superPassEnterUserDetailsDataState3.e, 0.0f, 44);
                superPassEnterUserDetailsDataState2 = superPassEnterUserDetailsDataState3;
                toolbarUIState3 = toolbarUIState2;
                superPassEnterUserDetailsViewModel$convertToUiState$3 = new SuperPassEnterUserDetailsViewModel$convertToUiState$3(1, this, SuperPassEnterUserDetailsViewModel.class, "processIntent", "processIntent(Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent;)V", 0);
                superPassEnterUserDetailsViewModel$convertToUiState$2.L$0 = superPassEnterUserDetailsDataState2;
                superPassEnterUserDetailsViewModel$convertToUiState$2.L$1 = toolbarUIState3;
                superPassEnterUserDetailsViewModel$convertToUiState$2.L$2 = list;
                superPassEnterUserDetailsViewModel$convertToUiState$2.L$3 = buttonUIStateG;
                superPassEnterUserDetailsViewModel$convertToUiState$2.label = 3;
                superPassBasicDetailsDialogType = superPassEnterUserDetailsDataState2.g;
                if (superPassBasicDetailsDialogType instanceof SuperPassBasicDetailsDialogType.GenderSelection) {
                    SuperPassBasicDetailsDialogType.GenderSelection genderSelection = (SuperPassBasicDetailsDialogType.GenderSelection) superPassBasicDetailsDialogType;
                    list2 = list;
                    objA = GenderSelectionDialogUIStateFactory.f10001a.a(genderSelection.f8408a, genderSelection.b, new yf1(superPassEnterUserDetailsViewModel$convertToUiState$3, superPassEnterUserDetailsDataState2, 0), new xf1(this, 1), superPassEnterUserDetailsViewModel$convertToUiState$2);
                    if (objA != obj) {
                        objA = (GenderSelectionDialogUIState) objA;
                    }
                } else {
                    list2 = list;
                    if ((superPassBasicDetailsDialogType instanceof SuperPassBasicDetailsDialogType.DobDatePicker) && !(superPassBasicDetailsDialogType instanceof SuperPassBasicDetailsDialogType.PassStartTimeDatePicker) && superPassBasicDetailsDialogType != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objA = null;
                }
                objW = objA;
                if (objW != obj) {
                    list3 = list2;
                    genderSelectionDialogUIState = (GenderSelectionDialogUIState) objW;
                    Function1 superPassEnterUserDetailsViewModel$convertToUiState$4 = new SuperPassEnterUserDetailsViewModel$convertToUiState$4(1, this, SuperPassEnterUserDetailsViewModel.class, "processIntent", "processIntent(Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent;)V", 0);
                    superPassEnterUserDetailsViewModel$convertToUiState$2.L$0 = toolbarUIState3;
                    superPassEnterUserDetailsViewModel$convertToUiState$2.L$1 = list3;
                    superPassEnterUserDetailsViewModel$convertToUiState$2.L$2 = buttonUIStateG;
                    superPassEnterUserDetailsViewModel$convertToUiState$2.L$3 = genderSelectionDialogUIState;
                    superPassEnterUserDetailsViewModel$convertToUiState$2.label = 4;
                    objW = w(superPassEnterUserDetailsDataState2, superPassEnterUserDetailsViewModel$convertToUiState$4, superPassEnterUserDetailsViewModel$convertToUiState$2);
                    if (objW != obj) {
                        list4 = list3;
                        genderSelectionDialogUIState2 = genderSelectionDialogUIState;
                        buttonUIState = buttonUIStateG;
                        toolbarUIState4 = toolbarUIState3;
                    }
                }
                return obj;
            }
            if (i2 == 3) {
                ButtonUIState buttonUIState2 = (ButtonUIState) superPassEnterUserDetailsViewModel$convertToUiState$2.L$3;
                list2 = (List) superPassEnterUserDetailsViewModel$convertToUiState$2.L$2;
                ToolbarUIState toolbarUIState7 = (ToolbarUIState) superPassEnterUserDetailsViewModel$convertToUiState$2.L$1;
                SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState6 = (SuperPassEnterUserDetailsDataState) superPassEnterUserDetailsViewModel$convertToUiState$2.L$0;
                ResultKt.b(objW);
                buttonUIStateG = buttonUIState2;
                toolbarUIState3 = toolbarUIState7;
                superPassEnterUserDetailsDataState2 = superPassEnterUserDetailsDataState6;
                list3 = list2;
                genderSelectionDialogUIState = (GenderSelectionDialogUIState) objW;
                Function1 superPassEnterUserDetailsViewModel$convertToUiState$5 = new SuperPassEnterUserDetailsViewModel$convertToUiState$4(1, this, SuperPassEnterUserDetailsViewModel.class, "processIntent", "processIntent(Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent;)V", 0);
                superPassEnterUserDetailsViewModel$convertToUiState$2.L$0 = toolbarUIState3;
                superPassEnterUserDetailsViewModel$convertToUiState$2.L$1 = list3;
                superPassEnterUserDetailsViewModel$convertToUiState$2.L$2 = buttonUIStateG;
                superPassEnterUserDetailsViewModel$convertToUiState$2.L$3 = genderSelectionDialogUIState;
                superPassEnterUserDetailsViewModel$convertToUiState$2.label = 4;
                objW = w(superPassEnterUserDetailsDataState2, superPassEnterUserDetailsViewModel$convertToUiState$5, superPassEnterUserDetailsViewModel$convertToUiState$2);
                if (objW != obj) {
                    list4 = list3;
                    genderSelectionDialogUIState2 = genderSelectionDialogUIState;
                    buttonUIState = buttonUIStateG;
                    toolbarUIState4 = toolbarUIState3;
                }
                return obj;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GenderSelectionDialogUIState genderSelectionDialogUIState3 = (GenderSelectionDialogUIState) superPassEnterUserDetailsViewModel$convertToUiState$2.L$3;
            ButtonUIState buttonUIState3 = (ButtonUIState) superPassEnterUserDetailsViewModel$convertToUiState$2.L$2;
            List list6 = (List) superPassEnterUserDetailsViewModel$convertToUiState$2.L$1;
            ToolbarUIState toolbarUIState8 = (ToolbarUIState) superPassEnterUserDetailsViewModel$convertToUiState$2.L$0;
            ResultKt.b(objW);
            genderSelectionDialogUIState2 = genderSelectionDialogUIState3;
            buttonUIState = buttonUIState3;
            list4 = list6;
            toolbarUIState4 = toolbarUIState8;
        }
        return new SuperPassEnterUserDetailsUIState(toolbarUIState4, list4, buttonUIState, genderSelectionDialogUIState2, (DatePickerUIState) objW);
        List list7 = (List) objW;
        superPassEnterUserDetailsViewModel$convertToUiState$2.L$0 = superPassEnterUserDetailsDataState3;
        superPassEnterUserDetailsViewModel$convertToUiState$2.L$1 = toolbarUIState;
        superPassEnterUserDetailsViewModel$convertToUiState$2.L$2 = list7;
        ButtonUIStateFactory buttonUIStateFactory3 = ButtonUIStateFactory.f9921a;
        superPassEnterUserDetailsViewModel$convertToUiState$2.L$3 = buttonUIStateFactory3;
        superPassEnterUserDetailsViewModel$convertToUiState$2.label = 2;
        Object objB = this.o.b(StringEnum.NEXT_CAPS, new Object[0], superPassEnterUserDetailsViewModel$convertToUiState$2);
        if (objB != obj) {
            buttonUIStateFactory = buttonUIStateFactory3;
            list = list7;
            objW = objB;
            toolbarUIState2 = toolbarUIState;
            buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, (String) objW, new xf1(this, 0), null, null, superPassEnterUserDetailsDataState3.e, 0.0f, 44);
            superPassEnterUserDetailsDataState2 = superPassEnterUserDetailsDataState3;
            toolbarUIState3 = toolbarUIState2;
            superPassEnterUserDetailsViewModel$convertToUiState$3 = new SuperPassEnterUserDetailsViewModel$convertToUiState$3(1, this, SuperPassEnterUserDetailsViewModel.class, "processIntent", "processIntent(Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent;)V", 0);
            superPassEnterUserDetailsViewModel$convertToUiState$2.L$0 = superPassEnterUserDetailsDataState2;
            superPassEnterUserDetailsViewModel$convertToUiState$2.L$1 = toolbarUIState3;
            superPassEnterUserDetailsViewModel$convertToUiState$2.L$2 = list;
            superPassEnterUserDetailsViewModel$convertToUiState$2.L$3 = buttonUIStateG;
            superPassEnterUserDetailsViewModel$convertToUiState$2.label = 3;
            superPassBasicDetailsDialogType = superPassEnterUserDetailsDataState2.g;
            if (superPassBasicDetailsDialogType instanceof SuperPassBasicDetailsDialogType.GenderSelection) {
                SuperPassBasicDetailsDialogType.GenderSelection genderSelection2 = (SuperPassBasicDetailsDialogType.GenderSelection) superPassBasicDetailsDialogType;
                list2 = list;
                objA = GenderSelectionDialogUIStateFactory.f10001a.a(genderSelection2.f8408a, genderSelection2.b, new yf1(superPassEnterUserDetailsViewModel$convertToUiState$3, superPassEnterUserDetailsDataState2, 0), new xf1(this, 1), superPassEnterUserDetailsViewModel$convertToUiState$2);
                if (objA != obj) {
                    objA = (GenderSelectionDialogUIState) objA;
                }
            } else {
                list2 = list;
                if (superPassBasicDetailsDialogType instanceof SuperPassBasicDetailsDialogType.DobDatePicker) {
                }
                objA = null;
            }
            objW = objA;
            if (objW != obj) {
                list3 = list2;
                genderSelectionDialogUIState = (GenderSelectionDialogUIState) objW;
                Function1 superPassEnterUserDetailsViewModel$convertToUiState$6 = new SuperPassEnterUserDetailsViewModel$convertToUiState$4(1, this, SuperPassEnterUserDetailsViewModel.class, "processIntent", "processIntent(Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent;)V", 0);
                superPassEnterUserDetailsViewModel$convertToUiState$2.L$0 = toolbarUIState3;
                superPassEnterUserDetailsViewModel$convertToUiState$2.L$1 = list3;
                superPassEnterUserDetailsViewModel$convertToUiState$2.L$2 = buttonUIStateG;
                superPassEnterUserDetailsViewModel$convertToUiState$2.L$3 = genderSelectionDialogUIState;
                superPassEnterUserDetailsViewModel$convertToUiState$2.label = 4;
                objW = w(superPassEnterUserDetailsDataState2, superPassEnterUserDetailsViewModel$convertToUiState$6, superPassEnterUserDetailsViewModel$convertToUiState$2);
                if (objW != obj) {
                    list4 = list3;
                    genderSelectionDialogUIState2 = genderSelectionDialogUIState;
                    buttonUIState = buttonUIStateG;
                    toolbarUIState4 = toolbarUIState3;
                    return new SuperPassEnterUserDetailsUIState(toolbarUIState4, list4, buttonUIState, genderSelectionDialogUIState2, (DatePickerUIState) objW);
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0111 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ce, code lost:
    
        if (r3 == r4) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsDataState r19, kotlin.jvm.functions.Function1 r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel.w(app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsDataState, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r1 == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (r1 == r3) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(app.chalo.scenes.args.SuperPassBasicUserPurpose r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel$description$1
            if (r2 == 0) goto L17
            r2 = r1
            app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel$description$1 r2 = (app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel$description$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel$description$1 r2 = new app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel$description$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.label
            app.chalo.uistate.base.ChaloColorToken$Black_70 r8 = app.chalo.uistate.base.ChaloColorToken.Black_70.f9767a
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3c
            if (r4 == r6) goto L38
            if (r4 != r5) goto L30
            kotlin.ResultKt.b(r1)
            goto L67
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            kotlin.ResultKt.b(r1)
            goto L8c
        L3c:
            kotlin.ResultKt.b(r1)
            if (r20 == 0) goto La4
            int[] r1 = app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel.WhenMappings.f8428a
            int r4 = r20.ordinal()
            r1 = r1[r4]
            r4 = 0
            app.chalo.providers.stringprovider.StringProvider r7 = r0.o
            if (r1 == r6) goto L7f
            if (r1 == r5) goto L5a
            r6 = 3
            if (r1 != r6) goto L54
            goto L5a
        L54:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L5a:
            app.chalo.providers.stringprovider.StringEnum r1 = app.chalo.providers.stringprovider.StringEnum.SUPER_PASS_ENTER_USER_NAME_FRAGMENT_SUBTITLE
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r2.label = r5
            java.lang.Object r1 = r7.b(r1, r4, r2)
            if (r1 != r3) goto L67
            goto L8b
        L67:
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            app.chalo.uistate.text.UITextStyle r7 = app.chalo.uistate.text.UITextStyle.BodyMedium
            app.chalo.uistate.text.TextUIState$ChaloTextUIState r5 = new app.chalo.uistate.text.TextUIState$ChaloTextUIState
            r17 = 0
            r18 = 8184(0x1ff8, float:1.1468E-41)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r5
        L7f:
            app.chalo.providers.stringprovider.StringEnum r1 = app.chalo.providers.stringprovider.StringEnum.BASIC_USER_DETAILS_FRAGMENT_SUBTITLE
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r2.label = r6
            java.lang.Object r1 = r7.b(r1, r4, r2)
            if (r1 != r3) goto L8c
        L8b:
            return r3
        L8c:
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            app.chalo.uistate.text.UITextStyle r7 = app.chalo.uistate.text.UITextStyle.BodyMedium
            app.chalo.uistate.text.TextUIState$ChaloTextUIState r5 = new app.chalo.uistate.text.TextUIState$ChaloTextUIState
            r17 = 0
            r18 = 8184(0x1ff8, float:1.1468E-41)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r5
        La4:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel.x(app.chalo.scenes.args.SuperPassBasicUserPurpose, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x012e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0143  */
    /* JADX WARN: Code duplicated, block: B:30:0x0176  */
    /* JADX WARN: Code duplicated, block: B:34:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:37:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:38:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:41:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:43:0x0207  */
    /* JADX WARN: Code duplicated, block: B:47:0x0234  */
    /* JADX WARN: Code duplicated, block: B:50:0x026a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0277  */
    /* JADX WARN: Code duplicated, block: B:58:0x029f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object z(SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState, ContinuationImpl continuationImpl) {
        SuperPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1 superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1;
        TextUIState textUIState;
        Object objX;
        SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState2;
        TextUIState textUIState2;
        TextUIState textUIState3;
        BaseTextFieldUIState[] baseTextFieldUIStateArr;
        String str;
        wf1 wf1Var;
        Object objB;
        TextUIState textUIState4;
        String str2;
        SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState3;
        BaseTextFieldUIState[] baseTextFieldUIStateArr2;
        Function1 function1;
        int i;
        TextUIState textUIState5;
        BaseTextFieldUIState[] baseTextFieldUIStateArr3;
        SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel;
        int i2;
        Object objB2;
        SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel2;
        Object obj;
        BaseTextFieldUIState[] baseTextFieldUIStateArr4;
        int i3;
        String str3;
        xf1 xf1Var;
        String str4;
        Function0 function0;
        TextUIState textUIState6;
        SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel3;
        Long l;
        String strG;
        Function0 xf1Var2;
        SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel4;
        SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel5;
        TextUIState textUIState7;
        BaseTextFieldUIState[] baseTextFieldUIStateArr5;
        BaseTextFieldUIState[] baseTextFieldUIStateArr6;
        String str5;
        int i4;
        SuperPassBasicUserInfoSectionUIState superPassBasicUserInfoSectionUIState;
        Long l2;
        String str6;
        Function0 xf1Var3;
        Object objB3;
        SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel6;
        String str7;
        String strG2;
        SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState4 = superPassEnterUserDetailsDataState;
        if (continuationImpl instanceof SuperPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1) {
            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1 = (SuperPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1) continuationImpl;
            int i5 = superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = i5 - Integer.MIN_VALUE;
            } else {
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1 = new SuperPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1(this, continuationImpl);
            }
        } else {
            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1 = new SuperPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1(this, continuationImpl);
        }
        Object objC = superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label;
        String str8 = "";
        TimeUtilsContract timeUtilsContract = this.q;
        StringProvider stringProvider = this.o;
        switch (i6) {
            case 0:
                ResultKt.b(objC);
                SuperPassBasicUserPurpose superPassBasicUserPurpose = superPassEnterUserDetailsDataState4.f;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassEnterUserDetailsDataState4;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 1;
                objC = C(superPassBasicUserPurpose, superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                if (objC != coroutineSingletons) {
                    textUIState = (TextUIState) objC;
                    SuperPassBasicUserPurpose superPassBasicUserPurpose2 = superPassEnterUserDetailsDataState4.f;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassEnterUserDetailsDataState4;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = textUIState;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 2;
                    objX = x(superPassBasicUserPurpose2, superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                    if (objX == coroutineSingletons) {
                        superPassEnterUserDetailsDataState2 = superPassEnterUserDetailsDataState4;
                        textUIState2 = textUIState;
                        objC = objX;
                        textUIState3 = (TextUIState) objC;
                        baseTextFieldUIStateArr = new BaseTextFieldUIState[3];
                        str = superPassEnterUserDetailsDataState2.f8412a;
                        wf1Var = new wf1(this, superPassEnterUserDetailsDataState2, 1);
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassEnterUserDetailsDataState2;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = baseTextFieldUIStateArr;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = textUIState2;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = textUIState3;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = baseTextFieldUIStateArr;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = this;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = str;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = wf1Var;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.I$0 = 0;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 3;
                        objB = stringProvider.b(StringEnum.FULL_NAME, new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                        if (objB != coroutineSingletons) {
                            textUIState4 = textUIState3;
                            objC = objB;
                            str2 = str;
                            superPassEnterUserDetailsDataState3 = superPassEnterUserDetailsDataState2;
                            baseTextFieldUIStateArr2 = baseTextFieldUIStateArr;
                            function1 = wf1Var;
                            i = 0;
                            textUIState5 = textUIState2;
                            baseTextFieldUIStateArr3 = baseTextFieldUIStateArr2;
                            superPassEnterUserDetailsViewModel = this;
                            superPassEnterUserDetailsViewModel.getClass();
                            ChaloColorToken.TextFieldIndicator textFieldIndicator = ChaloColorToken.TextFieldIndicator.f9859a;
                            baseTextFieldUIStateArr3[i] = y(str2, function1, (String) objC, textFieldIndicator, textFieldIndicator);
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassEnterUserDetailsDataState3;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = baseTextFieldUIStateArr2;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = textUIState5;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = textUIState4;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = baseTextFieldUIStateArr2;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = this;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = null;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = null;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.I$0 = 1;
                            i2 = 4;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 4;
                            objB2 = stringProvider.b(GenderKt.a(superPassEnterUserDetailsDataState3.b), new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                            if (objB2 == coroutineSingletons) {
                                superPassEnterUserDetailsViewModel2 = this;
                                obj = objB2;
                                baseTextFieldUIStateArr4 = baseTextFieldUIStateArr2;
                                i3 = 1;
                                str3 = (String) obj;
                                xf1Var = new xf1(this, i2);
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassEnterUserDetailsDataState3;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = baseTextFieldUIStateArr2;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = textUIState5;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = textUIState4;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = baseTextFieldUIStateArr4;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = superPassEnterUserDetailsViewModel2;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = str3;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = xf1Var;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.I$0 = i3;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 5;
                                objC = stringProvider.b(StringEnum.PROFILE_HINT_GENDER_PASS, new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                                if (objC != coroutineSingletons) {
                                    SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel7 = superPassEnterUserDetailsViewModel2;
                                    str4 = str3;
                                    function0 = xf1Var;
                                    textUIState6 = textUIState5;
                                    superPassEnterUserDetailsViewModel3 = superPassEnterUserDetailsViewModel7;
                                    superPassEnterUserDetailsViewModel3.getClass();
                                    baseTextFieldUIStateArr4[i3] = t(str4, (String) objC, function0);
                                    l = superPassEnterUserDetailsDataState3.c;
                                    if (l != null || (strG = timeUtilsContract.g(l.longValue())) == null) {
                                        strG = str8;
                                    }
                                    superPassEnterUserDetailsViewModel4 = this;
                                    xf1Var2 = new xf1(superPassEnterUserDetailsViewModel4, 5);
                                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassEnterUserDetailsDataState3;
                                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = baseTextFieldUIStateArr2;
                                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = textUIState6;
                                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = textUIState4;
                                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = baseTextFieldUIStateArr2;
                                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = superPassEnterUserDetailsViewModel4;
                                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = strG;
                                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = xf1Var2;
                                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.I$0 = 2;
                                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 6;
                                    objC = stringProvider.b(StringEnum.PROFILE_HINT_DOB_PASS, new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                                    if (objC != coroutineSingletons) {
                                        superPassEnterUserDetailsViewModel5 = superPassEnterUserDetailsViewModel4;
                                        textUIState7 = textUIState4;
                                        baseTextFieldUIStateArr5 = baseTextFieldUIStateArr2;
                                        baseTextFieldUIStateArr6 = baseTextFieldUIStateArr5;
                                        str5 = strG;
                                        i4 = 2;
                                        TextUIState textUIState8 = textUIState6;
                                        superPassEnterUserDetailsViewModel5.getClass();
                                        baseTextFieldUIStateArr5[i4] = t(str5, (String) objC, xf1Var2);
                                        superPassBasicUserInfoSectionUIState = new SuperPassBasicUserInfoSectionUIState(textUIState8, textUIState7, CollectionsKt.S(baseTextFieldUIStateArr6), new DividerUIState(ChaloThemeHelper.a().f, ChaloColorToken.UnselectedDot.f9866a, null, 4), 32);
                                        l2 = superPassEnterUserDetailsDataState3.d;
                                        if (l2 != null || (strG2 = timeUtilsContract.g(l2.longValue())) == null) {
                                            str6 = str8;
                                        } else {
                                            str6 = strG2;
                                        }
                                        xf1Var3 = new xf1(superPassEnterUserDetailsViewModel4, 6);
                                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassBasicUserInfoSectionUIState;
                                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = superPassEnterUserDetailsViewModel4;
                                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = str6;
                                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = xf1Var3;
                                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = null;
                                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = null;
                                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = null;
                                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = null;
                                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 7;
                                        objB3 = stringProvider.b(StringEnum.PROFILE_HINT_PASS_START_DATE, new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                                        if (objB3 != coroutineSingletons) {
                                            superPassEnterUserDetailsViewModel6 = superPassEnterUserDetailsViewModel4;
                                            str7 = str6;
                                            superPassEnterUserDetailsViewModel6.getClass();
                                            return CollectionsKt.S(superPassBasicUserInfoSectionUIState, new SuperPassBasicUserInfoSectionUIState(null, null, CollectionsKt.R(t(str7, (String) objB3, xf1Var3)), null, 48));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                return coroutineSingletons;
            case 1:
                superPassEnterUserDetailsDataState4 = (SuperPassEnterUserDetailsDataState) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0;
                ResultKt.b(objC);
                textUIState = (TextUIState) objC;
                SuperPassBasicUserPurpose superPassBasicUserPurpose3 = superPassEnterUserDetailsDataState4.f;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassEnterUserDetailsDataState4;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = textUIState;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 2;
                objX = x(superPassBasicUserPurpose3, superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                if (objX == coroutineSingletons) {
                    superPassEnterUserDetailsDataState2 = superPassEnterUserDetailsDataState4;
                    textUIState2 = textUIState;
                    objC = objX;
                    textUIState3 = (TextUIState) objC;
                    baseTextFieldUIStateArr = new BaseTextFieldUIState[3];
                    str = superPassEnterUserDetailsDataState2.f8412a;
                    wf1Var = new wf1(this, superPassEnterUserDetailsDataState2, 1);
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassEnterUserDetailsDataState2;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = baseTextFieldUIStateArr;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = textUIState2;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = textUIState3;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = baseTextFieldUIStateArr;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = this;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = str;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = wf1Var;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.I$0 = 0;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 3;
                    objB = stringProvider.b(StringEnum.FULL_NAME, new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                    if (objB != coroutineSingletons) {
                        textUIState4 = textUIState3;
                        objC = objB;
                        str2 = str;
                        superPassEnterUserDetailsDataState3 = superPassEnterUserDetailsDataState2;
                        baseTextFieldUIStateArr2 = baseTextFieldUIStateArr;
                        function1 = wf1Var;
                        i = 0;
                        textUIState5 = textUIState2;
                        baseTextFieldUIStateArr3 = baseTextFieldUIStateArr2;
                        superPassEnterUserDetailsViewModel = this;
                        superPassEnterUserDetailsViewModel.getClass();
                        ChaloColorToken.TextFieldIndicator textFieldIndicator2 = ChaloColorToken.TextFieldIndicator.f9859a;
                        baseTextFieldUIStateArr3[i] = y(str2, function1, (String) objC, textFieldIndicator2, textFieldIndicator2);
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassEnterUserDetailsDataState3;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = baseTextFieldUIStateArr2;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = textUIState5;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = textUIState4;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = baseTextFieldUIStateArr2;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = this;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = null;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = null;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.I$0 = 1;
                        i2 = 4;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 4;
                        objB2 = stringProvider.b(GenderKt.a(superPassEnterUserDetailsDataState3.b), new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                        if (objB2 == coroutineSingletons) {
                            superPassEnterUserDetailsViewModel2 = this;
                            obj = objB2;
                            baseTextFieldUIStateArr4 = baseTextFieldUIStateArr2;
                            i3 = 1;
                            str3 = (String) obj;
                            xf1Var = new xf1(this, i2);
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassEnterUserDetailsDataState3;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = baseTextFieldUIStateArr2;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = textUIState5;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = textUIState4;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = baseTextFieldUIStateArr4;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = superPassEnterUserDetailsViewModel2;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = str3;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = xf1Var;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.I$0 = i3;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 5;
                            objC = stringProvider.b(StringEnum.PROFILE_HINT_GENDER_PASS, new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                            if (objC != coroutineSingletons) {
                                SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel8 = superPassEnterUserDetailsViewModel2;
                                str4 = str3;
                                function0 = xf1Var;
                                textUIState6 = textUIState5;
                                superPassEnterUserDetailsViewModel3 = superPassEnterUserDetailsViewModel8;
                                superPassEnterUserDetailsViewModel3.getClass();
                                baseTextFieldUIStateArr4[i3] = t(str4, (String) objC, function0);
                                l = superPassEnterUserDetailsDataState3.c;
                                if (l != null) {
                                    strG = str8;
                                } else {
                                    strG = str8;
                                }
                                superPassEnterUserDetailsViewModel4 = this;
                                xf1Var2 = new xf1(superPassEnterUserDetailsViewModel4, 5);
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassEnterUserDetailsDataState3;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = baseTextFieldUIStateArr2;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = textUIState6;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = textUIState4;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = baseTextFieldUIStateArr2;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = superPassEnterUserDetailsViewModel4;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = strG;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = xf1Var2;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.I$0 = 2;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 6;
                                objC = stringProvider.b(StringEnum.PROFILE_HINT_DOB_PASS, new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                                if (objC != coroutineSingletons) {
                                    superPassEnterUserDetailsViewModel5 = superPassEnterUserDetailsViewModel4;
                                    textUIState7 = textUIState4;
                                    baseTextFieldUIStateArr5 = baseTextFieldUIStateArr2;
                                    baseTextFieldUIStateArr6 = baseTextFieldUIStateArr5;
                                    str5 = strG;
                                    i4 = 2;
                                    TextUIState textUIState9 = textUIState6;
                                    superPassEnterUserDetailsViewModel5.getClass();
                                    baseTextFieldUIStateArr5[i4] = t(str5, (String) objC, xf1Var2);
                                    superPassBasicUserInfoSectionUIState = new SuperPassBasicUserInfoSectionUIState(textUIState9, textUIState7, CollectionsKt.S(baseTextFieldUIStateArr6), new DividerUIState(ChaloThemeHelper.a().f, ChaloColorToken.UnselectedDot.f9866a, null, 4), 32);
                                    l2 = superPassEnterUserDetailsDataState3.d;
                                    if (l2 != null) {
                                        str6 = str8;
                                    } else {
                                        str6 = str8;
                                    }
                                    xf1Var3 = new xf1(superPassEnterUserDetailsViewModel4, 6);
                                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassBasicUserInfoSectionUIState;
                                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = superPassEnterUserDetailsViewModel4;
                                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = str6;
                                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = xf1Var3;
                                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = null;
                                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = null;
                                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = null;
                                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = null;
                                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 7;
                                    objB3 = stringProvider.b(StringEnum.PROFILE_HINT_PASS_START_DATE, new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                                    if (objB3 != coroutineSingletons) {
                                        superPassEnterUserDetailsViewModel6 = superPassEnterUserDetailsViewModel4;
                                        str7 = str6;
                                        superPassEnterUserDetailsViewModel6.getClass();
                                        return CollectionsKt.S(superPassBasicUserInfoSectionUIState, new SuperPassBasicUserInfoSectionUIState(null, null, CollectionsKt.R(t(str7, (String) objB3, xf1Var3)), null, 48));
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                textUIState2 = (TextUIState) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1;
                superPassEnterUserDetailsDataState2 = (SuperPassEnterUserDetailsDataState) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0;
                ResultKt.b(objC);
                textUIState3 = (TextUIState) objC;
                baseTextFieldUIStateArr = new BaseTextFieldUIState[3];
                str = superPassEnterUserDetailsDataState2.f8412a;
                wf1Var = new wf1(this, superPassEnterUserDetailsDataState2, 1);
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassEnterUserDetailsDataState2;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = baseTextFieldUIStateArr;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = textUIState2;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = textUIState3;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = baseTextFieldUIStateArr;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = this;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = str;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = wf1Var;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.I$0 = 0;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 3;
                objB = stringProvider.b(StringEnum.FULL_NAME, new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                if (objB != coroutineSingletons) {
                    textUIState4 = textUIState3;
                    objC = objB;
                    str2 = str;
                    superPassEnterUserDetailsDataState3 = superPassEnterUserDetailsDataState2;
                    baseTextFieldUIStateArr2 = baseTextFieldUIStateArr;
                    function1 = wf1Var;
                    i = 0;
                    textUIState5 = textUIState2;
                    baseTextFieldUIStateArr3 = baseTextFieldUIStateArr2;
                    superPassEnterUserDetailsViewModel = this;
                    superPassEnterUserDetailsViewModel.getClass();
                    ChaloColorToken.TextFieldIndicator textFieldIndicator3 = ChaloColorToken.TextFieldIndicator.f9859a;
                    baseTextFieldUIStateArr3[i] = y(str2, function1, (String) objC, textFieldIndicator3, textFieldIndicator3);
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassEnterUserDetailsDataState3;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = baseTextFieldUIStateArr2;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = textUIState5;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = textUIState4;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = baseTextFieldUIStateArr2;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = this;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = null;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = null;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.I$0 = 1;
                    i2 = 4;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 4;
                    objB2 = stringProvider.b(GenderKt.a(superPassEnterUserDetailsDataState3.b), new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                    if (objB2 == coroutineSingletons) {
                        superPassEnterUserDetailsViewModel2 = this;
                        obj = objB2;
                        baseTextFieldUIStateArr4 = baseTextFieldUIStateArr2;
                        i3 = 1;
                        str3 = (String) obj;
                        xf1Var = new xf1(this, i2);
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassEnterUserDetailsDataState3;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = baseTextFieldUIStateArr2;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = textUIState5;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = textUIState4;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = baseTextFieldUIStateArr4;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = superPassEnterUserDetailsViewModel2;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = str3;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = xf1Var;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.I$0 = i3;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 5;
                        objC = stringProvider.b(StringEnum.PROFILE_HINT_GENDER_PASS, new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                        if (objC != coroutineSingletons) {
                            SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel9 = superPassEnterUserDetailsViewModel2;
                            str4 = str3;
                            function0 = xf1Var;
                            textUIState6 = textUIState5;
                            superPassEnterUserDetailsViewModel3 = superPassEnterUserDetailsViewModel9;
                            superPassEnterUserDetailsViewModel3.getClass();
                            baseTextFieldUIStateArr4[i3] = t(str4, (String) objC, function0);
                            l = superPassEnterUserDetailsDataState3.c;
                            if (l != null) {
                                strG = str8;
                            } else {
                                strG = str8;
                            }
                            superPassEnterUserDetailsViewModel4 = this;
                            xf1Var2 = new xf1(superPassEnterUserDetailsViewModel4, 5);
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassEnterUserDetailsDataState3;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = baseTextFieldUIStateArr2;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = textUIState6;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = textUIState4;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = baseTextFieldUIStateArr2;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = superPassEnterUserDetailsViewModel4;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = strG;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = xf1Var2;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.I$0 = 2;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 6;
                            objC = stringProvider.b(StringEnum.PROFILE_HINT_DOB_PASS, new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                            if (objC != coroutineSingletons) {
                                superPassEnterUserDetailsViewModel5 = superPassEnterUserDetailsViewModel4;
                                textUIState7 = textUIState4;
                                baseTextFieldUIStateArr5 = baseTextFieldUIStateArr2;
                                baseTextFieldUIStateArr6 = baseTextFieldUIStateArr5;
                                str5 = strG;
                                i4 = 2;
                                TextUIState textUIState10 = textUIState6;
                                superPassEnterUserDetailsViewModel5.getClass();
                                baseTextFieldUIStateArr5[i4] = t(str5, (String) objC, xf1Var2);
                                superPassBasicUserInfoSectionUIState = new SuperPassBasicUserInfoSectionUIState(textUIState10, textUIState7, CollectionsKt.S(baseTextFieldUIStateArr6), new DividerUIState(ChaloThemeHelper.a().f, ChaloColorToken.UnselectedDot.f9866a, null, 4), 32);
                                l2 = superPassEnterUserDetailsDataState3.d;
                                if (l2 != null) {
                                    str6 = str8;
                                } else {
                                    str6 = str8;
                                }
                                xf1Var3 = new xf1(superPassEnterUserDetailsViewModel4, 6);
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassBasicUserInfoSectionUIState;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = superPassEnterUserDetailsViewModel4;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = str6;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = xf1Var3;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = null;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = null;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = null;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = null;
                                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 7;
                                objB3 = stringProvider.b(StringEnum.PROFILE_HINT_PASS_START_DATE, new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                                if (objB3 != coroutineSingletons) {
                                    superPassEnterUserDetailsViewModel6 = superPassEnterUserDetailsViewModel4;
                                    str7 = str6;
                                    superPassEnterUserDetailsViewModel6.getClass();
                                    return CollectionsKt.S(superPassBasicUserInfoSectionUIState, new SuperPassBasicUserInfoSectionUIState(null, null, CollectionsKt.R(t(str7, (String) objB3, xf1Var3)), null, 48));
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                int i7 = superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.I$0;
                function1 = (Function1) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7;
                str2 = (String) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6;
                SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel10 = (SuperPassEnterUserDetailsViewModel) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5;
                BaseTextFieldUIState[] baseTextFieldUIStateArr7 = (BaseTextFieldUIState[]) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4;
                TextUIState textUIState11 = (TextUIState) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3;
                TextUIState textUIState12 = (TextUIState) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2;
                baseTextFieldUIStateArr2 = (BaseTextFieldUIState[]) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1;
                SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState5 = (SuperPassEnterUserDetailsDataState) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0;
                ResultKt.b(objC);
                i = i7;
                superPassEnterUserDetailsViewModel = superPassEnterUserDetailsViewModel10;
                textUIState4 = textUIState11;
                baseTextFieldUIStateArr3 = baseTextFieldUIStateArr7;
                textUIState5 = textUIState12;
                superPassEnterUserDetailsDataState3 = superPassEnterUserDetailsDataState5;
                superPassEnterUserDetailsViewModel.getClass();
                ChaloColorToken.TextFieldIndicator textFieldIndicator4 = ChaloColorToken.TextFieldIndicator.f9859a;
                baseTextFieldUIStateArr3[i] = y(str2, function1, (String) objC, textFieldIndicator4, textFieldIndicator4);
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassEnterUserDetailsDataState3;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = baseTextFieldUIStateArr2;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = textUIState5;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = textUIState4;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = baseTextFieldUIStateArr2;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = this;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = null;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = null;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.I$0 = 1;
                i2 = 4;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 4;
                objB2 = stringProvider.b(GenderKt.a(superPassEnterUserDetailsDataState3.b), new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                if (objB2 == coroutineSingletons) {
                    superPassEnterUserDetailsViewModel2 = this;
                    obj = objB2;
                    baseTextFieldUIStateArr4 = baseTextFieldUIStateArr2;
                    i3 = 1;
                    str3 = (String) obj;
                    xf1Var = new xf1(this, i2);
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassEnterUserDetailsDataState3;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = baseTextFieldUIStateArr2;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = textUIState5;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = textUIState4;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = baseTextFieldUIStateArr4;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = superPassEnterUserDetailsViewModel2;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = str3;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = xf1Var;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.I$0 = i3;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 5;
                    objC = stringProvider.b(StringEnum.PROFILE_HINT_GENDER_PASS, new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                    if (objC != coroutineSingletons) {
                        SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel11 = superPassEnterUserDetailsViewModel2;
                        str4 = str3;
                        function0 = xf1Var;
                        textUIState6 = textUIState5;
                        superPassEnterUserDetailsViewModel3 = superPassEnterUserDetailsViewModel11;
                        superPassEnterUserDetailsViewModel3.getClass();
                        baseTextFieldUIStateArr4[i3] = t(str4, (String) objC, function0);
                        l = superPassEnterUserDetailsDataState3.c;
                        if (l != null) {
                            strG = str8;
                        } else {
                            strG = str8;
                        }
                        superPassEnterUserDetailsViewModel4 = this;
                        xf1Var2 = new xf1(superPassEnterUserDetailsViewModel4, 5);
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassEnterUserDetailsDataState3;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = baseTextFieldUIStateArr2;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = textUIState6;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = textUIState4;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = baseTextFieldUIStateArr2;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = superPassEnterUserDetailsViewModel4;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = strG;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = xf1Var2;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.I$0 = 2;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 6;
                        objC = stringProvider.b(StringEnum.PROFILE_HINT_DOB_PASS, new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                        if (objC != coroutineSingletons) {
                            superPassEnterUserDetailsViewModel5 = superPassEnterUserDetailsViewModel4;
                            textUIState7 = textUIState4;
                            baseTextFieldUIStateArr5 = baseTextFieldUIStateArr2;
                            baseTextFieldUIStateArr6 = baseTextFieldUIStateArr5;
                            str5 = strG;
                            i4 = 2;
                            TextUIState textUIState13 = textUIState6;
                            superPassEnterUserDetailsViewModel5.getClass();
                            baseTextFieldUIStateArr5[i4] = t(str5, (String) objC, xf1Var2);
                            superPassBasicUserInfoSectionUIState = new SuperPassBasicUserInfoSectionUIState(textUIState13, textUIState7, CollectionsKt.S(baseTextFieldUIStateArr6), new DividerUIState(ChaloThemeHelper.a().f, ChaloColorToken.UnselectedDot.f9866a, null, 4), 32);
                            l2 = superPassEnterUserDetailsDataState3.d;
                            if (l2 != null) {
                                str6 = str8;
                            } else {
                                str6 = str8;
                            }
                            xf1Var3 = new xf1(superPassEnterUserDetailsViewModel4, 6);
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassBasicUserInfoSectionUIState;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = superPassEnterUserDetailsViewModel4;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = str6;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = xf1Var3;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = null;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = null;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = null;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = null;
                            superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 7;
                            objB3 = stringProvider.b(StringEnum.PROFILE_HINT_PASS_START_DATE, new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                            if (objB3 != coroutineSingletons) {
                                superPassEnterUserDetailsViewModel6 = superPassEnterUserDetailsViewModel4;
                                str7 = str6;
                                superPassEnterUserDetailsViewModel6.getClass();
                                return CollectionsKt.S(superPassBasicUserInfoSectionUIState, new SuperPassBasicUserInfoSectionUIState(null, null, CollectionsKt.R(t(str7, (String) objB3, xf1Var3)), null, 48));
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                i3 = superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.I$0;
                SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel12 = (SuperPassEnterUserDetailsViewModel) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5;
                BaseTextFieldUIState[] baseTextFieldUIStateArr8 = (BaseTextFieldUIState[]) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4;
                textUIState4 = (TextUIState) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3;
                textUIState5 = (TextUIState) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2;
                BaseTextFieldUIState[] baseTextFieldUIStateArr9 = (BaseTextFieldUIState[]) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1;
                superPassEnterUserDetailsDataState3 = (SuperPassEnterUserDetailsDataState) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0;
                ResultKt.b(objC);
                baseTextFieldUIStateArr2 = baseTextFieldUIStateArr9;
                baseTextFieldUIStateArr4 = baseTextFieldUIStateArr8;
                superPassEnterUserDetailsViewModel2 = superPassEnterUserDetailsViewModel12;
                obj = objC;
                i2 = 4;
                str3 = (String) obj;
                xf1Var = new xf1(this, i2);
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassEnterUserDetailsDataState3;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = baseTextFieldUIStateArr2;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = textUIState5;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = textUIState4;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = baseTextFieldUIStateArr4;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = superPassEnterUserDetailsViewModel2;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = str3;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = xf1Var;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.I$0 = i3;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 5;
                objC = stringProvider.b(StringEnum.PROFILE_HINT_GENDER_PASS, new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                if (objC != coroutineSingletons) {
                    SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel13 = superPassEnterUserDetailsViewModel2;
                    str4 = str3;
                    function0 = xf1Var;
                    textUIState6 = textUIState5;
                    superPassEnterUserDetailsViewModel3 = superPassEnterUserDetailsViewModel13;
                    superPassEnterUserDetailsViewModel3.getClass();
                    baseTextFieldUIStateArr4[i3] = t(str4, (String) objC, function0);
                    l = superPassEnterUserDetailsDataState3.c;
                    if (l != null) {
                        strG = str8;
                    } else {
                        strG = str8;
                    }
                    superPassEnterUserDetailsViewModel4 = this;
                    xf1Var2 = new xf1(superPassEnterUserDetailsViewModel4, 5);
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassEnterUserDetailsDataState3;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = baseTextFieldUIStateArr2;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = textUIState6;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = textUIState4;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = baseTextFieldUIStateArr2;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = superPassEnterUserDetailsViewModel4;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = strG;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = xf1Var2;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.I$0 = 2;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 6;
                    objC = stringProvider.b(StringEnum.PROFILE_HINT_DOB_PASS, new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                    if (objC != coroutineSingletons) {
                        superPassEnterUserDetailsViewModel5 = superPassEnterUserDetailsViewModel4;
                        textUIState7 = textUIState4;
                        baseTextFieldUIStateArr5 = baseTextFieldUIStateArr2;
                        baseTextFieldUIStateArr6 = baseTextFieldUIStateArr5;
                        str5 = strG;
                        i4 = 2;
                        TextUIState textUIState14 = textUIState6;
                        superPassEnterUserDetailsViewModel5.getClass();
                        baseTextFieldUIStateArr5[i4] = t(str5, (String) objC, xf1Var2);
                        superPassBasicUserInfoSectionUIState = new SuperPassBasicUserInfoSectionUIState(textUIState14, textUIState7, CollectionsKt.S(baseTextFieldUIStateArr6), new DividerUIState(ChaloThemeHelper.a().f, ChaloColorToken.UnselectedDot.f9866a, null, 4), 32);
                        l2 = superPassEnterUserDetailsDataState3.d;
                        if (l2 != null) {
                            str6 = str8;
                        } else {
                            str6 = str8;
                        }
                        xf1Var3 = new xf1(superPassEnterUserDetailsViewModel4, 6);
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassBasicUserInfoSectionUIState;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = superPassEnterUserDetailsViewModel4;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = str6;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = xf1Var3;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = null;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = null;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = null;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = null;
                        superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 7;
                        objB3 = stringProvider.b(StringEnum.PROFILE_HINT_PASS_START_DATE, new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                        if (objB3 != coroutineSingletons) {
                            superPassEnterUserDetailsViewModel6 = superPassEnterUserDetailsViewModel4;
                            str7 = str6;
                            superPassEnterUserDetailsViewModel6.getClass();
                            return CollectionsKt.S(superPassBasicUserInfoSectionUIState, new SuperPassBasicUserInfoSectionUIState(null, null, CollectionsKt.R(t(str7, (String) objB3, xf1Var3)), null, 48));
                        }
                    }
                }
                return coroutineSingletons;
            case 5:
                i3 = superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.I$0;
                function0 = (Function0) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7;
                str4 = (String) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6;
                superPassEnterUserDetailsViewModel3 = (SuperPassEnterUserDetailsViewModel) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5;
                baseTextFieldUIStateArr4 = (BaseTextFieldUIState[]) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4;
                TextUIState textUIState15 = (TextUIState) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3;
                TextUIState textUIState16 = (TextUIState) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2;
                BaseTextFieldUIState[] baseTextFieldUIStateArr10 = (BaseTextFieldUIState[]) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1;
                SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState6 = (SuperPassEnterUserDetailsDataState) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0;
                ResultKt.b(objC);
                superPassEnterUserDetailsDataState3 = superPassEnterUserDetailsDataState6;
                textUIState4 = textUIState15;
                textUIState6 = textUIState16;
                baseTextFieldUIStateArr2 = baseTextFieldUIStateArr10;
                superPassEnterUserDetailsViewModel3.getClass();
                baseTextFieldUIStateArr4[i3] = t(str4, (String) objC, function0);
                l = superPassEnterUserDetailsDataState3.c;
                if (l != null) {
                    strG = str8;
                } else {
                    strG = str8;
                }
                superPassEnterUserDetailsViewModel4 = this;
                xf1Var2 = new xf1(superPassEnterUserDetailsViewModel4, 5);
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassEnterUserDetailsDataState3;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = baseTextFieldUIStateArr2;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = textUIState6;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = textUIState4;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = baseTextFieldUIStateArr2;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = superPassEnterUserDetailsViewModel4;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = strG;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = xf1Var2;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.I$0 = 2;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 6;
                objC = stringProvider.b(StringEnum.PROFILE_HINT_DOB_PASS, new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                if (objC != coroutineSingletons) {
                    superPassEnterUserDetailsViewModel5 = superPassEnterUserDetailsViewModel4;
                    textUIState7 = textUIState4;
                    baseTextFieldUIStateArr5 = baseTextFieldUIStateArr2;
                    baseTextFieldUIStateArr6 = baseTextFieldUIStateArr5;
                    str5 = strG;
                    i4 = 2;
                    TextUIState textUIState17 = textUIState6;
                    superPassEnterUserDetailsViewModel5.getClass();
                    baseTextFieldUIStateArr5[i4] = t(str5, (String) objC, xf1Var2);
                    superPassBasicUserInfoSectionUIState = new SuperPassBasicUserInfoSectionUIState(textUIState17, textUIState7, CollectionsKt.S(baseTextFieldUIStateArr6), new DividerUIState(ChaloThemeHelper.a().f, ChaloColorToken.UnselectedDot.f9866a, null, 4), 32);
                    l2 = superPassEnterUserDetailsDataState3.d;
                    if (l2 != null) {
                        str6 = str8;
                    } else {
                        str6 = str8;
                    }
                    xf1Var3 = new xf1(superPassEnterUserDetailsViewModel4, 6);
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassBasicUserInfoSectionUIState;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = superPassEnterUserDetailsViewModel4;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = str6;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = xf1Var3;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = null;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = null;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = null;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = null;
                    superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 7;
                    objB3 = stringProvider.b(StringEnum.PROFILE_HINT_PASS_START_DATE, new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                    if (objB3 != coroutineSingletons) {
                        superPassEnterUserDetailsViewModel6 = superPassEnterUserDetailsViewModel4;
                        str7 = str6;
                        superPassEnterUserDetailsViewModel6.getClass();
                        return CollectionsKt.S(superPassBasicUserInfoSectionUIState, new SuperPassBasicUserInfoSectionUIState(null, null, CollectionsKt.R(t(str7, (String) objB3, xf1Var3)), null, 48));
                    }
                }
                return coroutineSingletons;
            case 6:
                int i8 = superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.I$0;
                xf1Var2 = (Function0) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7;
                str5 = (String) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6;
                superPassEnterUserDetailsViewModel5 = (SuperPassEnterUserDetailsViewModel) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5;
                baseTextFieldUIStateArr5 = (BaseTextFieldUIState[]) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4;
                TextUIState textUIState18 = (TextUIState) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3;
                textUIState6 = (TextUIState) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2;
                baseTextFieldUIStateArr6 = (BaseTextFieldUIState[]) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1;
                superPassEnterUserDetailsDataState3 = (SuperPassEnterUserDetailsDataState) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0;
                ResultKt.b(objC);
                superPassEnterUserDetailsViewModel4 = this;
                i4 = i8;
                str8 = "";
                textUIState7 = textUIState18;
                TextUIState textUIState19 = textUIState6;
                superPassEnterUserDetailsViewModel5.getClass();
                baseTextFieldUIStateArr5[i4] = t(str5, (String) objC, xf1Var2);
                superPassBasicUserInfoSectionUIState = new SuperPassBasicUserInfoSectionUIState(textUIState19, textUIState7, CollectionsKt.S(baseTextFieldUIStateArr6), new DividerUIState(ChaloThemeHelper.a().f, ChaloColorToken.UnselectedDot.f9866a, null, 4), 32);
                l2 = superPassEnterUserDetailsDataState3.d;
                if (l2 != null) {
                    str6 = str8;
                } else {
                    str6 = str8;
                }
                xf1Var3 = new xf1(superPassEnterUserDetailsViewModel4, 6);
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0 = superPassBasicUserInfoSectionUIState;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1 = superPassEnterUserDetailsViewModel4;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2 = str6;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3 = xf1Var3;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$4 = null;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$5 = null;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$6 = null;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$7 = null;
                superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.label = 7;
                objB3 = stringProvider.b(StringEnum.PROFILE_HINT_PASS_START_DATE, new Object[0], superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1);
                if (objB3 != coroutineSingletons) {
                    superPassEnterUserDetailsViewModel6 = superPassEnterUserDetailsViewModel4;
                    str7 = str6;
                    superPassEnterUserDetailsViewModel6.getClass();
                    return CollectionsKt.S(superPassBasicUserInfoSectionUIState, new SuperPassBasicUserInfoSectionUIState(null, null, CollectionsKt.R(t(str7, (String) objB3, xf1Var3)), null, 48));
                }
                return coroutineSingletons;
            case 7:
                Function0 function2 = (Function0) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$3;
                str7 = (String) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$2;
                superPassEnterUserDetailsViewModel6 = (SuperPassEnterUserDetailsViewModel) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$1;
                SuperPassBasicUserInfoSectionUIState superPassBasicUserInfoSectionUIState2 = (SuperPassBasicUserInfoSectionUIState) superPassEnterUserDetailsViewModel$fieldsSectionForBasicDetails$1.L$0;
                ResultKt.b(objC);
                superPassBasicUserInfoSectionUIState = superPassBasicUserInfoSectionUIState2;
                objB3 = objC;
                xf1Var3 = function2;
                superPassEnterUserDetailsViewModel6.getClass();
                return CollectionsKt.S(superPassBasicUserInfoSectionUIState, new SuperPassBasicUserInfoSectionUIState(null, null, CollectionsKt.R(t(str7, (String) objB3, xf1Var3)), null, 48));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
