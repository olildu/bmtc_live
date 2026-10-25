package app.chalo.onboarding.cityprovider;

import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.network.ChaloUrlProvider;
import app.chalo.usecase.ClearProductStoresUseCase;
import app.chalo.worker.ApplicationBackgroundWorkersManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/cityprovider/PostCityChangeOperationExecutor;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PostCityChangeOperationExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloUrlProvider f6612a;
    public final ClearProductStoresUseCase b;
    public final AnalyticsContract c;
    public final CrashlyticsLogger d;
    public final CityChangeOperationTracker e;
    public final ApplicationBackgroundWorkersManager f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6613a;

        static {
            int[] iArr = new int[PostCityChangeOperation.values().length];
            try {
                iArr[PostCityChangeOperation.BASE_URL_UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostCityChangeOperation.CLEAR_PRODUCTS_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostCityChangeOperation.SETUP_ANALYTICS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PostCityChangeOperation.SETUP_CRASHLYTICS_PROPERTIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PostCityChangeOperation.ENCRYPTION_KEYS_FETCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f6613a = iArr;
        }
    }

    public PostCityChangeOperationExecutor(ChaloUrlProvider chaloUrlProvider, ClearProductStoresUseCase clearProductStoresUseCase, AnalyticsContract analyticsContract, CrashlyticsLogger crashlyticsLogger, CityChangeOperationTracker cityChangeOperationTracker, ApplicationBackgroundWorkersManager applicationBackgroundWorkersManager) {
        this.f6612a = chaloUrlProvider;
        this.b = clearProductStoresUseCase;
        this.c = analyticsContract;
        this.d = crashlyticsLogger;
        this.e = cityChangeOperationTracker;
        this.f = applicationBackgroundWorkersManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(PostCityChangeOperation postCityChangeOperation, Function1 function1, ContinuationImpl continuationImpl) {
        PostCityChangeOperationExecutor$executeOperation$1 postCityChangeOperationExecutor$executeOperation$1;
        if (continuationImpl instanceof PostCityChangeOperationExecutor$executeOperation$1) {
            postCityChangeOperationExecutor$executeOperation$1 = (PostCityChangeOperationExecutor$executeOperation$1) continuationImpl;
            int i = postCityChangeOperationExecutor$executeOperation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                postCityChangeOperationExecutor$executeOperation$1.label = i - Integer.MIN_VALUE;
            } else {
                postCityChangeOperationExecutor$executeOperation$1 = new PostCityChangeOperationExecutor$executeOperation$1(this, continuationImpl);
            }
        } else {
            postCityChangeOperationExecutor$executeOperation$1 = new PostCityChangeOperationExecutor$executeOperation$1(this, continuationImpl);
        }
        Object obj = postCityChangeOperationExecutor$executeOperation$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = postCityChangeOperationExecutor$executeOperation$1.label;
        Object obj3 = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            postCityChangeOperationExecutor$executeOperation$1.L$0 = postCityChangeOperation;
            postCityChangeOperationExecutor$executeOperation$1.label = 1;
            if (function1.invoke(postCityChangeOperationExecutor$executeOperation$1) != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj3;
        }
        postCityChangeOperation = (PostCityChangeOperation) postCityChangeOperationExecutor$executeOperation$1.L$0;
        ResultKt.b(obj);
        postCityChangeOperationExecutor$executeOperation$1.L$0 = null;
        postCityChangeOperationExecutor$executeOperation$1.label = 2;
        CityChangeOperationTracker cityChangeOperationTracker = this.e;
        Object objG = cityChangeOperationTracker.f6605a.g(PreferencesKeys.longKey(postCityChangeOperation.name() + "_key"), new Long(cityChangeOperationTracker.b.j()), postCityChangeOperationExecutor$executeOperation$1);
        if (objG != obj2) {
            objG = obj3;
        }
        return objG == obj2 ? obj2 : obj3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, List list, ContinuationImpl continuationImpl) {
        PostCityChangeOperationExecutor$invoke$1 postCityChangeOperationExecutor$invoke$1;
        String str2;
        Iterator it;
        if (continuationImpl instanceof PostCityChangeOperationExecutor$invoke$1) {
            postCityChangeOperationExecutor$invoke$1 = (PostCityChangeOperationExecutor$invoke$1) continuationImpl;
            int i = postCityChangeOperationExecutor$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                postCityChangeOperationExecutor$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                postCityChangeOperationExecutor$invoke$1 = new PostCityChangeOperationExecutor$invoke$1(this, continuationImpl);
            }
        } else {
            postCityChangeOperationExecutor$invoke$1 = new PostCityChangeOperationExecutor$invoke$1(this, continuationImpl);
        }
        Object obj = postCityChangeOperationExecutor$invoke$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = postCityChangeOperationExecutor$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            Iterator it2 = CollectionsKt.v0(new PostCityChangeOperationExecutor$invoke$$inlined$sortedBy$1(), list).iterator();
            str2 = str;
            it = it2;
        } else {
            if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) postCityChangeOperationExecutor$invoke$1.L$1;
            str2 = (String) postCityChangeOperationExecutor$invoke$1.L$0;
            ResultKt.b(obj);
        }
        while (it.hasNext()) {
            PostCityChangeOperation postCityChangeOperation = (PostCityChangeOperation) it.next();
            int i3 = WhenMappings.f6613a[postCityChangeOperation.ordinal()];
            if (i3 == 1) {
                Function1 postCityChangeOperationExecutor$invoke$3$1 = new PostCityChangeOperationExecutor$invoke$3$1(this, null);
                postCityChangeOperationExecutor$invoke$1.L$0 = str2;
                postCityChangeOperationExecutor$invoke$1.L$1 = it;
                postCityChangeOperationExecutor$invoke$1.label = 1;
                if (a(postCityChangeOperation, postCityChangeOperationExecutor$invoke$3$1, postCityChangeOperationExecutor$invoke$1) == obj2) {
                    return obj2;
                }
            } else if (i3 == 2) {
                Function1 postCityChangeOperationExecutor$invoke$3$2 = new PostCityChangeOperationExecutor$invoke$3$2(this, null);
                postCityChangeOperationExecutor$invoke$1.L$0 = str2;
                postCityChangeOperationExecutor$invoke$1.L$1 = it;
                postCityChangeOperationExecutor$invoke$1.label = 2;
                if (a(postCityChangeOperation, postCityChangeOperationExecutor$invoke$3$2, postCityChangeOperationExecutor$invoke$1) == obj2) {
                    return obj2;
                }
            } else if (i3 == 3) {
                Function1 postCityChangeOperationExecutor$invoke$3$3 = new PostCityChangeOperationExecutor$invoke$3$3(this, null);
                postCityChangeOperationExecutor$invoke$1.L$0 = str2;
                postCityChangeOperationExecutor$invoke$1.L$1 = it;
                postCityChangeOperationExecutor$invoke$1.label = 3;
                if (a(postCityChangeOperation, postCityChangeOperationExecutor$invoke$3$3, postCityChangeOperationExecutor$invoke$1) == obj2) {
                    return obj2;
                }
            } else if (i3 == 4) {
                Function1 postCityChangeOperationExecutor$invoke$3$4 = new PostCityChangeOperationExecutor$invoke$3$4(this, str2, null);
                postCityChangeOperationExecutor$invoke$1.L$0 = str2;
                postCityChangeOperationExecutor$invoke$1.L$1 = it;
                postCityChangeOperationExecutor$invoke$1.label = 4;
                if (a(postCityChangeOperation, postCityChangeOperationExecutor$invoke$3$4, postCityChangeOperationExecutor$invoke$1) == obj2) {
                    return obj2;
                }
            } else {
                if (i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                Function1 postCityChangeOperationExecutor$invoke$3$5 = new PostCityChangeOperationExecutor$invoke$3$5(this, null);
                postCityChangeOperationExecutor$invoke$1.L$0 = str2;
                postCityChangeOperationExecutor$invoke$1.L$1 = it;
                postCityChangeOperationExecutor$invoke$1.label = 5;
                if (a(postCityChangeOperation, postCityChangeOperationExecutor$invoke$3$5, postCityChangeOperationExecutor$invoke$1) == obj2) {
                    return obj2;
                }
            }
        }
        return Unit.f17538a;
    }
}
