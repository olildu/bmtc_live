package app.chalo.livetracking.routedetails.domain;

import androidx.exifinterface.media.ExifInterface;
import app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/domain/GetLivePassengerDetailsBottomSheetDetailsUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetLivePassengerDetailsBottomSheetDetailsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f4431a;
    public final LiveTrackingConfigDataStore b;

    public GetLivePassengerDetailsBottomSheetDetailsUseCase(CityProvider cityProvider, LiveTrackingConfigDataStore liveTrackingConfigDataStore) {
        this.f4431a = cityProvider;
        this.b = liveTrackingConfigDataStore;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14, types: [T, app.chalo.livetracking.routedetails.domain.LivePassengerIndicatorBottomSheetDetailsType$WithoutNotice] */
    /* JADX WARN: Type inference failed for: r2v12, types: [T, app.chalo.livetracking.routedetails.domain.LivePassengerIndicatorBottomSheetDetailsType$WithNotice] */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, app.chalo.livetracking.routedetails.domain.LivePassengerIndicatorBottomSheetDetailsType$Default] */
    public final Object a(ContinuationImpl continuationImpl) {
        GetLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1 getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1;
        String str;
        String str2;
        String str3;
        String str4;
        Ref.ObjectRef objectRef;
        String str5;
        Ref.ObjectRef objectRef2;
        String str6;
        if (continuationImpl instanceof GetLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1) {
            getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1 = (GetLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1) continuationImpl;
            int i = getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1 = new GetLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1 = new GetLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1(this, continuationImpl);
        }
        Object objK = getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1.label;
        LiveTrackingConfigDataStore liveTrackingConfigDataStore = this.b;
        if (i2 == 0) {
            ResultKt.b(objK);
            String strB = CityProviderKt.b(this.f4431a);
            if (strB == null) {
                return new ChaloUseCaseResult.Failure(LivePassengerIndicatorBottomSheetDetailsError.CityNotAvailable.f4440a);
            }
            String lowerCase = strB.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1.L$0 = lowerCase;
            getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1.label = 1;
            Object objJ = liveTrackingConfigDataStore.j(lowerCase, getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1);
            if (objJ != coroutineSingletons) {
                str = lowerCase;
                objK = objJ;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str = (String) getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1.L$0;
            ResultKt.b(objK);
        } else {
            if (i2 == 2) {
                str2 = (String) getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1.L$1;
                str3 = (String) getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1.L$0;
                ResultKt.b(objK);
                str4 = (String) objK;
                objectRef = new Ref.ObjectRef();
                objectRef.element = LivePassengerIndicatorBottomSheetDetailsType.Default.f4441a;
                if (str4 != null) {
                    if (str4.equals("1")) {
                        objectRef.element = LivePassengerIndicatorBottomSheetDetailsType.WithoutNotice.f4443a;
                    } else if (str4.equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                        getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1.L$0 = str2;
                        getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1.L$1 = objectRef;
                        getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1.label = 3;
                        objK = liveTrackingConfigDataStore.k(str3, getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1);
                        if (objK != coroutineSingletons) {
                            str5 = str2;
                            objectRef2 = objectRef;
                        }
                        return coroutineSingletons;
                    }
                }
                return new ChaloUseCaseResult.Success(new LivePassengerIndicatorBottomSheetDetails(str2, (LivePassengerIndicatorBottomSheetDetailsType) objectRef.element));
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef2 = (Ref.ObjectRef) getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1.L$1;
            str5 = (String) getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1.L$0;
            ResultKt.b(objK);
        }
        str6 = (String) objK;
        if (str6 != null && !str6.equals("disabled")) {
            objectRef2.element = new LivePassengerIndicatorBottomSheetDetailsType.WithNotice(str6);
        }
        str2 = str5;
        objectRef = objectRef2;
        return new ChaloUseCaseResult.Success(new LivePassengerIndicatorBottomSheetDetails(str2, (LivePassengerIndicatorBottomSheetDetailsType) objectRef.element));
        String str7 = (String) objK;
        getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1.L$0 = str;
        getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1.L$1 = str7;
        getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1.label = 2;
        Object objE = liveTrackingConfigDataStore.e(str, getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1);
        if (objE != coroutineSingletons) {
            String str8 = str;
            str2 = str7;
            objK = objE;
            str3 = str8;
            str4 = (String) objK;
            objectRef = new Ref.ObjectRef();
            objectRef.element = LivePassengerIndicatorBottomSheetDetailsType.Default.f4441a;
            if (str4 != null) {
                if (str4.equals("1")) {
                    objectRef.element = LivePassengerIndicatorBottomSheetDetailsType.WithoutNotice.f4443a;
                } else if (str4.equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                    getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1.L$0 = str2;
                    getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1.L$1 = objectRef;
                    getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1.label = 3;
                    objK = liveTrackingConfigDataStore.k(str3, getLivePassengerDetailsBottomSheetDetailsUseCase$invoke$1);
                    if (objK != coroutineSingletons) {
                        str5 = str2;
                        objectRef2 = objectRef;
                        str6 = (String) objK;
                        if (str6 != null) {
                            objectRef2.element = new LivePassengerIndicatorBottomSheetDetailsType.WithNotice(str6);
                        }
                        str2 = str5;
                        objectRef = objectRef2;
                    }
                }
            }
            return new ChaloUseCaseResult.Success(new LivePassengerIndicatorBottomSheetDetails(str2, (LivePassengerIndicatorBottomSheetDetailsType) objectRef.element));
        }
        return coroutineSingletons;
    }
}
