package app.chalo.livetracking.tripplanner.ui.result;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.data.model.app.RouteServiceType;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.livetracking.routedetails.LiveTrackingNavigationContract;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel;
import app.chalo.livetracking.routedetails.data.model.ui.TrackingAdditionalFeatures;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerResultAppResponseModelKt;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.RouteDetailsArgs;
import app.chalo.scenes.args.TripPlannerArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleItineraryClickedIntent$1", f = "TripPlannerResultsComponent.kt", l = {596, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE, 662}, m = "invokeSuspend", v = 1)
final class TripPlannerResultsComponent$handleItineraryClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TripPlannerResultIntent.ItineraryClickedIntent $intent;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ TripPlannerResultsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerResultsComponent$handleItineraryClickedIntent$1(TripPlannerResultsComponent tripPlannerResultsComponent, TripPlannerResultIntent.ItineraryClickedIntent itineraryClickedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tripPlannerResultsComponent;
        this.$intent = itineraryClickedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TripPlannerResultsComponent$handleItineraryClickedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerResultsComponent$handleItineraryClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x029f  */
    /* JADX WARN: Code duplicated, block: B:111:0x02af  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:119:0x028a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [T, app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        Ref.IntRef intRef;
        Ref.IntRef intRef2;
        Ref.ObjectRef objectRef;
        T t;
        String strA;
        TripPlannerResultsComponent tripPlannerResultsComponent;
        ChaloNavigationManager chaloNavigationManager;
        Long l;
        Object objC;
        ChaloNavigationManager chaloNavigationManager2;
        long jLongValue;
        String strA2;
        StopAppModel stopAppModel;
        Object objC2;
        LiveTrackingNavigationContract liveTrackingNavigationContract;
        List list;
        StopAppModel stopAppModel2;
        Source source;
        long jLongValue2;
        LiveTrackingNavigationContract liveTrackingNavigationContract2;
        List list2;
        StopAppModel stopAppModel3;
        Source source2;
        TripPlannerLegAppModel tripPlannerLegAppModel;
        Object objB;
        KotlinToastManager kotlinToastManager;
        TripPlannerItineraryInfoHolder tripPlannerItineraryInfoHolder;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            Map map = (Map) this.this$0.R.get(TripPlannerResultsComponent.H0(this.this$0).b);
            TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel = (map == null || (tripPlannerItineraryInfoHolder = (TripPlannerItineraryInfoHolder) map.get(this.$intent.f4771a)) == null) ? null : tripPlannerItineraryInfoHolder.f4752a;
            if (tripPlannerItineraryAppResponseModel == null) {
                TripPlannerResultsComponent tripPlannerResultsComponent2 = this.this$0;
                KotlinToastManager kotlinToastManager2 = tripPlannerResultsComponent2.B;
                this.L$0 = kotlinToastManager2;
                this.label = 1;
                objB = tripPlannerResultsComponent2.o.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                if (objB != coroutineSingletons) {
                    kotlinToastManager = kotlinToastManager2;
                    KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
                    return unit;
                }
            } else {
                List list3 = tripPlannerItineraryAppResponseModel.f;
                TripPlannerResultsComponent tripPlannerResultsComponent3 = this.this$0;
                tripPlannerResultsComponent3.getClass();
                TripPlannerLegAppModel tripPlannerLegAppModel2 = (TripPlannerLegAppModel) CollectionsKt.H(list3);
                if (tripPlannerLegAppModel2 == null || (tripPlannerLegAppModel = (TripPlannerLegAppModel) CollectionsKt.Q(list3)) == null) {
                    i = 3;
                } else {
                    i = 3;
                    LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("origin", String.valueOf(tripPlannerLegAppModel2.getE())), new Pair(FirebaseAnalytics.Param.DESTINATION, String.valueOf(tripPlannerLegAppModel.getF())), new Pair("isDirectPremiumBusResult", String.valueOf(TripPlannerResultAppResponseModelKt.g(list3))), new Pair("containsPremiumBusLeg", String.valueOf(TripPlannerResultAppResponseModelKt.c(list3))));
                    linkedHashMapK.putAll(TripPlannerResultAppResponseModelKt.d(tripPlannerItineraryAppResponseModel));
                    AnalyticsContract.DefaultImpls.a(tripPlannerResultsComponent3.w, "trip planner result clicked", Source.TRIP_PLANNER.getSourceName(), linkedHashMapK, null, false, 24);
                }
                List<??> list4 = list3;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list4) {
                    if (obj2 instanceof TripPlannerLegAppModel.Bus) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.size() != 1) {
                    intRef = new Ref.IntRef();
                    intRef2 = new Ref.IntRef();
                    objectRef = new Ref.ObjectRef();
                    for (?? r10 : list4) {
                        if (r10 instanceof TripPlannerLegAppModel.Bus) {
                            intRef.element++;
                            objectRef.element = r10;
                        } else {
                            if ((r10 instanceof TripPlannerLegAppModel.Auto) && !Intrinsics.d(r10, TripPlannerLegAppModel.Ferry.INSTANCE) && !(r10 instanceof TripPlannerLegAppModel.Metro) && !Intrinsics.d(r10, TripPlannerLegAppModel.MonoRail.INSTANCE) && !(r10 instanceof TripPlannerLegAppModel.Railway) && !(r10 instanceof TripPlannerLegAppModel.Taxi) && !(r10 instanceof TripPlannerLegAppModel.Walk)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int i3 = intRef2.element;
                            intRef2.element = i3 + 1;
                            Boxing.b(i3);
                        }
                    }
                    t = objectRef.element;
                    if (t == 0 && intRef.element == 1 && intRef2.element == 0) {
                        TripPlannerLegAppModel.Bus bus = (TripPlannerLegAppModel.Bus) t;
                        String str = bus.p;
                        if (str == null) {
                            str = "";
                        }
                        String str2 = str;
                        StopAppModel stopAppModel4 = bus.s;
                        String str3 = stopAppModel4 != null ? stopAppModel4.f1727a : null;
                        StopAppModel stopAppModel5 = bus.t;
                        RouteDetailsIntentModel routeDetailsIntentModel = new RouteDetailsIntentModel(str2, str3, stopAppModel5 != null ? stopAppModel5.f1727a : null, null, Source.TRIP_PLANNER.getSourceName(), Boolean.FALSE, false, new TrackingAdditionalFeatures(32767, null, null, null));
                        try {
                            Json json = ChaloJson.b;
                            json.getClass();
                            strA2 = json.a(RouteDetailsIntentModel.INSTANCE.serializer(), routeDetailsIntentModel);
                        } catch (Exception unused) {
                            strA2 = null;
                        }
                        if (strA2 != null) {
                            this.this$0.C.b(new ChaloNavigationRequest.Navigate(new RouteDetailsArgs(strA2), null, null, 6));
                        }
                    } else {
                        try {
                            Json json2 = ChaloJson.b;
                            json2.getClass();
                            strA = json2.a(TripPlannerItineraryAppResponseModel.INSTANCE.serializer(), tripPlannerItineraryAppResponseModel);
                        } catch (Exception unused2) {
                            strA = null;
                        }
                        if (strA != null) {
                            tripPlannerResultsComponent = this.this$0;
                            chaloNavigationManager = tripPlannerResultsComponent.C;
                            l = ((TripPlannerResultsState) tripPlannerResultsComponent.f.getValue()).p;
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                BasicInfoContract basicInfoContract = tripPlannerResultsComponent.n;
                                this.L$0 = strA;
                                this.L$1 = chaloNavigationManager;
                                this.label = i;
                                objC = basicInfoContract.c(this);
                                if (objC != coroutineSingletons) {
                                    chaloNavigationManager2 = chaloNavigationManager;
                                    jLongValue = ((Number) objC).longValue();
                                    chaloNavigationManager = chaloNavigationManager2;
                                }
                            }
                            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new TripPlannerArgs.DetailsScreen(strA, jLongValue), null, null, 6));
                        }
                    }
                } else {
                    TripPlannerLegAppModel.Bus bus2 = (TripPlannerLegAppModel.Bus) CollectionsKt.H(arrayList);
                    if ((bus2 != null ? bus2.G : null) == RouteServiceType.PREMIUM) {
                        LiveTrackingNavigationContract liveTrackingNavigationContract3 = this.this$0.A;
                        stopAppModel = ((TripPlannerLegAppModel.Bus) arrayList.get(0)).s;
                        StopAppModel stopAppModel6 = ((TripPlannerLegAppModel.Bus) arrayList.get(0)).t;
                        List listR = CollectionsKt.R(((TripPlannerLegAppModel.Bus) arrayList.get(0)).p);
                        Source source3 = Source.TRIP_PLANNER;
                        Long l2 = ((TripPlannerResultsState) this.this$0.f.getValue()).p;
                        if (l2 != null) {
                            jLongValue2 = l2.longValue();
                            liveTrackingNavigationContract2 = liveTrackingNavigationContract3;
                            list2 = listR;
                            stopAppModel3 = stopAppModel6;
                            source2 = source3;
                        } else {
                            BasicInfoContract basicInfoContract2 = this.this$0.n;
                            this.L$0 = liveTrackingNavigationContract3;
                            this.L$1 = stopAppModel;
                            this.L$2 = stopAppModel6;
                            this.L$3 = listR;
                            this.L$4 = source3;
                            this.label = 2;
                            objC2 = basicInfoContract2.c(this);
                            if (objC2 != coroutineSingletons) {
                                liveTrackingNavigationContract = liveTrackingNavigationContract3;
                                list = listR;
                                stopAppModel2 = stopAppModel6;
                                source = source3;
                                jLongValue2 = ((Number) objC2).longValue();
                                source2 = source;
                                list2 = list;
                                stopAppModel3 = stopAppModel2;
                                liveTrackingNavigationContract2 = liveTrackingNavigationContract;
                            }
                        }
                        liveTrackingNavigationContract2.d(stopAppModel, stopAppModel3, list2, source2, jLongValue2);
                        return unit;
                    }
                    intRef = new Ref.IntRef();
                    intRef2 = new Ref.IntRef();
                    objectRef = new Ref.ObjectRef();
                    while (r9.hasNext()) {
                        if (r10 instanceof TripPlannerLegAppModel.Bus) {
                            intRef.element++;
                            objectRef.element = r10;
                        } else {
                            if (r10 instanceof TripPlannerLegAppModel.Auto) {
                            }
                            int i4 = intRef2.element;
                            intRef2.element = i4 + 1;
                            Boxing.b(i4);
                        }
                    }
                    t = objectRef.element;
                    if (t == 0) {
                        Json json3 = ChaloJson.b;
                        json3.getClass();
                        strA = json3.a(TripPlannerItineraryAppResponseModel.INSTANCE.serializer(), tripPlannerItineraryAppResponseModel);
                        if (strA != null) {
                            tripPlannerResultsComponent = this.this$0;
                            chaloNavigationManager = tripPlannerResultsComponent.C;
                            l = ((TripPlannerResultsState) tripPlannerResultsComponent.f.getValue()).p;
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                BasicInfoContract basicInfoContract3 = tripPlannerResultsComponent.n;
                                this.L$0 = strA;
                                this.L$1 = chaloNavigationManager;
                                this.label = i;
                                objC = basicInfoContract3.c(this);
                                if (objC != coroutineSingletons) {
                                    chaloNavigationManager2 = chaloNavigationManager;
                                    jLongValue = ((Number) objC).longValue();
                                    chaloNavigationManager = chaloNavigationManager2;
                                }
                            }
                            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new TripPlannerArgs.DetailsScreen(strA, jLongValue), null, null, 6));
                        }
                    } else {
                        Json json4 = ChaloJson.b;
                        json4.getClass();
                        strA = json4.a(TripPlannerItineraryAppResponseModel.INSTANCE.serializer(), tripPlannerItineraryAppResponseModel);
                        if (strA != null) {
                            tripPlannerResultsComponent = this.this$0;
                            chaloNavigationManager = tripPlannerResultsComponent.C;
                            l = ((TripPlannerResultsState) tripPlannerResultsComponent.f.getValue()).p;
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                BasicInfoContract basicInfoContract4 = tripPlannerResultsComponent.n;
                                this.L$0 = strA;
                                this.L$1 = chaloNavigationManager;
                                this.label = i;
                                objC = basicInfoContract4.c(this);
                                if (objC != coroutineSingletons) {
                                    chaloNavigationManager2 = chaloNavigationManager;
                                    jLongValue = ((Number) objC).longValue();
                                    chaloNavigationManager = chaloNavigationManager2;
                                }
                            }
                            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new TripPlannerArgs.DetailsScreen(strA, jLongValue), null, null, 6));
                        }
                    }
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            objB = obj;
            KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
            return unit;
        }
        if (i2 == 2) {
            source = (Source) this.L$4;
            list = (List) this.L$3;
            stopAppModel2 = (StopAppModel) this.L$2;
            stopAppModel = (StopAppModel) this.L$1;
            LiveTrackingNavigationContract liveTrackingNavigationContract4 = (LiveTrackingNavigationContract) this.L$0;
            ResultKt.b(obj);
            liveTrackingNavigationContract = liveTrackingNavigationContract4;
            objC2 = obj;
            jLongValue2 = ((Number) objC2).longValue();
            source2 = source;
            list2 = list;
            stopAppModel3 = stopAppModel2;
            liveTrackingNavigationContract2 = liveTrackingNavigationContract;
            liveTrackingNavigationContract2.d(stopAppModel, stopAppModel3, list2, source2, jLongValue2);
            return unit;
        }
        if (i2 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        chaloNavigationManager2 = (ChaloNavigationManager) this.L$1;
        strA = (String) this.L$0;
        ResultKt.b(obj);
        objC = obj;
        jLongValue = ((Number) objC).longValue();
        chaloNavigationManager = chaloNavigationManager2;
        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new TripPlannerArgs.DetailsScreen(strA, jLongValue), null, null, 6));
        return unit;
    }
}
