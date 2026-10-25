package app.chalo.productpurchase.passpurchase.data.models.api.request;

import java.util.List;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productpurchase/passpurchase/data/models/api/request/CreateSuperPassOrderRequestApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productpurchase/passpurchase/data/models/api/request/CreateSuperPassOrderRequestApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class CreateSuperPassOrderRequestApiModel$$serializer implements GeneratedSerializer<CreateSuperPassOrderRequestApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CreateSuperPassOrderRequestApiModel$$serializer f8321a;
    private static final SerialDescriptor descriptor;

    static {
        CreateSuperPassOrderRequestApiModel$$serializer createSuperPassOrderRequestApiModel$$serializer = new CreateSuperPassOrderRequestApiModel$$serializer();
        f8321a = createSuperPassOrderRequestApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productpurchase.passpurchase.data.models.api.request.CreateSuperPassOrderRequestApiModel", createSuperPassOrderRequestApiModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("passProps", false);
        pluginGeneratedSerialDescriptor.j("paymentProps", false);
        pluginGeneratedSerialDescriptor.j("proofs", false);
        pluginGeneratedSerialDescriptor.j("userDetails", false);
        pluginGeneratedSerialDescriptor.j("appliedRules", false);
        pluginGeneratedSerialDescriptor.j("userAcquisitionChannel", false);
        pluginGeneratedSerialDescriptor.j("userCampaign", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = CreateSuperPassOrderRequestApiModel.i;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{stringSerializer, PassProps$$serializer.f8323a, PaymentProps$$serializer.f8325a, BuiltinSerializersKt.c((KSerializer) lazyArr[3].getValue()), UserDetails$$serializer.f8327a, lazyArr[5].getValue(), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        List list;
        UserDetails userDetails;
        String str3;
        PassProps passProps;
        PaymentProps paymentProps;
        Map map;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = CreateSuperPassOrderRequestApiModel.i;
        int i2 = 7;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            PassProps passProps2 = (PassProps) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, PassProps$$serializer.f8323a, null);
            PaymentProps paymentProps2 = (PaymentProps) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, PaymentProps$$serializer.f8325a, null);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            UserDetails userDetails2 = (UserDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, UserDetails$$serializer.f8327a, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            list = list2;
            str3 = strDecodeStringElement2;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            str = str4;
            userDetails = userDetails2;
            paymentProps = paymentProps2;
            i = 255;
            map = map2;
            passProps = passProps2;
        } else {
            int i3 = 3;
            boolean z = true;
            int i4 = 0;
            String str5 = null;
            String str6 = null;
            List list3 = null;
            UserDetails userDetails3 = null;
            PassProps passProps3 = null;
            PaymentProps paymentProps3 = null;
            Map map3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 3;
                        break;
                    case 0:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 3;
                        break;
                    case 1:
                        passProps3 = (PassProps) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, PassProps$$serializer.f8323a, passProps3);
                        i4 |= 2;
                        i2 = 7;
                        i3 = 3;
                        break;
                    case 2:
                        paymentProps3 = (PaymentProps) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, PaymentProps$$serializer.f8325a, paymentProps3);
                        i4 |= 4;
                        i2 = 7;
                        i3 = 3;
                        break;
                    case 3:
                        map3 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, (DeserializationStrategy) lazyArr[i3].getValue(), map3);
                        i4 |= 8;
                        i2 = 7;
                        break;
                    case 4:
                        userDetails3 = (UserDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, UserDetails$$serializer.f8327a, userDetails3);
                        i4 |= 16;
                        i2 = 7;
                        break;
                    case 5:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), list3);
                        i4 |= 32;
                        break;
                    case 6:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str5);
                        i4 |= 64;
                        break;
                    case 7:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.f18170a, str6);
                        i4 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            str = str5;
            str2 = str6;
            list = list3;
            userDetails = userDetails3;
            str3 = strDecodeStringElement;
            passProps = passProps3;
            paymentProps = paymentProps3;
            map = map3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CreateSuperPassOrderRequestApiModel(i, str3, passProps, paymentProps, map, userDetails, list, str, str2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        CreateSuperPassOrderRequestApiModel value = (CreateSuperPassOrderRequestApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = CreateSuperPassOrderRequestApiModel.i;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f8320a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, PassProps$$serializer.f8323a, value.b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, PaymentProps$$serializer.f8325a, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, UserDetails$$serializer.f8327a, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), value.f);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, value.h);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
