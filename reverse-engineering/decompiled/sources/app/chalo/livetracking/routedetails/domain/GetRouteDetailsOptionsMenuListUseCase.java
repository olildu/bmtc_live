package app.chalo.livetracking.routedetails.domain;

import app.chalo.livetracking.routedetails.data.local.datastore.RouteDetailsLocalDataStore;
import app.chalo.recent.model.app.RecentsSpecialStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/domain/GetRouteDetailsOptionsMenuListUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetRouteDetailsOptionsMenuListUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RouteDetailsLocalDataStore f4434a;

    public GetRouteDetailsOptionsMenuListUseCase(RouteDetailsLocalDataStore routeDetailsLocalDataStore) {
        this.f4434a = routeDetailsLocalDataStore;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl, boolean z) {
        GetRouteDetailsOptionsMenuListUseCase$invoke$1 getRouteDetailsOptionsMenuListUseCase$invoke$1;
        List list;
        if (continuationImpl instanceof GetRouteDetailsOptionsMenuListUseCase$invoke$1) {
            getRouteDetailsOptionsMenuListUseCase$invoke$1 = (GetRouteDetailsOptionsMenuListUseCase$invoke$1) continuationImpl;
            int i = getRouteDetailsOptionsMenuListUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRouteDetailsOptionsMenuListUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getRouteDetailsOptionsMenuListUseCase$invoke$1 = new GetRouteDetailsOptionsMenuListUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getRouteDetailsOptionsMenuListUseCase$invoke$1 = new GetRouteDetailsOptionsMenuListUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = getRouteDetailsOptionsMenuListUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getRouteDetailsOptionsMenuListUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            ArrayList arrayListB0 = CollectionsKt.b0(RouteDetailsOptionsMenu.SearchStop);
            RecentsSpecialStatus recentsSpecialStatus = RecentsSpecialStatus.FAVOURITE;
            getRouteDetailsOptionsMenuListUseCase$invoke$1.L$0 = arrayListB0;
            getRouteDetailsOptionsMenuListUseCase$invoke$1.Z$0 = z;
            getRouteDetailsOptionsMenuListUseCase$invoke$1.label = 1;
            Object objC = this.f4434a.c(str, recentsSpecialStatus, getRouteDetailsOptionsMenuListUseCase$invoke$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objC;
            list = arrayListB0;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = getRouteDetailsOptionsMenuListUseCase$invoke$1.Z$0;
            list = (List) getRouteDetailsOptionsMenuListUseCase$invoke$1.L$0;
            ResultKt.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            list.add(RouteDetailsOptionsMenu.RemoveFavorite);
        } else {
            list.add(RouteDetailsOptionsMenu.AddFavorite);
        }
        if (z) {
            list.add(RouteDetailsOptionsMenu.ViewTimeTable);
        }
        return list;
    }
}
