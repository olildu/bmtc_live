package app.chalo.chalobususerprofile.ui.compose;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference;
import app.chalo.chalobususerprofile.data.model.SurveyStep;
import app.chalo.chalobususerprofile.domain.GetPremiumBusUserSurveyPreferenceUseCase;
import app.chalo.constants.Source;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.ChaloBusUserProfileSurveyArgs;
import app.chalo.scenes.args.UniversalPickerHeaderIcon;
import app.chalo.universalsearch.data.UniversalSearchOption;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import app.chalo.usercommutepreference.domain.UpdateCommutePreferenceUseCase;
import app.chalo.utils.KUUID;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.ah;
import defpackage.bi;
import defpackage.ch;
import defpackage.di;
import defpackage.f;
import defpackage.i4;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyDataState;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyViewState;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveySideEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloBusUserProfileSurveyComponent extends ChaloBaseStateMviComponent<ChaloBusUserProfileSurveyIntent, ChaloBusUserProfileSurveyDataState, ChaloBusUserProfileSurveyViewState, ChaloBusUserProfileSurveySideEffect> {
    public final ChaloBusUserProfileSurveyArgs k;
    public final GetPremiumBusUserSurveyPreferenceUseCase l;
    public final UpdateCommutePreferenceUseCase m;
    public final ChaloNavigationManager n;
    public final StringProvider o;
    public final KotlinToastManager p;
    public final UniversalSearchResultStateManager q;
    public final TimeUtilsContract r;
    public final ChaloBusUserProfileSurveyUiStateFactory s;
    public final AnalyticsContract t;
    public Job u;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyComponent$Companion;", "", "", "DEFAULT_WORK_START_HOUR_24", "I", "DEFAULT_WORK_END_HOUR_24", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1204a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[TimePickerType.values().length];
            try {
                iArr[TimePickerType.WORK_START_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimePickerType.WORK_END_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f1204a = iArr;
            int[] iArr2 = new int[GetPremiumBusUserSurveyPreferenceUseCase.GetPremiumBusUserSurveyPreferenceError.values().length];
            try {
                iArr2[GetPremiumBusUserSurveyPreferenceUseCase.GetPremiumBusUserSurveyPreferenceError.USER_NOT_LOGGED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[GetPremiumBusUserSurveyPreferenceUseCase.GetPremiumBusUserSurveyPreferenceError.NO_PREFERENCE_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GetPremiumBusUserSurveyPreferenceUseCase.GetPremiumBusUserSurveyPreferenceError.INVALID_CITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
            int[] iArr3 = new int[PBUserProfileSurveyStepNavigator.Finish.values().length];
            try {
                iArr3[PBUserProfileSurveyStepNavigator.Finish.CLOSE_FLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[PBUserProfileSurveyStepNavigator.Finish.SHOW_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[PBUserProfileSurveyStepNavigator.Finish.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            c = iArr3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusUserProfileSurveyComponent(ComponentContext componentContext, ChaloBusUserProfileSurveyArgs args, GetPremiumBusUserSurveyPreferenceUseCase getPremiumBusUserSurveyPreferenceUseCase, UpdateCommutePreferenceUseCase updateCommutePreferenceUseCase, ChaloNavigationManager chaloNavigationManager, StringProvider stringProvider, KotlinToastManager kotlinToastManager, UniversalSearchResultStateManager universalSearchResultStateManager, TimeUtilsContract timeUtilsContract, ChaloBusUserProfileSurveyUiStateFactory chaloBusUserProfileSurveyUiStateFactory, AnalyticsContract analyticsContract) {
        super(componentContext);
        Intrinsics.i(componentContext, "componentContext");
        Intrinsics.i(args, "args");
        this.k = args;
        this.l = getPremiumBusUserSurveyPreferenceUseCase;
        this.m = updateCommutePreferenceUseCase;
        this.n = chaloNavigationManager;
        this.o = stringProvider;
        this.p = kotlinToastManager;
        this.q = universalSearchResultStateManager;
        this.r = timeUtilsContract;
        this.s = chaloBusUserProfileSurveyUiStateFactory;
        this.t = analyticsContract;
        O0(new ChaloBusUserProfileSurveyIntent.InitializationIntent(args.b));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r11 == r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e6, code lost:
    
        if (r11 == r3) goto L34;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F0(app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent r9, app.chalo.chalobususerprofile.domain.GetPremiumBusUserSurveyPreferenceUseCase.GetPremiumBusUserSurveyPreferenceError r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent.F0(app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent, app.chalo.chalobususerprofile.domain.GetPremiumBusUserSurveyPreferenceUseCase$GetPremiumBusUserSurveyPreferenceError, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void G0(ChaloBusUserProfileSurveyComponent chaloBusUserProfileSurveyComponent, PBUserProfileSurveyPreference pBUserProfileSurveyPreference) {
        chaloBusUserProfileSurveyComponent.getClass();
        if (pBUserProfileSurveyPreference.c().isEmpty()) {
            chaloBusUserProfileSurveyComponent.K0();
            return;
        }
        ArrayList arrayListC = pBUserProfileSurveyPreference.c();
        ArrayList arrayList = new ArrayList(CollectionsKt.v(arrayListC, 10));
        int size = arrayListC.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListC.get(i);
            i++;
            arrayList.add(((SurveyStep) obj).toInputState());
        }
        chaloBusUserProfileSurveyComponent.E0(new ch(pBUserProfileSurveyPreference, 6));
        chaloBusUserProfileSurveyComponent.R0(arrayList);
        chaloBusUserProfileSurveyComponent.M0(0);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        if (r3.N0(r2, (java.lang.String) r15, r4, r5, r6) == r0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H0(app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r14.getClass()
            boolean r0 = r15 instanceof app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$launchUniversalSearchForHomeLocation$1
            if (r0 == 0) goto L17
            r0 = r15
            app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$launchUniversalSearchForHomeLocation$1 r0 = (app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$launchUniversalSearchForHomeLocation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.label = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$launchUniversalSearchForHomeLocation$1 r0 = new app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$launchUniversalSearchForHomeLocation$1
            r0.<init>(r14, r15)
            goto L15
        L1d:
            java.lang.Object r15 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L43
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            kotlin.ResultKt.b(r15)
            goto L85
        L2f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L37:
            java.lang.Object r1 = r6.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r6.L$0
            app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent r3 = (app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent) r3
            kotlin.ResultKt.b(r15)
            goto L61
        L43:
            kotlin.ResultKt.b(r15)
            app.chalo.universalsearch.data.UniversalSearchFlowSource r15 = app.chalo.universalsearch.data.UniversalSearchFlowSource.HOME_PREFERENCE_SELECTION
            java.lang.String r1 = r15.getSourceName()
            app.chalo.providers.stringprovider.StringProvider r15 = r14.o
            app.chalo.providers.stringprovider.StringEnum r4 = app.chalo.providers.stringprovider.StringEnum.PB_USER_PROFILE_SURVEY_ADD_HOME
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6.L$0 = r14
            r6.L$1 = r1
            r6.label = r3
            java.lang.Object r15 = r15.b(r4, r5, r6)
            if (r15 != r0) goto L60
            goto L84
        L60:
            r3 = r14
        L61:
            java.lang.String r15 = (java.lang.String) r15
            app.chalo.scenes.args.UniversalPickerHeaderIcon r4 = app.chalo.scenes.args.UniversalPickerHeaderIcon.HOME
            app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$launchUniversalSearchForHomeLocation$2 r5 = new app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$launchUniversalSearchForHomeLocation$2
            java.lang.String r12 = "collectHomeLocationResult(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r13 = 0
            r8 = 2
            java.lang.Class<app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent> r10 = app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent.class
            java.lang.String r11 = "collectHomeLocationResult"
            r9 = r14
            r7 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r14 = 0
            r6.L$0 = r14
            r6.L$1 = r14
            r6.label = r2
            r2 = r1
            r1 = r3
            r3 = r15
            java.lang.Object r14 = r1.N0(r2, r3, r4, r5, r6)
            if (r14 != r0) goto L85
        L84:
            return r0
        L85:
            kotlin.Unit r14 = kotlin.Unit.f17538a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent.H0(app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        if (r3.N0(r2, (java.lang.String) r15, r4, r5, r6) == r0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I0(app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r14.getClass()
            boolean r0 = r15 instanceof app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$launchUniversalSearchForWorkLocation$1
            if (r0 == 0) goto L17
            r0 = r15
            app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$launchUniversalSearchForWorkLocation$1 r0 = (app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$launchUniversalSearchForWorkLocation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.label = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$launchUniversalSearchForWorkLocation$1 r0 = new app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$launchUniversalSearchForWorkLocation$1
            r0.<init>(r14, r15)
            goto L15
        L1d:
            java.lang.Object r15 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L43
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            kotlin.ResultKt.b(r15)
            goto L85
        L2f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L37:
            java.lang.Object r1 = r6.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r6.L$0
            app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent r3 = (app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent) r3
            kotlin.ResultKt.b(r15)
            goto L61
        L43:
            kotlin.ResultKt.b(r15)
            app.chalo.universalsearch.data.UniversalSearchFlowSource r15 = app.chalo.universalsearch.data.UniversalSearchFlowSource.WORK_PREFERECNCE_SELECTION
            java.lang.String r1 = r15.getSourceName()
            app.chalo.providers.stringprovider.StringProvider r15 = r14.o
            app.chalo.providers.stringprovider.StringEnum r4 = app.chalo.providers.stringprovider.StringEnum.PB_USER_PROFILE_SURVEY_ADD_WORK
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6.L$0 = r14
            r6.L$1 = r1
            r6.label = r3
            java.lang.Object r15 = r15.b(r4, r5, r6)
            if (r15 != r0) goto L60
            goto L84
        L60:
            r3 = r14
        L61:
            java.lang.String r15 = (java.lang.String) r15
            app.chalo.scenes.args.UniversalPickerHeaderIcon r4 = app.chalo.scenes.args.UniversalPickerHeaderIcon.WORK
            app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$launchUniversalSearchForWorkLocation$2 r5 = new app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$launchUniversalSearchForWorkLocation$2
            java.lang.String r12 = "collectWorkLocationResult(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r13 = 0
            r8 = 2
            java.lang.Class<app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent> r10 = app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent.class
            java.lang.String r11 = "collectWorkLocationResult"
            r9 = r14
            r7 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r14 = 0
            r6.L$0 = r14
            r6.L$1 = r14
            r6.label = r2
            r2 = r1
            r1 = r3
            r3 = r15
            java.lang.Object r14 = r1.N0(r2, r3, r4, r5, r6)
            if (r14 != r0) goto L85
        L84:
            return r0
        L85:
            kotlin.Unit r14 = kotlin.Unit.f17538a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent.I0(app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static /* synthetic */ void Q0(ChaloBusUserProfileSurveyComponent chaloBusUserProfileSurveyComponent, String str) {
        chaloBusUserProfileSurveyComponent.P0(str, MapsKt.d());
    }

    public static Map U0(RecentPlaceAppModel recentPlaceAppModel) {
        return MapsKt.i(new Pair("placeId", recentPlaceAppModel.e), new Pair("placeCityId", recentPlaceAppModel.h), new Pair("placeSearchPartner", recentPlaceAppModel.f));
    }

    public final void J0() {
        PBUserProfileSurveyStepNavigator.Result result;
        ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState = (ChaloBusUserProfileSurveyDataState) this.f.getValue();
        List sequence = chaloBusUserProfileSurveyDataState.b;
        int i = chaloBusUserProfileSurveyDataState.c;
        Intrinsics.i(sequence, "sequence");
        List list = sequence;
        if (i >= 0) {
            List list2 = sequence;
            if (i < list2.size()) {
                list = sequence;
                ArrayList arrayListE0 = CollectionsKt.E0(list2);
                PBUserProfileSurveyInputState it = (PBUserProfileSurveyInputState) arrayListE0.get(i);
                Intrinsics.i(it, "it");
                arrayListE0.set(i, PBUserProfileSurveyStepNavigator.b(it, false));
                list = arrayListE0;
            }
        }
        list = sequence;
        if (list.isEmpty() || i >= CollectionsKt.K(list)) {
            if (i < 0) {
                i = 0;
            }
            result = new PBUserProfileSurveyStepNavigator.Result(list, i, PBUserProfileSurveyStepNavigator.a(list));
        } else {
            result = new PBUserProfileSurveyStepNavigator.Result(list, i + 1, PBUserProfileSurveyStepNavigator.Finish.NONE);
        }
        E0(new f(24, chaloBusUserProfileSurveyDataState, result));
        int i2 = WhenMappings.c[result.c.ordinal()];
        if (i2 == 1) {
            E0(new ah(21));
            BuildersKt.d(this.j, null, null, new ChaloBusUserProfileSurveyComponent$saveAndClose$2(this, null), 3);
        } else if (i2 == 2) {
            T0();
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            M0(result.b);
        }
    }

    public final void K0() {
        q0(new i4(this, 28));
    }

    public final void L0() {
        PBUserProfileSurveyStepNavigator.Result result;
        List list;
        ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState = (ChaloBusUserProfileSurveyDataState) this.f.getValue();
        List list2 = chaloBusUserProfileSurveyDataState.b;
        int i = chaloBusUserProfileSurveyDataState.c;
        PBUserProfileSurveyInputState pBUserProfileSurveyInputState = (PBUserProfileSurveyInputState) CollectionsKt.L(i, list2);
        P0("pbUserProfileSurvey back clicked", pBUserProfileSurveyInputState != null ? vo1.s("pbSurveyStep", PBUserProfileSurveyInputStateKt.a(pBUserProfileSurveyInputState)) : MapsKt.d());
        List sequence = chaloBusUserProfileSurveyDataState.b;
        Intrinsics.i(sequence, "sequence");
        if (sequence.isEmpty() || i <= 0) {
            result = new PBUserProfileSurveyStepNavigator.Result(sequence, 0, PBUserProfileSurveyStepNavigator.Finish.CLOSE_FLOW);
        } else {
            List list3 = sequence;
            int iF = RangesKt.f(i - 1, CollectionsKt.J(list3));
            if (iF >= 0 && iF < list3.size()) {
                list = sequence;
                list = sequence;
                ArrayList arrayListE0 = CollectionsKt.E0(list3);
                PBUserProfileSurveyInputState it = (PBUserProfileSurveyInputState) arrayListE0.get(iF);
                Intrinsics.i(it, "it");
                arrayListE0.set(iF, PBUserProfileSurveyStepNavigator.b(it, false));
                list = arrayListE0;
            }
            list = sequence;
            list = sequence;
            list = sequence;
            result = new PBUserProfileSurveyStepNavigator.Result(list, iF, PBUserProfileSurveyStepNavigator.Finish.NONE);
        }
        if (result.c == PBUserProfileSurveyStepNavigator.Finish.CLOSE_FLOW) {
            K0();
        } else {
            E0(new bi(result, 0));
            M0(result.b);
        }
    }

    public final void M0(int i) {
        PBUserProfileSurveyInputState pBUserProfileSurveyInputState = (PBUserProfileSurveyInputState) CollectionsKt.L(i, ((ChaloBusUserProfileSurveyDataState) this.f.getValue()).b);
        if (pBUserProfileSurveyInputState == null) {
            return;
        }
        P0("pbUserProfileSurvey step shown", MapsKt.i(new Pair("pbSurveyStep", PBUserProfileSurveyInputStateKt.a(pBUserProfileSurveyInputState)), new Pair("pbSurveyStepIndex", Integer.valueOf(i))));
        boolean z = pBUserProfileSurveyInputState instanceof PBUserProfileSurveyInputState.WorkLocationInputPBUserProfile;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new ChaloBusUserProfileSurveyComponent$launchStepForIndex$1(this, null), 3);
        } else if (pBUserProfileSurveyInputState instanceof PBUserProfileSurveyInputState.HomeLocationInputPBUserProfile) {
            BuildersKt.d(contextScope, null, null, new ChaloBusUserProfileSurveyComponent$launchStepForIndex$2(this, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object N0(String str, String str2, UniversalPickerHeaderIcon universalPickerHeaderIcon, Function2 function2, ContinuationImpl continuationImpl) {
        ChaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1 chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1;
        String strA;
        String strA2;
        UniversalPickerHeaderIcon universalPickerHeaderIcon2;
        Function2 function3;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Job job;
        if (continuationImpl instanceof ChaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1) {
            chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1 = (ChaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1) continuationImpl;
            int i = chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1 = new ChaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1(this, continuationImpl);
            }
        } else {
            chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1 = new ChaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1(this, continuationImpl);
        }
        Object obj = chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            strA = KUUID.a();
            ChaloJson chaloJson = ChaloJson.f6455a;
            UniversalSearchOptions universalSearchOptions = new UniversalSearchOptions(SetsKt.g(new UniversalSearchOption.PLACES(false, false)));
            try {
                Json json = ChaloJson.b;
                json.getClass();
                strA2 = json.a(UniversalSearchOptions.INSTANCE.serializer(), universalSearchOptions);
            } catch (Exception unused) {
                strA2 = null;
            }
            if (strA2 == null) {
                return unit;
            }
            ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState = (ChaloBusUserProfileSurveyDataState) this.f.getValue();
            if (chaloBusUserProfileSurveyDataState.b.isEmpty()) {
                universalPickerHeaderIcon2 = universalPickerHeaderIcon;
                function3 = function2;
                str3 = str;
                str4 = strA;
                str5 = str2;
                str6 = null;
                str7 = strA2;
            } else {
                StringEnum stringEnum = StringEnum.PB_USER_PROFILE_SURVEY_STEP_X_OF_Y;
                Object[] objArr = {new Integer(chaloBusUserProfileSurveyDataState.c + 1), new Integer(chaloBusUserProfileSurveyDataState.b.size())};
                chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1.L$0 = str;
                chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1.L$1 = str2;
                universalPickerHeaderIcon2 = universalPickerHeaderIcon;
                chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1.L$2 = universalPickerHeaderIcon2;
                function3 = function2;
                chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1.L$3 = function3;
                chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1.L$4 = strA;
                chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1.L$5 = strA2;
                chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1.label = 1;
                Object objB = this.o.b(stringEnum, objArr, chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str8 = strA2;
                obj = objB;
                str9 = str2;
                str10 = str;
            }
            UniversalPickerHeaderIcon universalPickerHeaderIcon3 = universalPickerHeaderIcon2;
            Function2 function4 = function3;
            job = this.u;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            this.u = BuildersKt.d(this.j, null, null, new ChaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$2(function4, str4, this, str7, str3, str5, str6, universalPickerHeaderIcon3, null), 3);
            return unit;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str8 = (String) chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1.L$5;
        strA = (String) chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1.L$4;
        Function2 function5 = (Function2) chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1.L$3;
        UniversalPickerHeaderIcon universalPickerHeaderIcon4 = (UniversalPickerHeaderIcon) chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1.L$2;
        str9 = (String) chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1.L$1;
        str10 = (String) chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$1.L$0;
        ResultKt.b(obj);
        function3 = function5;
        universalPickerHeaderIcon2 = universalPickerHeaderIcon4;
        String str11 = strA;
        str7 = str8;
        str4 = str11;
        str3 = str10;
        str5 = str9;
        str6 = (String) obj;
        UniversalPickerHeaderIcon universalPickerHeaderIcon5 = universalPickerHeaderIcon2;
        Function2 function6 = function3;
        job = this.u;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.u = BuildersKt.d(this.j, null, null, new ChaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$2(function6, str4, this, str7, str3, str5, str6, universalPickerHeaderIcon5, null), 3);
        return unit;
    }

    public final void O0(ChaloBusUserProfileSurveyIntent intent) {
        TimePickerSelection timePickerSelection;
        Long l;
        Pair pair;
        Pair pairF;
        PBUserProfileSurveyInputState pBUserProfileSurveyInputState;
        PBUserProfileSurveyStepNavigator.Result result;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof ChaloBusUserProfileSurveyIntent.InitializationIntent;
        ContextScope contextScope = this.j;
        if (z) {
            if (this.d) {
                return;
            }
            this.d = true;
            BuildersKt.d(contextScope, null, null, new ChaloBusUserProfileSurveyComponent$handleInitializationIntent$1(this, null), 3);
            return;
        }
        if (intent instanceof ChaloBusUserProfileSurveyIntent.BackClicked) {
            L0();
            return;
        }
        boolean z2 = intent instanceof ChaloBusUserProfileSurveyIntent.SkipClicked;
        StateFlow stateFlow = this.f;
        if (z2) {
            ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState = (ChaloBusUserProfileSurveyDataState) stateFlow.getValue();
            boolean z3 = chaloBusUserProfileSurveyDataState.d;
            int i = chaloBusUserProfileSurveyDataState.c;
            List list = chaloBusUserProfileSurveyDataState.b;
            if (z3) {
                return;
            }
            PBUserProfileSurveyInputState pBUserProfileSurveyInputState2 = (PBUserProfileSurveyInputState) CollectionsKt.L(i, list);
            P0("pbUserProfileSurvey skip clicked", pBUserProfileSurveyInputState2 != null ? vo1.s("pbSurveyStep", PBUserProfileSurveyInputStateKt.a(pBUserProfileSurveyInputState2)) : MapsKt.d());
            List list2 = list;
            if (i >= 0) {
                List list3 = list;
                if (i < list3.size()) {
                    list2 = list;
                    ArrayList arrayListE0 = CollectionsKt.E0(list3);
                    PBUserProfileSurveyInputState it = (PBUserProfileSurveyInputState) arrayListE0.get(i);
                    Intrinsics.i(it, "it");
                    arrayListE0.set(i, PBUserProfileSurveyStepNavigator.b(it, true));
                    list2 = arrayListE0;
                }
            }
            list2 = list;
            if (list2.isEmpty() || i >= CollectionsKt.K(list2)) {
                result = new PBUserProfileSurveyStepNavigator.Result(list2, i >= 0 ? i : 0, PBUserProfileSurveyStepNavigator.a(list2));
            } else {
                result = new PBUserProfileSurveyStepNavigator.Result(list2, i + 1, PBUserProfileSurveyStepNavigator.Finish.NONE);
            }
            E0(new bi(result, 1));
            int i2 = WhenMappings.c[result.c.ordinal()];
            if (i2 == 1) {
                E0(new ah(21));
                BuildersKt.d(contextScope, null, null, new ChaloBusUserProfileSurveyComponent$saveAndClose$2(this, null), 3);
                return;
            } else if (i2 == 2) {
                T0();
                return;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                M0(result.b);
                return;
            }
        }
        if (intent instanceof ChaloBusUserProfileSurveyIntent.NextClicked) {
            ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState2 = (ChaloBusUserProfileSurveyDataState) stateFlow.getValue();
            if (chaloBusUserProfileSurveyDataState2.d || (pBUserProfileSurveyInputState = (PBUserProfileSurveyInputState) CollectionsKt.L(chaloBusUserProfileSurveyDataState2.c, chaloBusUserProfileSurveyDataState2.b)) == null) {
                return;
            }
            if (pBUserProfileSurveyInputState instanceof PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) {
                PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile workTimingInputPBUserProfile = (PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) pBUserProfileSurveyInputState;
                if (workTimingInputPBUserProfile.c == null || workTimingInputPBUserProfile.e == null) {
                    return;
                }
                P0("pbUserProfileSurvey next clicked", MapsKt.h(new Pair("pbSurveyStep", PBUserProfileSurveyInputStateKt.a(pBUserProfileSurveyInputState))));
                J0();
                return;
            }
            if (!(pBUserProfileSurveyInputState instanceof PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile)) {
                if (!(pBUserProfileSurveyInputState instanceof PBUserProfileSurveyInputState.HomeLocationInputPBUserProfile) && !(pBUserProfileSurveyInputState instanceof PBUserProfileSurveyInputState.WorkLocationInputPBUserProfile)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            } else {
                if (((PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile) pBUserProfileSurveyInputState).c == null) {
                    return;
                }
                P0("pbUserProfileSurvey next clicked", MapsKt.h(new Pair("pbSurveyStep", PBUserProfileSurveyInputStateKt.a(pBUserProfileSurveyInputState))));
                J0();
                return;
            }
        }
        boolean z4 = intent instanceof ChaloBusUserProfileSurveyIntent.TimeFieldClicked;
        TimeUtilsContract timeUtilsContract = this.r;
        if (z4) {
            ChaloBusUserProfileSurveyIntent.TimeFieldClicked timeFieldClicked = (ChaloBusUserProfileSurveyIntent.TimeFieldClicked) intent;
            Object objL = CollectionsKt.L(((ChaloBusUserProfileSurveyDataState) stateFlow.getValue()).c, ((ChaloBusUserProfileSurveyDataState) stateFlow.getValue()).b);
            PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile workTimingInputPBUserProfile2 = objL instanceof PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile ? (PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) objL : null;
            if (workTimingInputPBUserProfile2 == null) {
                return;
            }
            TimePickerType timePickerType = timeFieldClicked.f1216a;
            P0("pbUserProfileSurvey time picker opened", MapsKt.h(new Pair("pbSurveyTimePickerType", timePickerType.name())));
            int[] iArr = WhenMappings.f1204a;
            int i3 = iArr[timePickerType.ordinal()];
            if (i3 == 1) {
                l = workTimingInputPBUserProfile2.c;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                l = workTimingInputPBUserProfile2.e;
            }
            if (l != null) {
                pairF = timeUtilsContract.F(l.longValue());
            } else {
                int i4 = iArr[timePickerType.ordinal()];
                if (i4 == 1) {
                    pair = new Pair(9, 0);
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pair = new Pair(18, 0);
                }
                pairF = pair;
            }
            int iIntValue = ((Number) pairF.getFirst()).intValue();
            E0(new di(timeUtilsContract.r(iIntValue), ((Number) pairF.getSecond()).intValue(), 0, timeFieldClicked, iIntValue < 12 ? "AM" : "PM"));
            return;
        }
        int i5 = 20;
        if (intent instanceof ChaloBusUserProfileSurveyIntent.TimePickerDismissed) {
            E0(new ah(i5));
            return;
        }
        if (intent instanceof ChaloBusUserProfileSurveyIntent.TimePickerSelectionChanged) {
            E0(new ch((ChaloBusUserProfileSurveyIntent.TimePickerSelectionChanged) intent, 5));
            return;
        }
        if (intent instanceof ChaloBusUserProfileSurveyIntent.TimePickerDoneClicked) {
            ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState3 = (ChaloBusUserProfileSurveyDataState) stateFlow.getValue();
            TimePickerType timePickerType2 = chaloBusUserProfileSurveyDataState3.e;
            if (timePickerType2 == null || (timePickerSelection = chaloBusUserProfileSurveyDataState3.f) == null) {
                return;
            }
            long jF = timeUtilsContract.f(timeUtilsContract.v(RangesKt.e(timePickerSelection.f1237a, 1, 12), timePickerSelection.c), RangesKt.e(timePickerSelection.b, 0, 59));
            P0("pbUserProfileSurvey time picker done clicked", MapsKt.i(new Pair("pbSurveyTimePickerType", timePickerType2.name()), new Pair("pbSurveyTimingValue", Long.valueOf(jF))));
            E0(new ah(i5));
            int i6 = WhenMappings.f1204a[timePickerType2.ordinal()];
            if (i6 == 1) {
                O0(new ChaloBusUserProfileSurveyIntent.WorkTimingStartTimeChanged(jF));
                return;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                O0(new ChaloBusUserProfileSurveyIntent.WorkTimingEndTimeChanged(jF));
                return;
            }
        }
        if (intent instanceof ChaloBusUserProfileSurveyIntent.SuccessBackToHomeClicked) {
            Q0(this, "pbUserProfileSurvey success back to home clicked");
            K0();
            return;
        }
        if (intent instanceof ChaloBusUserProfileSurveyIntent.HomeLocationSelected) {
            RecentPlaceAppModel recentPlaceAppModel = ((ChaloBusUserProfileSurveyIntent.HomeLocationSelected) intent).f1210a;
            ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState4 = (ChaloBusUserProfileSurveyDataState) stateFlow.getValue();
            List list4 = chaloBusUserProfileSurveyDataState4.b;
            int i7 = chaloBusUserProfileSurveyDataState4.c;
            Object objL2 = CollectionsKt.L(i7, list4);
            PBUserProfileSurveyInputState.HomeLocationInputPBUserProfile homeLocationInputPBUserProfile = (PBUserProfileSurveyInputState.HomeLocationInputPBUserProfile) (objL2 instanceof PBUserProfileSurveyInputState.HomeLocationInputPBUserProfile ? objL2 : null);
            if (homeLocationInputPBUserProfile != null) {
                final ArrayList arrayListE1 = CollectionsKt.E0(chaloBusUserProfileSurveyDataState4.b);
                arrayListE1.set(i7, new PBUserProfileSurveyInputState.HomeLocationInputPBUserProfile(homeLocationInputPBUserProfile.b, recentPlaceAppModel));
                E0(new Function1<ChaloBusUserProfileSurveyDataState, ChaloBusUserProfileSurveyDataState>() { // from class: app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$updateCurrentInputStep$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ChaloBusUserProfileSurveyDataState it2 = (ChaloBusUserProfileSurveyDataState) obj;
                        Intrinsics.i(it2, "it");
                        return ChaloBusUserProfileSurveyDataState.a(it2, null, arrayListE1, 0, false, null, null, false, 253);
                    }
                });
            }
            P0("pbUserProfileSurvey home location selected", U0(recentPlaceAppModel));
            J0();
            return;
        }
        if (intent instanceof ChaloBusUserProfileSurveyIntent.WorkLocationSelected) {
            RecentPlaceAppModel recentPlaceAppModel2 = ((ChaloBusUserProfileSurveyIntent.WorkLocationSelected) intent).f1220a;
            ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState5 = (ChaloBusUserProfileSurveyDataState) stateFlow.getValue();
            List list5 = chaloBusUserProfileSurveyDataState5.b;
            int i8 = chaloBusUserProfileSurveyDataState5.c;
            Object objL3 = CollectionsKt.L(i8, list5);
            PBUserProfileSurveyInputState.WorkLocationInputPBUserProfile workLocationInputPBUserProfile = (PBUserProfileSurveyInputState.WorkLocationInputPBUserProfile) (objL3 instanceof PBUserProfileSurveyInputState.WorkLocationInputPBUserProfile ? objL3 : null);
            if (workLocationInputPBUserProfile != null) {
                final ArrayList arrayListE2 = CollectionsKt.E0(chaloBusUserProfileSurveyDataState5.b);
                arrayListE2.set(i8, new PBUserProfileSurveyInputState.WorkLocationInputPBUserProfile(workLocationInputPBUserProfile.b, recentPlaceAppModel2));
                E0(new Function1<ChaloBusUserProfileSurveyDataState, ChaloBusUserProfileSurveyDataState>() { // from class: app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$updateCurrentInputStep$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ChaloBusUserProfileSurveyDataState it2 = (ChaloBusUserProfileSurveyDataState) obj;
                        Intrinsics.i(it2, "it");
                        return ChaloBusUserProfileSurveyDataState.a(it2, null, arrayListE2, 0, false, null, null, false, 253);
                    }
                });
            }
            P0("pbUserProfileSurvey work location selected", U0(recentPlaceAppModel2));
            J0();
            return;
        }
        if (intent instanceof ChaloBusUserProfileSurveyIntent.WorkTimingStartTimeChanged) {
            long j = ((ChaloBusUserProfileSurveyIntent.WorkTimingStartTimeChanged) intent).f1223a;
            ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState6 = (ChaloBusUserProfileSurveyDataState) stateFlow.getValue();
            List list6 = chaloBusUserProfileSurveyDataState6.b;
            int i9 = chaloBusUserProfileSurveyDataState6.c;
            Object objL4 = CollectionsKt.L(i9, list6);
            PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile workTimingInputPBUserProfile3 = (PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) (objL4 instanceof PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile ? objL4 : null);
            if (workTimingInputPBUserProfile3 != null) {
                final ArrayList arrayListE3 = CollectionsKt.E0(chaloBusUserProfileSurveyDataState6.b);
                arrayListE3.set(i9, PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile.b(workTimingInputPBUserProfile3, false, Long.valueOf(j), null, null, null, 29));
                E0(new Function1<ChaloBusUserProfileSurveyDataState, ChaloBusUserProfileSurveyDataState>() { // from class: app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$updateCurrentInputStep$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ChaloBusUserProfileSurveyDataState it2 = (ChaloBusUserProfileSurveyDataState) obj;
                        Intrinsics.i(it2, "it");
                        return ChaloBusUserProfileSurveyDataState.a(it2, null, arrayListE3, 0, false, null, null, false, 253);
                    }
                });
            }
            S0(Long.valueOf(j), "startTime");
            return;
        }
        if (intent instanceof ChaloBusUserProfileSurveyIntent.WorkTimingStartVariabilityChanged) {
            ChaloBusUserProfileSurveyIntent.WorkTimingStartVariabilityChanged workTimingStartVariabilityChanged = (ChaloBusUserProfileSurveyIntent.WorkTimingStartVariabilityChanged) intent;
            ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState7 = (ChaloBusUserProfileSurveyDataState) stateFlow.getValue();
            List list7 = chaloBusUserProfileSurveyDataState7.b;
            int i10 = chaloBusUserProfileSurveyDataState7.c;
            Object objL5 = CollectionsKt.L(i10, list7);
            PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile workTimingInputPBUserProfile4 = (PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) (objL5 instanceof PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile ? objL5 : null);
            if (workTimingInputPBUserProfile4 != null) {
                final ArrayList arrayListE4 = CollectionsKt.E0(chaloBusUserProfileSurveyDataState7.b);
                arrayListE4.set(i10, PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile.b(workTimingInputPBUserProfile4, false, null, workTimingStartVariabilityChanged.f1224a, null, null, 27));
                E0(new Function1<ChaloBusUserProfileSurveyDataState, ChaloBusUserProfileSurveyDataState>() { // from class: app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$updateCurrentInputStep$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ChaloBusUserProfileSurveyDataState it2 = (ChaloBusUserProfileSurveyDataState) obj;
                        Intrinsics.i(it2, "it");
                        return ChaloBusUserProfileSurveyDataState.a(it2, null, arrayListE4, 0, false, null, null, false, 253);
                    }
                });
            }
            S0(workTimingStartVariabilityChanged.f1224a.name(), "startVariability");
            return;
        }
        if (intent instanceof ChaloBusUserProfileSurveyIntent.WorkTimingEndTimeChanged) {
            long j2 = ((ChaloBusUserProfileSurveyIntent.WorkTimingEndTimeChanged) intent).f1221a;
            ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState8 = (ChaloBusUserProfileSurveyDataState) stateFlow.getValue();
            List list8 = chaloBusUserProfileSurveyDataState8.b;
            int i11 = chaloBusUserProfileSurveyDataState8.c;
            Object objL6 = CollectionsKt.L(i11, list8);
            PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile workTimingInputPBUserProfile5 = (PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) (objL6 instanceof PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile ? objL6 : null);
            if (workTimingInputPBUserProfile5 != null) {
                final ArrayList arrayListE5 = CollectionsKt.E0(chaloBusUserProfileSurveyDataState8.b);
                arrayListE5.set(i11, PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile.b(workTimingInputPBUserProfile5, false, null, null, Long.valueOf(j2), null, 23));
                E0(new Function1<ChaloBusUserProfileSurveyDataState, ChaloBusUserProfileSurveyDataState>() { // from class: app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$updateCurrentInputStep$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ChaloBusUserProfileSurveyDataState it2 = (ChaloBusUserProfileSurveyDataState) obj;
                        Intrinsics.i(it2, "it");
                        return ChaloBusUserProfileSurveyDataState.a(it2, null, arrayListE5, 0, false, null, null, false, 253);
                    }
                });
            }
            S0(Long.valueOf(j2), "endTime");
            return;
        }
        if (intent instanceof ChaloBusUserProfileSurveyIntent.WorkTimingEndVariabilityChanged) {
            ChaloBusUserProfileSurveyIntent.WorkTimingEndVariabilityChanged workTimingEndVariabilityChanged = (ChaloBusUserProfileSurveyIntent.WorkTimingEndVariabilityChanged) intent;
            ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState9 = (ChaloBusUserProfileSurveyDataState) stateFlow.getValue();
            List list9 = chaloBusUserProfileSurveyDataState9.b;
            int i12 = chaloBusUserProfileSurveyDataState9.c;
            Object objL7 = CollectionsKt.L(i12, list9);
            PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile workTimingInputPBUserProfile6 = (PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) (objL7 instanceof PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile ? objL7 : null);
            if (workTimingInputPBUserProfile6 != null) {
                final ArrayList arrayListE6 = CollectionsKt.E0(chaloBusUserProfileSurveyDataState9.b);
                arrayListE6.set(i12, PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile.b(workTimingInputPBUserProfile6, false, null, null, null, workTimingEndVariabilityChanged.f1222a, 15));
                E0(new Function1<ChaloBusUserProfileSurveyDataState, ChaloBusUserProfileSurveyDataState>() { // from class: app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$updateCurrentInputStep$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ChaloBusUserProfileSurveyDataState it2 = (ChaloBusUserProfileSurveyDataState) obj;
                        Intrinsics.i(it2, "it");
                        return ChaloBusUserProfileSurveyDataState.a(it2, null, arrayListE6, 0, false, null, null, false, 253);
                    }
                });
            }
            S0(workTimingEndVariabilityChanged.f1222a.name(), "endVariability");
            return;
        }
        if (!(intent instanceof ChaloBusUserProfileSurveyIntent.FrequencySelected)) {
            if (intent.equals(ChaloBusUserProfileSurveyIntent.CancelBtnClickedIntent.f1208a)) {
                Q0(this, "pbUserProfileSurvey cancel clicked");
                K0();
                return;
            } else {
                if (!intent.equals(ChaloBusUserProfileSurveyIntent.RetryBtnClickedIntent.f1213a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Q0(this, "pbUserProfileSurvey retry clicked");
                T0();
                return;
            }
        }
        TravelFrequency travelFrequency = ((ChaloBusUserProfileSurveyIntent.FrequencySelected) intent).f1209a;
        ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState10 = (ChaloBusUserProfileSurveyDataState) stateFlow.getValue();
        List list10 = chaloBusUserProfileSurveyDataState10.b;
        int i13 = chaloBusUserProfileSurveyDataState10.c;
        Object objL8 = CollectionsKt.L(i13, list10);
        PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile travelFrequencyInputPBUserProfile = (PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile) (objL8 instanceof PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile ? objL8 : null);
        if (travelFrequencyInputPBUserProfile != null) {
            final ArrayList arrayListE7 = CollectionsKt.E0(chaloBusUserProfileSurveyDataState10.b);
            arrayListE7.set(i13, new PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile(travelFrequencyInputPBUserProfile.b, travelFrequency));
            E0(new Function1<ChaloBusUserProfileSurveyDataState, ChaloBusUserProfileSurveyDataState>() { // from class: app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$updateCurrentInputStep$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ChaloBusUserProfileSurveyDataState it2 = (ChaloBusUserProfileSurveyDataState) obj;
                    Intrinsics.i(it2, "it");
                    return ChaloBusUserProfileSurveyDataState.a(it2, null, arrayListE7, 0, false, null, null, false, 253);
                }
            });
        }
        P0("pbUserProfileSurvey frequency selected", MapsKt.h(new Pair("pbSurveyFrequency", travelFrequency.name())));
    }

    public final void P0(String str, Map map) {
        AnalyticsContractImplKt.b(this.t, str, Source.SURVEY_SCREEN, MapsKt.m(map, new Pair("pbSurveySource", this.k.b.getSourceName())), false, 8);
    }

    public final void R0(ArrayList arrayList) {
        P0("pbUserProfileSurvey started", MapsKt.i(new Pair("pbSurveyTotalSteps", Integer.valueOf(arrayList.size())), new Pair("pbSurveySteps", CollectionsKt.O(arrayList, ",", null, null, new ah(22), 30))));
    }

    public final void S0(Object obj, String str) {
        P0("pbUserProfileSurvey work timing updated", MapsKt.i(new Pair("pbSurveyTimingField", str), new Pair("pbSurveyTimingValue", obj)));
    }

    public final void T0() {
        E0(new ah(19));
        BuildersKt.d(this.j, null, null, new ChaloBusUserProfileSurveyComponent$saveAndShowSuccess$2(this, null), 3);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        ChaloBusUserProfileSurveyComponent$convertToUiState$2 chaloBusUserProfileSurveyComponent$convertToUiState$2 = new ChaloBusUserProfileSurveyComponent$convertToUiState$2(1, this, ChaloBusUserProfileSurveyComponent.class, "processIntent", "processIntent(Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent;)V", 0);
        return this.s.b((ChaloBusUserProfileSurveyDataState) obj, chaloBusUserProfileSurveyComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new ChaloBusUserProfileSurveyDataState(new PBUserProfileSurveyPreference(), EmptyList.f17557a, 0, true, null, null, false, false);
    }
}
