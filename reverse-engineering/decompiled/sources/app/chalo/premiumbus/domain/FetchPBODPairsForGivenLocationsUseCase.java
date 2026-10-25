package app.chalo.premiumbus.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.premiumbus.data.exceptions.PBStopPointsFetchFailedException;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/FetchPBODPairsForGivenLocationsUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchPBODPairsForGivenLocationsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7187a;
    public final BasicInfoContract b;

    public FetchPBODPairsForGivenLocationsUseCase(PremiumBusRepository premiumBusRepository, BasicInfoContract basicInfoContract) {
        this.f7187a = premiumBusRepository;
        this.b = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2, ContinuationImpl continuationImpl) {
        FetchPBODPairsForGivenLocationsUseCase$invoke$1 fetchPBODPairsForGivenLocationsUseCase$invoke$1;
        if (continuationImpl instanceof FetchPBODPairsForGivenLocationsUseCase$invoke$1) {
            fetchPBODPairsForGivenLocationsUseCase$invoke$1 = (FetchPBODPairsForGivenLocationsUseCase$invoke$1) continuationImpl;
            int i = fetchPBODPairsForGivenLocationsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchPBODPairsForGivenLocationsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchPBODPairsForGivenLocationsUseCase$invoke$1 = new FetchPBODPairsForGivenLocationsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchPBODPairsForGivenLocationsUseCase$invoke$1 = new FetchPBODPairsForGivenLocationsUseCase$invoke$1(this, continuationImpl);
        }
        Object objV = fetchPBODPairsForGivenLocationsUseCase$invoke$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchPBODPairsForGivenLocationsUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objV);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("fromId", pBStopPlaceSelectedAppModel.f7095a);
                linkedHashMap.put("fromIdSearchPartner", pBStopPlaceSelectedAppModel.b);
                linkedHashMap.put("fromIdType", pBStopPlaceSelectedAppModel.f.toParamValue());
                linkedHashMap.put("toId", pBStopPlaceSelectedAppModel2.f7095a);
                linkedHashMap.put("toIdSearchPartner", pBStopPlaceSelectedAppModel2.b);
                linkedHashMap.put("toIdType", pBStopPlaceSelectedAppModel2.f.toParamValue());
                linkedHashMap.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, String.valueOf(this.b.h()));
                linkedHashMap.put("serviceType", "Premium");
                PremiumBusRepository premiumBusRepository = this.f7187a;
                fetchPBODPairsForGivenLocationsUseCase$invoke$1.label = 1;
                objV = premiumBusRepository.v(linkedHashMap, fetchPBODPairsForGivenLocationsUseCase$invoke$1);
                if (objV == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objV);
            }
            List list = (List) objV;
            return list.isEmpty() ? FetchPBStopPointsResult.NoStopPointsAvailable.f7189a : new FetchPBStopPointsResult.Success(list);
        } catch (ChaloLocalException unused) {
            return FetchPBStopPointsResult.LocalException.f7188a;
        } catch (NetworkSuccessResponseParseException unused2) {
            return FetchPBStopPointsResult.ResponseParseException.f7190a;
        } catch (PBStopPointsFetchFailedException e) {
            return new FetchPBStopPointsResult.ServerError(e.getMessage());
        } catch (Exception unused3) {
            return FetchPBStopPointsResult.UnknownException.f7193a;
        }
    }
}
