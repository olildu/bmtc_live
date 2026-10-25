package app.chalo.validationsdk.vehiclebasedvalidation.ui;

import app.chalo.constants.Source;
import app.chalo.contract.NavigationContract;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.data.ProductBookingBranding;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.ValidationArgs;
import app.chalo.ticketvalidation.TicketValidationInfo;
import app.chalo.validationsdk.blevalidation.config.ProductValidationConfigProvider;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel;
import app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayData;
import app.chalo.validationsdk.blevalidation.ui.RouteDetailsFieldData;
import app.chalo.validationsdk.blevalidation.utils.ProductValidationExtKt;
import app.chalo.validationsdk.vehiclebasedvalidation.domain.ValidateONDCTicketAndFetchReceiptUseCase;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerDataState;
import com.arkivanov.decompose.ComponentContext;
import defpackage.eu0;
import defpackage.kz0;
import defpackage.ux0;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerValidationComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerViewIntent;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerDataState;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerViewState;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerViewSideEffect;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QRScannerValidationComponent extends ChaloBaseStateMviComponent<QRScannerViewIntent, QRScannerDataState, QRScannerViewState, QRScannerViewSideEffect> {
    public final StringProvider k;
    public final ProductValidationConfigProvider l;
    public final ValidateONDCTicketAndFetchReceiptUseCase m;
    public final ProductsSyncContract n;
    public final QRScannerValidationUiStateFactory o;
    public final ChaloNavigationManager p;
    public final NavigationContract q;
    public Job r;

    public QRScannerValidationComponent(ComponentContext componentContext, ValidationArgs.QrScannerValidationArgs qrScannerValidationArgs, StringProvider stringProvider, ProductValidationConfigProvider productValidationConfigProvider, ValidateONDCTicketAndFetchReceiptUseCase validateONDCTicketAndFetchReceiptUseCase, ProductsSyncContract productsSyncContract, QRScannerValidationUiStateFactory qRScannerValidationUiStateFactory, ChaloNavigationManager chaloNavigationManager, NavigationContract navigationContract) {
        super(componentContext);
        this.k = stringProvider;
        this.l = productValidationConfigProvider;
        this.m = validateONDCTicketAndFetchReceiptUseCase;
        this.n = productsSyncContract;
        this.o = qRScannerValidationUiStateFactory;
        this.p = chaloNavigationManager;
        this.q = navigationContract;
        G0(new QRScannerViewIntent.InitializationIntent(qrScannerValidationArgs.b.b));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x010b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0118  */
    /* JADX WARN: Code duplicated, block: B:37:0x012d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0137  */
    /* JADX WARN: Code duplicated, block: B:43:0x0148  */
    /* JADX WARN: Code duplicated, block: B:45:0x014c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0154  */
    /* JADX WARN: Code duplicated, block: B:53:0x016a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0173  */
    /* JADX WARN: Code duplicated, block: B:57:0x0176  */
    /* JADX WARN: Code duplicated, block: B:61:0x018a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0197  */
    /* JADX WARN: Code duplicated, block: B:65:0x019a  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:85:0x020a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0222  */
    /* JADX WARN: Code duplicated, block: B:91:0x0235  */
    /* JADX WARN: Code duplicated, block: B:94:0x024a A[RETURN] */
    public static final Object F0(QRScannerValidationComponent qRScannerValidationComponent, ValidationProduct validationProduct, ContinuationImpl continuationImpl) {
        QRScannerValidationComponent$setupInitialData$1 qRScannerValidationComponent$setupInitialData$1;
        ProductValidationData productValidationData;
        ProductValidationModel k;
        Object objV;
        ValidationProduct validationProduct2;
        ProductValidationModel productValidationModel;
        String str;
        ProductBookingBranding ondc;
        Object objT;
        ProductValidationData productValidationData2;
        String str2;
        RouteDetailsFieldData routeDetailsFieldData;
        String str3;
        Object objT2;
        ProductBookingBranding productBookingBranding;
        String str4;
        String str5;
        RouteDetailsFieldData routeDetailsFieldData2;
        String str6;
        Object objT3;
        ProductValidationData productValidationData3;
        String str7;
        String str8;
        RouteDetailsFieldData routeDetailsFieldData3;
        String str9;
        String str10;
        String str11;
        ProductBookingBranding productBookingBranding2;
        String str12;
        String strG;
        long jP;
        Object objQ;
        final String str13;
        final String str14;
        final String str15;
        final String str16;
        final long j;
        ValidationProduct validationProduct3 = validationProduct;
        qRScannerValidationComponent.getClass();
        if (continuationImpl instanceof QRScannerValidationComponent$setupInitialData$1) {
            qRScannerValidationComponent$setupInitialData$1 = (QRScannerValidationComponent$setupInitialData$1) continuationImpl;
            int i = qRScannerValidationComponent$setupInitialData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qRScannerValidationComponent$setupInitialData$1.label = i - Integer.MIN_VALUE;
            } else {
                qRScannerValidationComponent$setupInitialData$1 = new QRScannerValidationComponent$setupInitialData$1(qRScannerValidationComponent, continuationImpl);
            }
        } else {
            qRScannerValidationComponent$setupInitialData$1 = new QRScannerValidationComponent$setupInitialData$1(qRScannerValidationComponent, continuationImpl);
        }
        Object objA = qRScannerValidationComponent$setupInitialData$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = qRScannerValidationComponent$setupInitialData$1.label;
        Unit unit = Unit.f17538a;
        switch (i2) {
            case 0:
                ResultKt.b(objA);
                ProductValidationConfigProvider productValidationConfigProvider = qRScannerValidationComponent.l;
                qRScannerValidationComponent$setupInitialData$1.L$0 = validationProduct3;
                qRScannerValidationComponent$setupInitialData$1.label = 1;
                objA = ProductValidationExtKt.a(productValidationConfigProvider, validationProduct3, qRScannerValidationComponent$setupInitialData$1);
                if (objA != obj) {
                    productValidationData = (ProductValidationData) objA;
                    if (productValidationData == null) {
                        qRScannerValidationComponent$setupInitialData$1.L$0 = null;
                        qRScannerValidationComponent$setupInitialData$1.label = 2;
                        if (qRScannerValidationComponent.H0(qRScannerValidationComponent$setupInitialData$1) == obj) {
                            return unit;
                        }
                    } else {
                        k = productValidationData.getK();
                        qRScannerValidationComponent$setupInitialData$1.L$0 = validationProduct3;
                        qRScannerValidationComponent$setupInitialData$1.L$1 = productValidationData;
                        qRScannerValidationComponent$setupInitialData$1.L$2 = k;
                        qRScannerValidationComponent$setupInitialData$1.label = 3;
                        objV = productValidationData.v(qRScannerValidationComponent$setupInitialData$1);
                        if (objV != obj) {
                            validationProduct2 = validationProduct3;
                            productValidationModel = k;
                            objA = objV;
                            str = (String) objA;
                            if (productValidationModel == null) {
                                qRScannerValidationComponent$setupInitialData$1.L$0 = null;
                                qRScannerValidationComponent$setupInitialData$1.L$1 = null;
                                qRScannerValidationComponent$setupInitialData$1.L$2 = null;
                                qRScannerValidationComponent$setupInitialData$1.label = 4;
                                if (qRScannerValidationComponent.H0(qRScannerValidationComponent$setupInitialData$1) != obj) {
                                    return unit;
                                }
                            } else {
                                if (!(validationProduct2 instanceof ValidationProduct.MobileTicketProduct.OndcTicketValidation) || (validationProduct2 instanceof ValidationProduct.MobileTicketProduct.OndcMetroTicketValidation)) {
                                    ondc = new ProductBookingBranding.Ondc();
                                } else {
                                    ondc = ProductBookingBranding.None.INSTANCE;
                                }
                                qRScannerValidationComponent$setupInitialData$1.L$0 = productValidationData;
                                qRScannerValidationComponent$setupInitialData$1.L$1 = str;
                                qRScannerValidationComponent$setupInitialData$1.L$2 = ondc;
                                qRScannerValidationComponent$setupInitialData$1.label = 5;
                                objT = productValidationData.t(qRScannerValidationComponent$setupInitialData$1);
                                if (objT != obj) {
                                    productValidationData2 = productValidationData;
                                    str2 = str;
                                    objA = objT;
                                    routeDetailsFieldData = ((ProductDetailsDisplayData) objA).e;
                                    if (routeDetailsFieldData != null) {
                                        str3 = routeDetailsFieldData.e;
                                    } else {
                                        str3 = null;
                                    }
                                    qRScannerValidationComponent$setupInitialData$1.L$0 = productValidationData2;
                                    qRScannerValidationComponent$setupInitialData$1.L$1 = str2;
                                    qRScannerValidationComponent$setupInitialData$1.L$2 = ondc;
                                    qRScannerValidationComponent$setupInitialData$1.L$3 = str3;
                                    qRScannerValidationComponent$setupInitialData$1.label = 6;
                                    objT2 = productValidationData2.t(qRScannerValidationComponent$setupInitialData$1);
                                    if (objT2 != obj) {
                                        productBookingBranding = ondc;
                                        str4 = str2;
                                        str5 = str3;
                                        objA = objT2;
                                        routeDetailsFieldData2 = ((ProductDetailsDisplayData) objA).e;
                                        if (routeDetailsFieldData2 != null) {
                                            str6 = routeDetailsFieldData2.f10621a;
                                        } else {
                                            str6 = null;
                                        }
                                        qRScannerValidationComponent$setupInitialData$1.L$0 = productValidationData2;
                                        qRScannerValidationComponent$setupInitialData$1.L$1 = str4;
                                        qRScannerValidationComponent$setupInitialData$1.L$2 = productBookingBranding;
                                        qRScannerValidationComponent$setupInitialData$1.L$3 = str5;
                                        qRScannerValidationComponent$setupInitialData$1.L$4 = str6;
                                        qRScannerValidationComponent$setupInitialData$1.label = 7;
                                        objT3 = productValidationData2.t(qRScannerValidationComponent$setupInitialData$1);
                                        if (objT3 != obj) {
                                            productValidationData3 = productValidationData2;
                                            str7 = str4;
                                            str8 = str6;
                                            objA = objT3;
                                            routeDetailsFieldData3 = ((ProductDetailsDisplayData) objA).e;
                                            if (routeDetailsFieldData3 != null) {
                                                str9 = routeDetailsFieldData3.b;
                                            } else {
                                                str9 = null;
                                            }
                                            if (str5 != null || str8 == null || str9 == null) {
                                                qRScannerValidationComponent$setupInitialData$1.L$0 = null;
                                                qRScannerValidationComponent$setupInitialData$1.L$1 = null;
                                                qRScannerValidationComponent$setupInitialData$1.L$2 = null;
                                                qRScannerValidationComponent$setupInitialData$1.L$3 = null;
                                                qRScannerValidationComponent$setupInitialData$1.L$4 = null;
                                                qRScannerValidationComponent$setupInitialData$1.label = 8;
                                                if (qRScannerValidationComponent.H0(qRScannerValidationComponent$setupInitialData$1) != obj) {
                                                    return unit;
                                                }
                                            } else {
                                                qRScannerValidationComponent$setupInitialData$1.L$0 = productValidationData3;
                                                qRScannerValidationComponent$setupInitialData$1.L$1 = str7;
                                                qRScannerValidationComponent$setupInitialData$1.L$2 = productBookingBranding;
                                                qRScannerValidationComponent$setupInitialData$1.L$3 = str5;
                                                qRScannerValidationComponent$setupInitialData$1.L$4 = str8;
                                                qRScannerValidationComponent$setupInitialData$1.L$5 = str9;
                                                qRScannerValidationComponent$setupInitialData$1.label = 9;
                                                Object objT4 = productValidationData3.t(qRScannerValidationComponent$setupInitialData$1);
                                                if (objT4 != obj) {
                                                    str10 = str8;
                                                    str11 = str9;
                                                    objA = objT4;
                                                    productBookingBranding2 = productBookingBranding;
                                                    str12 = ((ProductDetailsDisplayData) objA).h;
                                                    strG = productValidationData3.g();
                                                    jP = productValidationData3.p();
                                                    qRScannerValidationComponent$setupInitialData$1.L$0 = str7;
                                                    qRScannerValidationComponent$setupInitialData$1.L$1 = productBookingBranding2;
                                                    qRScannerValidationComponent$setupInitialData$1.L$2 = str5;
                                                    qRScannerValidationComponent$setupInitialData$1.L$3 = str10;
                                                    qRScannerValidationComponent$setupInitialData$1.L$4 = str11;
                                                    qRScannerValidationComponent$setupInitialData$1.L$5 = str12;
                                                    qRScannerValidationComponent$setupInitialData$1.L$6 = strG;
                                                    qRScannerValidationComponent$setupInitialData$1.J$0 = jP;
                                                    qRScannerValidationComponent$setupInitialData$1.label = 10;
                                                    objQ = productValidationData3.q(qRScannerValidationComponent$setupInitialData$1);
                                                    if (objQ != obj) {
                                                        str13 = str11;
                                                        str14 = strG;
                                                        objA = objQ;
                                                        str15 = str5;
                                                        str16 = str7;
                                                        j = jP;
                                                        final String str17 = str12;
                                                        final String str18 = str10;
                                                        final ProductBookingBranding productBookingBranding3 = productBookingBranding2;
                                                        List list = (List) objA;
                                                        final String str19 = list.isEmpty() ? null : ((TicketValidationInfo) CollectionsKt.F(list)).c;
                                                        qRScannerValidationComponent.E0(new Function1() { // from class: jz0
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj2) {
                                                                QRScannerDataState it = (QRScannerDataState) obj2;
                                                                Intrinsics.i(it, "it");
                                                                return QRScannerDataState.a(it, null, str15, str18, str13, str19, str16, str14, Long.valueOf(j), false, false, null, productBookingBranding3, str17, 2561);
                                                            }
                                                        });
                                                        return unit;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 1:
                validationProduct3 = (ValidationProduct) qRScannerValidationComponent$setupInitialData$1.L$0;
                ResultKt.b(objA);
                productValidationData = (ProductValidationData) objA;
                if (productValidationData == null) {
                    qRScannerValidationComponent$setupInitialData$1.L$0 = null;
                    qRScannerValidationComponent$setupInitialData$1.label = 2;
                    if (qRScannerValidationComponent.H0(qRScannerValidationComponent$setupInitialData$1) == obj) {
                        return unit;
                    }
                } else {
                    k = productValidationData.getK();
                    qRScannerValidationComponent$setupInitialData$1.L$0 = validationProduct3;
                    qRScannerValidationComponent$setupInitialData$1.L$1 = productValidationData;
                    qRScannerValidationComponent$setupInitialData$1.L$2 = k;
                    qRScannerValidationComponent$setupInitialData$1.label = 3;
                    objV = productValidationData.v(qRScannerValidationComponent$setupInitialData$1);
                    if (objV != obj) {
                        validationProduct2 = validationProduct3;
                        productValidationModel = k;
                        objA = objV;
                        str = (String) objA;
                        if (productValidationModel == null) {
                            qRScannerValidationComponent$setupInitialData$1.L$0 = null;
                            qRScannerValidationComponent$setupInitialData$1.L$1 = null;
                            qRScannerValidationComponent$setupInitialData$1.L$2 = null;
                            qRScannerValidationComponent$setupInitialData$1.label = 4;
                            if (qRScannerValidationComponent.H0(qRScannerValidationComponent$setupInitialData$1) != obj) {
                                return unit;
                            }
                        } else {
                            if (validationProduct2 instanceof ValidationProduct.MobileTicketProduct.OndcTicketValidation) {
                                ondc = new ProductBookingBranding.Ondc();
                            } else {
                                ondc = new ProductBookingBranding.Ondc();
                            }
                            qRScannerValidationComponent$setupInitialData$1.L$0 = productValidationData;
                            qRScannerValidationComponent$setupInitialData$1.L$1 = str;
                            qRScannerValidationComponent$setupInitialData$1.L$2 = ondc;
                            qRScannerValidationComponent$setupInitialData$1.label = 5;
                            objT = productValidationData.t(qRScannerValidationComponent$setupInitialData$1);
                            if (objT != obj) {
                                productValidationData2 = productValidationData;
                                str2 = str;
                                objA = objT;
                                routeDetailsFieldData = ((ProductDetailsDisplayData) objA).e;
                                if (routeDetailsFieldData != null) {
                                    str3 = routeDetailsFieldData.e;
                                } else {
                                    str3 = null;
                                }
                                qRScannerValidationComponent$setupInitialData$1.L$0 = productValidationData2;
                                qRScannerValidationComponent$setupInitialData$1.L$1 = str2;
                                qRScannerValidationComponent$setupInitialData$1.L$2 = ondc;
                                qRScannerValidationComponent$setupInitialData$1.L$3 = str3;
                                qRScannerValidationComponent$setupInitialData$1.label = 6;
                                objT2 = productValidationData2.t(qRScannerValidationComponent$setupInitialData$1);
                                if (objT2 != obj) {
                                    productBookingBranding = ondc;
                                    str4 = str2;
                                    str5 = str3;
                                    objA = objT2;
                                    routeDetailsFieldData2 = ((ProductDetailsDisplayData) objA).e;
                                    if (routeDetailsFieldData2 != null) {
                                        str6 = routeDetailsFieldData2.f10621a;
                                    } else {
                                        str6 = null;
                                    }
                                    qRScannerValidationComponent$setupInitialData$1.L$0 = productValidationData2;
                                    qRScannerValidationComponent$setupInitialData$1.L$1 = str4;
                                    qRScannerValidationComponent$setupInitialData$1.L$2 = productBookingBranding;
                                    qRScannerValidationComponent$setupInitialData$1.L$3 = str5;
                                    qRScannerValidationComponent$setupInitialData$1.L$4 = str6;
                                    qRScannerValidationComponent$setupInitialData$1.label = 7;
                                    objT3 = productValidationData2.t(qRScannerValidationComponent$setupInitialData$1);
                                    if (objT3 != obj) {
                                        productValidationData3 = productValidationData2;
                                        str7 = str4;
                                        str8 = str6;
                                        objA = objT3;
                                        routeDetailsFieldData3 = ((ProductDetailsDisplayData) objA).e;
                                        if (routeDetailsFieldData3 != null) {
                                            str9 = routeDetailsFieldData3.b;
                                        } else {
                                            str9 = null;
                                        }
                                        if (str5 != null) {
                                            qRScannerValidationComponent$setupInitialData$1.L$0 = null;
                                            qRScannerValidationComponent$setupInitialData$1.L$1 = null;
                                            qRScannerValidationComponent$setupInitialData$1.L$2 = null;
                                            qRScannerValidationComponent$setupInitialData$1.L$3 = null;
                                            qRScannerValidationComponent$setupInitialData$1.L$4 = null;
                                            qRScannerValidationComponent$setupInitialData$1.label = 8;
                                            if (qRScannerValidationComponent.H0(qRScannerValidationComponent$setupInitialData$1) != obj) {
                                                return unit;
                                            }
                                        } else {
                                            qRScannerValidationComponent$setupInitialData$1.L$0 = null;
                                            qRScannerValidationComponent$setupInitialData$1.L$1 = null;
                                            qRScannerValidationComponent$setupInitialData$1.L$2 = null;
                                            qRScannerValidationComponent$setupInitialData$1.L$3 = null;
                                            qRScannerValidationComponent$setupInitialData$1.L$4 = null;
                                            qRScannerValidationComponent$setupInitialData$1.label = 8;
                                            if (qRScannerValidationComponent.H0(qRScannerValidationComponent$setupInitialData$1) != obj) {
                                                return unit;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 2:
                ResultKt.b(objA);
                return unit;
            case 3:
                productValidationModel = (ProductValidationModel) qRScannerValidationComponent$setupInitialData$1.L$2;
                productValidationData = (ProductValidationData) qRScannerValidationComponent$setupInitialData$1.L$1;
                validationProduct2 = (ValidationProduct) qRScannerValidationComponent$setupInitialData$1.L$0;
                ResultKt.b(objA);
                str = (String) objA;
                if (productValidationModel == null) {
                    qRScannerValidationComponent$setupInitialData$1.L$0 = null;
                    qRScannerValidationComponent$setupInitialData$1.L$1 = null;
                    qRScannerValidationComponent$setupInitialData$1.L$2 = null;
                    qRScannerValidationComponent$setupInitialData$1.label = 4;
                    if (qRScannerValidationComponent.H0(qRScannerValidationComponent$setupInitialData$1) != obj) {
                        return unit;
                    }
                } else {
                    if (validationProduct2 instanceof ValidationProduct.MobileTicketProduct.OndcTicketValidation) {
                        ondc = new ProductBookingBranding.Ondc();
                    } else {
                        ondc = new ProductBookingBranding.Ondc();
                    }
                    qRScannerValidationComponent$setupInitialData$1.L$0 = productValidationData;
                    qRScannerValidationComponent$setupInitialData$1.L$1 = str;
                    qRScannerValidationComponent$setupInitialData$1.L$2 = ondc;
                    qRScannerValidationComponent$setupInitialData$1.label = 5;
                    objT = productValidationData.t(qRScannerValidationComponent$setupInitialData$1);
                    if (objT != obj) {
                        productValidationData2 = productValidationData;
                        str2 = str;
                        objA = objT;
                        routeDetailsFieldData = ((ProductDetailsDisplayData) objA).e;
                        if (routeDetailsFieldData != null) {
                            str3 = routeDetailsFieldData.e;
                        } else {
                            str3 = null;
                        }
                        qRScannerValidationComponent$setupInitialData$1.L$0 = productValidationData2;
                        qRScannerValidationComponent$setupInitialData$1.L$1 = str2;
                        qRScannerValidationComponent$setupInitialData$1.L$2 = ondc;
                        qRScannerValidationComponent$setupInitialData$1.L$3 = str3;
                        qRScannerValidationComponent$setupInitialData$1.label = 6;
                        objT2 = productValidationData2.t(qRScannerValidationComponent$setupInitialData$1);
                        if (objT2 != obj) {
                            productBookingBranding = ondc;
                            str4 = str2;
                            str5 = str3;
                            objA = objT2;
                            routeDetailsFieldData2 = ((ProductDetailsDisplayData) objA).e;
                            if (routeDetailsFieldData2 != null) {
                                str6 = routeDetailsFieldData2.f10621a;
                            } else {
                                str6 = null;
                            }
                            qRScannerValidationComponent$setupInitialData$1.L$0 = productValidationData2;
                            qRScannerValidationComponent$setupInitialData$1.L$1 = str4;
                            qRScannerValidationComponent$setupInitialData$1.L$2 = productBookingBranding;
                            qRScannerValidationComponent$setupInitialData$1.L$3 = str5;
                            qRScannerValidationComponent$setupInitialData$1.L$4 = str6;
                            qRScannerValidationComponent$setupInitialData$1.label = 7;
                            objT3 = productValidationData2.t(qRScannerValidationComponent$setupInitialData$1);
                            if (objT3 != obj) {
                                productValidationData3 = productValidationData2;
                                str7 = str4;
                                str8 = str6;
                                objA = objT3;
                                routeDetailsFieldData3 = ((ProductDetailsDisplayData) objA).e;
                                if (routeDetailsFieldData3 != null) {
                                    str9 = routeDetailsFieldData3.b;
                                } else {
                                    str9 = null;
                                }
                                if (str5 != null) {
                                    qRScannerValidationComponent$setupInitialData$1.L$0 = null;
                                    qRScannerValidationComponent$setupInitialData$1.L$1 = null;
                                    qRScannerValidationComponent$setupInitialData$1.L$2 = null;
                                    qRScannerValidationComponent$setupInitialData$1.L$3 = null;
                                    qRScannerValidationComponent$setupInitialData$1.L$4 = null;
                                    qRScannerValidationComponent$setupInitialData$1.label = 8;
                                    if (qRScannerValidationComponent.H0(qRScannerValidationComponent$setupInitialData$1) != obj) {
                                        return unit;
                                    }
                                } else {
                                    qRScannerValidationComponent$setupInitialData$1.L$0 = null;
                                    qRScannerValidationComponent$setupInitialData$1.L$1 = null;
                                    qRScannerValidationComponent$setupInitialData$1.L$2 = null;
                                    qRScannerValidationComponent$setupInitialData$1.L$3 = null;
                                    qRScannerValidationComponent$setupInitialData$1.L$4 = null;
                                    qRScannerValidationComponent$setupInitialData$1.label = 8;
                                    if (qRScannerValidationComponent.H0(qRScannerValidationComponent$setupInitialData$1) != obj) {
                                        return unit;
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 4:
                ResultKt.b(objA);
                return unit;
            case 5:
                ondc = (ProductBookingBranding) qRScannerValidationComponent$setupInitialData$1.L$2;
                str2 = (String) qRScannerValidationComponent$setupInitialData$1.L$1;
                ProductValidationData productValidationData4 = (ProductValidationData) qRScannerValidationComponent$setupInitialData$1.L$0;
                ResultKt.b(objA);
                productValidationData2 = productValidationData4;
                routeDetailsFieldData = ((ProductDetailsDisplayData) objA).e;
                if (routeDetailsFieldData != null) {
                    str3 = routeDetailsFieldData.e;
                } else {
                    str3 = null;
                }
                qRScannerValidationComponent$setupInitialData$1.L$0 = productValidationData2;
                qRScannerValidationComponent$setupInitialData$1.L$1 = str2;
                qRScannerValidationComponent$setupInitialData$1.L$2 = ondc;
                qRScannerValidationComponent$setupInitialData$1.L$3 = str3;
                qRScannerValidationComponent$setupInitialData$1.label = 6;
                objT2 = productValidationData2.t(qRScannerValidationComponent$setupInitialData$1);
                if (objT2 != obj) {
                    productBookingBranding = ondc;
                    str4 = str2;
                    str5 = str3;
                    objA = objT2;
                    routeDetailsFieldData2 = ((ProductDetailsDisplayData) objA).e;
                    if (routeDetailsFieldData2 != null) {
                        str6 = routeDetailsFieldData2.f10621a;
                    } else {
                        str6 = null;
                    }
                    qRScannerValidationComponent$setupInitialData$1.L$0 = productValidationData2;
                    qRScannerValidationComponent$setupInitialData$1.L$1 = str4;
                    qRScannerValidationComponent$setupInitialData$1.L$2 = productBookingBranding;
                    qRScannerValidationComponent$setupInitialData$1.L$3 = str5;
                    qRScannerValidationComponent$setupInitialData$1.L$4 = str6;
                    qRScannerValidationComponent$setupInitialData$1.label = 7;
                    objT3 = productValidationData2.t(qRScannerValidationComponent$setupInitialData$1);
                    if (objT3 != obj) {
                        productValidationData3 = productValidationData2;
                        str7 = str4;
                        str8 = str6;
                        objA = objT3;
                        routeDetailsFieldData3 = ((ProductDetailsDisplayData) objA).e;
                        if (routeDetailsFieldData3 != null) {
                            str9 = routeDetailsFieldData3.b;
                        } else {
                            str9 = null;
                        }
                        if (str5 != null) {
                            qRScannerValidationComponent$setupInitialData$1.L$0 = null;
                            qRScannerValidationComponent$setupInitialData$1.L$1 = null;
                            qRScannerValidationComponent$setupInitialData$1.L$2 = null;
                            qRScannerValidationComponent$setupInitialData$1.L$3 = null;
                            qRScannerValidationComponent$setupInitialData$1.L$4 = null;
                            qRScannerValidationComponent$setupInitialData$1.label = 8;
                            if (qRScannerValidationComponent.H0(qRScannerValidationComponent$setupInitialData$1) != obj) {
                                return unit;
                            }
                        } else {
                            qRScannerValidationComponent$setupInitialData$1.L$0 = null;
                            qRScannerValidationComponent$setupInitialData$1.L$1 = null;
                            qRScannerValidationComponent$setupInitialData$1.L$2 = null;
                            qRScannerValidationComponent$setupInitialData$1.L$3 = null;
                            qRScannerValidationComponent$setupInitialData$1.L$4 = null;
                            qRScannerValidationComponent$setupInitialData$1.label = 8;
                            if (qRScannerValidationComponent.H0(qRScannerValidationComponent$setupInitialData$1) != obj) {
                                return unit;
                            }
                        }
                    }
                }
                return obj;
            case 6:
                String str20 = (String) qRScannerValidationComponent$setupInitialData$1.L$3;
                ProductBookingBranding productBookingBranding4 = (ProductBookingBranding) qRScannerValidationComponent$setupInitialData$1.L$2;
                String str21 = (String) qRScannerValidationComponent$setupInitialData$1.L$1;
                productValidationData2 = (ProductValidationData) qRScannerValidationComponent$setupInitialData$1.L$0;
                ResultKt.b(objA);
                str5 = str20;
                str4 = str21;
                productBookingBranding = productBookingBranding4;
                routeDetailsFieldData2 = ((ProductDetailsDisplayData) objA).e;
                if (routeDetailsFieldData2 != null) {
                    str6 = routeDetailsFieldData2.f10621a;
                } else {
                    str6 = null;
                }
                qRScannerValidationComponent$setupInitialData$1.L$0 = productValidationData2;
                qRScannerValidationComponent$setupInitialData$1.L$1 = str4;
                qRScannerValidationComponent$setupInitialData$1.L$2 = productBookingBranding;
                qRScannerValidationComponent$setupInitialData$1.L$3 = str5;
                qRScannerValidationComponent$setupInitialData$1.L$4 = str6;
                qRScannerValidationComponent$setupInitialData$1.label = 7;
                objT3 = productValidationData2.t(qRScannerValidationComponent$setupInitialData$1);
                if (objT3 != obj) {
                    productValidationData3 = productValidationData2;
                    str7 = str4;
                    str8 = str6;
                    objA = objT3;
                    routeDetailsFieldData3 = ((ProductDetailsDisplayData) objA).e;
                    if (routeDetailsFieldData3 != null) {
                        str9 = routeDetailsFieldData3.b;
                    } else {
                        str9 = null;
                    }
                    if (str5 != null) {
                        qRScannerValidationComponent$setupInitialData$1.L$0 = null;
                        qRScannerValidationComponent$setupInitialData$1.L$1 = null;
                        qRScannerValidationComponent$setupInitialData$1.L$2 = null;
                        qRScannerValidationComponent$setupInitialData$1.L$3 = null;
                        qRScannerValidationComponent$setupInitialData$1.L$4 = null;
                        qRScannerValidationComponent$setupInitialData$1.label = 8;
                        if (qRScannerValidationComponent.H0(qRScannerValidationComponent$setupInitialData$1) != obj) {
                            return unit;
                        }
                    } else {
                        qRScannerValidationComponent$setupInitialData$1.L$0 = null;
                        qRScannerValidationComponent$setupInitialData$1.L$1 = null;
                        qRScannerValidationComponent$setupInitialData$1.L$2 = null;
                        qRScannerValidationComponent$setupInitialData$1.L$3 = null;
                        qRScannerValidationComponent$setupInitialData$1.L$4 = null;
                        qRScannerValidationComponent$setupInitialData$1.label = 8;
                        if (qRScannerValidationComponent.H0(qRScannerValidationComponent$setupInitialData$1) != obj) {
                            return unit;
                        }
                    }
                }
                return obj;
            case 7:
                str8 = (String) qRScannerValidationComponent$setupInitialData$1.L$4;
                str5 = (String) qRScannerValidationComponent$setupInitialData$1.L$3;
                productBookingBranding = (ProductBookingBranding) qRScannerValidationComponent$setupInitialData$1.L$2;
                str7 = (String) qRScannerValidationComponent$setupInitialData$1.L$1;
                ProductValidationData productValidationData5 = (ProductValidationData) qRScannerValidationComponent$setupInitialData$1.L$0;
                ResultKt.b(objA);
                productValidationData3 = productValidationData5;
                routeDetailsFieldData3 = ((ProductDetailsDisplayData) objA).e;
                if (routeDetailsFieldData3 != null) {
                    str9 = routeDetailsFieldData3.b;
                } else {
                    str9 = null;
                }
                if (str5 != null) {
                    qRScannerValidationComponent$setupInitialData$1.L$0 = null;
                    qRScannerValidationComponent$setupInitialData$1.L$1 = null;
                    qRScannerValidationComponent$setupInitialData$1.L$2 = null;
                    qRScannerValidationComponent$setupInitialData$1.L$3 = null;
                    qRScannerValidationComponent$setupInitialData$1.L$4 = null;
                    qRScannerValidationComponent$setupInitialData$1.label = 8;
                    if (qRScannerValidationComponent.H0(qRScannerValidationComponent$setupInitialData$1) != obj) {
                        return unit;
                    }
                } else {
                    qRScannerValidationComponent$setupInitialData$1.L$0 = null;
                    qRScannerValidationComponent$setupInitialData$1.L$1 = null;
                    qRScannerValidationComponent$setupInitialData$1.L$2 = null;
                    qRScannerValidationComponent$setupInitialData$1.L$3 = null;
                    qRScannerValidationComponent$setupInitialData$1.L$4 = null;
                    qRScannerValidationComponent$setupInitialData$1.label = 8;
                    if (qRScannerValidationComponent.H0(qRScannerValidationComponent$setupInitialData$1) != obj) {
                        return unit;
                    }
                }
                return obj;
            case 8:
                ResultKt.b(objA);
                return unit;
            case 9:
                str11 = (String) qRScannerValidationComponent$setupInitialData$1.L$5;
                String str22 = (String) qRScannerValidationComponent$setupInitialData$1.L$4;
                String str23 = (String) qRScannerValidationComponent$setupInitialData$1.L$3;
                ProductBookingBranding productBookingBranding5 = (ProductBookingBranding) qRScannerValidationComponent$setupInitialData$1.L$2;
                String str24 = (String) qRScannerValidationComponent$setupInitialData$1.L$1;
                productValidationData3 = (ProductValidationData) qRScannerValidationComponent$setupInitialData$1.L$0;
                ResultKt.b(objA);
                productBookingBranding2 = productBookingBranding5;
                str7 = str24;
                str10 = str22;
                str5 = str23;
                str12 = ((ProductDetailsDisplayData) objA).h;
                strG = productValidationData3.g();
                jP = productValidationData3.p();
                qRScannerValidationComponent$setupInitialData$1.L$0 = str7;
                qRScannerValidationComponent$setupInitialData$1.L$1 = productBookingBranding2;
                qRScannerValidationComponent$setupInitialData$1.L$2 = str5;
                qRScannerValidationComponent$setupInitialData$1.L$3 = str10;
                qRScannerValidationComponent$setupInitialData$1.L$4 = str11;
                qRScannerValidationComponent$setupInitialData$1.L$5 = str12;
                qRScannerValidationComponent$setupInitialData$1.L$6 = strG;
                qRScannerValidationComponent$setupInitialData$1.J$0 = jP;
                qRScannerValidationComponent$setupInitialData$1.label = 10;
                objQ = productValidationData3.q(qRScannerValidationComponent$setupInitialData$1);
                if (objQ != obj) {
                    str13 = str11;
                    str14 = strG;
                    objA = objQ;
                    str15 = str5;
                    str16 = str7;
                    j = jP;
                    final String str110 = str12;
                    final String str111 = str10;
                    final ProductBookingBranding productBookingBranding6 = productBookingBranding2;
                    List list2 = (List) objA;
                    final String str112 = list2.isEmpty() ? null : ((TicketValidationInfo) CollectionsKt.F(list2)).c;
                    qRScannerValidationComponent.E0(new Function1() { // from class: jz0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            QRScannerDataState it = (QRScannerDataState) obj2;
                            Intrinsics.i(it, "it");
                            return QRScannerDataState.a(it, null, str15, str111, str13, str112, str16, str14, Long.valueOf(j), false, false, null, productBookingBranding6, str110, 2561);
                        }
                    });
                    return unit;
                }
                return obj;
            case 10:
                long j2 = qRScannerValidationComponent$setupInitialData$1.J$0;
                String str25 = (String) qRScannerValidationComponent$setupInitialData$1.L$6;
                str12 = (String) qRScannerValidationComponent$setupInitialData$1.L$5;
                String str26 = (String) qRScannerValidationComponent$setupInitialData$1.L$4;
                str10 = (String) qRScannerValidationComponent$setupInitialData$1.L$3;
                String str27 = (String) qRScannerValidationComponent$setupInitialData$1.L$2;
                productBookingBranding2 = (ProductBookingBranding) qRScannerValidationComponent$setupInitialData$1.L$1;
                String str28 = (String) qRScannerValidationComponent$setupInitialData$1.L$0;
                ResultKt.b(objA);
                str14 = str25;
                str16 = str28;
                j = j2;
                str13 = str26;
                str15 = str27;
                final String str113 = str12;
                final String str114 = str10;
                final ProductBookingBranding productBookingBranding7 = productBookingBranding2;
                List list3 = (List) objA;
                final String str115 = list3.isEmpty() ? null : ((TicketValidationInfo) CollectionsKt.F(list3)).c;
                qRScannerValidationComponent.E0(new Function1() { // from class: jz0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        QRScannerDataState it = (QRScannerDataState) obj2;
                        Intrinsics.i(it, "it");
                        return QRScannerDataState.a(it, null, str15, str114, str13, str115, str16, str14, Long.valueOf(j), false, false, null, productBookingBranding7, str113, 2561);
                    }
                });
                return unit;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void G0(QRScannerViewIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof QRScannerViewIntent.InitializationIntent;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new QRScannerValidationComponent$handleInitializationIntent$1(this, (QRScannerViewIntent.InitializationIntent) intent, null), 3);
            return;
        }
        if (intent.equals(QRScannerViewIntent.OnValidateDetailsButtonClickedIntent.f10728a)) {
            String str = ((QRScannerDataState) this.f.getValue()).f10720a;
            Job job = this.r;
            if (job == null || !((AbstractCoroutine) job).isActive()) {
                E0(new kz0(0));
                this.r = BuildersKt.d(contextScope, null, null, new QRScannerValidationComponent$validateTicketAndFetchReceipt$2(this, str, null, null), 3);
                return;
            }
            return;
        }
        if (intent.equals(QRScannerViewIntent.OnValidateFailedErrorButtonClickedIntent.f10729a)) {
            E0(new ux0(29));
            return;
        }
        if (intent instanceof QRScannerViewIntent.OnSummaryBtnClickedIntent) {
            NavigationContract.DefaultImpls.b(this.q, Source.ONDC_QR_SCANNER_FRAGMENT.getSourceName(), ((QRScannerViewIntent.OnSummaryBtnClickedIntent) intent).f10727a, null, "mobileTicket", "ondcTicket", null, 228);
        } else {
            if (!intent.equals(QRScannerViewIntent.OnBackPressedIntent.f10726a)) {
                throw new NoWhenBranchMatchedException();
            }
            ChaloNavigationManagerKt.c(this.p);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H0(ContinuationImpl continuationImpl) {
        QRScannerValidationComponent$showError$1 qRScannerValidationComponent$showError$1;
        if (continuationImpl instanceof QRScannerValidationComponent$showError$1) {
            qRScannerValidationComponent$showError$1 = (QRScannerValidationComponent$showError$1) continuationImpl;
            int i = qRScannerValidationComponent$showError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qRScannerValidationComponent$showError$1.label = i - Integer.MIN_VALUE;
            } else {
                qRScannerValidationComponent$showError$1 = new QRScannerValidationComponent$showError$1(this, continuationImpl);
            }
        } else {
            qRScannerValidationComponent$showError$1 = new QRScannerValidationComponent$showError$1(this, continuationImpl);
        }
        Object objB = qRScannerValidationComponent$showError$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = qRScannerValidationComponent$showError$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            qRScannerValidationComponent$showError$1.label = 1;
            objB = this.k.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], qRScannerValidationComponent$showError$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        E0(new eu0((String) objB, 15));
        return Unit.f17538a;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        QRScannerValidationComponent$convertToUiState$2 qRScannerValidationComponent$convertToUiState$2 = new QRScannerValidationComponent$convertToUiState$2(1, this, QRScannerValidationComponent.class, "processIntent", "processIntent(Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerViewIntent;)V", 0);
        return this.o.a((QRScannerDataState) obj, qRScannerValidationComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new QRScannerDataState("", true, "", "", "", null, "", null, null, false, false, null, ProductBookingBranding.None.INSTANCE, null);
    }
}
