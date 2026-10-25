package app.chalo.electricitybill.data.model.apimodel.response;

import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/electricitybill/data/model/apimodel/response/ElectricityBillPaymentHistoryApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/electricitybill/data/model/apimodel/response/ElectricityBillPaymentHistoryApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ElectricityBillPaymentHistoryApiModel$$serializer implements GeneratedSerializer<ElectricityBillPaymentHistoryApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ElectricityBillPaymentHistoryApiModel$$serializer f2533a;
    private static final SerialDescriptor descriptor;

    static {
        ElectricityBillPaymentHistoryApiModel$$serializer electricityBillPaymentHistoryApiModel$$serializer = new ElectricityBillPaymentHistoryApiModel$$serializer();
        f2533a = electricityBillPaymentHistoryApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.electricitybill.data.model.apimodel.response.ElectricityBillPaymentHistoryApiModel", electricityBillPaymentHistoryApiModel$$serializer, 13);
        pluginGeneratedSerialDescriptor.j("accountNumber", true);
        pluginGeneratedSerialDescriptor.j(PaymentConstants.AMOUNT, true);
        pluginGeneratedSerialDescriptor.j("billDate", true);
        pluginGeneratedSerialDescriptor.j("bookingTime", true);
        pluginGeneratedSerialDescriptor.j("city", true);
        pluginGeneratedSerialDescriptor.j("configId", true);
        pluginGeneratedSerialDescriptor.j("customerName", true);
        pluginGeneratedSerialDescriptor.j(CLConstants.SALT_FIELD_DEVICE_ID, true);
        pluginGeneratedSerialDescriptor.j("dueDate", true);
        pluginGeneratedSerialDescriptor.j(CLConstants.LABEL_REF_ID, true);
        pluginGeneratedSerialDescriptor.j("status", true);
        pluginGeneratedSerialDescriptor.j("transactionId", true);
        pluginGeneratedSerialDescriptor.j("userId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(IntSerializer.f18146a);
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{kSerializerC, kSerializerC2, BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        Long l;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Long l2;
        Long l3;
        Integer num;
        int i;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.f18146a, null);
            LongSerializer longSerializer = LongSerializer.f18151a;
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, longSerializer, null);
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, longSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            Long l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, longSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            i = 8191;
            str7 = str16;
            str4 = str15;
            str5 = str14;
            str8 = str13;
            str6 = str12;
            l2 = l5;
            l = l6;
            str9 = str11;
            l3 = l4;
            str3 = str17;
            str = str10;
            num = num2;
        } else {
            String str18 = null;
            Integer num3 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            Long l7 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            boolean z = true;
            Long l8 = null;
            int i2 = 0;
            Long l9 = null;
            while (z) {
                String str27 = str18;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str18 = str27;
                        z = false;
                        num3 = num3;
                        i2 = i2;
                        continue;
                    case 0:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str27);
                        i2 |= 1;
                        num3 = num3;
                        continue;
                    case 1:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.f18146a, num3);
                        i2 |= 2;
                        str18 = str27;
                        continue;
                    case 2:
                        l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.f18151a, l9);
                        i2 |= 4;
                        break;
                    case 3:
                        l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.f18151a, l8);
                        i2 |= 8;
                        break;
                    case 4:
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str26);
                        i2 |= 16;
                        break;
                    case 5:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str23);
                        i2 |= 32;
                        break;
                    case 6:
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str25);
                        i2 |= 64;
                        break;
                    case 7:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str22);
                        i2 |= 128;
                        break;
                    case 8:
                        l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.f18151a, l7);
                        i2 |= 256;
                        break;
                    case 9:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.f18170a, str21);
                        i2 |= 512;
                        break;
                    case 10:
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str24);
                        i2 |= 1024;
                        break;
                    case 11:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str20);
                        i2 |= 2048;
                        break;
                    case 12:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str19);
                        i2 |= 4096;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
                str18 = str27;
                num3 = num3;
            }
            str = str18;
            str2 = str19;
            str3 = str20;
            str4 = str21;
            l = l7;
            str5 = str22;
            str6 = str23;
            str7 = str24;
            str8 = str25;
            str9 = str26;
            l2 = l8;
            l3 = l9;
            num = num3;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ElectricityBillPaymentHistoryApiModel(i, str, num, l3, l2, str9, str6, str8, str5, l, str4, str7, str3, str2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ElectricityBillPaymentHistoryApiModel value = (ElectricityBillPaymentHistoryApiModel) obj;
        Intrinsics.i(value, "value");
        String str = value.m;
        String str2 = value.l;
        String str3 = value.k;
        String str4 = value.j;
        Long l = value.i;
        String str5 = value.h;
        String str6 = value.g;
        String str7 = value.f;
        String str8 = value.e;
        Long l2 = value.d;
        Long l3 = value.c;
        Integer num = value.b;
        String str9 = value.f2532a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || str9 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str9);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || num != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.f18146a, num);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || l3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.f18151a, l3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || l2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.f18151a, l2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || str8 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str8);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || str7 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str7);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || str6 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || str5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || l != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.f18151a, l);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.f18170a, str4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || str != 0) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
