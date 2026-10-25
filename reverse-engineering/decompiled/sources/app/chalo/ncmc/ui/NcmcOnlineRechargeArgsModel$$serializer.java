package app.chalo.ncmc.ui;

import app.chalo.constants.Source;
import app.chalo.ncmc.data.NcmcCardRechargeConfigAppModel;
import app.chalo.ncmc.data.NcmcCardRechargeConfigAppModel$$serializer;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/ncmc/ui/NcmcOnlineRechargeArgsModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/ncmc/ui/NcmcOnlineRechargeArgsModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class NcmcOnlineRechargeArgsModel$$serializer implements GeneratedSerializer<NcmcOnlineRechargeArgsModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NcmcOnlineRechargeArgsModel$$serializer f6270a;
    private static final SerialDescriptor descriptor;

    static {
        NcmcOnlineRechargeArgsModel$$serializer ncmcOnlineRechargeArgsModel$$serializer = new NcmcOnlineRechargeArgsModel$$serializer();
        f6270a = ncmcOnlineRechargeArgsModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.ncmc.ui.NcmcOnlineRechargeArgsModel", ncmcOnlineRechargeArgsModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("config", false);
        pluginGeneratedSerialDescriptor.j("cardNumber", false);
        pluginGeneratedSerialDescriptor.j("onlineBalance", false);
        pluginGeneratedSerialDescriptor.j("kitNumber", false);
        pluginGeneratedSerialDescriptor.j("loadLimit", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f18170a;
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{NcmcOnlineRechargeArgsModel.g[0].getValue(), NcmcCardRechargeConfigAppModel$$serializer.f6034a, stringSerializer, longSerializer, stringSerializer, longSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Source source;
        long j;
        NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel;
        String str;
        String strDecodeStringElement;
        long jDecodeLongElement;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = NcmcOnlineRechargeArgsModel.g;
        int i2 = 5;
        int i3 = 0;
        Source source2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Source source3 = (Source) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel2 = (NcmcCardRechargeConfigAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, NcmcCardRechargeConfigAppModel$$serializer.f6034a, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            source = source3;
            ncmcCardRechargeConfigAppModel = ncmcCardRechargeConfigAppModel2;
            i = 63;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            str = strDecodeStringElement2;
            j = jDecodeLongElement2;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
        } else {
            long jDecodeLongElement3 = 0;
            int i4 = 1;
            int i5 = 0;
            NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            long jDecodeLongElement4 = 0;
            while (i4 != 0) {
                int i6 = i3;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        i3 = i6;
                        i4 = i3;
                        i2 = 5;
                        break;
                    case 0:
                        source2 = (Source) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i6, (DeserializationStrategy) lazyArr[i6].getValue(), source2);
                        i5 |= 1;
                        i3 = i6;
                        i2 = 5;
                        break;
                    case 1:
                        ncmcCardRechargeConfigAppModel3 = (NcmcCardRechargeConfigAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, NcmcCardRechargeConfigAppModel$$serializer.f6034a, ncmcCardRechargeConfigAppModel3);
                        i5 |= 2;
                        i3 = i6;
                        break;
                    case 2:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        i3 = i6;
                        break;
                    case 3:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i5 |= 8;
                        i3 = i6;
                        break;
                    case 4:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i5 |= 16;
                        i3 = i6;
                        break;
                    case 5:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i2);
                        i5 |= 32;
                        i3 = i6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            source = source2;
            j = jDecodeLongElement3;
            ncmcCardRechargeConfigAppModel = ncmcCardRechargeConfigAppModel3;
            str = strDecodeStringElement3;
            strDecodeStringElement = strDecodeStringElement4;
            jDecodeLongElement = jDecodeLongElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NcmcOnlineRechargeArgsModel(i, source, ncmcCardRechargeConfigAppModel, str, j, strDecodeStringElement, jDecodeLongElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        NcmcOnlineRechargeArgsModel value = (NcmcOnlineRechargeArgsModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (SerializationStrategy) NcmcOnlineRechargeArgsModel.g[0].getValue(), value.f6269a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, NcmcCardRechargeConfigAppModel$$serializer.f6034a, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
