package app.chalo.livetracking.universalsearch.domain;

import app.chalo.citydata.data.model.app.RouteLegacySpecialFeature;
import app.chalo.livetracking.universalsearch.data.model.app.PlaceAndStopInfoAppModel;
import app.chalo.livetracking.universalsearch.data.model.app.SearchedResultItemsAppModel;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRouteAppModel;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchItem;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchPlacesAndStopsInfoModel;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchRoutesDetailModel;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.universalsearch.data.UniversalSearchOption;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import defpackage.py;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/domain/ConvertSearchedResultItemsAppModelToUiModelUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConvertSearchedResultItemsAppModelToUiModelUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f5014a;

    public ConvertSearchedResultItemsAppModelToUiModelUseCase(StringProvider stringProvider) {
        this.f5014a = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0086 A[LOOP:0: B:23:0x0080->B:25:0x0086, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, SearchedResultItemsAppModel searchedResultItemsAppModel, List list, ContinuationImpl continuationImpl) {
        ConvertSearchedResultItemsAppModelToUiModelUseCase$addPlacesAndStopsWithHeader$1 convertSearchedResultItemsAppModelToUiModelUseCase$addPlacesAndStopsWithHeader$1;
        List list2;
        ArrayList arrayList;
        if (continuationImpl instanceof ConvertSearchedResultItemsAppModelToUiModelUseCase$addPlacesAndStopsWithHeader$1) {
            convertSearchedResultItemsAppModelToUiModelUseCase$addPlacesAndStopsWithHeader$1 = (ConvertSearchedResultItemsAppModelToUiModelUseCase$addPlacesAndStopsWithHeader$1) continuationImpl;
            int i = convertSearchedResultItemsAppModelToUiModelUseCase$addPlacesAndStopsWithHeader$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                convertSearchedResultItemsAppModelToUiModelUseCase$addPlacesAndStopsWithHeader$1.label = i - Integer.MIN_VALUE;
            } else {
                convertSearchedResultItemsAppModelToUiModelUseCase$addPlacesAndStopsWithHeader$1 = new ConvertSearchedResultItemsAppModelToUiModelUseCase$addPlacesAndStopsWithHeader$1(this, continuationImpl);
            }
        } else {
            convertSearchedResultItemsAppModelToUiModelUseCase$addPlacesAndStopsWithHeader$1 = new ConvertSearchedResultItemsAppModelToUiModelUseCase$addPlacesAndStopsWithHeader$1(this, continuationImpl);
        }
        Object objB = convertSearchedResultItemsAppModelToUiModelUseCase$addPlacesAndStopsWithHeader$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = convertSearchedResultItemsAppModelToUiModelUseCase$addPlacesAndStopsWithHeader$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (!searchedResultItemsAppModel.b.isEmpty()) {
                if (z) {
                    convertSearchedResultItemsAppModelToUiModelUseCase$addPlacesAndStopsWithHeader$1.L$0 = searchedResultItemsAppModel;
                    convertSearchedResultItemsAppModelToUiModelUseCase$addPlacesAndStopsWithHeader$1.L$1 = list;
                    convertSearchedResultItemsAppModelToUiModelUseCase$addPlacesAndStopsWithHeader$1.L$2 = list;
                    convertSearchedResultItemsAppModelToUiModelUseCase$addPlacesAndStopsWithHeader$1.label = 1;
                    objB = this.f5014a.b(StringEnum.PLACES_STOPS_HEADER, new Object[0], convertSearchedResultItemsAppModelToUiModelUseCase$addPlacesAndStopsWithHeader$1);
                    if (objB == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list2 = list;
                }
                List<PlaceAndStopInfoAppModel> list3 = searchedResultItemsAppModel.b;
                arrayList = new ArrayList(CollectionsKt.v(list3, 10));
                for (PlaceAndStopInfoAppModel placeAndStopInfoAppModel : list3) {
                    Intrinsics.i(placeAndStopInfoAppModel, "<this>");
                    arrayList.add(new UniversalSearchPlacesAndStopsInfoModel(placeAndStopInfoAppModel.f4992a, placeAndStopInfoAppModel.f, placeAndStopInfoAppModel.g, placeAndStopInfoAppModel.b, placeAndStopInfoAppModel.c, placeAndStopInfoAppModel.d, placeAndStopInfoAppModel.e, placeAndStopInfoAppModel.h, placeAndStopInfoAppModel.i));
                }
                list.add(new UniversalSearchItem.PlacesAndStopsItem(arrayList));
            }
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list = (List) convertSearchedResultItemsAppModelToUiModelUseCase$addPlacesAndStopsWithHeader$1.L$2;
        list2 = (List) convertSearchedResultItemsAppModelToUiModelUseCase$addPlacesAndStopsWithHeader$1.L$1;
        searchedResultItemsAppModel = (SearchedResultItemsAppModel) convertSearchedResultItemsAppModelToUiModelUseCase$addPlacesAndStopsWithHeader$1.L$0;
        ResultKt.b(objB);
        list.add(new UniversalSearchItem.HeaderItem((String) objB));
        list = list2;
        List<PlaceAndStopInfoAppModel> list4 = searchedResultItemsAppModel.b;
        arrayList = new ArrayList(CollectionsKt.v(list4, 10));
        while (r12.hasNext()) {
            Intrinsics.i(placeAndStopInfoAppModel, "<this>");
            arrayList.add(new UniversalSearchPlacesAndStopsInfoModel(placeAndStopInfoAppModel.f4992a, placeAndStopInfoAppModel.f, placeAndStopInfoAppModel.g, placeAndStopInfoAppModel.b, placeAndStopInfoAppModel.c, placeAndStopInfoAppModel.d, placeAndStopInfoAppModel.e, placeAndStopInfoAppModel.h, placeAndStopInfoAppModel.i));
        }
        list.add(new UniversalSearchItem.PlacesAndStopsItem(arrayList));
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object b(SearchedResultItemsAppModel searchedResultItemsAppModel, ArrayList arrayList, ContinuationImpl continuationImpl) {
        ConvertSearchedResultItemsAppModelToUiModelUseCase$addRoutesWithHeader$1 convertSearchedResultItemsAppModelToUiModelUseCase$addRoutesWithHeader$1;
        Object obj;
        List list;
        SearchedResultItemsAppModel searchedResultItemsAppModel2 = searchedResultItemsAppModel;
        List list2 = arrayList;
        if (continuationImpl instanceof ConvertSearchedResultItemsAppModelToUiModelUseCase$addRoutesWithHeader$1) {
            convertSearchedResultItemsAppModelToUiModelUseCase$addRoutesWithHeader$1 = (ConvertSearchedResultItemsAppModelToUiModelUseCase$addRoutesWithHeader$1) continuationImpl;
            int i = convertSearchedResultItemsAppModelToUiModelUseCase$addRoutesWithHeader$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                convertSearchedResultItemsAppModelToUiModelUseCase$addRoutesWithHeader$1.label = i - Integer.MIN_VALUE;
            } else {
                convertSearchedResultItemsAppModelToUiModelUseCase$addRoutesWithHeader$1 = new ConvertSearchedResultItemsAppModelToUiModelUseCase$addRoutesWithHeader$1(this, continuationImpl);
            }
        } else {
            convertSearchedResultItemsAppModelToUiModelUseCase$addRoutesWithHeader$1 = new ConvertSearchedResultItemsAppModelToUiModelUseCase$addRoutesWithHeader$1(this, continuationImpl);
        }
        Object obj2 = convertSearchedResultItemsAppModelToUiModelUseCase$addRoutesWithHeader$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = convertSearchedResultItemsAppModelToUiModelUseCase$addRoutesWithHeader$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            if (!searchedResultItemsAppModel2.f4996a.isEmpty()) {
                convertSearchedResultItemsAppModelToUiModelUseCase$addRoutesWithHeader$1.L$0 = searchedResultItemsAppModel2;
                convertSearchedResultItemsAppModelToUiModelUseCase$addRoutesWithHeader$1.L$1 = list2;
                convertSearchedResultItemsAppModelToUiModelUseCase$addRoutesWithHeader$1.L$2 = list2;
                convertSearchedResultItemsAppModelToUiModelUseCase$addRoutesWithHeader$1.label = 1;
                Object objB = this.f5014a.b(StringEnum.ROUTES, new Object[0], convertSearchedResultItemsAppModelToUiModelUseCase$addRoutesWithHeader$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = objB;
                list = list2;
            }
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list3 = (List) convertSearchedResultItemsAppModelToUiModelUseCase$addRoutesWithHeader$1.L$2;
        List list4 = (List) convertSearchedResultItemsAppModelToUiModelUseCase$addRoutesWithHeader$1.L$1;
        SearchedResultItemsAppModel searchedResultItemsAppModel3 = (SearchedResultItemsAppModel) convertSearchedResultItemsAppModelToUiModelUseCase$addRoutesWithHeader$1.L$0;
        ResultKt.b(obj2);
        list2 = list3;
        searchedResultItemsAppModel2 = searchedResultItemsAppModel3;
        obj = obj2;
        list = list4;
        list2.add(new UniversalSearchItem.HeaderItem((String) obj));
        List<UniversalSearchRouteAppModel> list5 = searchedResultItemsAppModel2.f4996a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list5, 10));
        for (UniversalSearchRouteAppModel universalSearchRouteAppModel : list5) {
            Intrinsics.i(universalSearchRouteAppModel, "<this>");
            String str = universalSearchRouteAppModel.f4999a;
            String str2 = universalSearchRouteAppModel.b;
            String str3 = universalSearchRouteAppModel.c;
            String str4 = universalSearchRouteAppModel.f;
            arrayList2.add(new UniversalSearchRoutesDetailModel(str, str2, str3, universalSearchRouteAppModel.g.contains(RouteLegacySpecialFeature.AC), str4, universalSearchRouteAppModel.i, universalSearchRouteAppModel.d, universalSearchRouteAppModel.e, universalSearchRouteAppModel.h, universalSearchRouteAppModel.k, universalSearchRouteAppModel.l));
        }
        list.add(new UniversalSearchItem.RouteList(arrayList2));
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x010e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x012f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0135  */
    /* JADX WARN: Code duplicated, block: B:72:0x0137  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [app.chalo.livetracking.universalsearch.domain.ConvertSearchedResultItemsAppModelToUiModelUseCase] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    public final Object c(SearchedResultItemsAppModel searchedResultItemsAppModel, UniversalSearchOptions universalSearchOptions, ContinuationImpl continuationImpl) {
        ConvertSearchedResultItemsAppModelToUiModelUseCase$invoke$1 convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1;
        ArrayList arrayListL;
        Ref.BooleanRef booleanRef;
        Ref.BooleanRef booleanRef2;
        boolean z;
        List list;
        Ref.BooleanRef booleanRef3;
        List list2;
        List list3;
        ?? r2;
        boolean z2;
        ?? r3;
        SearchedResultItemsAppModel searchedResultItemsAppModel2 = searchedResultItemsAppModel;
        if (continuationImpl instanceof ConvertSearchedResultItemsAppModelToUiModelUseCase$invoke$1) {
            convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1 = (ConvertSearchedResultItemsAppModelToUiModelUseCase$invoke$1) continuationImpl;
            int i = convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1 = new ConvertSearchedResultItemsAppModelToUiModelUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1 = new ConvertSearchedResultItemsAppModelToUiModelUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.label;
        if (i2 == 0) {
            arrayListL = py.l(obj);
            Ref.BooleanRef booleanRef4 = new Ref.BooleanRef();
            booleanRef = new Ref.BooleanRef();
            booleanRef2 = new Ref.BooleanRef();
            Ref.BooleanRef booleanRef5 = new Ref.BooleanRef();
            for (UniversalSearchOption universalSearchOption : universalSearchOptions.f10141a) {
                if (universalSearchOption instanceof UniversalSearchOption.ALL) {
                    booleanRef4.element = true;
                } else if (universalSearchOption instanceof UniversalSearchOption.STOPS) {
                    booleanRef2.element = true;
                } else if (universalSearchOption instanceof UniversalSearchOption.PLACES) {
                    booleanRef.element = true;
                } else if (universalSearchOption instanceof UniversalSearchOption.ROUTES) {
                    booleanRef5.element = true;
                } else if (!(universalSearchOption instanceof UniversalSearchOption.TRIPS)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            Set set = universalSearchOptions.f10141a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : set) {
                if (obj2 instanceof UniversalSearchOption.PLACES) {
                    arrayList.add(obj2);
                }
            }
            UniversalSearchOption.PLACES places = (UniversalSearchOption.PLACES) CollectionsKt.H(arrayList);
            z = places != null ? places.d : false;
            if (booleanRef4.element) {
                convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$0 = searchedResultItemsAppModel2;
                convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$1 = arrayListL;
                convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.label = 1;
                if (b(searchedResultItemsAppModel2, arrayListL, convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1) != coroutineSingletons) {
                    list2 = arrayListL;
                    convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$0 = list2;
                    convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$1 = null;
                    convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.label = 2;
                    if (a(true, searchedResultItemsAppModel2, list2, convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1) == coroutineSingletons) {
                        return list2;
                    }
                }
            } else {
                if (!booleanRef5.element) {
                    r2 = z;
                    list3 = arrayListL;
                    if (booleanRef2.element) {
                        if (r2 != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$0 = list3;
                        convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$1 = null;
                        convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$2 = null;
                        convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$3 = null;
                        convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.label = 4;
                        if (a(z2, searchedResultItemsAppModel2, list3, convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1) == coroutineSingletons) {
                        }
                    } else {
                        if (r2 != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$0 = list3;
                        convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$1 = null;
                        convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$2 = null;
                        convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$3 = null;
                        convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.label = 4;
                        if (a(z2, searchedResultItemsAppModel2, list3, convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1) == coroutineSingletons) {
                        }
                    }
                    return list3;
                }
                convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$0 = searchedResultItemsAppModel2;
                convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$1 = arrayListL;
                convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$2 = booleanRef;
                convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$3 = booleanRef2;
                convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.I$0 = z ? 1 : 0;
                convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.label = 3;
                if (b(searchedResultItemsAppModel2, arrayListL, convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1) != coroutineSingletons) {
                    r2 = z;
                    list3 = arrayListL;
                    list = arrayListL;
                    booleanRef3 = booleanRef;
                    r3 = z;
                    booleanRef = booleanRef3;
                    list3 = list;
                    r2 = r3;
                    r2 = z;
                    list3 = arrayListL;
                    if (booleanRef2.element) {
                        if (r2 != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$0 = list3;
                        convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$1 = null;
                        convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$2 = null;
                        convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$3 = null;
                        convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.label = 4;
                        if (a(z2, searchedResultItemsAppModel2, list3, convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1) == coroutineSingletons) {
                        }
                    } else {
                        if (r2 != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$0 = list3;
                        convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$1 = null;
                        convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$2 = null;
                        convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$3 = null;
                        convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.label = 4;
                        if (a(z2, searchedResultItemsAppModel2, list3, convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1) == coroutineSingletons) {
                        }
                    }
                    return list3;
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        int i3 = convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.I$0;
                        Ref.BooleanRef booleanRef6 = (Ref.BooleanRef) convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$3;
                        booleanRef3 = (Ref.BooleanRef) convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$2;
                        List list4 = (List) convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$1;
                        SearchedResultItemsAppModel searchedResultItemsAppModel3 = (SearchedResultItemsAppModel) convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$0;
                        ResultKt.b(obj);
                        booleanRef2 = booleanRef6;
                        r3 = i3;
                        searchedResultItemsAppModel2 = searchedResultItemsAppModel3;
                        list = list4;
                        booleanRef = booleanRef3;
                        list3 = list;
                        r2 = r3;
                        r2 = z;
                        list3 = arrayListL;
                        if (booleanRef2.element || booleanRef.element) {
                            if (r2 != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$0 = list3;
                            convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$1 = null;
                            convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$2 = null;
                            convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$3 = null;
                            convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.label = 4;
                            if (a(z2, searchedResultItemsAppModel2, list3, convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1) == coroutineSingletons) {
                            }
                        }
                        return list3;
                    }
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                List list5 = (List) convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$0;
                ResultKt.b(obj);
                return list5;
            }
            List list6 = (List) convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$1;
            SearchedResultItemsAppModel searchedResultItemsAppModel4 = (SearchedResultItemsAppModel) convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$0;
            ResultKt.b(obj);
            list2 = list6;
            searchedResultItemsAppModel2 = searchedResultItemsAppModel4;
            list2 = arrayListL;
            convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$0 = list2;
            convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.L$1 = null;
            convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1.label = 2;
            if (a(true, searchedResultItemsAppModel2, list2, convertSearchedResultItemsAppModelToUiModelUseCase$invoke$1) == coroutineSingletons) {
                return list2;
            }
        }
        r2 = z;
        list3 = arrayListL;
        list2 = arrayListL;
        return coroutineSingletons;
    }
}
