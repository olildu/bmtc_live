package app.chalo.validationsdk.blevalidation.helper;

import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.data.WalletSetupConfiguration;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.notification.models.AppNotification;
import app.chalo.notification.models.TITOTapInNotificationEvent;
import app.chalo.notification.models.TITOTapOutNotificationEvent;
import app.chalo.utils.ChaloWalletOrderIdUtils;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.helper.BleValidationProcessCompletionHelper$onValidationNotificationReceived$1", f = "BleValidationProcessCompletionHelper.kt", l = {133, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 143, 140, 149}, m = "invokeSuspend", v = 1)
final class BleValidationProcessCompletionHelper$onValidationNotificationReceived$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AppNotification.PunchNotification $notification;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ BleValidationProcessCompletionHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationProcessCompletionHelper$onValidationNotificationReceived$1(BleValidationProcessCompletionHelper bleValidationProcessCompletionHelper, AppNotification.PunchNotification punchNotification, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bleValidationProcessCompletionHelper;
        this.$notification = punchNotification;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleValidationProcessCompletionHelper$onValidationNotificationReceived$1(this.this$0, this.$notification, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationProcessCompletionHelper$onValidationNotificationReceived$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0240  */
    /* JADX WARN: Code duplicated, block: B:103:0x0246  */
    /* JADX WARN: Code duplicated, block: B:106:0x0256  */
    /* JADX WARN: Code duplicated, block: B:110:0x0269  */
    /* JADX WARN: Code duplicated, block: B:113:0x0276  */
    /* JADX WARN: Code duplicated, block: B:114:0x0280 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0282  */
    /* JADX WARN: Code duplicated, block: B:116:0x028c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0296  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:121:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:124:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:125:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7 A[PHI: r3
      0x00e7: PHI (r3v8 java.lang.String) = (r3v7 java.lang.String), (r3v22 java.lang.String) binds: [B:49:0x00f8, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:53:0x010a  */
    /* JADX WARN: Code duplicated, block: B:59:0x012b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0138  */
    /* JADX WARN: Code duplicated, block: B:63:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0144  */
    /* JADX WARN: Code duplicated, block: B:65:0x014e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0158  */
    /* JADX WARN: Code duplicated, block: B:68:0x0165  */
    /* JADX WARN: Code duplicated, block: B:70:0x016f  */
    /* JADX WARN: Code duplicated, block: B:71:0x017d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0181  */
    /* JADX WARN: Code duplicated, block: B:74:0x018f  */
    /* JADX WARN: Code duplicated, block: B:76:0x019d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0233 A[PHI: r7
      0x0233: PHI (r7v11 java.lang.String) = (r7v10 java.lang.String), (r7v19 java.lang.String) binds: [B:102:0x0244, B:96:0x0225] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BleValidationProcessCompletionHelper bleValidationProcessCompletionHelper;
        ProductValidationData productValidationData;
        ProductValidationConfig productValidationConfig;
        Unit unit;
        TITOTapOutNotificationEvent tITOTapOutNotificationEvent;
        Object objB;
        Object objB2;
        TITOTapInNotificationEvent tITOTapInNotificationEvent;
        String str;
        BleValidationProcessCompletionHelper bleValidationProcessCompletionHelper2;
        String str2;
        String strA;
        BleValidationAckData.InvalidData invalidData;
        String str3;
        long jLongValue;
        long j;
        String string;
        long jLongValue2;
        String str4;
        long jLongValue3;
        String str5;
        String str6;
        String str7;
        BleValidationAckData tITOTapInData;
        ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium;
        Long l;
        String str8;
        BleValidationProcessCompletionHelper bleValidationProcessCompletionHelper3;
        String str9;
        String strA2;
        BleValidationAckData.InvalidData invalidData2;
        String str10;
        long jLongValue4;
        long j2;
        String string2;
        long jLongValue5;
        String str11;
        long j3;
        String str12;
        String str13;
        BleValidationAckData tITOTapOutData;
        ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit2 = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            bleValidationProcessCompletionHelper = this.this$0;
            productValidationData = bleValidationProcessCompletionHelper.n;
            GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase = bleValidationProcessCompletionHelper.g;
            productValidationConfig = bleValidationProcessCompletionHelper.r;
            AppNotification.PunchNotification punchNotification = this.$notification;
            if (productValidationData == null || productValidationConfig == null) {
                return unit2;
            }
            if (punchNotification instanceof TITOTapInNotificationEvent) {
                TITOTapInNotificationEvent tITOTapInNotificationEvent2 = (TITOTapInNotificationEvent) punchNotification;
                this.L$0 = tITOTapInNotificationEvent2;
                this.L$1 = productValidationConfig;
                this.L$2 = productValidationData;
                this.L$3 = bleValidationProcessCompletionHelper;
                this.label = 1;
                objB2 = getWalletSetupConfigurationUseCase.b(this);
                if (objB2 != coroutineSingletons) {
                    tITOTapInNotificationEvent = tITOTapInNotificationEvent2;
                    long j4 = ((WalletSetupConfiguration) objB2).f;
                    Intrinsics.i(tITOTapInNotificationEvent, "<this>");
                    String str14 = tITOTapInNotificationEvent.o;
                    Long l2 = tITOTapInNotificationEvent.p;
                    str = tITOTapInNotificationEvent.e;
                    bleValidationProcessCompletionHelper2 = bleValidationProcessCompletionHelper;
                    str2 = tITOTapInNotificationEvent.d;
                    if (Intrinsics.d(str2, "quickpay")) {
                        strA = tITOTapInNotificationEvent.c;
                        if (strA == null) {
                            invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "bookingId null");
                        } else {
                            str3 = strA;
                            if (Intrinsics.d(str2, "quickpay")) {
                                jLongValue = tITOTapInNotificationEvent.h.longValue();
                                j = jLongValue;
                                string = tITOTapInNotificationEvent.toString();
                                if (str2 == null) {
                                    invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "productType null");
                                } else if (str == null) {
                                    invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "productSubtype null");
                                } else {
                                    jLongValue2 = tITOTapInNotificationEvent.f.longValue();
                                    str4 = tITOTapInNotificationEvent.j;
                                    if (str4 == null) {
                                        invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "routeId null");
                                    } else {
                                        jLongValue3 = tITOTapInNotificationEvent.i.longValue();
                                        str5 = tITOTapInNotificationEvent.k;
                                        if (str5 == null) {
                                            invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "stopId null");
                                        } else {
                                            str6 = tITOTapInNotificationEvent.l;
                                            if (str6 == null) {
                                                invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "tripNo null");
                                            } else {
                                                long jLongValue6 = tITOTapInNotificationEvent.m.longValue();
                                                String str15 = tITOTapInNotificationEvent.o;
                                                Long l3 = tITOTapInNotificationEvent.p;
                                                str7 = tITOTapInNotificationEvent.n;
                                                if (str7 == null) {
                                                    str7 = "";
                                                }
                                                tITOTapInData = new BleValidationAckData.TITOTapInData(string, str3, str2, str, jLongValue2, j, jLongValue3, str4, str5, str6, jLongValue6, str7, str15, l3);
                                            }
                                            validationNotificationDeliveryMedium = ValidationNotificationDeliveryMedium.PUSH_NOTIFICATION;
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.label = 2;
                                            if (bleValidationProcessCompletionHelper2.g(productValidationData, productValidationConfig, tITOTapInData, validationNotificationDeliveryMedium, this) != coroutineSingletons) {
                                                return unit2;
                                            }
                                        }
                                    }
                                }
                            } else {
                                jLongValue = tITOTapInNotificationEvent.h.longValue();
                                j = jLongValue;
                                string = tITOTapInNotificationEvent.toString();
                                if (str2 == null) {
                                    invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "productType null");
                                } else if (str == null) {
                                    invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "productSubtype null");
                                } else {
                                    jLongValue2 = tITOTapInNotificationEvent.f.longValue();
                                    str4 = tITOTapInNotificationEvent.j;
                                    if (str4 == null) {
                                        invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "routeId null");
                                    } else {
                                        jLongValue3 = tITOTapInNotificationEvent.i.longValue();
                                        str5 = tITOTapInNotificationEvent.k;
                                        if (str5 == null) {
                                            invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "stopId null");
                                        } else {
                                            str6 = tITOTapInNotificationEvent.l;
                                            if (str6 == null) {
                                                invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "tripNo null");
                                            } else {
                                                long jLongValue7 = tITOTapInNotificationEvent.m.longValue();
                                                String str16 = tITOTapInNotificationEvent.o;
                                                Long l4 = tITOTapInNotificationEvent.p;
                                                str7 = tITOTapInNotificationEvent.n;
                                                if (str7 == null) {
                                                    str7 = "";
                                                }
                                                tITOTapInData = new BleValidationAckData.TITOTapInData(string, str3, str2, str, jLongValue2, j, jLongValue3, str4, str5, str6, jLongValue7, str7, str16, l4);
                                            }
                                            validationNotificationDeliveryMedium = ValidationNotificationDeliveryMedium.PUSH_NOTIFICATION;
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.label = 2;
                                            if (bleValidationProcessCompletionHelper2.g(productValidationData, productValidationConfig, tITOTapInData, validationNotificationDeliveryMedium, this) != coroutineSingletons) {
                                                return unit2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        strA = tITOTapInNotificationEvent.c;
                        if (strA == null) {
                            invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "bookingId null");
                        } else {
                            str3 = strA;
                            if (Intrinsics.d(str2, "quickpay")) {
                                jLongValue = tITOTapInNotificationEvent.h.longValue();
                                j = jLongValue;
                                string = tITOTapInNotificationEvent.toString();
                                if (str2 == null) {
                                    invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "productType null");
                                } else if (str == null) {
                                    invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "productSubtype null");
                                } else {
                                    jLongValue2 = tITOTapInNotificationEvent.f.longValue();
                                    str4 = tITOTapInNotificationEvent.j;
                                    if (str4 == null) {
                                        invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "routeId null");
                                    } else {
                                        jLongValue3 = tITOTapInNotificationEvent.i.longValue();
                                        str5 = tITOTapInNotificationEvent.k;
                                        if (str5 == null) {
                                            invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "stopId null");
                                        } else {
                                            str6 = tITOTapInNotificationEvent.l;
                                            if (str6 == null) {
                                                invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "tripNo null");
                                            } else {
                                                long jLongValue8 = tITOTapInNotificationEvent.m.longValue();
                                                String str17 = tITOTapInNotificationEvent.o;
                                                Long l5 = tITOTapInNotificationEvent.p;
                                                str7 = tITOTapInNotificationEvent.n;
                                                if (str7 == null) {
                                                    str7 = "";
                                                }
                                                tITOTapInData = new BleValidationAckData.TITOTapInData(string, str3, str2, str, jLongValue2, j, jLongValue3, str4, str5, str6, jLongValue8, str7, str17, l5);
                                            }
                                            validationNotificationDeliveryMedium = ValidationNotificationDeliveryMedium.PUSH_NOTIFICATION;
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.label = 2;
                                            if (bleValidationProcessCompletionHelper2.g(productValidationData, productValidationConfig, tITOTapInData, validationNotificationDeliveryMedium, this) != coroutineSingletons) {
                                                return unit2;
                                            }
                                        }
                                    }
                                }
                            } else {
                                jLongValue = tITOTapInNotificationEvent.h.longValue();
                                j = jLongValue;
                                string = tITOTapInNotificationEvent.toString();
                                if (str2 == null) {
                                    invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "productType null");
                                } else if (str == null) {
                                    invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "productSubtype null");
                                } else {
                                    jLongValue2 = tITOTapInNotificationEvent.f.longValue();
                                    str4 = tITOTapInNotificationEvent.j;
                                    if (str4 == null) {
                                        invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "routeId null");
                                    } else {
                                        jLongValue3 = tITOTapInNotificationEvent.i.longValue();
                                        str5 = tITOTapInNotificationEvent.k;
                                        if (str5 == null) {
                                            invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "stopId null");
                                        } else {
                                            str6 = tITOTapInNotificationEvent.l;
                                            if (str6 == null) {
                                                invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "tripNo null");
                                            } else {
                                                long jLongValue9 = tITOTapInNotificationEvent.m.longValue();
                                                String str18 = tITOTapInNotificationEvent.o;
                                                Long l6 = tITOTapInNotificationEvent.p;
                                                str7 = tITOTapInNotificationEvent.n;
                                                if (str7 == null) {
                                                    str7 = "";
                                                }
                                                tITOTapInData = new BleValidationAckData.TITOTapInData(string, str3, str2, str, jLongValue2, j, jLongValue3, str4, str5, str6, jLongValue9, str7, str18, l6);
                                            }
                                            validationNotificationDeliveryMedium = ValidationNotificationDeliveryMedium.PUSH_NOTIFICATION;
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.label = 2;
                                            if (bleValidationProcessCompletionHelper2.g(productValidationData, productValidationConfig, tITOTapInData, validationNotificationDeliveryMedium, this) != coroutineSingletons) {
                                                return unit2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    tITOTapInData = invalidData;
                    validationNotificationDeliveryMedium = ValidationNotificationDeliveryMedium.PUSH_NOTIFICATION;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 2;
                    if (bleValidationProcessCompletionHelper2.g(productValidationData, productValidationConfig, tITOTapInData, validationNotificationDeliveryMedium, this) != coroutineSingletons) {
                        return unit2;
                    }
                }
            } else {
                unit = unit2;
                if (punchNotification instanceof TITOTapOutNotificationEvent) {
                    tITOTapOutNotificationEvent = (TITOTapOutNotificationEvent) punchNotification;
                    this.L$0 = tITOTapOutNotificationEvent;
                    this.L$1 = productValidationConfig;
                    this.L$2 = productValidationData;
                    this.L$3 = bleValidationProcessCompletionHelper;
                    this.label = 3;
                    objB = getWalletSetupConfigurationUseCase.b(this);
                    if (objB != coroutineSingletons) {
                        long j5 = ((WalletSetupConfiguration) objB).f;
                        Intrinsics.i(tITOTapOutNotificationEvent, "<this>");
                        l = tITOTapOutNotificationEvent.n;
                        String str19 = tITOTapOutNotificationEvent.m;
                        str8 = tITOTapOutNotificationEvent.e;
                        bleValidationProcessCompletionHelper3 = bleValidationProcessCompletionHelper;
                        str9 = tITOTapOutNotificationEvent.d;
                        if (Intrinsics.d(str9, "quickpay")) {
                            strA2 = tITOTapOutNotificationEvent.c;
                            if (strA2 == null) {
                                invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "bookingId null");
                            } else {
                                str10 = strA2;
                                if (Intrinsics.d(str9, "quickpay")) {
                                    jLongValue4 = tITOTapOutNotificationEvent.f.longValue();
                                } else {
                                    jLongValue4 = tITOTapOutNotificationEvent.f.longValue();
                                }
                                j2 = jLongValue4;
                                string2 = tITOTapOutNotificationEvent.toString();
                                if (str9 == null) {
                                    invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "productType null");
                                } else if (str8 == null) {
                                    invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "productSubtype null");
                                } else {
                                    jLongValue5 = tITOTapOutNotificationEvent.g.longValue();
                                    str11 = tITOTapOutNotificationEvent.k;
                                    if (str11 == null) {
                                        invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "tapOutRouteId null");
                                    } else {
                                        j3 = tITOTapOutNotificationEvent.j;
                                        str12 = tITOTapOutNotificationEvent.l;
                                        if (str12 == null) {
                                            invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "tapOutStopId null");
                                        } else {
                                            str13 = tITOTapOutNotificationEvent.h;
                                            if (str13 == null) {
                                                invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "tapOutTripNo null");
                                            } else {
                                                tITOTapOutData = new BleValidationAckData.TITOTapOutData(string2, str10, str9, str8, jLongValue5, j2, j3, str11, str12, str13, tITOTapOutNotificationEvent.i.longValue(), "", "", 1, tITOTapOutNotificationEvent.m, l);
                                            }
                                            validationNotificationDeliveryMedium2 = ValidationNotificationDeliveryMedium.PUSH_NOTIFICATION;
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.label = 4;
                                            if (bleValidationProcessCompletionHelper3.g(productValidationData, productValidationConfig, tITOTapOutData, validationNotificationDeliveryMedium2, this) == coroutineSingletons) {
                                                return unit;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            strA2 = tITOTapOutNotificationEvent.c;
                            if (strA2 == null) {
                                invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "bookingId null");
                            } else {
                                str10 = strA2;
                                if (Intrinsics.d(str9, "quickpay")) {
                                    jLongValue4 = tITOTapOutNotificationEvent.f.longValue();
                                } else {
                                    jLongValue4 = tITOTapOutNotificationEvent.f.longValue();
                                }
                                j2 = jLongValue4;
                                string2 = tITOTapOutNotificationEvent.toString();
                                if (str9 == null) {
                                    invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "productType null");
                                } else if (str8 == null) {
                                    invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "productSubtype null");
                                } else {
                                    jLongValue5 = tITOTapOutNotificationEvent.g.longValue();
                                    str11 = tITOTapOutNotificationEvent.k;
                                    if (str11 == null) {
                                        invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "tapOutRouteId null");
                                    } else {
                                        j3 = tITOTapOutNotificationEvent.j;
                                        str12 = tITOTapOutNotificationEvent.l;
                                        if (str12 == null) {
                                            invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "tapOutStopId null");
                                        } else {
                                            str13 = tITOTapOutNotificationEvent.h;
                                            if (str13 == null) {
                                                invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "tapOutTripNo null");
                                            } else {
                                                tITOTapOutData = new BleValidationAckData.TITOTapOutData(string2, str10, str9, str8, jLongValue5, j2, j3, str11, str12, str13, tITOTapOutNotificationEvent.i.longValue(), "", "", 1, tITOTapOutNotificationEvent.m, l);
                                            }
                                            validationNotificationDeliveryMedium2 = ValidationNotificationDeliveryMedium.PUSH_NOTIFICATION;
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.label = 4;
                                            if (bleValidationProcessCompletionHelper3.g(productValidationData, productValidationConfig, tITOTapOutData, validationNotificationDeliveryMedium2, this) == coroutineSingletons) {
                                                return unit;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        tITOTapOutData = invalidData2;
                        validationNotificationDeliveryMedium2 = ValidationNotificationDeliveryMedium.PUSH_NOTIFICATION;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 4;
                        if (bleValidationProcessCompletionHelper3.g(productValidationData, productValidationConfig, tITOTapOutData, validationNotificationDeliveryMedium2, this) == coroutineSingletons) {
                            return unit;
                        }
                    }
                } else {
                    this.label = 5;
                    if (BleValidationProcessCompletionHelper.a(bleValidationProcessCompletionHelper, productValidationData, productValidationConfig, punchNotification, this) != coroutineSingletons) {
                        return unit;
                    }
                }
            }
        } else if (i == 1) {
            bleValidationProcessCompletionHelper = (BleValidationProcessCompletionHelper) this.L$3;
            ProductValidationData productValidationData2 = (ProductValidationData) this.L$2;
            ProductValidationConfig productValidationConfig2 = (ProductValidationConfig) this.L$1;
            tITOTapInNotificationEvent = (TITOTapInNotificationEvent) this.L$0;
            ResultKt.b(obj);
            productValidationConfig = productValidationConfig2;
            productValidationData = productValidationData2;
            objB2 = obj;
            long j6 = ((WalletSetupConfiguration) objB2).f;
            Intrinsics.i(tITOTapInNotificationEvent, "<this>");
            String str110 = tITOTapInNotificationEvent.o;
            Long l7 = tITOTapInNotificationEvent.p;
            str = tITOTapInNotificationEvent.e;
            bleValidationProcessCompletionHelper2 = bleValidationProcessCompletionHelper;
            str2 = tITOTapInNotificationEvent.d;
            if (Intrinsics.d(str2, "quickpay") || !Intrinsics.d(str, "quickpay")) {
                strA = tITOTapInNotificationEvent.c;
                if (strA == null) {
                    invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "bookingId null");
                } else {
                    str3 = strA;
                    if (Intrinsics.d(str2, "quickpay") || !Intrinsics.d(str, "quickpay")) {
                        jLongValue = tITOTapInNotificationEvent.h.longValue();
                    } else if (l7 != null) {
                        jLongValue = (l7.longValue() - j6) / ((long) 1000);
                    } else {
                        invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "expiry ts null for quickpay tapin");
                    }
                    j = jLongValue;
                    string = tITOTapInNotificationEvent.toString();
                    if (str2 == null) {
                        invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "productType null");
                    } else if (str == null) {
                        invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "productSubtype null");
                    } else {
                        jLongValue2 = tITOTapInNotificationEvent.f.longValue();
                        str4 = tITOTapInNotificationEvent.j;
                        if (str4 == null) {
                            invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "routeId null");
                        } else {
                            jLongValue3 = tITOTapInNotificationEvent.i.longValue();
                            str5 = tITOTapInNotificationEvent.k;
                            if (str5 == null) {
                                invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "stopId null");
                            } else {
                                str6 = tITOTapInNotificationEvent.l;
                                if (str6 == null) {
                                    invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "tripNo null");
                                } else {
                                    long jLongValue10 = tITOTapInNotificationEvent.m.longValue();
                                    String str111 = tITOTapInNotificationEvent.o;
                                    Long l8 = tITOTapInNotificationEvent.p;
                                    str7 = tITOTapInNotificationEvent.n;
                                    if (str7 == null) {
                                        str7 = "";
                                    }
                                    tITOTapInData = new BleValidationAckData.TITOTapInData(string, str3, str2, str, jLongValue2, j, jLongValue3, str4, str5, str6, jLongValue10, str7, str111, l8);
                                }
                                validationNotificationDeliveryMedium = ValidationNotificationDeliveryMedium.PUSH_NOTIFICATION;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 2;
                                if (bleValidationProcessCompletionHelper2.g(productValidationData, productValidationConfig, tITOTapInData, validationNotificationDeliveryMedium, this) != coroutineSingletons) {
                                    return unit2;
                                }
                            }
                        }
                    }
                }
            } else if (str110 == null || str110.length() <= 0 || (l7 != null && l7.longValue() == -1)) {
                invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "bookingId null");
            } else {
                strA = l7 != null ? ChaloWalletOrderIdUtils.a(l7.longValue(), str110) : null;
                if (strA == null) {
                    invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "walletId or expiry time null for qpBooking");
                } else {
                    str3 = strA;
                    if (Intrinsics.d(str2, "quickpay")) {
                        jLongValue = tITOTapInNotificationEvent.h.longValue();
                        j = jLongValue;
                        string = tITOTapInNotificationEvent.toString();
                        if (str2 == null) {
                            invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "productType null");
                        } else if (str == null) {
                            invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "productSubtype null");
                        } else {
                            jLongValue2 = tITOTapInNotificationEvent.f.longValue();
                            str4 = tITOTapInNotificationEvent.j;
                            if (str4 == null) {
                                invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "routeId null");
                            } else {
                                jLongValue3 = tITOTapInNotificationEvent.i.longValue();
                                str5 = tITOTapInNotificationEvent.k;
                                if (str5 == null) {
                                    invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "stopId null");
                                } else {
                                    str6 = tITOTapInNotificationEvent.l;
                                    if (str6 == null) {
                                        invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "tripNo null");
                                    } else {
                                        long jLongValue11 = tITOTapInNotificationEvent.m.longValue();
                                        String str112 = tITOTapInNotificationEvent.o;
                                        Long l9 = tITOTapInNotificationEvent.p;
                                        str7 = tITOTapInNotificationEvent.n;
                                        if (str7 == null) {
                                            str7 = "";
                                        }
                                        tITOTapInData = new BleValidationAckData.TITOTapInData(string, str3, str2, str, jLongValue2, j, jLongValue3, str4, str5, str6, jLongValue11, str7, str112, l9);
                                    }
                                    validationNotificationDeliveryMedium = ValidationNotificationDeliveryMedium.PUSH_NOTIFICATION;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.label = 2;
                                    if (bleValidationProcessCompletionHelper2.g(productValidationData, productValidationConfig, tITOTapInData, validationNotificationDeliveryMedium, this) != coroutineSingletons) {
                                        return unit2;
                                    }
                                }
                            }
                        }
                    } else {
                        jLongValue = tITOTapInNotificationEvent.h.longValue();
                        j = jLongValue;
                        string = tITOTapInNotificationEvent.toString();
                        if (str2 == null) {
                            invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "productType null");
                        } else if (str == null) {
                            invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "productSubtype null");
                        } else {
                            jLongValue2 = tITOTapInNotificationEvent.f.longValue();
                            str4 = tITOTapInNotificationEvent.j;
                            if (str4 == null) {
                                invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "routeId null");
                            } else {
                                jLongValue3 = tITOTapInNotificationEvent.i.longValue();
                                str5 = tITOTapInNotificationEvent.k;
                                if (str5 == null) {
                                    invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "stopId null");
                                } else {
                                    str6 = tITOTapInNotificationEvent.l;
                                    if (str6 == null) {
                                        invalidData = new BleValidationAckData.InvalidData(tITOTapInNotificationEvent.toString(), "tripNo null");
                                    } else {
                                        long jLongValue12 = tITOTapInNotificationEvent.m.longValue();
                                        String str113 = tITOTapInNotificationEvent.o;
                                        Long l10 = tITOTapInNotificationEvent.p;
                                        str7 = tITOTapInNotificationEvent.n;
                                        if (str7 == null) {
                                            str7 = "";
                                        }
                                        tITOTapInData = new BleValidationAckData.TITOTapInData(string, str3, str2, str, jLongValue2, j, jLongValue3, str4, str5, str6, jLongValue12, str7, str113, l10);
                                    }
                                    validationNotificationDeliveryMedium = ValidationNotificationDeliveryMedium.PUSH_NOTIFICATION;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.label = 2;
                                    if (bleValidationProcessCompletionHelper2.g(productValidationData, productValidationConfig, tITOTapInData, validationNotificationDeliveryMedium, this) != coroutineSingletons) {
                                        return unit2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            tITOTapInData = invalidData;
            validationNotificationDeliveryMedium = ValidationNotificationDeliveryMedium.PUSH_NOTIFICATION;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            if (bleValidationProcessCompletionHelper2.g(productValidationData, productValidationConfig, tITOTapInData, validationNotificationDeliveryMedium, this) != coroutineSingletons) {
                return unit2;
            }
        } else {
            if (i == 2) {
                ResultKt.b(obj);
                return unit2;
            }
            if (i != 3) {
                if (i == 4) {
                    ResultKt.b(obj);
                    return unit2;
                }
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit2;
            }
            bleValidationProcessCompletionHelper = (BleValidationProcessCompletionHelper) this.L$3;
            productValidationData = (ProductValidationData) this.L$2;
            productValidationConfig = (ProductValidationConfig) this.L$1;
            tITOTapOutNotificationEvent = (TITOTapOutNotificationEvent) this.L$0;
            ResultKt.b(obj);
            objB = obj;
            unit = unit2;
            long j7 = ((WalletSetupConfiguration) objB).f;
            Intrinsics.i(tITOTapOutNotificationEvent, "<this>");
            l = tITOTapOutNotificationEvent.n;
            String str114 = tITOTapOutNotificationEvent.m;
            str8 = tITOTapOutNotificationEvent.e;
            bleValidationProcessCompletionHelper3 = bleValidationProcessCompletionHelper;
            str9 = tITOTapOutNotificationEvent.d;
            if (Intrinsics.d(str9, "quickpay") || !Intrinsics.d(str8, "quickpay")) {
                strA2 = tITOTapOutNotificationEvent.c;
                if (strA2 == null) {
                    invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "bookingId null");
                } else {
                    str10 = strA2;
                    if (Intrinsics.d(str9, "quickpay") || !Intrinsics.d(str8, "quickpay")) {
                        jLongValue4 = tITOTapOutNotificationEvent.f.longValue();
                    } else {
                        jLongValue4 = (l.longValue() - j7) / ((long) 1000);
                    }
                    j2 = jLongValue4;
                    string2 = tITOTapOutNotificationEvent.toString();
                    if (str9 == null) {
                        invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "productType null");
                    } else if (str8 == null) {
                        invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "productSubtype null");
                    } else {
                        jLongValue5 = tITOTapOutNotificationEvent.g.longValue();
                        str11 = tITOTapOutNotificationEvent.k;
                        if (str11 == null) {
                            invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "tapOutRouteId null");
                        } else {
                            j3 = tITOTapOutNotificationEvent.j;
                            str12 = tITOTapOutNotificationEvent.l;
                            if (str12 == null) {
                                invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "tapOutStopId null");
                            } else {
                                str13 = tITOTapOutNotificationEvent.h;
                                if (str13 == null) {
                                    invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "tapOutTripNo null");
                                } else {
                                    tITOTapOutData = new BleValidationAckData.TITOTapOutData(string2, str10, str9, str8, jLongValue5, j2, j3, str11, str12, str13, tITOTapOutNotificationEvent.i.longValue(), "", "", 1, tITOTapOutNotificationEvent.m, l);
                                }
                                validationNotificationDeliveryMedium2 = ValidationNotificationDeliveryMedium.PUSH_NOTIFICATION;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 4;
                                if (bleValidationProcessCompletionHelper3.g(productValidationData, productValidationConfig, tITOTapOutData, validationNotificationDeliveryMedium2, this) == coroutineSingletons) {
                                    return unit;
                                }
                            }
                        }
                    }
                }
            } else if (str114 == null || str114.length() <= 0 || l.longValue() == -1) {
                invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "bookingId null");
            } else {
                strA2 = ChaloWalletOrderIdUtils.a(l.longValue(), str114);
                if (strA2 == null) {
                    invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "walletId or expiry time null for qpBooking");
                } else {
                    str10 = strA2;
                    if (Intrinsics.d(str9, "quickpay")) {
                        jLongValue4 = tITOTapOutNotificationEvent.f.longValue();
                    } else {
                        jLongValue4 = tITOTapOutNotificationEvent.f.longValue();
                    }
                    j2 = jLongValue4;
                    string2 = tITOTapOutNotificationEvent.toString();
                    if (str9 == null) {
                        invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "productType null");
                    } else if (str8 == null) {
                        invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "productSubtype null");
                    } else {
                        jLongValue5 = tITOTapOutNotificationEvent.g.longValue();
                        str11 = tITOTapOutNotificationEvent.k;
                        if (str11 == null) {
                            invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "tapOutRouteId null");
                        } else {
                            j3 = tITOTapOutNotificationEvent.j;
                            str12 = tITOTapOutNotificationEvent.l;
                            if (str12 == null) {
                                invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "tapOutStopId null");
                            } else {
                                str13 = tITOTapOutNotificationEvent.h;
                                if (str13 == null) {
                                    invalidData2 = new BleValidationAckData.InvalidData(tITOTapOutNotificationEvent.toString(), "tapOutTripNo null");
                                } else {
                                    tITOTapOutData = new BleValidationAckData.TITOTapOutData(string2, str10, str9, str8, jLongValue5, j2, j3, str11, str12, str13, tITOTapOutNotificationEvent.i.longValue(), "", "", 1, tITOTapOutNotificationEvent.m, l);
                                }
                                validationNotificationDeliveryMedium2 = ValidationNotificationDeliveryMedium.PUSH_NOTIFICATION;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 4;
                                if (bleValidationProcessCompletionHelper3.g(productValidationData, productValidationConfig, tITOTapOutData, validationNotificationDeliveryMedium2, this) == coroutineSingletons) {
                                    return unit;
                                }
                            }
                        }
                    }
                }
            }
            tITOTapOutData = invalidData2;
            validationNotificationDeliveryMedium2 = ValidationNotificationDeliveryMedium.PUSH_NOTIFICATION;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 4;
            if (bleValidationProcessCompletionHelper3.g(productValidationData, productValidationConfig, tITOTapOutData, validationNotificationDeliveryMedium2, this) == coroutineSingletons) {
                return unit;
            }
        }
        return coroutineSingletons;
    }
}
