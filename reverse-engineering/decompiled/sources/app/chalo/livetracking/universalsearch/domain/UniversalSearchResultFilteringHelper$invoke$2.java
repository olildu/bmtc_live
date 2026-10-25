package app.chalo.livetracking.universalsearch.domain;

import app.chalo.livetracking.universalsearch.UniversalSearchResult;
import app.chalo.livetracking.universalsearch.data.model.app.SearchedResultItemsAppModel;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRecentSearchItem;
import app.chalo.recent.model.app.RecentsSpecialStatus;
import app.chalo.universalsearch.data.UniversalSearchOption;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.universalsearch.domain.UniversalSearchResultFilteringHelper$invoke$2", f = "UniversalSearchResultFilteringHelper.kt", l = {}, m = "invokeSuspend", v = 1)
final class UniversalSearchResultFilteringHelper$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<UniversalSearchResult> $finalUniversalSearchResult;
    final /* synthetic */ UniversalSearchOptions $universalSearchOptions;
    final /* synthetic */ UniversalSearchResult $universalSearchResult;
    int label;
    final /* synthetic */ UniversalSearchResultFilteringHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalSearchResultFilteringHelper$invoke$2(UniversalSearchOptions universalSearchOptions, Ref.ObjectRef objectRef, UniversalSearchResult universalSearchResult, UniversalSearchResultFilteringHelper universalSearchResultFilteringHelper, Continuation continuation) {
        super(2, continuation);
        this.$universalSearchOptions = universalSearchOptions;
        this.$finalUniversalSearchResult = objectRef;
        this.$universalSearchResult = universalSearchResult;
        this.this$0 = universalSearchResultFilteringHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UniversalSearchResultFilteringHelper$invoke$2(this.$universalSearchOptions, this.$finalUniversalSearchResult, this.$universalSearchResult, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        UniversalSearchResultFilteringHelper$invoke$2 universalSearchResultFilteringHelper$invoke$2 = (UniversalSearchResultFilteringHelper$invoke$2) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        universalSearchResultFilteringHelper$invoke$2.invokeSuspend(unit);
        return unit;
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [T, app.chalo.livetracking.universalsearch.UniversalSearchResult] */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, app.chalo.livetracking.universalsearch.UniversalSearchResult] */
    /* JADX WARN: Type inference failed for: r6v5, types: [T, app.chalo.livetracking.universalsearch.UniversalSearchResult] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UniversalSearchResultSource universalSearchResultSource;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Set<UniversalSearchOption> set = this.$universalSearchOptions.f10141a;
        UniversalSearchResultFilteringHelper universalSearchResultFilteringHelper = this.this$0;
        for (UniversalSearchOption universalSearchOption : set) {
            universalSearchResultFilteringHelper.getClass();
            if (Intrinsics.d(universalSearchOption, UniversalSearchOption.ALL.INSTANCE)) {
                universalSearchResultSource = UniversalSearchResultSource.ALL;
            } else if (universalSearchOption instanceof UniversalSearchOption.PLACES) {
                universalSearchResultSource = UniversalSearchResultSource.PLACE;
            } else if (universalSearchOption instanceof UniversalSearchOption.TRIPS) {
                universalSearchResultSource = UniversalSearchResultSource.TRIP;
            } else if (universalSearchOption instanceof UniversalSearchOption.ROUTES) {
                universalSearchResultSource = UniversalSearchResultSource.ROUTE;
            } else {
                if (!(universalSearchOption instanceof UniversalSearchOption.STOPS)) {
                    throw new NoWhenBranchMatchedException();
                }
                universalSearchResultSource = UniversalSearchResultSource.STOP;
            }
            linkedHashSet.add(universalSearchResultSource);
        }
        if (linkedHashSet.isEmpty()) {
            linkedHashSet.add(UniversalSearchResultSource.ALL);
        }
        boolean zContains = linkedHashSet.contains(UniversalSearchResultSource.ALL);
        Unit unit = Unit.f17538a;
        if (zContains) {
            this.$finalUniversalSearchResult.element = this.$universalSearchResult;
            return unit;
        }
        ChaloUseCaseResult success = this.$universalSearchResult.f4964a;
        if (success instanceof ChaloUseCaseResult.Success) {
            success = new ChaloUseCaseResult.Success(UniversalSearchResultFilteringHelper.b(this.this$0, (SearchedResultItemsAppModel) ((ChaloUseCaseResult.Success) success).f10419a, linkedHashSet));
        } else if (!(success instanceof ChaloUseCaseResult.Failure) && success != null) {
            throw new NoWhenBranchMatchedException();
        }
        final UniversalSearchResultFilteringHelper universalSearchResultFilteringHelper2 = this.this$0;
        List listV0 = this.$universalSearchResult.b;
        UniversalSearchOptions universalSearchOptions = this.$universalSearchOptions;
        universalSearchResultFilteringHelper2.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = universalSearchOptions.f10141a.iterator();
        while (true) {
            if (!it.hasNext()) {
                listV0 = CollectionsKt.v0(new Comparator() { // from class: app.chalo.livetracking.universalsearch.domain.UniversalSearchResultFilteringHelper$getFilteredRecentData$$inlined$sortedByDescending$1
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        UniversalSearchResultFilteringHelper universalSearchResultFilteringHelper3 = universalSearchResultFilteringHelper2;
                        return ComparisonsKt.a(Long.valueOf(UniversalSearchResultFilteringHelper.a(universalSearchResultFilteringHelper3, (UniversalSearchRecentSearchItem) obj3)), Long.valueOf(UniversalSearchResultFilteringHelper.a(universalSearchResultFilteringHelper3, (UniversalSearchRecentSearchItem) obj2)));
                    }
                }, arrayList);
                break;
            }
            UniversalSearchOption universalSearchOption2 = (UniversalSearchOption) it.next();
            if (Intrinsics.d(universalSearchOption2, UniversalSearchOption.ALL.INSTANCE)) {
                break;
            }
            if (universalSearchOption2 instanceof UniversalSearchOption.PLACES) {
                UniversalSearchOption.PLACES places = (UniversalSearchOption.PLACES) universalSearchOption2;
                if (places.b) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : listV0) {
                        if (obj2 instanceof UniversalSearchRecentSearchItem.Place) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj3 = arrayList2.get(i);
                        i++;
                        if (((UniversalSearchRecentSearchItem.Place) obj3).c.k == RecentsSpecialStatus.NONE) {
                            arrayList3.add(obj3);
                        }
                    }
                    arrayList.addAll(arrayList3);
                }
                if (places.c) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj4 : listV0) {
                        if (obj4 instanceof UniversalSearchRecentSearchItem.Place) {
                            arrayList4.add(obj4);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    int size2 = arrayList4.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj5 = arrayList4.get(i2);
                        i2++;
                        if (((UniversalSearchRecentSearchItem.Place) obj5).c.k == RecentsSpecialStatus.FAVOURITE) {
                            arrayList5.add(obj5);
                        }
                    }
                    arrayList.addAll(arrayList5);
                }
            } else if (universalSearchOption2 instanceof UniversalSearchOption.STOPS) {
                UniversalSearchOption.STOPS stops = (UniversalSearchOption.STOPS) universalSearchOption2;
                if (stops.b) {
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj6 : listV0) {
                        if (obj6 instanceof UniversalSearchRecentSearchItem.Stop) {
                            arrayList6.add(obj6);
                        }
                    }
                    ArrayList arrayList7 = new ArrayList();
                    int size3 = arrayList6.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        Object obj7 = arrayList6.get(i3);
                        i3++;
                        if (((UniversalSearchRecentSearchItem.Stop) obj7).c.h == RecentsSpecialStatus.NONE) {
                            arrayList7.add(obj7);
                        }
                    }
                    arrayList.addAll(arrayList7);
                }
                if (stops.c) {
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj8 : listV0) {
                        if (obj8 instanceof UniversalSearchRecentSearchItem.Stop) {
                            arrayList8.add(obj8);
                        }
                    }
                    ArrayList arrayList9 = new ArrayList();
                    int size4 = arrayList8.size();
                    int i4 = 0;
                    while (i4 < size4) {
                        Object obj9 = arrayList8.get(i4);
                        i4++;
                        if (((UniversalSearchRecentSearchItem.Stop) obj9).c.h == RecentsSpecialStatus.FAVOURITE) {
                            arrayList9.add(obj9);
                        }
                    }
                    arrayList.addAll(arrayList9);
                }
            } else if (universalSearchOption2 instanceof UniversalSearchOption.ROUTES) {
                UniversalSearchOption.ROUTES routes = (UniversalSearchOption.ROUTES) universalSearchOption2;
                if (routes.b) {
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj10 : listV0) {
                        if (obj10 instanceof UniversalSearchRecentSearchItem.Route) {
                            arrayList10.add(obj10);
                        }
                    }
                    ArrayList arrayList11 = new ArrayList();
                    int size5 = arrayList10.size();
                    int i5 = 0;
                    while (i5 < size5) {
                        Object obj11 = arrayList10.get(i5);
                        i5++;
                        if (((UniversalSearchRecentSearchItem.Route) obj11).c.o == RecentsSpecialStatus.NONE) {
                            arrayList11.add(obj11);
                        }
                    }
                    arrayList.addAll(arrayList11);
                }
                if (routes.c) {
                    ArrayList arrayList12 = new ArrayList();
                    for (Object obj12 : listV0) {
                        if (obj12 instanceof UniversalSearchRecentSearchItem.Route) {
                            arrayList12.add(obj12);
                        }
                    }
                    ArrayList arrayList13 = new ArrayList();
                    int size6 = arrayList12.size();
                    int i6 = 0;
                    while (i6 < size6) {
                        Object obj13 = arrayList12.get(i6);
                        i6++;
                        if (((UniversalSearchRecentSearchItem.Route) obj13).c.o == RecentsSpecialStatus.FAVOURITE) {
                            arrayList13.add(obj13);
                        }
                    }
                    arrayList.addAll(arrayList13);
                }
            } else {
                if (!(universalSearchOption2 instanceof UniversalSearchOption.TRIPS)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((UniversalSearchOption.TRIPS) universalSearchOption2).b) {
                    ArrayList arrayList14 = new ArrayList();
                    for (Object obj14 : listV0) {
                        if (obj14 instanceof UniversalSearchRecentSearchItem.Trip) {
                            arrayList14.add(obj14);
                        }
                    }
                    arrayList.addAll(arrayList14);
                }
            }
        }
        SearchedResultItemsAppModel searchedResultItemsAppModel = this.$universalSearchResult.c;
        if (searchedResultItemsAppModel == null) {
            this.$finalUniversalSearchResult.element = new UniversalSearchResult(success, listV0, null);
            return unit;
        }
        SearchedResultItemsAppModel searchedResultItemsAppModelB = UniversalSearchResultFilteringHelper.b(this.this$0, searchedResultItemsAppModel, linkedHashSet);
        this.$finalUniversalSearchResult.element = new UniversalSearchResult(success, listV0, searchedResultItemsAppModelB);
        return unit;
    }
}
