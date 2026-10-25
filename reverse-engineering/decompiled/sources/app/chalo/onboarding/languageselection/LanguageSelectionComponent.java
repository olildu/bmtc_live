package app.chalo.onboarding.languageselection;

import androidx.compose.ui.unit.Dp;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.ResolveSupportPolicyUseCase;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.features.chaloconfig.ChaloConfigCacheStatus;
import app.chalo.features.chaloconfig.ChaloConfigFetchStatus;
import app.chalo.features.language.LanguageFeature;
import app.chalo.features.language.LanguagePlatformHelper;
import app.chalo.features.language.data.LanguageSelectionSourceType;
import app.chalo.homescreen.domain.CheckIfCanLaunchHomeScreenUseCase;
import app.chalo.manager.homescreen.HomeScreenConfigManager;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManager;
import app.chalo.onboarding.languageselection.splitinstallhandler.SplitInstallHandler;
import app.chalo.onboarding.languageselection.splitinstallhandler.SplitInstallResult;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.LanguageSelectionArgs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.toolbar.ToolbarUIState;
import com.arkivanov.decompose.ComponentContext;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.cy;
import defpackage.dd0;
import defpackage.hd0;
import defpackage.ib0;
import defpackage.n10;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/onboarding/languageselection/LanguageSelectionComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/onboarding/languageselection/LanguageSelectionIntent;", "Lapp/chalo/onboarding/languageselection/LanguageSelectionDataState;", "Lapp/chalo/onboarding/languageselection/LanguageSelectionState;", "Lapp/chalo/onboarding/languageselection/LanguageSelectionEffect;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LanguageSelectionComponent extends ChaloBaseStateMviComponent<LanguageSelectionIntent, LanguageSelectionDataState, LanguageSelectionState, LanguageSelectionEffect> {
    public final AnalyticsContract k;
    public final LanguageFeature l;
    public final LanguagePlatformHelper m;
    public final SplitInstallHandler n;
    public final OnboardingBackgroundOperationManager o;
    public final StringProvider p;
    public final ChaloNavigationManager q;
    public final HomeScreenConfigManager r;
    public final CityProvider s;
    public final ResolveSupportPolicyUseCase t;
    public Job u;
    public final Lazy v;

    /* JADX INFO: renamed from: app.chalo.onboarding.languageselection.LanguageSelectionComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.onboarding.languageselection.LanguageSelectionComponent$1", f = "LanguageSelectionComponent.kt", l = {113}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return LanguageSelectionComponent.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                Flow flowB = LanguageSelectionComponent.this.n.b();
                final LanguageSelectionComponent languageSelectionComponent = LanguageSelectionComponent.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.onboarding.languageselection.LanguageSelectionComponent.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        SplitInstallResult splitInstallResult = (SplitInstallResult) obj2;
                        boolean zD = Intrinsics.d(splitInstallResult, SplitInstallResult.Installed.f6673a);
                        LanguageSelectionComponent languageSelectionComponent2 = languageSelectionComponent;
                        if (zD) {
                            BuildersKt.d(languageSelectionComponent2.j, null, null, new LanguageSelectionComponent$updateLocaleAndRefreshConfig$1(languageSelectionComponent2, null), 3);
                        } else if (Intrinsics.d(splitInstallResult, SplitInstallResult.Failed.f6672a) || Intrinsics.d(splitInstallResult, SplitInstallResult.Unknown.f6677a) || Intrinsics.d(splitInstallResult, SplitInstallResult.Canceled.f6668a) || (splitInstallResult instanceof SplitInstallResult.Error)) {
                            BuildersKt.d(languageSelectionComponent2.j, null, null, new LanguageSelectionComponent$handleLanguageInstallFailure$1(languageSelectionComponent2, null), 3);
                        } else if (!Intrinsics.d(splitInstallResult, SplitInstallResult.Canceling.f6669a) && !Intrinsics.d(splitInstallResult, SplitInstallResult.Downloaded.f6670a) && !Intrinsics.d(splitInstallResult, SplitInstallResult.Downloading.f6671a) && !Intrinsics.d(splitInstallResult, SplitInstallResult.Installing.f6674a) && !Intrinsics.d(splitInstallResult, SplitInstallResult.Pending.f6675a) && !Intrinsics.d(splitInstallResult, SplitInstallResult.RequiresUserConfirmation.f6676a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (((ChannelFlow) flowB).collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6648a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[LanguageSelectionSourceType.values().length];
            try {
                iArr[LanguageSelectionSourceType.SPLASH_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LanguageSelectionSourceType.HOME_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LanguageSelectionSourceType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6648a = iArr;
            int[] iArr2 = new int[ChaloConfigFetchStatus.values().length];
            try {
                iArr2[ChaloConfigFetchStatus.FETCHING_NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ChaloConfigFetchStatus.FETCH_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ChaloConfigFetchStatus.FETCH_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ChaloConfigFetchStatus.FETCH_SUCCESSFUL.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
            int[] iArr3 = new int[ChaloConfigCacheStatus.values().length];
            try {
                iArr3[ChaloConfigCacheStatus.DATA_CACHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ChaloConfigCacheStatus.NO_DATA_CACHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ChaloConfigCacheStatus.CACHE_EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ChaloConfigCacheStatus.OLD_LANGUAGE_DATA_CACHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ChaloConfigCacheStatus.CACHE_STATUS_UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            c = iArr3;
        }
    }

    public LanguageSelectionComponent(ComponentContext componentContext, LanguageSelectionArgs languageSelectionArgs, AnalyticsContract analyticsContract, LanguageFeature languageFeature, CheckIfCanLaunchHomeScreenUseCase checkIfCanLaunchHomeScreenUseCase, LanguagePlatformHelper languagePlatformHelper, SplitInstallHandler splitInstallHandler, OnboardingBackgroundOperationManager onboardingBackgroundOperationManager, StringProvider stringProvider, ChaloNavigationManager chaloNavigationManager, HomeScreenConfigManager homeScreenConfigManager, CityProvider cityProvider, ResolveSupportPolicyUseCase resolveSupportPolicyUseCase) {
        super(componentContext);
        this.k = analyticsContract;
        this.l = languageFeature;
        this.m = languagePlatformHelper;
        this.n = splitInstallHandler;
        this.o = onboardingBackgroundOperationManager;
        this.p = stringProvider;
        this.q = chaloNavigationManager;
        this.r = homeScreenConfigManager;
        this.s = cityProvider;
        this.t = resolveSupportPolicyUseCase;
        this.v = LazyKt.b(new hd0(this, 1));
        L0(new LanguageSelectionIntent.InitializationIntent(languageSelectionArgs.b));
        D0(new AnonymousClass1(null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object F0(LanguageSelectionComponent languageSelectionComponent, ContinuationImpl continuationImpl) {
        LanguageSelectionComponent$navigateToNextScreen$1 languageSelectionComponent$navigateToNextScreen$1;
        languageSelectionComponent.getClass();
        if (continuationImpl instanceof LanguageSelectionComponent$navigateToNextScreen$1) {
            languageSelectionComponent$navigateToNextScreen$1 = (LanguageSelectionComponent$navigateToNextScreen$1) continuationImpl;
            int i = languageSelectionComponent$navigateToNextScreen$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageSelectionComponent$navigateToNextScreen$1.label = i - Integer.MIN_VALUE;
            } else {
                languageSelectionComponent$navigateToNextScreen$1 = new LanguageSelectionComponent$navigateToNextScreen$1(languageSelectionComponent, continuationImpl);
            }
        } else {
            languageSelectionComponent$navigateToNextScreen$1 = new LanguageSelectionComponent$navigateToNextScreen$1(languageSelectionComponent, continuationImpl);
        }
        Object objJ = languageSelectionComponent$navigateToNextScreen$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = languageSelectionComponent$navigateToNextScreen$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objJ);
            int i3 = WhenMappings.f6648a[((LanguageSelectionDataState) languageSelectionComponent.f.getValue()).e.ordinal()];
            if (i3 == 1) {
                languageSelectionComponent.q0(new hd0(languageSelectionComponent, 2));
                return unit;
            }
            if (i3 == 2) {
                CityProvider cityProvider = languageSelectionComponent.s;
                languageSelectionComponent$navigateToNextScreen$1.label = 1;
                objJ = cityProvider.j();
                if (objJ != obj) {
                }
            }
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objJ);
            return unit;
        }
        ResultKt.b(objJ);
        if (((Boolean) objJ).booleanValue()) {
            languageSelectionComponent$navigateToNextScreen$1.label = 2;
            return languageSelectionComponent.K0(languageSelectionComponent$navigateToNextScreen$1) == obj ? obj : unit;
        }
        languageSelectionComponent.q0(new hd0(languageSelectionComponent, 3));
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:54:0x020f  */
    /* JADX WARN: Code duplicated, block: B:56:0x021b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0236  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public final Object p0(LanguageSelectionDataState languageSelectionDataState, ContinuationImpl continuationImpl) {
        LanguageSelectionComponent$convertToUiState$1 languageSelectionComponent$convertToUiState$1;
        LanguageSelectionDataState languageSelectionDataState2;
        ChaloTextStyleHelper chaloTextStyleHelper;
        LanguageGridUiState languageGridUiState;
        ToolbarUIState toolbarUIState;
        TextUIState.StyledTextUIState styledTextUIState;
        ImageUIState imageUIState;
        TextUIState.ChaloTextUIState chaloTextUIState;
        boolean z;
        ToolbarUIState toolbarUIState2;
        LanguageSelectionDataState languageSelectionDataState3;
        LanguageGridUiState languageGridUiState2;
        ButtonUIState buttonUIState;
        TextUIState.StyledTextUIState styledTextUIState2;
        Object objJ0;
        ButtonUIState buttonUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        Object objI0;
        boolean z2;
        LanguageGridUiState languageGridUiState3;
        ButtonUIState buttonUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        ToolbarUIState toolbarUIState3;
        TextUIState.StyledTextUIState styledTextUIState3;
        if (continuationImpl instanceof LanguageSelectionComponent$convertToUiState$1) {
            languageSelectionComponent$convertToUiState$1 = (LanguageSelectionComponent$convertToUiState$1) continuationImpl;
            int i = languageSelectionComponent$convertToUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageSelectionComponent$convertToUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                languageSelectionComponent$convertToUiState$1 = new LanguageSelectionComponent$convertToUiState$1(this, continuationImpl);
            }
        } else {
            languageSelectionComponent$convertToUiState$1 = new LanguageSelectionComponent$convertToUiState$1(this, continuationImpl);
        }
        Object objB = languageSelectionComponent$convertToUiState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = languageSelectionComponent$convertToUiState$1.label;
        ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
        if (i2 == 0) {
            ResultKt.b(objB);
            languageSelectionDataState2 = languageSelectionDataState;
            languageSelectionComponent$convertToUiState$1.L$0 = languageSelectionDataState2;
            languageSelectionComponent$convertToUiState$1.L$1 = chaloTextStyleHelper2;
            languageSelectionComponent$convertToUiState$1.label = 1;
            objB = this.p.b(StringEnum.CHOOSE_YOUR_LANGUAGE, new Object[0], languageSelectionComponent$convertToUiState$1);
            if (objB != obj) {
                chaloTextStyleHelper = chaloTextStyleHelper2;
            }
            return obj;
        }
        if (i2 == 1) {
            ChaloTextStyleHelper chaloTextStyleHelper3 = (ChaloTextStyleHelper) languageSelectionComponent$convertToUiState$1.L$1;
            languageSelectionDataState2 = (LanguageSelectionDataState) languageSelectionComponent$convertToUiState$1.L$0;
            ResultKt.b(objB);
            chaloTextStyleHelper = chaloTextStyleHelper3;
        } else {
            if (i2 == 2) {
                z = languageSelectionComponent$convertToUiState$1.Z$0;
                ImageUIState imageUIState2 = (ImageUIState) languageSelectionComponent$convertToUiState$1.L$4;
                ToolbarUIState toolbarUIState4 = (ToolbarUIState) languageSelectionComponent$convertToUiState$1.L$3;
                LanguageGridUiState languageGridUiState4 = (LanguageGridUiState) languageSelectionComponent$convertToUiState$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState4 = (TextUIState.ChaloTextUIState) languageSelectionComponent$convertToUiState$1.L$1;
                LanguageSelectionDataState languageSelectionDataState4 = (LanguageSelectionDataState) languageSelectionComponent$convertToUiState$1.L$0;
                ResultKt.b(objB);
                imageUIState = imageUIState2;
                chaloTextUIState = chaloTextUIState4;
                languageGridUiState2 = languageGridUiState4;
                toolbarUIState2 = toolbarUIState4;
                languageSelectionDataState3 = languageSelectionDataState4;
                styledTextUIState = null;
                buttonUIState = (ButtonUIState) objB;
                if (languageSelectionDataState3.c) {
                    languageSelectionComponent$convertToUiState$1.L$0 = languageSelectionDataState3;
                    languageSelectionComponent$convertToUiState$1.L$1 = chaloTextUIState;
                    languageSelectionComponent$convertToUiState$1.L$2 = languageGridUiState2;
                    languageSelectionComponent$convertToUiState$1.L$3 = toolbarUIState2;
                    languageSelectionComponent$convertToUiState$1.L$4 = imageUIState;
                    languageSelectionComponent$convertToUiState$1.L$5 = buttonUIState;
                    languageSelectionComponent$convertToUiState$1.Z$0 = z;
                    languageSelectionComponent$convertToUiState$1.label = 3;
                    objJ0 = J0(languageSelectionComponent$convertToUiState$1);
                    if (objJ0 != obj) {
                        TextUIState.ChaloTextUIState chaloTextUIState5 = chaloTextUIState;
                        buttonUIState2 = buttonUIState;
                        objB = objJ0;
                        chaloTextUIState2 = chaloTextUIState5;
                        styledTextUIState2 = (TextUIState.StyledTextUIState) objB;
                        buttonUIState = buttonUIState2;
                        chaloTextUIState = chaloTextUIState2;
                        LanguageSelectionSnackbarType languageSelectionSnackbarType = languageSelectionDataState3.b;
                        languageSelectionComponent$convertToUiState$1.L$0 = chaloTextUIState;
                        languageSelectionComponent$convertToUiState$1.L$1 = languageGridUiState2;
                        languageSelectionComponent$convertToUiState$1.L$2 = toolbarUIState2;
                        languageSelectionComponent$convertToUiState$1.L$3 = imageUIState;
                        languageSelectionComponent$convertToUiState$1.L$4 = buttonUIState;
                        languageSelectionComponent$convertToUiState$1.L$5 = styledTextUIState2;
                        languageSelectionComponent$convertToUiState$1.Z$0 = z;
                        languageSelectionComponent$convertToUiState$1.label = 4;
                        objI0 = I0(languageSelectionSnackbarType, languageSelectionComponent$convertToUiState$1);
                        if (objI0 != obj) {
                            LanguageGridUiState languageGridUiState5 = languageGridUiState2;
                            z2 = z;
                            languageGridUiState3 = languageGridUiState5;
                            buttonUIState3 = buttonUIState;
                            objB = objI0;
                            chaloTextUIState3 = chaloTextUIState;
                            toolbarUIState3 = toolbarUIState2;
                            styledTextUIState3 = styledTextUIState2;
                        }
                    }
                } else {
                    styledTextUIState2 = styledTextUIState;
                    LanguageSelectionSnackbarType languageSelectionSnackbarType2 = languageSelectionDataState3.b;
                    languageSelectionComponent$convertToUiState$1.L$0 = chaloTextUIState;
                    languageSelectionComponent$convertToUiState$1.L$1 = languageGridUiState2;
                    languageSelectionComponent$convertToUiState$1.L$2 = toolbarUIState2;
                    languageSelectionComponent$convertToUiState$1.L$3 = imageUIState;
                    languageSelectionComponent$convertToUiState$1.L$4 = buttonUIState;
                    languageSelectionComponent$convertToUiState$1.L$5 = styledTextUIState2;
                    languageSelectionComponent$convertToUiState$1.Z$0 = z;
                    languageSelectionComponent$convertToUiState$1.label = 4;
                    objI0 = I0(languageSelectionSnackbarType2, languageSelectionComponent$convertToUiState$1);
                    if (objI0 != obj) {
                        LanguageGridUiState languageGridUiState6 = languageGridUiState2;
                        z2 = z;
                        languageGridUiState3 = languageGridUiState6;
                        buttonUIState3 = buttonUIState;
                        objB = objI0;
                        chaloTextUIState3 = chaloTextUIState;
                        toolbarUIState3 = toolbarUIState2;
                        styledTextUIState3 = styledTextUIState2;
                    }
                }
                return obj;
            }
            if (i2 == 3) {
                z = languageSelectionComponent$convertToUiState$1.Z$0;
                buttonUIState2 = (ButtonUIState) languageSelectionComponent$convertToUiState$1.L$5;
                imageUIState = (ImageUIState) languageSelectionComponent$convertToUiState$1.L$4;
                toolbarUIState2 = (ToolbarUIState) languageSelectionComponent$convertToUiState$1.L$3;
                languageGridUiState2 = (LanguageGridUiState) languageSelectionComponent$convertToUiState$1.L$2;
                chaloTextUIState2 = (TextUIState.ChaloTextUIState) languageSelectionComponent$convertToUiState$1.L$1;
                languageSelectionDataState3 = (LanguageSelectionDataState) languageSelectionComponent$convertToUiState$1.L$0;
                ResultKt.b(objB);
                styledTextUIState2 = (TextUIState.StyledTextUIState) objB;
                buttonUIState = buttonUIState2;
                chaloTextUIState = chaloTextUIState2;
                LanguageSelectionSnackbarType languageSelectionSnackbarType3 = languageSelectionDataState3.b;
                languageSelectionComponent$convertToUiState$1.L$0 = chaloTextUIState;
                languageSelectionComponent$convertToUiState$1.L$1 = languageGridUiState2;
                languageSelectionComponent$convertToUiState$1.L$2 = toolbarUIState2;
                languageSelectionComponent$convertToUiState$1.L$3 = imageUIState;
                languageSelectionComponent$convertToUiState$1.L$4 = buttonUIState;
                languageSelectionComponent$convertToUiState$1.L$5 = styledTextUIState2;
                languageSelectionComponent$convertToUiState$1.Z$0 = z;
                languageSelectionComponent$convertToUiState$1.label = 4;
                objI0 = I0(languageSelectionSnackbarType3, languageSelectionComponent$convertToUiState$1);
                if (objI0 != obj) {
                    LanguageGridUiState languageGridUiState7 = languageGridUiState2;
                    z2 = z;
                    languageGridUiState3 = languageGridUiState7;
                    buttonUIState3 = buttonUIState;
                    objB = objI0;
                    chaloTextUIState3 = chaloTextUIState;
                    toolbarUIState3 = toolbarUIState2;
                    styledTextUIState3 = styledTextUIState2;
                }
                return obj;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = languageSelectionComponent$convertToUiState$1.Z$0;
            TextUIState.StyledTextUIState styledTextUIState4 = (TextUIState.StyledTextUIState) languageSelectionComponent$convertToUiState$1.L$5;
            ButtonUIState buttonUIState4 = (ButtonUIState) languageSelectionComponent$convertToUiState$1.L$4;
            imageUIState = (ImageUIState) languageSelectionComponent$convertToUiState$1.L$3;
            ToolbarUIState toolbarUIState5 = (ToolbarUIState) languageSelectionComponent$convertToUiState$1.L$2;
            LanguageGridUiState languageGridUiState8 = (LanguageGridUiState) languageSelectionComponent$convertToUiState$1.L$1;
            TextUIState.ChaloTextUIState chaloTextUIState6 = (TextUIState.ChaloTextUIState) languageSelectionComponent$convertToUiState$1.L$0;
            ResultKt.b(objB);
            buttonUIState3 = buttonUIState4;
            toolbarUIState3 = toolbarUIState5;
            styledTextUIState3 = styledTextUIState4;
            languageGridUiState3 = languageGridUiState8;
            z2 = z3;
            chaloTextUIState3 = chaloTextUIState6;
        }
        return new LanguageSelectionState(chaloTextUIState3, languageGridUiState3, toolbarUIState3, imageUIState, styledTextUIState3, z2, buttonUIState3, (SnackbarUIState) objB);
        Object obj2 = objB;
        LanguageSelectionDataState languageSelectionDataState5 = languageSelectionDataState2;
        TextUIState.ChaloTextUIState chaloTextUIStateD = ChaloTextStyleHelper.d(chaloTextStyleHelper, (String) obj2, null, null, UIFontWeight.Bold, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
        String str = languageSelectionDataState5.g.b;
        List<LanguageDetails> list = languageSelectionDataState5.f;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        for (LanguageDetails languageDetails : list) {
            boolean zD = Intrinsics.d(languageDetails.b, str);
            LanguageGridUiState languageGridUiState9 = languageGridUiState;
            ArrayList arrayList2 = arrayList;
            String str2 = str;
            TextUIState.ChaloTextUIState chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper2, languageDetails.f6643a, ChaloColorToken.Black.f9759a, UIFontWeight.Bold, null, 108);
            ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().l, 0.0f, 0.0f, ChaloThemeHelper.a().l, 6);
            ChaloColorToken chaloColorToken = ChaloColorToken.ShimmerBackground.f9852a;
            ChaloColorToken chaloColorToken2 = zD ? ChaloColorToken.LightYellow2.f9821a : chaloColorToken;
            if (zD) {
                chaloColorToken = ChaloColorToken.OrangePrimary.f9835a;
            }
            arrayList2.add(new LanguageUiState(chaloTextUIStateF, new LanguageItemUiSpec(chaloPadding, chaloColorToken2, chaloColorToken), new cy(23, this, languageDetails)));
            languageGridUiState = languageGridUiState9;
            arrayList = arrayList2;
            str = str2;
        }
        LanguageGridUiState languageGridUiState10 = new LanguageGridUiState(2, arrayList);
        int i3 = WhenMappings.f6648a[languageSelectionDataState5.e.ordinal()];
        if (i3 == 1) {
            toolbarUIState = null;
        } else if (i3 != 2) {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            toolbarUIState = null;
        } else {
            toolbarUIState = new ToolbarUIState(null, null, null, null, null, ChaloThemeHelper.b().f1917a, null, null, 223);
        }
        styledTextUIState = null;
        imageUIState = new ImageUIState(IconType.CHALO_LOGO_LANGUAGE_SCREEN, (String) null, (ChaloColorToken) null, new ImageUISize(null, Dp.m7276boximpl(ChaloThemeHelper.a().u), 1), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
        boolean z4 = languageSelectionDataState5.f6650a;
        languageSelectionComponent$convertToUiState$1.L$0 = languageSelectionDataState5;
        languageSelectionComponent$convertToUiState$1.L$1 = chaloTextUIStateD;
        languageSelectionComponent$convertToUiState$1.L$2 = languageGridUiState10;
        languageSelectionComponent$convertToUiState$1.L$3 = toolbarUIState;
        languageSelectionComponent$convertToUiState$1.L$4 = imageUIState;
        languageSelectionComponent$convertToUiState$1.Z$0 = z4;
        languageSelectionComponent$convertToUiState$1.label = 2;
        Object objH0 = H0(languageSelectionComponent$convertToUiState$1);
        if (objH0 != obj) {
            ToolbarUIState toolbarUIState6 = toolbarUIState;
            chaloTextUIState = chaloTextUIStateD;
            z = z4;
            toolbarUIState2 = toolbarUIState6;
            languageSelectionDataState3 = languageSelectionDataState5;
            objB = objH0;
            languageGridUiState2 = languageGridUiState10;
            buttonUIState = (ButtonUIState) objB;
            if (languageSelectionDataState3.c) {
                languageSelectionComponent$convertToUiState$1.L$0 = languageSelectionDataState3;
                languageSelectionComponent$convertToUiState$1.L$1 = chaloTextUIState;
                languageSelectionComponent$convertToUiState$1.L$2 = languageGridUiState2;
                languageSelectionComponent$convertToUiState$1.L$3 = toolbarUIState2;
                languageSelectionComponent$convertToUiState$1.L$4 = imageUIState;
                languageSelectionComponent$convertToUiState$1.L$5 = buttonUIState;
                languageSelectionComponent$convertToUiState$1.Z$0 = z;
                languageSelectionComponent$convertToUiState$1.label = 3;
                objJ0 = J0(languageSelectionComponent$convertToUiState$1);
                if (objJ0 != obj) {
                    TextUIState.ChaloTextUIState chaloTextUIState7 = chaloTextUIState;
                    buttonUIState2 = buttonUIState;
                    objB = objJ0;
                    chaloTextUIState2 = chaloTextUIState7;
                    styledTextUIState2 = (TextUIState.StyledTextUIState) objB;
                    buttonUIState = buttonUIState2;
                    chaloTextUIState = chaloTextUIState2;
                    LanguageSelectionSnackbarType languageSelectionSnackbarType4 = languageSelectionDataState3.b;
                    languageSelectionComponent$convertToUiState$1.L$0 = chaloTextUIState;
                    languageSelectionComponent$convertToUiState$1.L$1 = languageGridUiState2;
                    languageSelectionComponent$convertToUiState$1.L$2 = toolbarUIState2;
                    languageSelectionComponent$convertToUiState$1.L$3 = imageUIState;
                    languageSelectionComponent$convertToUiState$1.L$4 = buttonUIState;
                    languageSelectionComponent$convertToUiState$1.L$5 = styledTextUIState2;
                    languageSelectionComponent$convertToUiState$1.Z$0 = z;
                    languageSelectionComponent$convertToUiState$1.label = 4;
                    objI0 = I0(languageSelectionSnackbarType4, languageSelectionComponent$convertToUiState$1);
                    if (objI0 != obj) {
                        LanguageGridUiState languageGridUiState11 = languageGridUiState2;
                        z2 = z;
                        languageGridUiState3 = languageGridUiState11;
                        buttonUIState3 = buttonUIState;
                        objB = objI0;
                        chaloTextUIState3 = chaloTextUIState;
                        toolbarUIState3 = toolbarUIState2;
                        styledTextUIState3 = styledTextUIState2;
                        return new LanguageSelectionState(chaloTextUIState3, languageGridUiState3, toolbarUIState3, imageUIState, styledTextUIState3, z2, buttonUIState3, (SnackbarUIState) objB);
                    }
                }
            } else {
                styledTextUIState2 = styledTextUIState;
                LanguageSelectionSnackbarType languageSelectionSnackbarType5 = languageSelectionDataState3.b;
                languageSelectionComponent$convertToUiState$1.L$0 = chaloTextUIState;
                languageSelectionComponent$convertToUiState$1.L$1 = languageGridUiState2;
                languageSelectionComponent$convertToUiState$1.L$2 = toolbarUIState2;
                languageSelectionComponent$convertToUiState$1.L$3 = imageUIState;
                languageSelectionComponent$convertToUiState$1.L$4 = buttonUIState;
                languageSelectionComponent$convertToUiState$1.L$5 = styledTextUIState2;
                languageSelectionComponent$convertToUiState$1.Z$0 = z;
                languageSelectionComponent$convertToUiState$1.label = 4;
                objI0 = I0(languageSelectionSnackbarType5, languageSelectionComponent$convertToUiState$1);
                if (objI0 != obj) {
                    LanguageGridUiState languageGridUiState12 = languageGridUiState2;
                    z2 = z;
                    languageGridUiState3 = languageGridUiState12;
                    buttonUIState3 = buttonUIState;
                    objB = objI0;
                    chaloTextUIState3 = chaloTextUIState;
                    toolbarUIState3 = toolbarUIState2;
                    styledTextUIState3 = styledTextUIState2;
                    return new LanguageSelectionState(chaloTextUIState3, languageGridUiState3, toolbarUIState3, imageUIState, styledTextUIState3, z2, buttonUIState3, (SnackbarUIState) objB);
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H0(ContinuationImpl continuationImpl) {
        LanguageSelectionComponent$getContinueButtonUiState$1 languageSelectionComponent$getContinueButtonUiState$1;
        ButtonUIStateFactory buttonUIStateFactory;
        ChaloTextStyleHelper chaloTextStyleHelper;
        if (continuationImpl instanceof LanguageSelectionComponent$getContinueButtonUiState$1) {
            languageSelectionComponent$getContinueButtonUiState$1 = (LanguageSelectionComponent$getContinueButtonUiState$1) continuationImpl;
            int i = languageSelectionComponent$getContinueButtonUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageSelectionComponent$getContinueButtonUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                languageSelectionComponent$getContinueButtonUiState$1 = new LanguageSelectionComponent$getContinueButtonUiState$1(this, continuationImpl);
            }
        } else {
            languageSelectionComponent$getContinueButtonUiState$1 = new LanguageSelectionComponent$getContinueButtonUiState$1(this, continuationImpl);
        }
        Object objB = languageSelectionComponent$getContinueButtonUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = languageSelectionComponent$getContinueButtonUiState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
            languageSelectionComponent$getContinueButtonUiState$1.L$0 = buttonUIStateFactory2;
            ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
            languageSelectionComponent$getContinueButtonUiState$1.L$1 = chaloTextStyleHelper2;
            languageSelectionComponent$getContinueButtonUiState$1.label = 1;
            objB = this.p.b(StringEnum.CONTINUE, new Object[0], languageSelectionComponent$getContinueButtonUiState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            buttonUIStateFactory = buttonUIStateFactory2;
            chaloTextStyleHelper = chaloTextStyleHelper2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloTextStyleHelper = (ChaloTextStyleHelper) languageSelectionComponent$getContinueButtonUiState$1.L$1;
            buttonUIStateFactory = (ButtonUIStateFactory) languageSelectionComponent$getContinueButtonUiState$1.L$0;
            ResultKt.b(objB);
        }
        return ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.g(chaloTextStyleHelper, (String) objB, ChaloColorToken.White.f9870a, null, null, null, null, 124), new hd0(this, 0), null, false, 0.0f, 60);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r13 == r1) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I0(app.chalo.onboarding.languageselection.LanguageSelectionSnackbarType r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.onboarding.languageselection.LanguageSelectionComponent.I0(app.chalo.onboarding.languageselection.LanguageSelectionSnackbarType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0092  */
    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object J0(ContinuationImpl continuationImpl) {
        LanguageSelectionComponent$getTncUiState$1 languageSelectionComponent$getTncUiState$1;
        String str;
        StateFlow stateFlow;
        UITextDecoration uITextDecoration;
        LanguageSelectionComponent$tncStyledTextClickHandler$2$1 languageSelectionComponent$tncStyledTextClickHandler$2$1;
        LanguageSelectionComponent$tncStyledTextClickHandler$2$1 languageSelectionComponent$tncStyledTextClickHandler$2$2;
        if (continuationImpl instanceof LanguageSelectionComponent$getTncUiState$1) {
            languageSelectionComponent$getTncUiState$1 = (LanguageSelectionComponent$getTncUiState$1) continuationImpl;
            int i = languageSelectionComponent$getTncUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageSelectionComponent$getTncUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                languageSelectionComponent$getTncUiState$1 = new LanguageSelectionComponent$getTncUiState$1(this, continuationImpl);
            }
        } else {
            languageSelectionComponent$getTncUiState$1 = new LanguageSelectionComponent$getTncUiState$1(this, continuationImpl);
        }
        Object objB = languageSelectionComponent$getTncUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = languageSelectionComponent$getTncUiState$1.label;
        StringProvider stringProvider = this.p;
        if (i2 == 0) {
            ResultKt.b(objB);
            languageSelectionComponent$getTncUiState$1.label = 1;
            objB = stringProvider.b(StringEnum.TNC_PREFIX, new Object[0], languageSelectionComponent$getTncUiState$1);
            if (objB != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objB);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) languageSelectionComponent$getTncUiState$1.L$0;
            ResultKt.b(objB);
        }
        String str2 = (String) objB;
        String strA = vo1.A(str, " ");
        UITextStyle uITextStyle = UITextStyle.BodySmall;
        StyledTextDataUIState styledTextDataUIState = new StyledTextDataUIState(strA, null, null, uITextStyle, null, null, null, 1014);
        stateFlow = this.f;
        if (StringsKt.F(((LanguageSelectionDataState) stateFlow.getValue()).h)) {
            uITextDecoration = UITextDecoration.None;
        } else {
            uITextDecoration = UITextDecoration.Underline;
        }
        UITextDecoration uITextDecoration2 = uITextDecoration;
        languageSelectionComponent$tncStyledTextClickHandler$2$1 = (LanguageSelectionComponent$tncStyledTextClickHandler$2$1) this.v.getValue();
        if (StringsKt.F(((LanguageSelectionDataState) stateFlow.getValue()).h)) {
            languageSelectionComponent$tncStyledTextClickHandler$2$2 = null;
        } else {
            languageSelectionComponent$tncStyledTextClickHandler$2$2 = languageSelectionComponent$tncStyledTextClickHandler$2$1;
        }
        return new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIState, new StyledTextDataUIState(str2, ChaloColorToken.OrangePrimary.f9835a, null, uITextStyle, uITextDecoration2, null, languageSelectionComponent$tncStyledTextClickHandler$2$2, 372)), null, null, 30);
        String str3 = (String) objB;
        languageSelectionComponent$getTncUiState$1.L$0 = str3;
        languageSelectionComponent$getTncUiState$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.TERMS_HOME_DRAWER, new Object[0], languageSelectionComponent$getTncUiState$1);
        if (objB2 != coroutineSingletons) {
            str = str3;
            objB = objB2;
            String str4 = (String) objB;
            String strA2 = vo1.A(str, " ");
            UITextStyle uITextStyle2 = UITextStyle.BodySmall;
            StyledTextDataUIState styledTextDataUIState2 = new StyledTextDataUIState(strA2, null, null, uITextStyle2, null, null, null, 1014);
            stateFlow = this.f;
            if (StringsKt.F(((LanguageSelectionDataState) stateFlow.getValue()).h)) {
                uITextDecoration = UITextDecoration.Underline;
            } else {
                uITextDecoration = UITextDecoration.None;
            }
            UITextDecoration uITextDecoration3 = uITextDecoration;
            languageSelectionComponent$tncStyledTextClickHandler$2$1 = (LanguageSelectionComponent$tncStyledTextClickHandler$2$1) this.v.getValue();
            if (StringsKt.F(((LanguageSelectionDataState) stateFlow.getValue()).h)) {
                languageSelectionComponent$tncStyledTextClickHandler$2$2 = languageSelectionComponent$tncStyledTextClickHandler$2$1;
            } else {
                languageSelectionComponent$tncStyledTextClickHandler$2$2 = null;
            }
            return new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIState2, new StyledTextDataUIState(str4, ChaloColorToken.OrangePrimary.f9835a, null, uITextStyle2, uITextDecoration3, null, languageSelectionComponent$tncStyledTextClickHandler$2$2, 372)), null, null, 30);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (M0(r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        if (M0(r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K0(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof app.chalo.onboarding.languageselection.LanguageSelectionComponent$proceedToHomeScreenIfHomeScreenConfigFetched$1
            if (r0 == 0) goto L13
            r0 = r10
            app.chalo.onboarding.languageselection.LanguageSelectionComponent$proceedToHomeScreenIfHomeScreenConfigFetched$1 r0 = (app.chalo.onboarding.languageselection.LanguageSelectionComponent$proceedToHomeScreenIfHomeScreenConfigFetched$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.onboarding.languageselection.LanguageSelectionComponent$proceedToHomeScreenIfHomeScreenConfigFetched$1 r0 = new app.chalo.onboarding.languageselection.LanguageSelectionComponent$proceedToHomeScreenIfHomeScreenConfigFetched$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.ResultKt.b(r10)
            goto Lb0
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L36:
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Exception -> L9d
            goto Lb0
        L3b:
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Exception -> L9d
            goto L5f
        L3f:
            kotlin.ResultKt.b(r10)
            ib0 r10 = new ib0
            r2 = 23
            r10.<init>(r2)
            r9.E0(r10)
            r0.label = r5     // Catch: java.lang.Exception -> L9d
            app.chalo.manager.homescreen.HomeScreenConfigManager r10 = r9.r     // Catch: java.lang.Exception -> L9d
            app.chalo.providers.cityprovider.CityProvider r2 = r9.s     // Catch: java.lang.Exception -> L9d
            java.lang.String r2 = r2.h()     // Catch: java.lang.Exception -> L9d
            app.chalo.homescreen.data.model.app.HomeScreenConfigGetType r5 = app.chalo.homescreen.data.model.app.HomeScreenConfigGetType.REFRESH_CONFIG_WHEN_LANGUAGE_CHANGED     // Catch: java.lang.Exception -> L9d
            java.lang.Object r10 = r10.b(r2, r5, r0)     // Catch: java.lang.Exception -> L9d
            if (r10 != r1) goto L5f
            goto Laf
        L5f:
            app.chalo.homescreen.data.model.app.HomeScreenConfigAppModel r10 = (app.chalo.homescreen.data.model.app.HomeScreenConfigAppModel) r10     // Catch: java.lang.Exception -> L9d
            if (r10 == 0) goto L8a
            ib0 r10 = new ib0     // Catch: java.lang.Exception -> L9d
            r2 = 24
            r10.<init>(r2)     // Catch: java.lang.Exception -> L9d
            r9.E0(r10)     // Catch: java.lang.Exception -> L9d
            app.chalo.scenes.ChaloNavigationManager r10 = r9.q     // Catch: java.lang.Exception -> L9d
            app.chalo.scenes.ChaloNavigationRequest$Navigate r2 = new app.chalo.scenes.ChaloNavigationRequest$Navigate     // Catch: java.lang.Exception -> L9d
            app.chalo.scenes.args.HomeArgs r5 = new app.chalo.scenes.args.HomeArgs     // Catch: java.lang.Exception -> L9d
            r6 = 7
            r7 = 0
            r5.<init>(r7, r7, r6)     // Catch: java.lang.Exception -> L9d
            app.chalo.scenes.ChaloNavOptions r6 = new app.chalo.scenes.ChaloNavOptions     // Catch: java.lang.Exception -> L9d
            app.chalo.scenes.PopUpToConfig$ClearAll r8 = new app.chalo.scenes.PopUpToConfig$ClearAll     // Catch: java.lang.Exception -> L9d
            r8.<init>()     // Catch: java.lang.Exception -> L9d
            r6.<init>(r8, r4)     // Catch: java.lang.Exception -> L9d
            r4 = 4
            r2.<init>(r5, r6, r7, r4)     // Catch: java.lang.Exception -> L9d
            r10.b(r2)     // Catch: java.lang.Exception -> L9d
            goto Lb0
        L8a:
            ib0 r10 = new ib0     // Catch: java.lang.Exception -> L9d
            r2 = 25
            r10.<init>(r2)     // Catch: java.lang.Exception -> L9d
            r9.E0(r10)     // Catch: java.lang.Exception -> L9d
            r0.label = r4     // Catch: java.lang.Exception -> L9d
            java.lang.Object r10 = r9.M0(r0)     // Catch: java.lang.Exception -> L9d
            if (r10 != r1) goto Lb0
            goto Laf
        L9d:
            ib0 r10 = new ib0
            r2 = 26
            r10.<init>(r2)
            r9.E0(r10)
            r0.label = r3
            java.lang.Object r10 = r9.M0(r0)
            if (r10 != r1) goto Lb0
        Laf:
            return r1
        Lb0:
            kotlin.Unit r10 = kotlin.Unit.f17538a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.onboarding.languageselection.LanguageSelectionComponent.K0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void L0(LanguageSelectionIntent languageSelectionIntent) {
        C0(languageSelectionIntent);
        boolean z = languageSelectionIntent instanceof LanguageSelectionIntent.InitializationIntent;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new LanguageSelectionComponent$handleInitializationIntent$1((LanguageSelectionIntent.InitializationIntent) languageSelectionIntent, this, null), 3);
            return;
        }
        if (languageSelectionIntent instanceof LanguageSelectionIntent.LanguageSelected) {
            LanguageSelectionIntent.LanguageSelected languageSelected = (LanguageSelectionIntent.LanguageSelected) languageSelectionIntent;
            if (this.d) {
                return;
            }
            E0(new dd0(languageSelected, 1));
            return;
        }
        boolean zEquals = languageSelectionIntent.equals(LanguageSelectionIntent.TncTextClicked.f6656a);
        StateFlow stateFlow = this.f;
        if (zEquals) {
            String str = ((LanguageSelectionDataState) stateFlow.getValue()).h;
            String str2 = StringsKt.F(str) ? null : str;
            if (str2 != null) {
                r0(new LanguageSelectionEffect.OpenUrlInBrowser(str2));
                return;
            }
            return;
        }
        if (languageSelectionIntent.equals(LanguageSelectionIntent.ContinueClicked.f6652a)) {
            String str3 = ((LanguageSelectionDataState) stateFlow.getValue()).g.b;
            if (this.m.c().equalsIgnoreCase(str3) || this.n.a().contains(str3)) {
                BuildersKt.d(contextScope, null, null, new LanguageSelectionComponent$updateLocaleAndRefreshConfig$1(this, null), 3);
                return;
            } else {
                E0(new ib0(20));
                BuildersKt.d(contextScope, null, null, new LanguageSelectionComponent$requestLanguageInstall$1(this, str3, null), 3);
                return;
            }
        }
        if (!(languageSelectionIntent instanceof LanguageSelectionIntent.SnackbarRetryClicked)) {
            throw new NoWhenBranchMatchedException();
        }
        LanguageSelectionSnackbarType languageSelectionSnackbarType = ((LanguageSelectionIntent.SnackbarRetryClicked) languageSelectionIntent).f6655a;
        if (languageSelectionSnackbarType instanceof LanguageSelectionSnackbarType.ChaloConfigFetchFailed) {
            E0(new ib0(21));
            Job job = this.u;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            this.u = BuildersKt.d(contextScope, null, null, new LanguageSelectionComponent$fetchRemoteConfigAndHandleResult$1(this, true, null), 3);
            return;
        }
        if (Intrinsics.d(languageSelectionSnackbarType, LanguageSelectionSnackbarType.LanguageDownloadFailed.f6660a) || Intrinsics.d(languageSelectionSnackbarType, LanguageSelectionSnackbarType.None.f6661a)) {
            return;
        }
        if (!(languageSelectionSnackbarType instanceof LanguageSelectionSnackbarType.HomeScreenConfigFetchFailed)) {
            throw new NoWhenBranchMatchedException();
        }
        E0(new ib0(22));
        BuildersKt.d(contextScope, null, null, new LanguageSelectionComponent$handleSnackbarRetryClick$3(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M0(ContinuationImpl continuationImpl) {
        LanguageSelectionComponent$showHomeScreenConfigFetchFailedSnackbar$1 languageSelectionComponent$showHomeScreenConfigFetchFailedSnackbar$1;
        if (continuationImpl instanceof LanguageSelectionComponent$showHomeScreenConfigFetchFailedSnackbar$1) {
            languageSelectionComponent$showHomeScreenConfigFetchFailedSnackbar$1 = (LanguageSelectionComponent$showHomeScreenConfigFetchFailedSnackbar$1) continuationImpl;
            int i = languageSelectionComponent$showHomeScreenConfigFetchFailedSnackbar$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageSelectionComponent$showHomeScreenConfigFetchFailedSnackbar$1.label = i - Integer.MIN_VALUE;
            } else {
                languageSelectionComponent$showHomeScreenConfigFetchFailedSnackbar$1 = new LanguageSelectionComponent$showHomeScreenConfigFetchFailedSnackbar$1(this, continuationImpl);
            }
        } else {
            languageSelectionComponent$showHomeScreenConfigFetchFailedSnackbar$1 = new LanguageSelectionComponent$showHomeScreenConfigFetchFailedSnackbar$1(this, continuationImpl);
        }
        Object objB = languageSelectionComponent$showHomeScreenConfigFetchFailedSnackbar$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = languageSelectionComponent$showHomeScreenConfigFetchFailedSnackbar$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            languageSelectionComponent$showHomeScreenConfigFetchFailedSnackbar$1.label = 1;
            objB = this.p.b(StringEnum.HOME_SCREEN_CONFIG_FETCH_FAILED, new Object[0], languageSelectionComponent$showHomeScreenConfigFetchFailedSnackbar$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        E0(new n10((String) objB, 17));
        return Unit.f17538a;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new LanguageSelectionDataState(false, LanguageSelectionSnackbarType.None.f6661a, false, false, LanguageSelectionSourceType.NONE, EmptyList.f17557a, new LanguageDetails("", ""), "");
    }
}
