package app.chalo.ncmc.ui;

import app.chalo.ncmc.data.NcmcCardRechargeConfigAppModel;
import app.chalo.ncmc.data.NcmcCardRechargeConfigAppModel$$serializer;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/ncmc/ui/NcmcOfflineRechargeArgsModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/ncmc/ui/NcmcOfflineRechargeArgsModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class NcmcOfflineRechargeArgsModel$$serializer implements GeneratedSerializer<NcmcOfflineRechargeArgsModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NcmcOfflineRechargeArgsModel$$serializer f6268a;
    private static final SerialDescriptor descriptor;

    static {
        NcmcOfflineRechargeArgsModel$$serializer ncmcOfflineRechargeArgsModel$$serializer = new NcmcOfflineRechargeArgsModel$$serializer();
        f6268a = ncmcOfflineRechargeArgsModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.ncmc.ui.NcmcOfflineRechargeArgsModel", ncmcOfflineRechargeArgsModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("config", false);
        pluginGeneratedSerialDescriptor.j("cardNumber", false);
        pluginGeneratedSerialDescriptor.j("onlineBalance", false);
        pluginGeneratedSerialDescriptor.j("kitNumber", false);
        pluginGeneratedSerialDescriptor.j("minLoadLimit", false);
        pluginGeneratedSerialDescriptor.j("maxLoadLimit", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.f18151a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(longSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(longSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(longSerializer);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{NcmcCardRechargeConfigAppModel$$serializer.f6034a, stringSerializer, kSerializerC, stringSerializer, kSerializerC2, kSerializerC3};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel;
        String str;
        Long l;
        String str2;
        Long l2;
        Long l3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 5;
        NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel3 = (NcmcCardRechargeConfigAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, NcmcCardRechargeConfigAppModel$$serializer.f6034a, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            LongSerializer longSerializer = LongSerializer.f18151a;
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, longSerializer, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, longSerializer, null);
            ncmcCardRechargeConfigAppModel = ncmcCardRechargeConfigAppModel3;
            l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, longSerializer, null);
            str2 = strDecodeStringElement2;
            l2 = l5;
            l = l4;
            str = strDecodeStringElement;
            i = 63;
        } else {
            boolean z = true;
            int i3 = 0;
            String strDecodeStringElement3 = null;
            Long l6 = null;
            String strDecodeStringElement4 = null;
            Long l7 = null;
            Long l8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                        break;
                    case 0:
                        ncmcCardRechargeConfigAppModel2 = (NcmcCardRechargeConfigAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, NcmcCardRechargeConfigAppModel$$serializer.f6034a, ncmcCardRechargeConfigAppModel2);
                        i3 |= 1;
                        i2 = 5;
                        break;
                    case 1:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.f18151a, l6);
                        i3 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        break;
                    case 4:
                        l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.f18151a, l7);
                        i3 |= 16;
                        break;
                    case 5:
                        l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, LongSerializer.f18151a, l8);
                        i3 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            ncmcCardRechargeConfigAppModel = ncmcCardRechargeConfigAppModel2;
            str = strDecodeStringElement3;
            l = l6;
            str2 = strDecodeStringElement4;
            l2 = l7;
            l3 = l8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NcmcOfflineRechargeArgsModel(i, ncmcCardRechargeConfigAppModel, str, l, str2, l2, l3);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        NcmcOfflineRechargeArgsModel value = (NcmcOfflineRechargeArgsModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, NcmcCardRechargeConfigAppModel$$serializer.f6034a, value.f6267a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        LongSerializer longSerializer = LongSerializer.f18151a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, longSerializer, value.c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, longSerializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, longSerializer, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
