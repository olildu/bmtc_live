package app.chalo.citydata.domain;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.data.model.app.RouteIdWithVersion;
import app.chalo.citydata.repository.CityDataRepository;
import app.chalo.citydata.repository.SavedRoutesSortType;
import app.chalo.citydata.repository.local.store.CityDataLocalStore;
import app.chalo.contract.BasicInfoContract;
import app.chalo.features.language.LanguageFeature;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.recent.localsource.recent.RecentRouteLocalDataSource;
import app.chalo.recent.model.app.RecentRouteAppModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/domain/SyncRoutesDataUseCase;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SyncRoutesDataUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f1775a;
    public final UserProfileDetailsProvider b;
    public final LanguageFeature c;
    public final BasicInfoContract d;
    public final CityDataRepository e;
    public final RecentRouteLocalDataSource f;
    public final ManageRoutesDataUseCase g;
    public final AnalyticsContract h;
    public final CityDataLocalStore i;
    public final GetCityDataRemoteConfigUseCase j;
    public final StringProvider k;

    public SyncRoutesDataUseCase(CityProvider cityProvider, UserProfileDetailsProvider userProfileDetailsProvider, LanguageFeature languageFeature, BasicInfoContract basicInfoContract, CityDataRepository cityDataRepository, RecentRouteLocalDataSource recentRouteLocalDataSource, ManageRoutesDataUseCase manageRoutesDataUseCase, AnalyticsContract analyticsContract, CityDataLocalStore cityDataLocalStore, GetCityDataRemoteConfigUseCase getCityDataRemoteConfigUseCase, StringProvider stringProvider) {
        this.f1775a = cityProvider;
        this.b = userProfileDetailsProvider;
        this.c = languageFeature;
        this.d = basicInfoContract;
        this.e = cityDataRepository;
        this.f = recentRouteLocalDataSource;
        this.g = manageRoutesDataUseCase;
        this.h = analyticsContract;
        this.i = cityDataLocalStore;
        this.j = getCityDataRemoteConfigUseCase;
        this.k = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0122 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:12:0x0038, B:93:0x0202, B:17:0x0044, B:90:0x01ef, B:20:0x004d, B:83:0x01a3, B:84:0x01b4, B:86:0x01ba, B:87:0x01c6, B:23:0x0056, B:80:0x0197, B:26:0x0063, B:77:0x0189, B:29:0x006c, B:74:0x0173, B:32:0x008a, B:64:0x0141, B:66:0x0145, B:68:0x014b, B:58:0x011c, B:60:0x0122, B:69:0x0155, B:70:0x015b, B:33:0x008f, B:41:0x00ae, B:36:0x0096, B:38:0x009c, B:43:0x00bb, B:45:0x00dd, B:50:0x00ea, B:52:0x00f6, B:54:0x00fd, B:57:0x0107), top: B:126:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:62:0x013e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0140  */
    /* JADX WARN: Code duplicated, block: B:66:0x0145 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:12:0x0038, B:93:0x0202, B:17:0x0044, B:90:0x01ef, B:20:0x004d, B:83:0x01a3, B:84:0x01b4, B:86:0x01ba, B:87:0x01c6, B:23:0x0056, B:80:0x0197, B:26:0x0063, B:77:0x0189, B:29:0x006c, B:74:0x0173, B:32:0x008a, B:64:0x0141, B:66:0x0145, B:68:0x014b, B:58:0x011c, B:60:0x0122, B:69:0x0155, B:70:0x015b, B:33:0x008f, B:41:0x00ae, B:36:0x0096, B:38:0x009c, B:43:0x00bb, B:45:0x00dd, B:50:0x00ea, B:52:0x00f6, B:54:0x00fd, B:57:0x0107), top: B:126:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:67:0x014a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0140 -> B:64:0x0141). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.util.List r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.citydata.domain.SyncRoutesDataUseCase.a(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r8.e.b(r4, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof app.chalo.citydata.domain.SyncRoutesDataUseCase$purgeStaleRoutes$1
            if (r0 == 0) goto L13
            r0 = r9
            app.chalo.citydata.domain.SyncRoutesDataUseCase$purgeStaleRoutes$1 r0 = (app.chalo.citydata.domain.SyncRoutesDataUseCase$purgeStaleRoutes$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.citydata.domain.SyncRoutesDataUseCase$purgeStaleRoutes$1 r0 = new app.chalo.citydata.domain.SyncRoutesDataUseCase$purgeStaleRoutes$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r9)
            goto L76
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            java.lang.Object r2 = r0.L$0
            app.chalo.citydata.data.model.app.CityDataConfigForCity r2 = (app.chalo.citydata.data.model.app.CityDataConfigForCity) r2
            kotlin.ResultKt.b(r9)
            goto L5f
        L3d:
            kotlin.ResultKt.b(r9)
            goto L4f
        L41:
            kotlin.ResultKt.b(r9)
            r0.label = r5
            app.chalo.citydata.domain.GetCityDataRemoteConfigUseCase r9 = r8.j
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L4f
            goto L75
        L4f:
            r2 = r9
            app.chalo.citydata.data.model.app.CityDataConfigForCity r2 = (app.chalo.citydata.data.model.app.CityDataConfigForCity) r2
            r0.L$0 = r2
            r0.label = r4
            app.chalo.contract.BasicInfoContract r9 = r8.d
            java.lang.Object r9 = r9.c(r0)
            if (r9 != r1) goto L5f
            goto L75
        L5f:
            java.lang.Number r9 = (java.lang.Number) r9
            long r4 = r9.longValue()
            long r6 = r2.c
            long r4 = r4 - r6
            r9 = 0
            r0.L$0 = r9
            r0.label = r3
            app.chalo.citydata.repository.CityDataRepository r9 = r8.e
            java.lang.Object r9 = r9.b(r4, r0)
            if (r9 != r1) goto L76
        L75:
            return r1
        L76:
            kotlin.Unit r9 = kotlin.Unit.f17538a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.citydata.domain.SyncRoutesDataUseCase.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b7 A[LOOP:1: B:33:0x00b1->B:35:0x00b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:51:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[LOOP:0: B:43:0x00e9->B:53:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        SyncRoutesDataUseCase$purgeZombieRoutesFromRecent$1 syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1;
        String str2;
        List list;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        Iterator it2;
        String str3;
        if (continuationImpl instanceof SyncRoutesDataUseCase$purgeZombieRoutesFromRecent$1) {
            syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1 = (SyncRoutesDataUseCase$purgeZombieRoutesFromRecent$1) continuationImpl;
            int i = syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1.label = i - Integer.MIN_VALUE;
            } else {
                syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1 = new SyncRoutesDataUseCase$purgeZombieRoutesFromRecent$1(this, continuationImpl);
            }
        } else {
            syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1 = new SyncRoutesDataUseCase$purgeZombieRoutesFromRecent$1(this, continuationImpl);
        }
        Object objI = syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1.label;
        RecentRouteLocalDataSource recentRouteLocalDataSource = this.f;
        if (i2 == 0) {
            ResultKt.b(objI);
            syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1.L$0 = str;
            syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1.label = 1;
            objI = recentRouteLocalDataSource.i(str, syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1);
            if (objI != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str = (String) syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1.L$0;
            ResultKt.b(objI);
        } else if (i2 == 2) {
            list = (List) syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1.L$1;
            str2 = (String) syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1.L$0;
            ResultKt.b(objI);
            Iterable iterable = (Iterable) objI;
            arrayList = new ArrayList(CollectionsKt.v(iterable, 10));
            it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((RouteIdWithVersion) it.next()).b);
            }
            arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!arrayList.contains((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            it2 = arrayList2.iterator();
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it2 = (Iterator) syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1.L$1;
            str2 = (String) syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1.L$0;
            ResultKt.b(objI);
        }
        while (it2.hasNext()) {
            str3 = (String) it2.next();
            syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1.L$0 = str2;
            syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1.L$1 = it2;
            syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1.label = 3;
            if (recentRouteLocalDataSource.b(str3, str2, syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f17538a;
        Iterable iterable2 = (Iterable) objI;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.v(iterable2, 10));
        Iterator it3 = iterable2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((RecentRouteAppModel) it3.next()).e);
        }
        if (!arrayList3.isEmpty()) {
            syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1.L$0 = str;
            syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1.L$1 = arrayList3;
            syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1.label = 2;
            objI = this.e.e(SavedRoutesSortType.NO_SORT, syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1);
            if (objI != coroutineSingletons) {
                str2 = str;
                list = arrayList3;
                Iterable iterable3 = (Iterable) objI;
                arrayList = new ArrayList(CollectionsKt.v(iterable3, 10));
                it = iterable3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((RouteIdWithVersion) it.next()).b);
                }
                arrayList2 = new ArrayList();
                while (r10.hasNext()) {
                    if (!arrayList.contains((String) obj)) {
                        arrayList2.add(obj);
                    }
                }
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    str3 = (String) it2.next();
                    syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1.L$0 = str2;
                    syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1.L$1 = it2;
                    syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1.label = 3;
                    if (recentRouteLocalDataSource.b(str3, str2, syncRoutesDataUseCase$purgeZombieRoutesFromRecent$1) == coroutineSingletons) {
                    }
                }
            }
            return coroutineSingletons;
        }
        return Unit.f17538a;
    }
}
