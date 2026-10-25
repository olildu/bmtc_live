package app.chalo.instantticket.domain;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.extensions.DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1;
import app.chalo.features.onetimeoffer.IUserPreferencesDataStore;
import app.chalo.instantticket.data.InstantTicketRepository;
import app.chalo.instantticket.data.exception.InvalidFareResponseDataException;
import app.chalo.instantticket.data.exception.ProductBookingRemoteDataException;
import app.chalo.instantticket.data.model.api.request.FareRequestFilters;
import app.chalo.instantticket.data.model.app.request.FetchMobileTicketFareRequestAppModel;
import app.chalo.instantticket.data.model.app.response.FetchMobileTicketFareResponseAppModel;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.ondc.model.app.request.ONDCFetchFareRequestAppModel;
import app.chalo.ondc.repository.OndcRepository;
import app.chalo.productbooking.common.data.error.ProductBookingDataSourceError;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.dd;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/domain/FetchMobileTicketFareUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchMobileTicketFareUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f3900a;
    public final InstantTicketRepository b;
    public final OndcRepository c;
    public final AnalyticsContract d;
    public final IUserPreferencesDataStore e;

    public FetchMobileTicketFareUseCase(CityProvider cityProvider, InstantTicketRepository instantTicketRepository, OndcRepository ondcRepository, AnalyticsContract analyticsContract, IUserPreferencesDataStore iUserPreferencesDataStore) {
        this.f3900a = cityProvider;
        this.b = instantTicketRepository;
        this.c = ondcRepository;
        this.d = analyticsContract;
        this.e = iUserPreferencesDataStore;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0138 A[Catch: Exception -> 0x0066, TryCatch #5 {Exception -> 0x0066, blocks: (B:25:0x0061, B:49:0x00d1, B:52:0x00da, B:55:0x00df, B:57:0x00e3, B:63:0x0132, B:64:0x0137, B:65:0x0138, B:67:0x0153, B:73:0x0161, B:81:0x017c, B:30:0x0075, B:45:0x00b3), top: B:132:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0153 A[Catch: Exception -> 0x0066, TryCatch #5 {Exception -> 0x0066, blocks: (B:25:0x0061, B:49:0x00d1, B:52:0x00da, B:55:0x00df, B:57:0x00e3, B:63:0x0132, B:64:0x0137, B:65:0x0138, B:67:0x0153, B:73:0x0161, B:81:0x017c, B:30:0x0075, B:45:0x00b3), top: B:132:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x015d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0161 A[Catch: Exception -> 0x0066, TRY_LEAVE, TryCatch #5 {Exception -> 0x0066, blocks: (B:25:0x0061, B:49:0x00d1, B:52:0x00da, B:55:0x00df, B:57:0x00e3, B:63:0x0132, B:64:0x0137, B:65:0x0138, B:67:0x0153, B:73:0x0161, B:81:0x017c, B:30:0x0075, B:45:0x00b3), top: B:132:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0174  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:84:0x018f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [app.chalo.instantticket.data.InstantTicketRepository] */
    /* JADX WARN: Type inference failed for: r0v33, types: [app.chalo.ondc.repository.OndcRepository] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r2v2, types: [app.chalo.instantticket.domain.FetchMobileTicketFareUseCase$invoke$1, kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object a(FareDetailsData fareDetailsData, FareRequestFilters fareRequestFilters, ContinuationImpl continuationImpl) {
        ?? fetchMobileTicketFareUseCase$invoke$1;
        ?? r11;
        String str;
        FareRequestFilters fareRequestFilters2;
        String str2;
        FareDetailsData fareDetailsData2;
        FareRequestFilters fareRequestFilters3;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        FareRequestFilters fareRequestFilters4;
        FareRequestFilters fareRequestFilters5;
        FareRequestFilters fareRequestFilters6;
        FetchMobileTicketFareResponseAppModel fetchMobileTicketFareResponseAppModel;
        if (continuationImpl instanceof FetchMobileTicketFareUseCase$invoke$1) {
            FetchMobileTicketFareUseCase$invoke$1 fetchMobileTicketFareUseCase$invoke$2 = (FetchMobileTicketFareUseCase$invoke$1) continuationImpl;
            int i = fetchMobileTicketFareUseCase$invoke$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchMobileTicketFareUseCase$invoke$2.label = i - Integer.MIN_VALUE;
                fetchMobileTicketFareUseCase$invoke$1 = fetchMobileTicketFareUseCase$invoke$2;
            } else {
                fetchMobileTicketFareUseCase$invoke$1 = new FetchMobileTicketFareUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchMobileTicketFareUseCase$invoke$1 = new FetchMobileTicketFareUseCase$invoke$1(this, continuationImpl);
        }
        Object objK = fetchMobileTicketFareUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchMobileTicketFareUseCase$invoke$1.label;
        IUserPreferencesDataStore iUserPreferencesDataStore = this.e;
        try {
            try {
                if (i2 == 0) {
                    ResultKt.b(objK);
                    try {
                        String strB = CityProviderKt.b(this.f3900a);
                        if (strB == null) {
                            try {
                                return new ChaloUseCaseResult.Failure(ProductBookingDataSourceError.UnavailableCityDetails.b);
                            } catch (Exception e) {
                                e = e;
                                r11 = fareRequestFilters;
                            }
                        } else {
                            DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1 dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1D = iUserPreferencesDataStore.d();
                            fetchMobileTicketFareUseCase$invoke$1.L$0 = fareDetailsData;
                            fareRequestFilters2 = fareRequestFilters;
                            try {
                                fetchMobileTicketFareUseCase$invoke$1.L$1 = fareRequestFilters2;
                                fetchMobileTicketFareUseCase$invoke$1.L$2 = strB;
                                fetchMobileTicketFareUseCase$invoke$1.label = 1;
                                Object objV = FlowKt.v(dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1D, fetchMobileTicketFareUseCase$invoke$1);
                                if (objV != coroutineSingletons) {
                                    str2 = strB;
                                    objK = objV;
                                    fareDetailsData2 = fareDetailsData;
                                    fareRequestFilters3 = fareRequestFilters2;
                                }
                                return coroutineSingletons;
                            } catch (Exception e2) {
                                e = e2;
                                r11 = fareRequestFilters2;
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        fareRequestFilters2 = fareRequestFilters;
                    }
                    r11 = fareRequestFilters2;
                    if (r11 instanceof FareRequestFilters.InstantTicketFilter) {
                        str = "instant ticket fare fetch failure";
                    } else if (r11 instanceof FareRequestFilters.PremiumReserveTicketFilter) {
                        str = "premium reserve ticket fare fetch failure";
                    } else {
                        if (!(r11 instanceof FareRequestFilters.OndcTicketFilter)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "ondc ticket fare fetch failure";
                    }
                    String str8 = str;
                    boolean z = e instanceof InvalidFareResponseDataException;
                    AnalyticsContractImplKt.b(this.d, str8, Source.FARE_DETAILS_FETCH_USECASE, MapsKt.i(new Pair("type", String.valueOf(Reflection.a(e.getClass()).f())), new Pair("reason", String.valueOf(e.getMessage())), new Pair("invalidResponse", Boolean.valueOf(z))), false, 24);
                    if (e instanceof ChaloLocalException) {
                        return new ChaloUseCaseResult.Failure(new ProductBookingDataSourceError.Local(e.getMessage()));
                    }
                    if (!(e instanceof ProductBookingRemoteDataException)) {
                        if (e instanceof NetworkSuccessResponseParseException) {
                            return new ChaloUseCaseResult.Failure(ProductBookingDataSourceError.ResponseParsing.b);
                        }
                        return z ? new ChaloUseCaseResult.Failure(ProductBookingDataSourceError.InvalidData.b) : new ChaloUseCaseResult.Failure(new ProductBookingDataSourceError.Unknown(e.getMessage()));
                    }
                    String message = e.getMessage();
                    ProductBookingRemoteDataException productBookingRemoteDataException = (ProductBookingRemoteDataException) e;
                    GenericChaloErrorResponse errorResponse = productBookingRemoteDataException.getErrorResponse();
                    String strC = dd.c(errorResponse != null ? new Integer(errorResponse.f6497a) : null, message, " code: ");
                    GenericChaloErrorResponse errorResponse2 = productBookingRemoteDataException.getErrorResponse();
                    return new ChaloUseCaseResult.Failure(new ProductBookingDataSourceError.API(strC, errorResponse2 != null ? new Integer(errorResponse2.f6497a) : null));
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            FareRequestFilters fareRequestFilters7 = (FareRequestFilters) fetchMobileTicketFareUseCase$invoke$1.L$0;
                            ResultKt.b(objK);
                            fareRequestFilters5 = fareRequestFilters7;
                            fetchMobileTicketFareResponseAppModel = (FetchMobileTicketFareResponseAppModel) objK;
                            fetchMobileTicketFareUseCase$invoke$1 = fareRequestFilters5;
                            return new ChaloUseCaseResult.Success(fetchMobileTicketFareResponseAppModel);
                        }
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        FareRequestFilters fareRequestFilters8 = (FareRequestFilters) fetchMobileTicketFareUseCase$invoke$1.L$0;
                        ResultKt.b(objK);
                        fareRequestFilters6 = fareRequestFilters8;
                        fetchMobileTicketFareResponseAppModel = (FetchMobileTicketFareResponseAppModel) objK;
                        fetchMobileTicketFareUseCase$invoke$1 = fareRequestFilters6;
                        return new ChaloUseCaseResult.Success(fetchMobileTicketFareResponseAppModel);
                    }
                    str3 = (String) fetchMobileTicketFareUseCase$invoke$1.L$3;
                    str4 = (String) fetchMobileTicketFareUseCase$invoke$1.L$2;
                    fareRequestFilters3 = (FareRequestFilters) fetchMobileTicketFareUseCase$invoke$1.L$1;
                    fareDetailsData2 = (FareDetailsData) fetchMobileTicketFareUseCase$invoke$1.L$0;
                    ResultKt.b(objK);
                    str5 = (String) objK;
                    if (!(fareRequestFilters3 instanceof FareRequestFilters.InstantTicketFilter) || (fareRequestFilters3 instanceof FareRequestFilters.PremiumReserveTicketFilter)) {
                        String lowerCase = str4.toLowerCase(Locale.ROOT);
                        Intrinsics.h(lowerCase, "toLowerCase(...)");
                        String str9 = fareDetailsData2.f8185a.b;
                        String str10 = fareDetailsData2.b.f8199a;
                        String str11 = fareDetailsData2.c.f8199a;
                        List list = fareDetailsData2.i;
                        if (str3 != null || str3.length() == 0) {
                            str6 = null;
                        } else {
                            str6 = str3;
                        }
                        if (str5 != null || str5.length() == 0) {
                            str7 = null;
                        } else {
                            str7 = str5;
                        }
                        fareRequestFilters4 = fareRequestFilters3;
                        try {
                            FetchMobileTicketFareRequestAppModel fetchMobileTicketFareRequestAppModel = new FetchMobileTicketFareRequestAppModel(lowerCase, str9, str10, str11, fareRequestFilters4, list, str6, str7);
                            ?? r0 = this.b;
                            fetchMobileTicketFareUseCase$invoke$1.L$0 = fareRequestFilters4;
                            fetchMobileTicketFareUseCase$invoke$1.L$1 = null;
                            fetchMobileTicketFareUseCase$invoke$1.L$2 = null;
                            fetchMobileTicketFareUseCase$invoke$1.L$3 = null;
                            fetchMobileTicketFareUseCase$invoke$1.label = 3;
                            objK = r0.k(fetchMobileTicketFareRequestAppModel, fetchMobileTicketFareUseCase$invoke$1);
                            if (objK != coroutineSingletons) {
                                fareRequestFilters5 = fareRequestFilters4;
                                fetchMobileTicketFareResponseAppModel = (FetchMobileTicketFareResponseAppModel) objK;
                                fetchMobileTicketFareUseCase$invoke$1 = fareRequestFilters5;
                                return new ChaloUseCaseResult.Success(fetchMobileTicketFareResponseAppModel);
                            }
                        } catch (Exception e4) {
                            e = e4;
                            r11 = fareRequestFilters4;
                        }
                    } else {
                        if (!(fareRequestFilters3 instanceof FareRequestFilters.OndcTicketFilter)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String lowerCase2 = str4.toLowerCase(Locale.ROOT);
                        Intrinsics.h(lowerCase2, "toLowerCase(...)");
                        ONDCFetchFareRequestAppModel oNDCFetchFareRequestAppModel = new ONDCFetchFareRequestAppModel(lowerCase2, fareDetailsData2.c.f8199a, fareDetailsData2.f8185a.b, fareDetailsData2.b.f8199a, ((FareRequestFilters.OndcTicketFilter) fareRequestFilters3).b, ((FareRequestFilters.OndcTicketFilter) fareRequestFilters3).c, ((FareRequestFilters.OndcTicketFilter) fareRequestFilters3).d);
                        ?? r1 = this.c;
                        fetchMobileTicketFareUseCase$invoke$1.L$0 = fareRequestFilters3;
                        fetchMobileTicketFareUseCase$invoke$1.L$1 = null;
                        fetchMobileTicketFareUseCase$invoke$1.L$2 = null;
                        fetchMobileTicketFareUseCase$invoke$1.L$3 = null;
                        fetchMobileTicketFareUseCase$invoke$1.label = 4;
                        objK = r1.u(oNDCFetchFareRequestAppModel, fetchMobileTicketFareUseCase$invoke$1);
                        if (objK != coroutineSingletons) {
                            fareRequestFilters6 = fareRequestFilters3;
                            fetchMobileTicketFareResponseAppModel = (FetchMobileTicketFareResponseAppModel) objK;
                            fetchMobileTicketFareUseCase$invoke$1 = fareRequestFilters6;
                            return new ChaloUseCaseResult.Success(fetchMobileTicketFareResponseAppModel);
                        }
                    }
                    return coroutineSingletons;
                }
                str2 = (String) fetchMobileTicketFareUseCase$invoke$1.L$2;
                fareRequestFilters3 = (FareRequestFilters) fetchMobileTicketFareUseCase$invoke$1.L$1;
                fareDetailsData2 = (FareDetailsData) fetchMobileTicketFareUseCase$invoke$1.L$0;
                ResultKt.b(objK);
                String str12 = (String) objK;
                DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1 dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1B = iUserPreferencesDataStore.b();
                fetchMobileTicketFareUseCase$invoke$1.L$0 = fareDetailsData2;
                fetchMobileTicketFareUseCase$invoke$1.L$1 = fareRequestFilters3;
                fetchMobileTicketFareUseCase$invoke$1.L$2 = str2;
                fetchMobileTicketFareUseCase$invoke$1.L$3 = str12;
                fetchMobileTicketFareUseCase$invoke$1.label = 2;
                Object objV2 = FlowKt.v(dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1B, fetchMobileTicketFareUseCase$invoke$1);
                if (objV2 != coroutineSingletons) {
                    String str13 = str2;
                    str3 = str12;
                    objK = objV2;
                    str4 = str13;
                    str5 = (String) objK;
                    if (fareRequestFilters3 instanceof FareRequestFilters.InstantTicketFilter) {
                        String lowerCase3 = str4.toLowerCase(Locale.ROOT);
                        Intrinsics.h(lowerCase3, "toLowerCase(...)");
                        String str14 = fareDetailsData2.f8185a.b;
                        String str15 = fareDetailsData2.b.f8199a;
                        String str16 = fareDetailsData2.c.f8199a;
                        List list2 = fareDetailsData2.i;
                        if (str3 != null) {
                            str6 = null;
                        } else {
                            str6 = null;
                        }
                        if (str5 != null) {
                            str7 = null;
                        } else {
                            str7 = null;
                        }
                        fareRequestFilters4 = fareRequestFilters3;
                        FetchMobileTicketFareRequestAppModel fetchMobileTicketFareRequestAppModel2 = new FetchMobileTicketFareRequestAppModel(lowerCase3, str14, str15, str16, fareRequestFilters4, list2, str6, str7);
                        ?? r2 = this.b;
                        fetchMobileTicketFareUseCase$invoke$1.L$0 = fareRequestFilters4;
                        fetchMobileTicketFareUseCase$invoke$1.L$1 = null;
                        fetchMobileTicketFareUseCase$invoke$1.L$2 = null;
                        fetchMobileTicketFareUseCase$invoke$1.L$3 = null;
                        fetchMobileTicketFareUseCase$invoke$1.label = 3;
                        objK = r2.k(fetchMobileTicketFareRequestAppModel2, fetchMobileTicketFareUseCase$invoke$1);
                        if (objK != coroutineSingletons) {
                            fareRequestFilters5 = fareRequestFilters4;
                            fetchMobileTicketFareResponseAppModel = (FetchMobileTicketFareResponseAppModel) objK;
                            fetchMobileTicketFareUseCase$invoke$1 = fareRequestFilters5;
                            return new ChaloUseCaseResult.Success(fetchMobileTicketFareResponseAppModel);
                        }
                    } else {
                        String lowerCase4 = str4.toLowerCase(Locale.ROOT);
                        Intrinsics.h(lowerCase4, "toLowerCase(...)");
                        String str17 = fareDetailsData2.f8185a.b;
                        String str18 = fareDetailsData2.b.f8199a;
                        String str19 = fareDetailsData2.c.f8199a;
                        List list3 = fareDetailsData2.i;
                        if (str3 != null) {
                            str6 = null;
                        } else {
                            str6 = null;
                        }
                        if (str5 != null) {
                            str7 = null;
                        } else {
                            str7 = null;
                        }
                        fareRequestFilters4 = fareRequestFilters3;
                        FetchMobileTicketFareRequestAppModel fetchMobileTicketFareRequestAppModel3 = new FetchMobileTicketFareRequestAppModel(lowerCase4, str17, str18, str19, fareRequestFilters4, list3, str6, str7);
                        ?? r3 = this.b;
                        fetchMobileTicketFareUseCase$invoke$1.L$0 = fareRequestFilters4;
                        fetchMobileTicketFareUseCase$invoke$1.L$1 = null;
                        fetchMobileTicketFareUseCase$invoke$1.L$2 = null;
                        fetchMobileTicketFareUseCase$invoke$1.L$3 = null;
                        fetchMobileTicketFareUseCase$invoke$1.label = 3;
                        objK = r3.k(fetchMobileTicketFareRequestAppModel3, fetchMobileTicketFareUseCase$invoke$1);
                        if (objK != coroutineSingletons) {
                            fareRequestFilters5 = fareRequestFilters4;
                            fetchMobileTicketFareResponseAppModel = (FetchMobileTicketFareResponseAppModel) objK;
                            fetchMobileTicketFareUseCase$invoke$1 = fareRequestFilters5;
                            return new ChaloUseCaseResult.Success(fetchMobileTicketFareResponseAppModel);
                        }
                    }
                }
                return coroutineSingletons;
            } catch (Exception e5) {
                e = e5;
                r11 = fetchMobileTicketFareUseCase$invoke$1;
            }
        } catch (Exception e6) {
            e = e6;
        }
    }
}
