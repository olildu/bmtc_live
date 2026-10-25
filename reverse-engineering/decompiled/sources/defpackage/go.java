package defpackage;

import app.chalo.checkout.data.model.app.CheckoutPaymentMethod;
import app.chalo.citydata.data.model.api.response.CityIdAndDisplayNameApiModel$$serializer;
import app.chalo.citydata.data.model.api.response.CityIdAndNameFromLatLngResponseApiModel;
import app.chalo.citydata.data.model.app.CityDataConfigForCity$$serializer;
import app.chalo.citydata.data.model.app.CityDataRemoteConfig;
import app.chalo.constants.Source;
import app.chalo.data.CityClusterConfiguration;
import app.chalo.data.ClusterConfig$$serializer;
import app.chalo.features.checkout.CheckoutProductData;
import app.chalo.features.checkout.CheckoutProductType;
import app.chalo.scenes.args.CheckoutPhonePeArgs;
import app.chalo.scenes.args.CheckoutRazorpayArgs;
import app.chalo.scenes.args.CheckoutUpiArgs;
import app.chalo.scenes.args.CheckoutWalletArgs;
import app.chalo.scenes.args.CitySelectionArgs;
import app.chalo.scenes.args.CitySelectionArgs$CityLocationSelectionArgs$$serializer;
import app.chalo.scenes.args.CitySelectionArgs$OldCitySelectionArgs$$serializer;
import java.lang.annotation.Annotation;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.ObjectSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class go implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15751a;

    public /* synthetic */ go(int i) {
        this.f15751a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15751a) {
            case 0:
                return new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.Inai.Cash", CheckoutPaymentMethod.Inai.Cash.INSTANCE, new Annotation[0]);
            case 1:
                return new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.Inai.Lazypay", CheckoutPaymentMethod.Inai.Lazypay.INSTANCE, new Annotation[0]);
            case 2:
                return new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.Inai.NetBanking", CheckoutPaymentMethod.Inai.NetBanking.INSTANCE, new Annotation[0]);
            case 3:
                return new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.Inai.Upi", CheckoutPaymentMethod.Inai.Upi.INSTANCE, new Annotation[0]);
            case 4:
                return new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.Inai.Wallet", CheckoutPaymentMethod.Inai.Wallet.INSTANCE, new Annotation[0]);
            case 5:
                return new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.JuspayTurboUpi", CheckoutPaymentMethod.JuspayTurboUpi.INSTANCE, new Annotation[0]);
            case 6:
                CheckoutPaymentMethod.PhonePe.Companion companion = CheckoutPaymentMethod.PhonePe.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.PhonePe", Reflection.a(CheckoutPaymentMethod.PhonePe.class), new KClass[]{Reflection.a(CheckoutPaymentMethod.PhonePe.Card.class), Reflection.a(CheckoutPaymentMethod.PhonePe.NetBanking.class), Reflection.a(CheckoutPaymentMethod.PhonePe.Unknown.class), Reflection.a(CheckoutPaymentMethod.PhonePe.Upi.class)}, new KSerializer[]{new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.PhonePe.Card", CheckoutPaymentMethod.PhonePe.Card.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.PhonePe.NetBanking", CheckoutPaymentMethod.PhonePe.NetBanking.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.PhonePe.Unknown", CheckoutPaymentMethod.PhonePe.Unknown.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.PhonePe.Upi", CheckoutPaymentMethod.PhonePe.Upi.INSTANCE, new Annotation[0])});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 7:
                return new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.PhonePe.Card", CheckoutPaymentMethod.PhonePe.Card.INSTANCE, new Annotation[0]);
            case 8:
                return new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.PhonePe.NetBanking", CheckoutPaymentMethod.PhonePe.NetBanking.INSTANCE, new Annotation[0]);
            case 9:
                return new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.PhonePe.Unknown", CheckoutPaymentMethod.PhonePe.Unknown.INSTANCE, new Annotation[0]);
            case 10:
                return new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.PhonePe.Upi", CheckoutPaymentMethod.PhonePe.Upi.INSTANCE, new Annotation[0]);
            case 11:
                CheckoutPaymentMethod.RazorPay.Companion companion2 = CheckoutPaymentMethod.RazorPay.INSTANCE;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.RazorPay", Reflection.a(CheckoutPaymentMethod.RazorPay.class), new KClass[]{Reflection.a(CheckoutPaymentMethod.RazorPay.Card.class), Reflection.a(CheckoutPaymentMethod.RazorPay.Cash.class), Reflection.a(CheckoutPaymentMethod.RazorPay.Lazypay.class), Reflection.a(CheckoutPaymentMethod.RazorPay.NetBanking.class), Reflection.a(CheckoutPaymentMethod.RazorPay.Unknown.class), Reflection.a(CheckoutPaymentMethod.RazorPay.Upi.class), Reflection.a(CheckoutPaymentMethod.RazorPay.Wallet.class)}, new KSerializer[]{new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.RazorPay.Card", CheckoutPaymentMethod.RazorPay.Card.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.RazorPay.Cash", CheckoutPaymentMethod.RazorPay.Cash.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.RazorPay.Lazypay", CheckoutPaymentMethod.RazorPay.Lazypay.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.RazorPay.NetBanking", CheckoutPaymentMethod.RazorPay.NetBanking.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.RazorPay.Unknown", CheckoutPaymentMethod.RazorPay.Unknown.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.RazorPay.Upi", CheckoutPaymentMethod.RazorPay.Upi.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.RazorPay.Wallet", CheckoutPaymentMethod.RazorPay.Wallet.INSTANCE, new Annotation[0])});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 12:
                return new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.RazorPay.Card", CheckoutPaymentMethod.RazorPay.Card.INSTANCE, new Annotation[0]);
            case 13:
                return new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.RazorPay.Cash", CheckoutPaymentMethod.RazorPay.Cash.INSTANCE, new Annotation[0]);
            case 14:
                return new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.RazorPay.Lazypay", CheckoutPaymentMethod.RazorPay.Lazypay.INSTANCE, new Annotation[0]);
            case 15:
                return new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.RazorPay.NetBanking", CheckoutPaymentMethod.RazorPay.NetBanking.INSTANCE, new Annotation[0]);
            case 16:
                return new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.RazorPay.Unknown", CheckoutPaymentMethod.RazorPay.Unknown.INSTANCE, new Annotation[0]);
            case 17:
                return new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.RazorPay.Upi", CheckoutPaymentMethod.RazorPay.Upi.INSTANCE, new Annotation[0]);
            case 18:
                return new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.RazorPay.Wallet", CheckoutPaymentMethod.RazorPay.Wallet.INSTANCE, new Annotation[0]);
            case 19:
                return new ObjectSerializer("app.chalo.scenes.args.CheckoutPhonePeArgs", CheckoutPhonePeArgs.INSTANCE, new Annotation[0]);
            case 20:
                CheckoutProductData.Companion companion3 = CheckoutProductData.INSTANCE;
                return EnumsKt.b("app.chalo.features.checkout.CheckoutProductType", CheckoutProductType.values());
            case 21:
                return new ObjectSerializer("app.chalo.scenes.args.CheckoutRazorpayArgs", CheckoutRazorpayArgs.INSTANCE, new Annotation[0]);
            case 22:
                return new ObjectSerializer("app.chalo.scenes.args.CheckoutUpiArgs", CheckoutUpiArgs.INSTANCE, new Annotation[0]);
            case 23:
                return new ObjectSerializer("app.chalo.scenes.args.CheckoutWalletArgs", CheckoutWalletArgs.INSTANCE, new Annotation[0]);
            case 24:
                CityClusterConfiguration.Companion companion4 = CityClusterConfiguration.Companion;
                return new ArrayListSerializer(ClusterConfig$$serializer.f2347a);
            case 25:
                CityDataRemoteConfig.Companion companion5 = CityDataRemoteConfig.INSTANCE;
                return new ArrayListSerializer(CityDataConfigForCity$$serializer.f1704a);
            case 26:
                CityIdAndNameFromLatLngResponseApiModel.Companion companion6 = CityIdAndNameFromLatLngResponseApiModel.Companion;
                return new ArrayListSerializer(CityIdAndDisplayNameApiModel$$serializer.f1659a);
            case 27:
                CitySelectionArgs.Companion companion7 = CitySelectionArgs.INSTANCE;
                SealedClassSerializer sealedClassSerializer3 = new SealedClassSerializer("app.chalo.scenes.args.CitySelectionArgs", Reflection.a(CitySelectionArgs.class), new KClass[]{Reflection.a(CitySelectionArgs.CityLocationSelectionArgs.class), Reflection.a(CitySelectionArgs.OldCitySelectionArgs.class)}, new KSerializer[]{CitySelectionArgs$CityLocationSelectionArgs$$serializer.f9240a, CitySelectionArgs$OldCitySelectionArgs$$serializer.f9242a});
                sealedClassSerializer3.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer3;
            case 28:
                CitySelectionArgs.CityLocationSelectionArgs.Companion companion8 = CitySelectionArgs.CityLocationSelectionArgs.INSTANCE;
                return Source.INSTANCE.serializer();
            default:
                CitySelectionArgs.OldCitySelectionArgs.Companion companion9 = CitySelectionArgs.OldCitySelectionArgs.INSTANCE;
                return Source.INSTANCE.serializer();
        }
    }
}
