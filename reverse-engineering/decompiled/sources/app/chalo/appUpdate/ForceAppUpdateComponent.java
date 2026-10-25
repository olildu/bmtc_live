package app.chalo.appUpdate;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.ForceAppUpdateArgs;
import app.chalo.scenes.args.UpdateType;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.ForceAppUpdateError;
import app.chalo.utils.SystemHelper;
import com.arkivanov.decompose.ComponentContext;
import defpackage.e40;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/appUpdate/ForceAppUpdateComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/appUpdate/ForceAppUpdateIntent;", "Lapp/chalo/appUpdate/ForceAppUpdateDataState;", "Lapp/chalo/appUpdate/ForceAppUpdateUIState;", "Lapp/chalo/appUpdate/ForceAppUpdateSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ForceAppUpdateComponent extends ChaloBaseStateMviComponent<ForceAppUpdateIntent, ForceAppUpdateDataState, ForceAppUpdateUIState, ForceAppUpdateSideEffect> {
    public final SystemHelper k;
    public final StringProvider l;
    public final KotlinToastManager m;
    public final AnalyticsContract n;
    public final ChaloConfigFeature o;
    public final ChaloNavigationManager p;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f946a;

        static {
            int[] iArr = new int[UpdateType.values().length];
            try {
                iArr[UpdateType.FORCE_UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UpdateType.RECOMMENDED_UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f946a = iArr;
        }
    }

    public ForceAppUpdateComponent(ComponentContext componentContext, ForceAppUpdateArgs forceAppUpdateArgs, SystemHelper systemHelper, StringProvider stringProvider, KotlinToastManager kotlinToastManager, AnalyticsContract analyticsContract, ChaloConfigFeature chaloConfigFeature, ChaloNavigationManager chaloNavigationManager) {
        super(componentContext);
        this.k = systemHelper;
        this.l = stringProvider;
        this.m = kotlinToastManager;
        this.n = analyticsContract;
        this.o = chaloConfigFeature;
        this.p = chaloNavigationManager;
        H0(new ForceAppUpdateIntent.InitializationIntent(forceAppUpdateArgs.b));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object F0(ForceAppUpdateComponent forceAppUpdateComponent, ContinuationImpl continuationImpl) {
        ForceAppUpdateComponent$handleUpdateBtnClickedIntent$1 forceAppUpdateComponent$handleUpdateBtnClickedIntent$1;
        KotlinToastManager kotlinToastManager;
        forceAppUpdateComponent.getClass();
        if (continuationImpl instanceof ForceAppUpdateComponent$handleUpdateBtnClickedIntent$1) {
            forceAppUpdateComponent$handleUpdateBtnClickedIntent$1 = (ForceAppUpdateComponent$handleUpdateBtnClickedIntent$1) continuationImpl;
            int i = forceAppUpdateComponent$handleUpdateBtnClickedIntent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                forceAppUpdateComponent$handleUpdateBtnClickedIntent$1.label = i - Integer.MIN_VALUE;
            } else {
                forceAppUpdateComponent$handleUpdateBtnClickedIntent$1 = new ForceAppUpdateComponent$handleUpdateBtnClickedIntent$1(forceAppUpdateComponent, continuationImpl);
            }
        } else {
            forceAppUpdateComponent$handleUpdateBtnClickedIntent$1 = new ForceAppUpdateComponent$handleUpdateBtnClickedIntent$1(forceAppUpdateComponent, continuationImpl);
        }
        Object obj = forceAppUpdateComponent$handleUpdateBtnClickedIntent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = forceAppUpdateComponent$handleUpdateBtnClickedIntent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            AnalyticsContract analyticsContract = forceAppUpdateComponent.n;
            Source source = Source.FORCE_APP_UPDATE;
            AnalyticsContractImplKt.b(analyticsContract, "app update button clicked", source, null, false, 28);
            ChaloUseCaseResult chaloUseCaseResultG = forceAppUpdateComponent.k.g();
            if (!(chaloUseCaseResultG instanceof ChaloUseCaseResult.Success)) {
                if (!(chaloUseCaseResultG instanceof ChaloUseCaseResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                AnalyticsContractImplKt.b(forceAppUpdateComponent.n, "force app update failed to launch store app", source, vo1.s("force app update launch failure reason", ((ForceAppUpdateError) ((ChaloUseCaseResult.Failure) chaloUseCaseResultG).f10418a).a()), false, 24);
                KotlinToastManager kotlinToastManager2 = forceAppUpdateComponent.m;
                forceAppUpdateComponent$handleUpdateBtnClickedIntent$1.L$0 = kotlinToastManager2;
                forceAppUpdateComponent$handleUpdateBtnClickedIntent$1.label = 1;
                Object objB = forceAppUpdateComponent.l.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], forceAppUpdateComponent$handleUpdateBtnClickedIntent$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = objB;
                kotlinToastManager = kotlinToastManager2;
            }
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlinToastManager = (KotlinToastManager) forceAppUpdateComponent$handleUpdateBtnClickedIntent$1.L$0;
        ResultKt.b(obj);
        KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.SHORT);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0135  */
    /* JADX WARN: Code duplicated, block: B:28:0x0149  */
    /* JADX WARN: Code duplicated, block: B:38:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:40:0x0201  */
    /* JADX WARN: Code duplicated, block: B:43:0x0217  */
    /* JADX WARN: Code duplicated, block: B:47:0x024b  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x017c, code lost:
    
        if (r5 == r3) goto L20;
     */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p0(app.chalo.appUpdate.ForceAppUpdateDataState r30, kotlin.coroutines.jvm.internal.ContinuationImpl r31) {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.appUpdate.ForceAppUpdateComponent.p0(app.chalo.appUpdate.ForceAppUpdateDataState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void H0(ForceAppUpdateIntent forceAppUpdateIntent) {
        C0(forceAppUpdateIntent);
        if (forceAppUpdateIntent instanceof ForceAppUpdateIntent.InitializationIntent) {
            UpdateType updateType = ((ForceAppUpdateIntent.InitializationIntent) forceAppUpdateIntent).f948a;
            AnalyticsContractImplKt.b(this.n, "app update screen shown", Source.FORCE_APP_UPDATE, null, false, 28);
            E0(new e40(updateType, 1));
            return;
        }
        if (forceAppUpdateIntent.equals(ForceAppUpdateIntent.OnUpdateBtnClicked.f951a)) {
            BuildersKt.d(this.j, null, null, new ForceAppUpdateComponent$processIntent$1(this, null), 3);
            return;
        }
        boolean zEquals = forceAppUpdateIntent.equals(ForceAppUpdateIntent.OnRemindLaterClicked.f950a);
        ChaloNavigationManager chaloNavigationManager = this.p;
        if (zEquals) {
            AnalyticsContractImplKt.b(this.n, "app update postponed", Source.FORCE_APP_UPDATE, null, false, 28);
            ChaloNavigationManagerKt.c(chaloNavigationManager);
        } else {
            if (!forceAppUpdateIntent.equals(ForceAppUpdateIntent.OnBackPressed.f949a)) {
                throw new NoWhenBranchMatchedException();
            }
            boolean z = ((ForceAppUpdateDataState) this.f.getValue()).f947a == UpdateType.FORCE_UPDATE;
            AnalyticsContractImplKt.b(this.n, "force app update back pressed", Source.FORCE_APP_UPDATE, MapsKt.h(new Pair("isForceUpdate", Boolean.valueOf(z))), false, 24);
            if (z) {
                return;
            }
            ChaloNavigationManagerKt.c(chaloNavigationManager);
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new ForceAppUpdateDataState(UpdateType.RECOMMENDED_UPDATE);
    }
}
