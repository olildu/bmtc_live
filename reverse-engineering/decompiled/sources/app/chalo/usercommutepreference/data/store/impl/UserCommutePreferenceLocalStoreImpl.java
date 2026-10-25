package app.chalo.usercommutepreference.data.store.impl;

import app.chalo.usercommutepreference.data.dao.UserCommutePreferenceSavedRideDao;
import app.chalo.usercommutepreference.data.dao.UserCommutePreferenceSavedRideEntity;
import app.chalo.usercommutepreference.data.dao.UserCommutePreferenceStopPlaceDao;
import app.chalo.usercommutepreference.data.dao.UserCommutePreferenceStopPlaceEntity;
import app.chalo.usercommutepreference.data.mappers.UserCommutePreferenceEntityAppModelMapperKt;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceAppModelKt;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceSavedRideAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceStopPlaceAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceStopPlaceResultType;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceTag;
import app.chalo.usercommutepreference.data.store.UserCommutePreferenceLocalStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/data/store/impl/UserCommutePreferenceLocalStoreImpl;", "Lapp/chalo/usercommutepreference/data/store/UserCommutePreferenceLocalStore;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserCommutePreferenceLocalStoreImpl implements UserCommutePreferenceLocalStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserCommutePreferenceSavedRideDao f10265a;
    public final UserCommutePreferenceStopPlaceDao b;

    public UserCommutePreferenceLocalStoreImpl(UserCommutePreferenceSavedRideDao userCommutePreferenceSavedRideDao, UserCommutePreferenceStopPlaceDao userCommutePreferenceStopPlaceDao) {
        this.f10265a = userCommutePreferenceSavedRideDao;
        this.b = userCommutePreferenceStopPlaceDao;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [app.chalo.usercommutepreference.data.store.impl.UserCommutePreferenceLocalStoreImpl$getAllSavedRidesAsFlow$$inlined$map$1] */
    @Override // app.chalo.usercommutepreference.data.store.UserCommutePreferenceLocalStore
    public final UserCommutePreferenceLocalStoreImpl$getAllSavedRidesAsFlow$$inlined$map$1 a(String str, String str2) {
        final FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1A = this.f10265a.a(str, str2);
        return new Flow<List<? extends UserCommutePreferenceSavedRideAppModel>>() { // from class: app.chalo.usercommutepreference.data.store.impl.UserCommutePreferenceLocalStoreImpl$getAllSavedRidesAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.usercommutepreference.data.store.impl.UserCommutePreferenceLocalStoreImpl$getAllSavedRidesAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f10267a;

                /* JADX INFO: renamed from: app.chalo.usercommutepreference.data.store.impl.UserCommutePreferenceLocalStoreImpl$getAllSavedRidesAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.usercommutepreference.data.store.impl.UserCommutePreferenceLocalStoreImpl$getAllSavedRidesAsFlow$$inlined$map$1$2", f = "UserCommutePreferenceLocalStoreImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f10267a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(UserCommutePreferenceEntityAppModelMapperKt.a((UserCommutePreferenceSavedRideEntity) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (this.f10267a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1A.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [app.chalo.usercommutepreference.data.store.impl.UserCommutePreferenceLocalStoreImpl$getAllUserCommutePreferencePlacesAsFlow$$inlined$map$1] */
    @Override // app.chalo.usercommutepreference.data.store.UserCommutePreferenceLocalStore
    public final UserCommutePreferenceLocalStoreImpl$getAllUserCommutePreferencePlacesAsFlow$$inlined$map$1 b(String str, String str2) {
        final FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1B = this.b.b(str, str2);
        return new Flow<List<? extends UserCommutePreferenceStopPlaceAppModel>>() { // from class: app.chalo.usercommutepreference.data.store.impl.UserCommutePreferenceLocalStoreImpl$getAllUserCommutePreferencePlacesAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.usercommutepreference.data.store.impl.UserCommutePreferenceLocalStoreImpl$getAllUserCommutePreferencePlacesAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f10269a;

                /* JADX INFO: renamed from: app.chalo.usercommutepreference.data.store.impl.UserCommutePreferenceLocalStoreImpl$getAllUserCommutePreferencePlacesAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.usercommutepreference.data.store.impl.UserCommutePreferenceLocalStoreImpl$getAllUserCommutePreferencePlacesAsFlow$$inlined$map$1$2", f = "UserCommutePreferenceLocalStoreImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f10269a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    UserCommutePreferencePlaceLocationAppModel place;
                    UserCommutePreferenceTag userCommutePreferenceTagValueOf;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    int i3 = 1;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        List<UserCommutePreferenceStopPlaceEntity> list = (List) obj;
                        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                        for (UserCommutePreferenceStopPlaceEntity userCommutePreferenceStopPlaceEntity : list) {
                            Intrinsics.i(userCommutePreferenceStopPlaceEntity, "<this>");
                            UserCommutePreferenceStopPlaceResultType.Companion companion = UserCommutePreferenceStopPlaceResultType.INSTANCE;
                            String str = userCommutePreferenceStopPlaceEntity.f;
                            companion.getClass();
                            UserCommutePreferenceStopPlaceResultType userCommutePreferenceStopPlaceResultTypeA = UserCommutePreferenceStopPlaceResultType.Companion.a(str);
                            if (userCommutePreferenceStopPlaceResultTypeA == null) {
                                userCommutePreferenceStopPlaceResultTypeA = UserCommutePreferenceStopPlaceResultType.PLACE;
                            }
                            int i4 = UserCommutePreferenceEntityAppModelMapperKt.WhenMappings.f10241a[userCommutePreferenceStopPlaceResultTypeA.ordinal()];
                            if (i4 == i3) {
                                place = new UserCommutePreferencePlaceLocationAppModel.Place(userCommutePreferenceStopPlaceEntity.g, userCommutePreferenceStopPlaceEntity.c, userCommutePreferenceStopPlaceEntity.h, userCommutePreferenceStopPlaceEntity.j, userCommutePreferenceStopPlaceEntity.k, userCommutePreferenceStopPlaceEntity.l, UserCommutePreferenceStopPlaceResultType.PLACE);
                            } else {
                                if (i4 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                place = new UserCommutePreferencePlaceLocationAppModel.Stop(userCommutePreferenceStopPlaceEntity.g, userCommutePreferenceStopPlaceEntity.c, userCommutePreferenceStopPlaceEntity.h, userCommutePreferenceStopPlaceEntity.i, userCommutePreferenceStopPlaceEntity.j, userCommutePreferenceStopPlaceEntity.k, userCommutePreferenceStopPlaceEntity.l, UserCommutePreferenceStopPlaceResultType.STOP);
                            }
                            String str2 = userCommutePreferenceStopPlaceEntity.f10239a;
                            UserCommutePreferenceTag.Companion companion2 = UserCommutePreferenceTag.INSTANCE;
                            String str3 = userCommutePreferenceStopPlaceEntity.d;
                            companion2.getClass();
                            if (str3 != null) {
                                try {
                                    String upperCase = str3.toUpperCase(Locale.ROOT);
                                    Intrinsics.h(upperCase, "toUpperCase(...)");
                                    userCommutePreferenceTagValueOf = UserCommutePreferenceTag.valueOf(upperCase);
                                } catch (IllegalArgumentException unused) {
                                    userCommutePreferenceTagValueOf = null;
                                }
                            } else {
                                userCommutePreferenceTagValueOf = null;
                            }
                            if (userCommutePreferenceTagValueOf == null) {
                                userCommutePreferenceTagValueOf = UserCommutePreferenceTag.CUSTOM;
                            }
                            arrayList.add(new UserCommutePreferenceStopPlaceAppModel(str2, userCommutePreferenceTagValueOf, userCommutePreferenceStopPlaceEntity.e, place));
                            i3 = 1;
                        }
                        anonymousClass1.label = i3;
                        if (this.f10269a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1B.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.usercommutepreference.data.store.UserCommutePreferenceLocalStore
    public final Object f(List list, String userId, String cityId, Continuation continuation) {
        List<UserCommutePreferenceStopPlaceAppModel> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        for (UserCommutePreferenceStopPlaceAppModel userCommutePreferenceStopPlaceAppModel : list2) {
            Intrinsics.i(userCommutePreferenceStopPlaceAppModel, "<this>");
            Intrinsics.i(userId, "userId");
            Intrinsics.i(cityId, "cityId");
            UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel = userCommutePreferenceStopPlaceAppModel.d;
            String str = userCommutePreferenceStopPlaceAppModel.f10253a;
            String strName = userCommutePreferenceStopPlaceAppModel.b.name();
            String str2 = userCommutePreferenceStopPlaceAppModel.c;
            String strName2 = userCommutePreferencePlaceLocationAppModel.getI().name();
            String b = userCommutePreferencePlaceLocationAppModel.getB();
            String strA = UserCommutePreferenceAppModelKt.a(userCommutePreferencePlaceLocationAppModel);
            String str3 = null;
            UserCommutePreferencePlaceLocationAppModel.Stop stop = userCommutePreferencePlaceLocationAppModel instanceof UserCommutePreferencePlaceLocationAppModel.Stop ? (UserCommutePreferencePlaceLocationAppModel.Stop) userCommutePreferencePlaceLocationAppModel : null;
            if (stop != null) {
                str3 = stop.e;
            }
            arrayList.add(new UserCommutePreferenceStopPlaceEntity(str, userId, cityId, strName, str2, strName2, b, strA, str3, userCommutePreferencePlaceLocationAppModel.getF(), userCommutePreferencePlaceLocationAppModel.getG(), userCommutePreferencePlaceLocationAppModel.getH()));
        }
        Object objC = this.b.c(arrayList, userId, cityId, continuation);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : Unit.f17538a;
    }

    @Override // app.chalo.usercommutepreference.data.store.UserCommutePreferenceLocalStore
    public final Object h(List list, String userId, String cityId, Continuation continuation) {
        List<UserCommutePreferenceSavedRideAppModel> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        for (UserCommutePreferenceSavedRideAppModel userCommutePreferenceSavedRideAppModel : list2) {
            Intrinsics.i(userCommutePreferenceSavedRideAppModel, "<this>");
            Intrinsics.i(userId, "userId");
            Intrinsics.i(cityId, "cityId");
            arrayList.add(new UserCommutePreferenceSavedRideEntity(userCommutePreferenceSavedRideAppModel.d, userCommutePreferenceSavedRideAppModel.f10252a, userId, cityId, UserCommutePreferenceEntityAppModelMapperKt.c(userCommutePreferenceSavedRideAppModel.b), UserCommutePreferenceEntityAppModelMapperKt.c(userCommutePreferenceSavedRideAppModel.c)));
        }
        Object objB = this.f10265a.b(arrayList, userId, cityId, continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [app.chalo.usercommutepreference.data.store.impl.UserCommutePreferenceLocalStoreImpl$getSavedRidesByODPairAsFlow$$inlined$map$1] */
    @Override // app.chalo.usercommutepreference.data.store.UserCommutePreferenceLocalStore
    public final UserCommutePreferenceLocalStoreImpl$getSavedRidesByODPairAsFlow$$inlined$map$1 i(final String originId, final String destinationId, String str, String str2) {
        Intrinsics.i(originId, "originId");
        Intrinsics.i(destinationId, "destinationId");
        final FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1A = this.f10265a.a(str, str2);
        return new Flow<List<? extends UserCommutePreferenceSavedRideAppModel>>() { // from class: app.chalo.usercommutepreference.data.store.impl.UserCommutePreferenceLocalStoreImpl$getSavedRidesByODPairAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.usercommutepreference.data.store.impl.UserCommutePreferenceLocalStoreImpl$getSavedRidesByODPairAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f10271a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;

                /* JADX INFO: renamed from: app.chalo.usercommutepreference.data.store.impl.UserCommutePreferenceLocalStoreImpl$getSavedRidesByODPairAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.usercommutepreference.data.store.impl.UserCommutePreferenceLocalStoreImpl$getSavedRidesByODPairAsFlow$$inlined$map$1$2", f = "UserCommutePreferenceLocalStoreImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, String str, String str2) {
                    this.f10271a = flowCollector;
                    this.b = str;
                    this.c = str2;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(UserCommutePreferenceEntityAppModelMapperKt.a((UserCommutePreferenceSavedRideEntity) it.next()));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj3 = arrayList.get(i3);
                            i3++;
                            UserCommutePreferenceSavedRideAppModel userCommutePreferenceSavedRideAppModel = (UserCommutePreferenceSavedRideAppModel) obj3;
                            if (Intrinsics.d(userCommutePreferenceSavedRideAppModel.b.getB(), this.b) && Intrinsics.d(userCommutePreferenceSavedRideAppModel.c.getB(), this.c)) {
                                arrayList2.add(obj3);
                            }
                        }
                        anonymousClass1.label = 1;
                        if (this.f10271a.emit(arrayList2, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1A.collect(new AnonymousClass2(flowCollector, originId, destinationId), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }
}
