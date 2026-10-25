package defpackage;

import androidx.compose.ui.graphics.Path;
import app.chalo.checkout.data.model.api.response.PaymentInstrument$$serializer;
import app.chalo.checkout.data.model.api.response.PaymentMethodOption;
import app.chalo.checkout.data.model.api.response.PaymentMethodOption$$serializer;
import app.chalo.checkout.data.model.api.response.PaymentMethodsAPIModel;
import app.chalo.checkout.data.model.api.response.PaymentStatus;
import app.chalo.checkout.data.model.api.response.PreferredPaymentMethod$$serializer;
import app.chalo.checkout.data.model.app.PaymentInstrumentAppModel;
import app.chalo.checkout.data.model.app.PaymentInstrumentAppModel$NetBankingPaymentInstrumentAppModel$$serializer;
import app.chalo.checkout.data.model.app.PaymentInstrumentAppModel$UPIPaymentInstrumentAppModel$$serializer;
import app.chalo.checkout.data.model.app.PaymentInstrumentAppModel$WalletPaymentInstrumentAppModel$$serializer;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$ChaloPay$$serializer;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$ClosedLoopWallet$$serializer;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Card$$serializer;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Cash$$serializer;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Generic$$serializer;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$InaiPaymentMethodOption$LazyPay$$serializer;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$InaiPaymentMethodOption$NetBanking$$serializer;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$InaiPaymentMethodOption$UPI$$serializer;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Wallet$$serializer;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$JuspayTurboUpi$$serializer;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$Card$$serializer;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$NetBanking$$serializer;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$UPI$$serializer;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Card$$serializer;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Cash$$serializer;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$LazyPay$$serializer;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$NetBanking$$serializer;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$UPI$$serializer;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Wallet$$serializer;
import app.chalo.checkout.data.model.app.PaymentMethodsAppModel;
import app.chalo.checkout.data.model.app.PreferredPaymentMethodsAppModel$$serializer;
import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData;
import app.chalo.checkout.data.resolver.CustomUrlPaymentStatus;
import app.chalo.checkout.data.resolver.PaymentInfoState;
import app.chalo.homescreen.data.model.app.PayForTicketCardAppModel;
import app.chalo.homescreen.data.model.app.RegularBusPageFeature;
import app.chalo.instantticket.data.model.api.response.FareBreakupApiModel$$serializer;
import app.chalo.instantticket.data.model.api.response.PassengerDetailApiModel;
import app.chalo.models.SuperPassSubTypes;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.api.PbTripBookingApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PbTripCommunicationApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PbTripCommunicationMessageApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductApiResponseModel$$serializer;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.scenes.args.PbBulkBookingRideDetailsArgs;
import app.chalo.superpass.data.models.PassTripHistoryApiResponseModel;
import app.chalo.superpass.data.models.SuperPassTripReceiptApiResponseModel$$serializer;
import app.chalo.utils.Patterns;
import io.github.alexzhirkevich.compottie.internal.shapes.PathShape;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xp0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20042a;

    public /* synthetic */ xp0(int i) {
        this.f20042a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20042a) {
            case 0:
                PassTripHistoryApiResponseModel.Companion companion = PassTripHistoryApiResponseModel.INSTANCE;
                return new ArrayListSerializer(SuperPassTripReceiptApiResponseModel$$serializer.f9534a);
            case 1:
                PassengerDetailApiModel.Companion companion2 = PassengerDetailApiModel.Companion;
                return new ArrayListSerializer(FareBreakupApiModel$$serializer.f3862a);
            case 2:
                PathShape.Companion companion3 = PathShape.Companion;
                return new PolymorphicSerializer(Reflection.a(Path.class), new Annotation[0]);
            case 3:
                Lazy lazy = Patterns.f10434a;
                return new Regex("(?=.{1,256}\\@)[a-zA-Z0-9_+%\\-]+(?:\\.[a-zA-Z0-9_+%\\-]+)*\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
            case 4:
                PayForTicketCardAppModel.Companion companion4 = PayForTicketCardAppModel.Companion;
                return EnumsKt.b("app.chalo.providers.iconassetprovider.IconType", IconType.values());
            case 5:
                PayForTicketCardAppModel.Companion companion5 = PayForTicketCardAppModel.Companion;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageFeature", RegularBusPageFeature.values());
            case 6:
                PaymentInfoState.Companion companion6 = PaymentInfoState.INSTANCE;
                return SelectedPaymentInstrumentData.INSTANCE.serializer();
            case 7:
                PaymentInfoState.Companion companion7 = PaymentInfoState.INSTANCE;
                return EnumsKt.b("app.chalo.checkout.data.resolver.CustomUrlPaymentStatus", CustomUrlPaymentStatus.values());
            case 8:
                PaymentInstrumentAppModel.Companion companion8 = PaymentInstrumentAppModel.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.checkout.data.model.app.PaymentInstrumentAppModel", Reflection.a(PaymentInstrumentAppModel.class), new KClass[]{Reflection.a(PaymentInstrumentAppModel.NetBankingPaymentInstrumentAppModel.class), Reflection.a(PaymentInstrumentAppModel.UPIPaymentInstrumentAppModel.class), Reflection.a(PaymentInstrumentAppModel.WalletPaymentInstrumentAppModel.class)}, new KSerializer[]{PaymentInstrumentAppModel$NetBankingPaymentInstrumentAppModel$$serializer.f1292a, PaymentInstrumentAppModel$UPIPaymentInstrumentAppModel$$serializer.f1293a, PaymentInstrumentAppModel$WalletPaymentInstrumentAppModel$$serializer.f1294a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 9:
                PaymentMethodOption.Companion companion9 = PaymentMethodOption.INSTANCE;
                return new ArrayListSerializer(PaymentInstrument$$serializer.f1261a);
            case 10:
                PaymentMethodOptionsAppModel.Companion companion10 = PaymentMethodOptionsAppModel.INSTANCE;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel", Reflection.a(PaymentMethodOptionsAppModel.class), new KClass[]{Reflection.a(PaymentMethodOptionsAppModel.ChaloPay.class), Reflection.a(PaymentMethodOptionsAppModel.ClosedLoopWallet.class), Reflection.a(PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Card.class), Reflection.a(PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Cash.class), Reflection.a(PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Generic.class), Reflection.a(PaymentMethodOptionsAppModel.InaiPaymentMethodOption.LazyPay.class), Reflection.a(PaymentMethodOptionsAppModel.InaiPaymentMethodOption.NetBanking.class), Reflection.a(PaymentMethodOptionsAppModel.InaiPaymentMethodOption.UPI.class), Reflection.a(PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Wallet.class), Reflection.a(PaymentMethodOptionsAppModel.JuspayTurboUpi.class), Reflection.a(PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.Card.class), Reflection.a(PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.NetBanking.class), Reflection.a(PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.UPI.class), Reflection.a(PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.Card.class), Reflection.a(PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.Cash.class), Reflection.a(PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.LazyPay.class), Reflection.a(PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.NetBanking.class), Reflection.a(PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.UPI.class), Reflection.a(PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.Wallet.class)}, new KSerializer[]{PaymentMethodOptionsAppModel$ChaloPay$$serializer.f1298a, PaymentMethodOptionsAppModel$ClosedLoopWallet$$serializer.f1299a, PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Card$$serializer.f1300a, PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Cash$$serializer.f1301a, PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Generic$$serializer.f1302a, PaymentMethodOptionsAppModel$InaiPaymentMethodOption$LazyPay$$serializer.f1303a, PaymentMethodOptionsAppModel$InaiPaymentMethodOption$NetBanking$$serializer.f1304a, PaymentMethodOptionsAppModel$InaiPaymentMethodOption$UPI$$serializer.f1305a, PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Wallet$$serializer.f1306a, PaymentMethodOptionsAppModel$JuspayTurboUpi$$serializer.f1307a, PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$Card$$serializer.f1308a, PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$NetBanking$$serializer.f1309a, PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$UPI$$serializer.f1310a, PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Card$$serializer.f1311a, PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Cash$$serializer.f1312a, PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$LazyPay$$serializer.f1313a, PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$NetBanking$$serializer.f1314a, PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$UPI$$serializer.f1315a, PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Wallet$$serializer.f1316a});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 11:
                PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Companion companion11 = PaymentMethodOptionsAppModel.InaiPaymentMethodOption.INSTANCE;
                SealedClassSerializer sealedClassSerializer3 = new SealedClassSerializer("app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel.InaiPaymentMethodOption", Reflection.a(PaymentMethodOptionsAppModel.InaiPaymentMethodOption.class), new KClass[]{Reflection.a(PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Card.class), Reflection.a(PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Cash.class), Reflection.a(PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Generic.class), Reflection.a(PaymentMethodOptionsAppModel.InaiPaymentMethodOption.LazyPay.class), Reflection.a(PaymentMethodOptionsAppModel.InaiPaymentMethodOption.NetBanking.class), Reflection.a(PaymentMethodOptionsAppModel.InaiPaymentMethodOption.UPI.class), Reflection.a(PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Wallet.class)}, new KSerializer[]{PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Card$$serializer.f1300a, PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Cash$$serializer.f1301a, PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Generic$$serializer.f1302a, PaymentMethodOptionsAppModel$InaiPaymentMethodOption$LazyPay$$serializer.f1303a, PaymentMethodOptionsAppModel$InaiPaymentMethodOption$NetBanking$$serializer.f1304a, PaymentMethodOptionsAppModel$InaiPaymentMethodOption$UPI$$serializer.f1305a, PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Wallet$$serializer.f1306a});
                sealedClassSerializer3.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer3;
            case 12:
                PaymentMethodOptionsAppModel.InaiPaymentMethodOption.NetBanking.Companion companion12 = PaymentMethodOptionsAppModel.InaiPaymentMethodOption.NetBanking.INSTANCE;
                return new ArrayListSerializer(PaymentInstrumentAppModel$NetBankingPaymentInstrumentAppModel$$serializer.f1292a);
            case 13:
                PaymentMethodOptionsAppModel.InaiPaymentMethodOption.UPI.Companion companion13 = PaymentMethodOptionsAppModel.InaiPaymentMethodOption.UPI.INSTANCE;
                return new ArrayListSerializer(PaymentInstrumentAppModel$UPIPaymentInstrumentAppModel$$serializer.f1293a);
            case 14:
                PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Wallet.Companion companion14 = PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Wallet.INSTANCE;
                return new ArrayListSerializer(PaymentInstrumentAppModel$WalletPaymentInstrumentAppModel$$serializer.f1294a);
            case 15:
                PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.Companion companion15 = PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.INSTANCE;
                SealedClassSerializer sealedClassSerializer4 = new SealedClassSerializer("app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel.PhonePePaymentMethodOption", Reflection.a(PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.class), new KClass[]{Reflection.a(PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.Card.class), Reflection.a(PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.NetBanking.class), Reflection.a(PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.UPI.class)}, new KSerializer[]{PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$Card$$serializer.f1308a, PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$NetBanking$$serializer.f1309a, PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$UPI$$serializer.f1310a});
                sealedClassSerializer4.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer4;
            case 16:
                PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.NetBanking.Companion companion16 = PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.NetBanking.INSTANCE;
                return new ArrayListSerializer(PaymentInstrumentAppModel$NetBankingPaymentInstrumentAppModel$$serializer.f1292a);
            case 17:
                PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.UPI.Companion companion17 = PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.UPI.INSTANCE;
                return new ArrayListSerializer(PaymentInstrumentAppModel$UPIPaymentInstrumentAppModel$$serializer.f1293a);
            case 18:
                PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.Companion companion18 = PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.INSTANCE;
                SealedClassSerializer sealedClassSerializer5 = new SealedClassSerializer("app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption", Reflection.a(PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.class), new KClass[]{Reflection.a(PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.Card.class), Reflection.a(PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.Cash.class), Reflection.a(PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.LazyPay.class), Reflection.a(PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.NetBanking.class), Reflection.a(PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.UPI.class), Reflection.a(PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.Wallet.class)}, new KSerializer[]{PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Card$$serializer.f1311a, PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Cash$$serializer.f1312a, PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$LazyPay$$serializer.f1313a, PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$NetBanking$$serializer.f1314a, PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$UPI$$serializer.f1315a, PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Wallet$$serializer.f1316a});
                sealedClassSerializer5.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer5;
            case 19:
                PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.NetBanking.Companion companion19 = PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.NetBanking.INSTANCE;
                return new ArrayListSerializer(PaymentInstrumentAppModel$NetBankingPaymentInstrumentAppModel$$serializer.f1292a);
            case 20:
                PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.UPI.Companion companion20 = PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.UPI.INSTANCE;
                return new ArrayListSerializer(PaymentInstrumentAppModel$UPIPaymentInstrumentAppModel$$serializer.f1293a);
            case 21:
                PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.Wallet.Companion companion21 = PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.Wallet.INSTANCE;
                return new ArrayListSerializer(PaymentInstrumentAppModel$WalletPaymentInstrumentAppModel$$serializer.f1294a);
            case 22:
                PaymentMethodsAPIModel.Companion companion22 = PaymentMethodsAPIModel.INSTANCE;
                return new ArrayListSerializer(PaymentMethodOption$$serializer.f1263a);
            case 23:
                PaymentMethodsAPIModel.Companion companion23 = PaymentMethodsAPIModel.INSTANCE;
                return new ArrayListSerializer(PreferredPaymentMethod$$serializer.f1271a);
            case 24:
                PaymentMethodsAppModel.Companion companion24 = PaymentMethodsAppModel.INSTANCE;
                return new ArrayListSerializer(PaymentMethodOptionsAppModel.INSTANCE.serializer());
            case 25:
                PaymentMethodsAppModel.Companion companion25 = PaymentMethodsAppModel.INSTANCE;
                return new ArrayListSerializer(PreferredPaymentMethodsAppModel$$serializer.f1321a);
            case 26:
                return PaymentStatus._init_$_anonymous_();
            case 27:
                PbBulkBookingRideDetailsArgs.Companion companion26 = PbBulkBookingRideDetailsArgs.Companion;
                return SuperPassSubTypes.INSTANCE.serializer();
            case 28:
                PbTripBookingApiResponseModel.Companion companion27 = PbTripBookingApiResponseModel.INSTANCE;
                return new ArrayListSerializer(GenericMobileTicketProductApiResponseModel$$serializer.f8125a);
            default:
                PbTripCommunicationApiResponseModel.Companion companion28 = PbTripCommunicationApiResponseModel.Companion;
                return new ArrayListSerializer(PbTripCommunicationMessageApiResponseModel$$serializer.f7037a);
        }
    }
}
