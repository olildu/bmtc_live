package app.chalo.citylocationselection;

import app.chalo.citydata.domain.FetchCityIdErrorType;
import app.chalo.citydata.domain.FetchCityIdFromLatLngUseCase;
import app.chalo.contract.CityMetaDataManager;
import app.chalo.contract.FetchCityMetaDataErrorType;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.onboarding.citylocationselection.CityMetaDataCacheUpdateResult;
import app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citylocationselection/CityMetaDataManagerImpl;", "Lapp/chalo/contract/CityMetaDataManager;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CityMetaDataManagerImpl implements CityMetaDataManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchCityIdFromLatLngUseCase f1800a;
    public final FetchCityMetaDataUseCase b;
    public final FetchBasicCityInfoListUseCase c;
    public final CityMetaPropsLocalDataSource d;
    public final ChaloAppFeatureHelper e;
    public final CityProvider f;

    public CityMetaDataManagerImpl(FetchCityIdFromLatLngUseCase fetchCityIdFromLatLngUseCase, FetchCityMetaDataUseCase fetchCityMetaDataUseCase, FetchBasicCityInfoListUseCase fetchBasicCityInfoListUseCase, CityMetaPropsLocalDataSource cityMetaPropsLocalDataSource, ChaloAppFeatureHelper chaloAppFeatureHelper, CityProvider cityProvider) {
        this.f1800a = fetchCityIdFromLatLngUseCase;
        this.b = fetchCityMetaDataUseCase;
        this.c = fetchBasicCityInfoListUseCase;
        this.d = cityMetaPropsLocalDataSource;
        this.e = chaloAppFeatureHelper;
        this.f = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r7 == r1) goto L27;
     */
    @Override // app.chalo.contract.CityMetaDataManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.location.LatLng r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof app.chalo.citylocationselection.CityMetaDataManagerImpl$fetchCityIdAndCityNameForLocation$1
            if (r0 == 0) goto L13
            r0 = r7
            app.chalo.citylocationselection.CityMetaDataManagerImpl$fetchCityIdAndCityNameForLocation$1 r0 = (app.chalo.citylocationselection.CityMetaDataManagerImpl$fetchCityIdAndCityNameForLocation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.citylocationselection.CityMetaDataManagerImpl$fetchCityIdAndCityNameForLocation$1 r0 = new app.chalo.citylocationselection.CityMetaDataManagerImpl$fetchCityIdAndCityNameForLocation$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r7)
            goto L69
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.ResultKt.b(r7)
            goto L44
        L36:
            kotlin.ResultKt.b(r7)
            r0.label = r4
            app.chalo.citydata.domain.FetchCityIdFromLatLngUseCase r7 = r5.f1800a
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L44
            goto L68
        L44:
            app.chalo.utils.ChaloUseCaseResult r7 = (app.chalo.utils.ChaloUseCaseResult) r7
            boolean r6 = r7 instanceof app.chalo.utils.ChaloUseCaseResult.Success
            if (r6 == 0) goto L56
            app.chalo.utils.ChaloUseCaseResult$Success r7 = (app.chalo.utils.ChaloUseCaseResult.Success) r7
            java.lang.Object r6 = r7.f10419a
            app.chalo.data.CityIdAndDisplayNameAppModel r6 = (app.chalo.data.CityIdAndDisplayNameAppModel) r6
            app.chalo.utils.ChaloUseCaseResult$Success r7 = new app.chalo.utils.ChaloUseCaseResult$Success
            r7.<init>(r6)
            return r7
        L56:
            boolean r6 = r7 instanceof app.chalo.utils.ChaloUseCaseResult.Failure
            if (r6 == 0) goto L6f
            app.chalo.utils.ChaloUseCaseResult$Failure r7 = (app.chalo.utils.ChaloUseCaseResult.Failure) r7
            java.lang.Object r6 = r7.f10418a
            app.chalo.citydata.domain.FetchCityIdErrorType r6 = (app.chalo.citydata.domain.FetchCityIdErrorType) r6
            r0.label = r3
            java.lang.Object r7 = r5.d(r6, r0)
            if (r7 != r1) goto L69
        L68:
            return r1
        L69:
            app.chalo.utils.ChaloUseCaseResult$Failure r6 = new app.chalo.utils.ChaloUseCaseResult$Failure
            r6.<init>(r7)
            return r6
        L6f:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.citylocationselection.CityMetaDataManagerImpl.a(app.chalo.location.LatLng, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.contract.CityMetaDataManager
    public final Object b(String str, ContinuationImpl continuationImpl) {
        CityMetaDataManagerImpl$fetchAndCacheCityMetaData$1 cityMetaDataManagerImpl$fetchAndCacheCityMetaData$1;
        CityMetaDataCacheUpdateResult cityMetaDataCacheUpdateResult;
        Object objD;
        CityAppModel cityAppModel;
        if (continuationImpl instanceof CityMetaDataManagerImpl$fetchAndCacheCityMetaData$1) {
            cityMetaDataManagerImpl$fetchAndCacheCityMetaData$1 = (CityMetaDataManagerImpl$fetchAndCacheCityMetaData$1) continuationImpl;
            int i = cityMetaDataManagerImpl$fetchAndCacheCityMetaData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityMetaDataManagerImpl$fetchAndCacheCityMetaData$1.label = i - Integer.MIN_VALUE;
            } else {
                cityMetaDataManagerImpl$fetchAndCacheCityMetaData$1 = new CityMetaDataManagerImpl$fetchAndCacheCityMetaData$1(this, continuationImpl);
            }
        } else {
            cityMetaDataManagerImpl$fetchAndCacheCityMetaData$1 = new CityMetaDataManagerImpl$fetchAndCacheCityMetaData$1(this, continuationImpl);
        }
        Object objB = cityMetaDataManagerImpl$fetchAndCacheCityMetaData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityMetaDataManagerImpl$fetchAndCacheCityMetaData$1.label;
        CityAppModel cityAppModel2 = null;
        CityMetaPropsLocalDataSource cityMetaPropsLocalDataSource = this.d;
        if (i2 == 0) {
            ResultKt.b(objB);
            cityMetaDataManagerImpl$fetchAndCacheCityMetaData$1.L$0 = str;
            cityMetaDataManagerImpl$fetchAndCacheCityMetaData$1.label = 1;
            objB = this.b.b(str, cityMetaDataManagerImpl$fetchAndCacheCityMetaData$1);
            if (objB != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str = (String) cityMetaDataManagerImpl$fetchAndCacheCityMetaData$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i2 == 2) {
                ResultKt.b(objB);
                cityMetaDataCacheUpdateResult = (CityMetaDataCacheUpdateResult) objB;
                Intrinsics.i(cityMetaDataCacheUpdateResult, "<this>");
                if (!(cityMetaDataCacheUpdateResult instanceof CityMetaDataCacheUpdateResult.Failure)) {
                    if (cityMetaDataCacheUpdateResult instanceof CityMetaDataCacheUpdateResult.Success) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cityAppModel2 = ((CityMetaDataCacheUpdateResult.Success) cityMetaDataCacheUpdateResult).f6564a;
                }
                if (cityAppModel2 == null) {
                    return new ChaloUseCaseResult.Failure(new FetchCityMetaDataErrorType.CityMetaDataFetchError("City meta data parsing failed"));
                }
                cityMetaDataManagerImpl$fetchAndCacheCityMetaData$1.L$0 = cityAppModel2;
                cityMetaDataManagerImpl$fetchAndCacheCityMetaData$1.label = 3;
                objD = cityMetaPropsLocalDataSource.d("key_is_meta_updated", "true", cityMetaDataManagerImpl$fetchAndCacheCityMetaData$1);
                if (objD != coroutineSingletons) {
                    objD = Unit.f17538a;
                }
                if (objD != coroutineSingletons) {
                    cityAppModel = cityAppModel2;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cityAppModel = (CityAppModel) cityMetaDataManagerImpl$fetchAndCacheCityMetaData$1.L$0;
            ResultKt.b(objB);
        }
        return new ChaloUseCaseResult.Success(cityAppModel);
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objB;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            return new ChaloUseCaseResult.Failure(((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a);
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        Pair pair = (Pair) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
        String str2 = (String) pair.d();
        String str3 = (String) pair.e();
        cityMetaDataManagerImpl$fetchAndCacheCityMetaData$1.L$0 = null;
        cityMetaDataManagerImpl$fetchAndCacheCityMetaData$1.label = 2;
        objB = cityMetaPropsLocalDataSource.c(str, str2, str3, cityMetaDataManagerImpl$fetchAndCacheCityMetaData$1);
        if (objB != coroutineSingletons) {
            cityMetaDataCacheUpdateResult = (CityMetaDataCacheUpdateResult) objB;
            Intrinsics.i(cityMetaDataCacheUpdateResult, "<this>");
            if (!(cityMetaDataCacheUpdateResult instanceof CityMetaDataCacheUpdateResult.Failure)) {
                if (cityMetaDataCacheUpdateResult instanceof CityMetaDataCacheUpdateResult.Success) {
                    throw new NoWhenBranchMatchedException();
                }
                cityAppModel2 = ((CityMetaDataCacheUpdateResult.Success) cityMetaDataCacheUpdateResult).f6564a;
            }
            if (cityAppModel2 == null) {
                return new ChaloUseCaseResult.Failure(new FetchCityMetaDataErrorType.CityMetaDataFetchError("City meta data parsing failed"));
            }
            cityMetaDataManagerImpl$fetchAndCacheCityMetaData$1.L$0 = cityAppModel2;
            cityMetaDataManagerImpl$fetchAndCacheCityMetaData$1.label = 3;
            objD = cityMetaPropsLocalDataSource.d("key_is_meta_updated", "true", cityMetaDataManagerImpl$fetchAndCacheCityMetaData$1);
            if (objD != coroutineSingletons) {
                objD = Unit.f17538a;
            }
            if (objD != coroutineSingletons) {
                cityAppModel = cityAppModel2;
                return new ChaloUseCaseResult.Success(cityAppModel);
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r6 == r1) goto L27;
     */
    @Override // app.chalo.contract.CityMetaDataManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof app.chalo.citylocationselection.CityMetaDataManagerImpl$fetchAndCacheBasicCityInfoList$1
            if (r0 == 0) goto L13
            r0 = r6
            app.chalo.citylocationselection.CityMetaDataManagerImpl$fetchAndCacheBasicCityInfoList$1 r0 = (app.chalo.citylocationselection.CityMetaDataManagerImpl$fetchAndCacheBasicCityInfoList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.citylocationselection.CityMetaDataManagerImpl$fetchAndCacheBasicCityInfoList$1 r0 = new app.chalo.citylocationselection.CityMetaDataManagerImpl$fetchAndCacheBasicCityInfoList$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r6)
            goto L69
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            kotlin.ResultKt.b(r6)
            goto L44
        L36:
            kotlin.ResultKt.b(r6)
            r0.label = r4
            app.chalo.citylocationselection.FetchBasicCityInfoListUseCase r6 = r5.c
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L44
            goto L68
        L44:
            app.chalo.utils.ChaloUseCaseResult r6 = (app.chalo.utils.ChaloUseCaseResult) r6
            boolean r2 = r6 instanceof app.chalo.utils.ChaloUseCaseResult.Failure
            if (r2 == 0) goto L54
            app.chalo.utils.ChaloUseCaseResult$Failure r0 = new app.chalo.utils.ChaloUseCaseResult$Failure
            app.chalo.utils.ChaloUseCaseResult$Failure r6 = (app.chalo.utils.ChaloUseCaseResult.Failure) r6
            java.lang.Object r6 = r6.f10418a
            r0.<init>(r6)
            return r0
        L54:
            boolean r2 = r6 instanceof app.chalo.utils.ChaloUseCaseResult.Success
            if (r2 == 0) goto L80
            app.chalo.utils.ChaloUseCaseResult$Success r6 = (app.chalo.utils.ChaloUseCaseResult.Success) r6
            java.lang.Object r6 = r6.f10419a
            java.lang.String r6 = (java.lang.String) r6
            r0.label = r3
            app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource r2 = r5.d
            java.lang.Object r6 = r2.b(r6, r0)
            if (r6 != r1) goto L69
        L68:
            return r1
        L69:
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L7a
            app.chalo.utils.ChaloUseCaseResult$Failure r6 = new app.chalo.utils.ChaloUseCaseResult$Failure
            app.chalo.contract.FetchBasicCityInfoListErrorType$FetchBasicCityInfoListError r0 = new app.chalo.contract.FetchBasicCityInfoListErrorType$FetchBasicCityInfoListError
            java.lang.String r1 = "Basic city Info parsing failed"
            r0.<init>(r1)
            r6.<init>(r0)
            return r6
        L7a:
            app.chalo.utils.ChaloUseCaseResult$Success r0 = new app.chalo.utils.ChaloUseCaseResult$Success
            r0.<init>(r6)
            return r0
        L80:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.citylocationselection.CityMetaDataManagerImpl.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(FetchCityIdErrorType fetchCityIdErrorType, ContinuationImpl continuationImpl) {
        CityMetaDataManagerImpl$toFetchCityMetaDataErrorType$1 cityMetaDataManagerImpl$toFetchCityMetaDataErrorType$1;
        if (continuationImpl instanceof CityMetaDataManagerImpl$toFetchCityMetaDataErrorType$1) {
            cityMetaDataManagerImpl$toFetchCityMetaDataErrorType$1 = (CityMetaDataManagerImpl$toFetchCityMetaDataErrorType$1) continuationImpl;
            int i = cityMetaDataManagerImpl$toFetchCityMetaDataErrorType$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityMetaDataManagerImpl$toFetchCityMetaDataErrorType$1.label = i - Integer.MIN_VALUE;
            } else {
                cityMetaDataManagerImpl$toFetchCityMetaDataErrorType$1 = new CityMetaDataManagerImpl$toFetchCityMetaDataErrorType$1(this, continuationImpl);
            }
        } else {
            cityMetaDataManagerImpl$toFetchCityMetaDataErrorType$1 = new CityMetaDataManagerImpl$toFetchCityMetaDataErrorType$1(this, continuationImpl);
        }
        Object objO = cityMetaDataManagerImpl$toFetchCityMetaDataErrorType$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityMetaDataManagerImpl$toFetchCityMetaDataErrorType$1.label;
        FetchCityMetaDataErrorType.CityIdNotAvailable cityIdNotAvailable = FetchCityMetaDataErrorType.CityIdNotAvailable.f1943a;
        if (i2 == 0) {
            ResultKt.b(objO);
            if (!Intrinsics.d(fetchCityIdErrorType, FetchCityIdErrorType.CityUnavailable.f1749a)) {
                if (fetchCityIdErrorType instanceof FetchCityIdErrorType.Remote) {
                    return cityIdNotAvailable;
                }
                throw new NoWhenBranchMatchedException();
            }
            CityAppModel cityAppModel = (CityAppModel) this.f.b().getValue();
            String str = cityAppModel != null ? cityAppModel.f8854a : null;
            cityMetaDataManagerImpl$toFetchCityMetaDataErrorType$1.label = 1;
            objO = this.e.o(str, cityMetaDataManagerImpl$toFetchCityMetaDataErrorType$1);
            if (objO == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objO);
        }
        boolean zBooleanValue = ((Boolean) objO).booleanValue();
        if (zBooleanValue) {
            return cityIdNotAvailable;
        }
        if (zBooleanValue) {
            throw new NoWhenBranchMatchedException();
        }
        return FetchCityMetaDataErrorType.CityNotServiceable.f1945a;
    }
}
