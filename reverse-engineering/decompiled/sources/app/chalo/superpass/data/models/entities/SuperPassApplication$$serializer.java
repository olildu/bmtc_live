package app.chalo.superpass.data.models.entities;

import app.chalo.features.productsync.constants.SuperPassApplicationStatus;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel$$serializer;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/superpass/data/models/entities/SuperPassApplication.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/superpass/data/models/entities/SuperPassApplication;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SuperPassApplication$$serializer implements GeneratedSerializer<SuperPassApplication> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SuperPassApplication$$serializer f9564a;
    private static final SerialDescriptor descriptor;

    static {
        SuperPassApplication$$serializer superPassApplication$$serializer = new SuperPassApplication$$serializer();
        f9564a = superPassApplication$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.superpass.data.models.entities.SuperPassApplication", superPassApplication$$serializer, 16);
        pluginGeneratedSerialDescriptor.j("cityName", false);
        pluginGeneratedSerialDescriptor.j("agencyName", false);
        pluginGeneratedSerialDescriptor.j("configId", false);
        pluginGeneratedSerialDescriptor.j("categoryId", true);
        pluginGeneratedSerialDescriptor.j("fareMappingId", true);
        pluginGeneratedSerialDescriptor.j("fareMappingDisplayName", false);
        pluginGeneratedSerialDescriptor.j("passName", false);
        pluginGeneratedSerialDescriptor.j("passStartDate", false);
        pluginGeneratedSerialDescriptor.j("verificationExpiryTime", false);
        pluginGeneratedSerialDescriptor.j("superPassUserDetails", false);
        pluginGeneratedSerialDescriptor.j("superPassApplicationStatus", false);
        pluginGeneratedSerialDescriptor.j("proofs", false);
        pluginGeneratedSerialDescriptor.j("cashPaymentPendingTransactionDetails", false);
        pluginGeneratedSerialDescriptor.j("passApplicationRejectionReasons", false);
        pluginGeneratedSerialDescriptor.j("passApplicationActionRequired", false);
        pluginGeneratedSerialDescriptor.j("refundInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = SuperPassApplication.q;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, IntSerializer.f18146a, stringSerializer, stringSerializer, longSerializer, longSerializer, SuperPassUserDetails$$serializer.f9581a, lazyArr[10].getValue(), lazyArr[11].getValue(), BuiltinSerializersKt.c(CashPaymentPendingTransactionDetails$$serializer.f9542a), BuiltinSerializersKt.c(PassApplicationRejectionReasons$$serializer.f9548a), BuiltinSerializersKt.c((KSerializer) lazyArr[14].getValue()), BuiltinSerializersKt.c(RefundInfoEntityModel$$serializer.f8246a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        SuperPassApplicationStatus superPassApplicationStatus;
        SuperPassUserDetails superPassUserDetails;
        RefundInfoEntityModel refundInfoEntityModel;
        PassApplicationActionRequired passApplicationActionRequired;
        CashPaymentPendingTransactionDetails cashPaymentPendingTransactionDetails;
        PassApplicationRejectionReasons passApplicationRejectionReasons;
        Map map;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        long j;
        long j2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassApplication.q;
        int i3 = 9;
        int i4 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
            SuperPassUserDetails superPassUserDetails2 = (SuperPassUserDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, SuperPassUserDetails$$serializer.f9581a, null);
            SuperPassApplicationStatus superPassApplicationStatus2 = (SuperPassApplicationStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, (DeserializationStrategy) lazyArr[10].getValue(), null);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, (DeserializationStrategy) lazyArr[11].getValue(), null);
            CashPaymentPendingTransactionDetails cashPaymentPendingTransactionDetails2 = (CashPaymentPendingTransactionDetails) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, CashPaymentPendingTransactionDetails$$serializer.f9542a, null);
            PassApplicationRejectionReasons passApplicationRejectionReasons2 = (PassApplicationRejectionReasons) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, PassApplicationRejectionReasons$$serializer.f9548a, null);
            PassApplicationActionRequired passApplicationActionRequired2 = (PassApplicationActionRequired) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, (DeserializationStrategy) lazyArr[14].getValue(), null);
            i = 65535;
            refundInfoEntityModel = (RefundInfoEntityModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, RefundInfoEntityModel$$serializer.f8246a, null);
            str = strDecodeStringElement;
            str2 = strDecodeStringElement2;
            str3 = strDecodeStringElement3;
            superPassUserDetails = superPassUserDetails2;
            superPassApplicationStatus = superPassApplicationStatus2;
            str6 = strDecodeStringElement6;
            str5 = strDecodeStringElement5;
            str4 = strDecodeStringElement4;
            map = map2;
            i2 = iDecodeIntElement;
            cashPaymentPendingTransactionDetails = cashPaymentPendingTransactionDetails2;
            passApplicationActionRequired = passApplicationActionRequired2;
            passApplicationRejectionReasons = passApplicationRejectionReasons2;
            j = jDecodeLongElement;
            j2 = jDecodeLongElement2;
        } else {
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            RefundInfoEntityModel refundInfoEntityModel2 = null;
            PassApplicationActionRequired passApplicationActionRequired3 = null;
            CashPaymentPendingTransactionDetails cashPaymentPendingTransactionDetails3 = null;
            PassApplicationRejectionReasons passApplicationRejectionReasons3 = null;
            Map map3 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            boolean z = true;
            int iDecodeIntElement2 = 0;
            SuperPassApplicationStatus superPassApplicationStatus3 = null;
            SuperPassUserDetails superPassUserDetails3 = null;
            i = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        i4 = i4;
                        z = false;
                        break;
                    case 0:
                        i |= 1;
                        i4 = i4;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 = 9;
                        break;
                    case 1:
                        i |= 2;
                        i4 = i4;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 = 9;
                        break;
                    case 2:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        i4 = i4;
                        i3 = 9;
                        break;
                    case 3:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        i4 = i4;
                        i3 = 9;
                        break;
                    case 4:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i |= 16;
                        i4 = i4;
                        i3 = 9;
                        break;
                    case 5:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        i4 = i4;
                        i3 = 9;
                        break;
                    case 6:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        i4 = i4;
                        i3 = 9;
                        break;
                    case 7:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
                        i |= 128;
                        i4 = i4;
                        i3 = 9;
                        break;
                    case 8:
                        int i5 = i4;
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i5);
                        i |= 256;
                        i4 = i5;
                        break;
                    case 9:
                        superPassUserDetails3 = (SuperPassUserDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i3, SuperPassUserDetails$$serializer.f9581a, superPassUserDetails3);
                        i |= 512;
                        i4 = 8;
                        break;
                    case 10:
                        superPassApplicationStatus3 = (SuperPassApplicationStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, (DeserializationStrategy) lazyArr[10].getValue(), superPassApplicationStatus3);
                        i |= 1024;
                        i4 = 8;
                        break;
                    case 11:
                        map3 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, (DeserializationStrategy) lazyArr[11].getValue(), map3);
                        i |= 2048;
                        i4 = 8;
                        break;
                    case 12:
                        cashPaymentPendingTransactionDetails3 = (CashPaymentPendingTransactionDetails) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, CashPaymentPendingTransactionDetails$$serializer.f9542a, cashPaymentPendingTransactionDetails3);
                        i |= 4096;
                        i4 = 8;
                        break;
                    case 13:
                        passApplicationRejectionReasons3 = (PassApplicationRejectionReasons) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, PassApplicationRejectionReasons$$serializer.f9548a, passApplicationRejectionReasons3);
                        i |= 8192;
                        i4 = 8;
                        break;
                    case 14:
                        passApplicationActionRequired3 = (PassApplicationActionRequired) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, (DeserializationStrategy) lazyArr[14].getValue(), passApplicationActionRequired3);
                        i |= 16384;
                        i4 = 8;
                        break;
                    case 15:
                        refundInfoEntityModel2 = (RefundInfoEntityModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, RefundInfoEntityModel$$serializer.f8246a, refundInfoEntityModel2);
                        i |= 32768;
                        i4 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement7;
            str2 = strDecodeStringElement8;
            superPassApplicationStatus = superPassApplicationStatus3;
            superPassUserDetails = superPassUserDetails3;
            refundInfoEntityModel = refundInfoEntityModel2;
            passApplicationActionRequired = passApplicationActionRequired3;
            cashPaymentPendingTransactionDetails = cashPaymentPendingTransactionDetails3;
            passApplicationRejectionReasons = passApplicationRejectionReasons3;
            map = map3;
            str3 = strDecodeStringElement9;
            str4 = strDecodeStringElement10;
            str5 = strDecodeStringElement11;
            str6 = strDecodeStringElement12;
            i2 = iDecodeIntElement2;
            j = jDecodeLongElement3;
            j2 = jDecodeLongElement4;
        }
        int i6 = i;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SuperPassApplication(i6, str, str2, str3, str4, i2, str5, str6, j, j2, superPassUserDetails, superPassApplicationStatus, map, cashPaymentPendingTransactionDetails, passApplicationRejectionReasons, passApplicationActionRequired, refundInfoEntityModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SuperPassApplication value = (SuperPassApplication) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassApplication.q;
        String str = value.f9563a;
        int i = value.e;
        String str2 = value.d;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.d(str2, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || i != -1) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 4, i);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.g);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 7, value.h);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 8, value.i);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, SuperPassUserDetails$$serializer.f9581a, value.j);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, (SerializationStrategy) lazyArr[10].getValue(), value.k);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 11, (SerializationStrategy) lazyArr[11].getValue(), value.l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, CashPaymentPendingTransactionDetails$$serializer.f9542a, value.m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, PassApplicationRejectionReasons$$serializer.f9548a, value.n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, (SerializationStrategy) lazyArr[14].getValue(), value.o);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, RefundInfoEntityModel$$serializer.f8246a, value.p);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
