package app.chalo.ncmc.data.cardtransactions;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/ncmc/data/cardtransactions/CardMerchantTransactionAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/ncmc/data/cardtransactions/CardMerchantTransactionAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class CardMerchantTransactionAppModel$$serializer implements GeneratedSerializer<CardMerchantTransactionAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CardMerchantTransactionAppModel$$serializer f6167a;
    private static final SerialDescriptor descriptor;

    static {
        CardMerchantTransactionAppModel$$serializer cardMerchantTransactionAppModel$$serializer = new CardMerchantTransactionAppModel$$serializer();
        f6167a = cardMerchantTransactionAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.ncmc.data.cardtransactions.CardMerchantTransactionAppModel", cardMerchantTransactionAppModel$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("transactionId", false);
        pluginGeneratedSerialDescriptor.j("transactionTime", false);
        pluginGeneratedSerialDescriptor.j("fareInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{StringSerializer.f18170a, LongSerializer.f18151a, CardTransactionFareInfoAppModel$$serializer.f6191a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String strDecodeStringElement;
        int i;
        long j;
        CardTransactionFareInfoAppModel cardTransactionFareInfoAppModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            i = 7;
            cardTransactionFareInfoAppModel = (CardTransactionFareInfoAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, CardTransactionFareInfoAppModel$$serializer.f6191a, null);
            j = jDecodeLongElement;
        } else {
            long jDecodeLongElement2 = 0;
            boolean z = true;
            strDecodeStringElement = null;
            CardTransactionFareInfoAppModel cardTransactionFareInfoAppModel2 = null;
            i = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iDecodeElementIndex == 1) {
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                    i |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    cardTransactionFareInfoAppModel2 = (CardTransactionFareInfoAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, CardTransactionFareInfoAppModel$$serializer.f6191a, cardTransactionFareInfoAppModel2);
                    i |= 4;
                }
            }
            j = jDecodeLongElement2;
            cardTransactionFareInfoAppModel = cardTransactionFareInfoAppModel2;
        }
        String str = strDecodeStringElement;
        int i2 = i;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CardMerchantTransactionAppModel(i2, str, j, cardTransactionFareInfoAppModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        CardMerchantTransactionAppModel value = (CardMerchantTransactionAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f6166a);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, CardTransactionFareInfoAppModel$$serializer.f6191a, value.c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
